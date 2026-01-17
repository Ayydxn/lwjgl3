/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.ultralight;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.net.*;
import java.util.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL45.*;
import static org.lwjgl.ultralight.AppCore.*;
import static org.lwjgl.ultralight.Ultralight.*;

public class HelloUltralightOpenGL {
    private final String vertexShaderSource = "#version 330 core\n" +
                                              "layout (location = 0) in vec3 aPos;\n" +
                                              "void main()\n" +
                                              "{\n" +
                                              "   gl_Position = vec4(aPos.x, aPos.y, aPos.z, 1.0);\n" +
                                              "}\0";

    private final String fragmentShaderSource = "#version 330 core\n" +
                                                "out vec4 FragColor;\n" +
                                                "void main()\n" +
                                                "{\n" +
                                                "   FragColor = vec4(0.2f, 0.6f, 0.7f, 1.0f);\n" +
                                                "}\n\0";

    private final String uiVertexShaderSource = "#version 330 core\n" +
                                                "layout (location = 0) in vec2 aPos;\n" +
                                                "layout (location = 1) in vec2 aTexCoord;\n" +
                                                "out vec2 TexCoord;\n" +
                                                "void main()\n" +
                                                "{\n" +
                                                "   gl_Position = vec4(aPos.x, aPos.y, 0.0, 1.0);\n" +
                                                "   TexCoord = aTexCoord;\n" +
                                                "}\0";

    private final String uiFragmentShaderSource = "#version 330 core\n" +
                                                  "out vec4 FragColor;\n" +
                                                  "in vec2 TexCoord;\n" +
                                                  "uniform sampler2D uiTexture;\n" +
                                                  "void main()\n" +
                                                  "{\n" +
                                                  "   FragColor = texture(uiTexture, TexCoord);\n" +
                                                  "}\0";

    private final float[] vertices = {
        -0.5f, -0.5f, 0.0f,
        0.5f, -0.5f, 0.0f,
        0.0f, 0.5f, 0.0f
    };

    private final int[] indices = {
        0, 1, 2
    };

    private final float[] uiQuadVertices = {
        // positions   // texture coords
        0.1f, 0.8f, 0.0f, 0.0f,  // top left
        0.9f, 0.8f, 1.0f, 0.0f,  // top right
        0.9f, -0.8f, 1.0f, 1.0f,  // bottom right
        0.1f, -0.8f, 0.0f, 1.0f   // bottom left
    };

    private final int[] uiQuadIndices = {
        0, 1, 2,
        2, 3, 0
    };

    private long window               = MemoryUtil.NULL;
    private int  shaderProgram;
    private int  vertexBuffer;
    private int  indexBuffer;
    private int  vertexArrayObject;
    private int  uiShaderProgram;
    private int  uiVertexBuffer;
    private int  uiIndexBuffer;
    private int  uiVertexArrayObject;
    private int  uiTexture;
    private long ultralightConfig     = MemoryUtil.NULL;
    private long ultralightApp        = MemoryUtil.NULL;
    private long ultralightRenderer   = MemoryUtil.NULL;
    private long ultralightViewConfig = MemoryUtil.NULL;
    private long ultralightView       = MemoryUtil.NULL;

    private boolean isRunning = true;

    public static void main(String[] args) throws Exception {
        System.out.printf("Ultralight Version: %s%n", ulVersionString());

        new HelloUltralightOpenGL().run();
    }

    public void run() throws Exception {
        this.init();

        while (this.isRunning) {
            this.update();
            this.render();
        }

        this.shutdown();
    }

    private void init() throws Exception {
        /*----------------------------------*/
        /* -- Create a window using GLFW -- */
        /*----------------------------------*/

        GLFWErrorCallback.createPrint().set();

        // Initialize GLFW
        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW!");
        }

        // Setup window hints
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);

        this.window = glfwCreateWindow(1280, 720, "LWJGL Ultralight Demo", MemoryUtil.NULL, MemoryUtil.NULL);
        if (this.window == MemoryUtil.NULL) {
            throw new IllegalStateException("Window creation failed!");
        }

        GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        Objects.requireNonNull(vidMode);

        // Setup callbacks
        glfwSetWindowCloseCallback(this.window, glfwWindow -> this.isRunning = false);

        // Create an OpenGL context
        glfwMakeContextCurrent(this.window);

        GL.createCapabilities();

        /*------------------------*/
        /* -- Setup Ultralight -- */
        /*------------------------*/

        URL resourcesFolderURL = HelloUltralightOpenGL.class.getClassLoader().getResource("./demo/ultralight");
        Objects.requireNonNull(resourcesFolderURL);

        this.ultralightConfig = ulCreateConfig();
        ulConfigSetResourcePathPrefix(ultralightConfig, ulCreateString(new File(resourcesFolderURL.toURI()) + "/"));
        ulConfigSetUserStylesheet(ultralightConfig, ulCreateString("body { background: white; }"));
        ulConfigSetScrollTimerDelay(this.ultralightConfig, 1.0d / vidMode.refreshRate());
        ulConfigSetAnimationTimerDelay(this.ultralightConfig, 1.0d / vidMode.refreshRate());

        this.ultralightApp = ulCreateApp(ulCreateSettings(), ultralightConfig);

        this.ultralightRenderer = ulCreateRenderer(ultralightConfig);

        this.ultralightViewConfig = ulCreateViewConfig();
        ulViewConfigSetIsAccelerated(ultralightViewConfig, false);

        this.ultralightView = ulCreateView(ultralightRenderer, 500, 500, ultralightViewConfig, MemoryUtil.NULL);
        ulViewLoadHTML(ultralightView, ulCreateString("<h1>Hello World!</h1><p>Welcome to the Ultralight demo using OpenGL!</p>"));

        int uiVertexShader = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(uiVertexShader, this.uiVertexShaderSource);
        glCompileShader(uiVertexShader);

        int uiFragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(uiFragmentShader, this.uiFragmentShaderSource);
        glCompileShader(uiFragmentShader);

        this.uiShaderProgram = glCreateProgram();
        glAttachShader(this.uiShaderProgram, uiVertexShader);
        glAttachShader(this.uiShaderProgram, uiFragmentShader);
        glLinkProgram(this.uiShaderProgram);

        glDeleteShader(uiVertexShader);
        glDeleteShader(uiFragmentShader);

        this.uiVertexArrayObject = glCreateVertexArrays();
        glBindVertexArray(this.uiVertexArrayObject);

        this.uiVertexBuffer = glCreateBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, this.uiVertexBuffer);
        glBufferData(GL_ARRAY_BUFFER, this.uiQuadVertices, GL_STATIC_DRAW);

        this.uiIndexBuffer = glCreateBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, this.uiIndexBuffer);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, this.uiQuadIndices, GL_STATIC_DRAW);

        // Position attribute
        glVertexAttribPointer(0, 2, GL_FLOAT, false, 4 * Float.BYTES, 0);
        glEnableVertexAttribArray(0);

        // Texture coordinate attribute
        glVertexAttribPointer(1, 2, GL_FLOAT, false, 4 * Float.BYTES, 2 * Float.BYTES);
        glEnableVertexAttribArray(1);

        // Create texture for Ultralight surface
        this.uiTexture = glCreateTextures(GL_TEXTURE_2D);
        glBindTexture(GL_TEXTURE_2D, this.uiTexture);
        glTextureParameteri(this.uiTexture, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
        glTextureParameteri(this.uiTexture, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        glTextureParameteri(this.uiTexture, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
        glTextureParameteri(this.uiTexture, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);

        /*--------------------------------*/
        /* -- Setup Triangle Resources -- */
        /*--------------------------------*/

        int vertexShader = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(vertexShader, this.vertexShaderSource);
        glCompileShader(vertexShader);

        int fragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(fragmentShader, this.fragmentShaderSource);
        glCompileShader(fragmentShader);

        this.shaderProgram = glCreateProgram();
        glAttachShader(this.shaderProgram, vertexShader);
        glAttachShader(this.shaderProgram, fragmentShader);
        glLinkProgram(this.shaderProgram);

        glDeleteShader(vertexShader);
        glDeleteShader(fragmentShader);

        this.vertexArrayObject = glCreateVertexArrays();
        glBindVertexArray(this.vertexArrayObject);

        this.vertexBuffer = glCreateBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, this.vertexBuffer);
        glBufferData(GL_ARRAY_BUFFER, this.vertices, GL_STATIC_DRAW);

        this.indexBuffer = glCreateBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, this.indexBuffer);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, this.indices, GL_STATIC_DRAW);

        glVertexAttribPointer(0, 3, GL_FLOAT, false, 3 * Float.BYTES, MemoryUtil.NULL);
        glEnableVertexAttribArray(0);
    }

    private void update() {
        glfwPollEvents();

        ulUpdate(this.ultralightRenderer);
    }

    private void render() {
        glClearColor(0.25f, 0.25f, 0.25f, 1.0f);
        glClear(GL_COLOR_BUFFER_BIT);

        glUseProgram(this.shaderProgram);
        glBindVertexArray(this.vertexArrayObject);
        glDrawElements(GL_TRIANGLES, this.indices.length, GL_UNSIGNED_INT, MemoryUtil.NULL);

        ulRefreshDisplay(this.ultralightRenderer, 0);
        ulRender(this.ultralightRenderer);

        this.renderUI();

        glfwSwapBuffers(this.window);
    }

    private void renderUI() {
        long surface = ulViewGetSurface(this.ultralightView);
        if (surface == MemoryUtil.NULL) {
            return;
        }

        long bitmap = ulBitmapSurfaceGetBitmap(surface);
        if (bitmap == MemoryUtil.NULL) {
            return;
        }

        // Get bitmap properties
        int  width  = ulBitmapGetWidth(bitmap);
        int  height = ulBitmapGetHeight(bitmap);
        long pixels = ulBitmapLockPixels(bitmap);

        if (pixels != MemoryUtil.NULL) {
            // Update texture with bitmap data
            glBindTexture(GL_TEXTURE_2D, this.uiTexture);
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0,
                GL_BGRA, GL_UNSIGNED_BYTE, pixels);

            ulBitmapUnlockPixels(bitmap);

            // Enable blending for transparency
            glEnable(GL_BLEND);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

            // Render the UI quad
            glUseProgram(this.uiShaderProgram);
            glBindVertexArray(this.uiVertexArrayObject);
            glBindTexture(GL_TEXTURE_2D, this.uiTexture);
            glDrawElements(GL_TRIANGLES, this.uiQuadIndices.length, GL_UNSIGNED_INT, MemoryUtil.NULL);

            glDisable(GL_BLEND);
        }
    }

    private void shutdown() {
        // Shutdown GLFW and free its resources
        glfwFreeCallbacks(this.window);
        glfwDestroyWindow(this.window);
        glfwTerminate();
        glfwSetErrorCallback(null).free();

        // Destroy Ultralight resources
        ulDestroyViewConfig(this.ultralightViewConfig);
        ulDestroyView(this.ultralightView);
        ulDestroyRenderer(this.ultralightRenderer);
        ulDestroyConfig(this.ultralightConfig);
        ulDestroyApp(this.ultralightApp);

        // Destroy OpenGL resources
        glDeleteVertexArrays(this.vertexArrayObject);
        glDeleteBuffers(this.vertexBuffer);
        glDeleteBuffers(this.indexBuffer);
        glDeleteProgram(this.shaderProgram);
    }

    private String getExampleHTML() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head>" +
               "<style>" +
               "* { margin: 0; padding: 0; box-sizing: border-box; }" +
               "body {" +
               "  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', sans-serif;" +
               "  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);" +
               "  padding: 20px; min-height: 100vh; display: flex;" +
               "  flex-direction: column; gap: 16px;" +
               "}" +
               ".card {" +
               "  background: rgba(255, 255, 255, 0.1);" +
               "  backdrop-filter: blur(10px);" +
               "  border-radius: 16px; padding: 20px;" +
               "  border: 1px solid rgba(255, 255, 255, 0.2);" +
               "  box-shadow: 0 8px 32px rgba(0, 0, 0, 0.1);" +
               "}" +
               "h1 { color: white; font-size: 24px; margin-bottom: 8px; font-weight: 600; }" +
               ".subtitle { color: rgba(255, 255, 255, 0.7); font-size: 14px; margin-bottom: 16px; }" +
               ".stats { display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin-top: 16px; }" +
               ".stat-item {" +
               "  background: rgba(255, 255, 255, 0.15); border-radius: 12px;" +
               "  padding: 16px; border: 1px solid rgba(255, 255, 255, 0.2);" +
               "}" +
               ".stat-value { color: white; font-size: 28px; font-weight: 700; margin-bottom: 4px; }" +
               ".stat-label {" +
               "  color: rgba(255, 255, 255, 0.6); font-size: 12px;" +
               "  text-transform: uppercase; letter-spacing: 0.5px;" +
               "}" +
               ".progress-bar {" +
               "  width: 100%; height: 8px; background: rgba(255, 255, 255, 0.2);" +
               "  border-radius: 4px; overflow: hidden; margin-top: 12px;" +
               "}" +
               ".progress-fill {" +
               "  height: 100%; background: linear-gradient(90deg, #4ade80, #22c55e);" +
               "  border-radius: 4px; animation: progress 2s ease-in-out infinite;" +
               "}" +
               "@keyframes progress { 0%, 100% { width: 65%; } 50% { width: 75%; } }" +
               ".button {" +
               "  background: linear-gradient(135deg, #667eea, #764ba2);" +
               "  color: white; border: none; border-radius: 12px;" +
               "  padding: 14px 24px; font-size: 14px; font-weight: 600;" +
               "  cursor: pointer; margin-top: 16px; width: 100%;" +
               "  box-shadow: 0 4px 16px rgba(102, 126, 234, 0.4);" +
               "  transition: transform 0.2s, box-shadow 0.2s;" +
               "}" +
               ".button:hover {" +
               "  transform: translateY(-2px);" +
               "  box-shadow: 0 6px 20px rgba(102, 126, 234, 0.5);" +
               "}" +
               ".badge {" +
               "  display: inline-block; background: rgba(74, 222, 128, 0.3);" +
               "  color: #4ade80; padding: 4px 12px; border-radius: 20px;" +
               "  font-size: 12px; font-weight: 600;" +
               "  border: 1px solid rgba(74, 222, 128, 0.5);" +
               "}" +
               ".metric-row {" +
               "  display: flex; justify-content: space-between; align-items: center;" +
               "  margin-top: 12px; padding: 12px;" +
               "  background: rgba(255, 255, 255, 0.05); border-radius: 8px;" +
               "}" +
               ".metric-name { color: rgba(255, 255, 255, 0.8); font-size: 13px; }" +
               ".metric-value { color: white; font-weight: 600; font-size: 14px; }" +
               "</style>" +
               "</head>" +
               "<body>" +
               "<div class='card'>" +
               "<h1>🎮 Game Dashboard</h1>" +
               "<div class='subtitle'>Real-time performance metrics</div>" +
               "<span class='badge'>● ACTIVE</span>" +
               "<div class='stats'>" +
               "<div class='stat-item'><div class='stat-value'>60</div><div class='stat-label'>FPS</div></div>" +
               "<div class='stat-item'><div class='stat-value'>2.4ms</div><div class='stat-label'>Frame Time</div></div>" +
               "</div>" +
               "<div class='progress-bar'><div class='progress-fill'></div></div>" +
               "</div>" +
               "<div class='card'>" +
               "<h1>📊 System Status</h1>" +
               "<div class='metric-row'><span class='metric-name'>GPU Usage</span><span class='metric-value'>45%</span></div>" +
               "<div class='metric-row'><span class='metric-name'>Memory</span><span class='metric-value'>2.1 GB</span></div>" +
               "<div class='metric-row'><span class='metric-name'>Draw Calls</span><span class='metric-value'>1,234</span></div>" +
               "<button class='button'>View Details</button>" +
               "</div>" +
               "</body>" +
               "</html>";
    }
}
