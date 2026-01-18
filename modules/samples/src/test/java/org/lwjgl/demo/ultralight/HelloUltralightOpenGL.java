/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.ultralight;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.util.*;

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
                                              "   gl_Position = vec4(aPos.x + 0.12, aPos.y, aPos.z, 1.0);\n" +
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

    private final String html = "<!DOCTYPE html>\n" +
                  "<html lang=\"en\">\n" +
                  "<head>\n" +
                  "<meta charset=\"UTF-8\">\n" +
                  "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                  "<title>Solomon Client - Fullscreen UI</title>\n" +
                  "\n" +
                  "<link href=\"https://fonts.googleapis.com/css2?family=Orbitron:wght@400;700&display=swap\" rel=\"stylesheet\">\n" +
                  "\n" +
                  "<style>\n" +
                  "* { box-sizing:border-box; margin:0; padding:0; font-family:'Orbitron',sans-serif; }\n" +
                  "html, body {\n" +
                  "    height: 100%; width: 100%;\n" +
                  "    background: transparent; /* Fully transparent HTML background */\n" +
                  "    overflow: hidden;\n" +
                  "}\n" +
                  "\n" +
                  "/* Scale wrapper to fill screen */\n" +
                  ".ui-wrapper {\n" +
                  "    width: 100vw;\n" +
                  "    height: 100vh;\n" +
                  "    display: flex;\n" +
                  "    justify-content: center;\n" +
                  "    align-items: center;\n" +
                  "}\n" +
                  "\n" +
                  "/* Main UI container filling the entire viewport */\n" +
                  ".client-container {\n" +
                  "    width: 100%;\n" +
                  "    height: 100%;\n" +
                  "    display: flex;\n" +
                  "    flex-direction: column;\n" +
                  "    background: rgba(0,0,0,0); /* fully transparent background */\n" +
                  "    border-radius: 16px;\n" +
                  "    gap: 1.5vh;\n" +
                  "    padding: 1.5vh;\n" +
                  "    backdrop-filter: blur(20px) saturate(150%);\n" +
                  "    -webkit-backdrop-filter: blur(20px) saturate(150%);\n" +
                  "    border: 2px solid #8B0000;\n" +
                  "    box-shadow: 0 0 40px rgba(0,0,0,0.6), inset 0 0 4px rgba(255,255,255,0.05);\n" +
                  "    overflow-y: auto;\n" +
                  "    position: relative;\n" +
                  "    transform-origin: top left;\n" +
                  "    animation: dropFadeIn 0.8s forwards;\n" +
                  "}\n" +
                  "\n" +
                  "/* Drop + fade in */\n" +
                  "@keyframes dropFadeIn {\n" +
                  "    0% { opacity: 0; transform: translateY(-5vh); }\n" +
                  "    100% { opacity: 1; transform: translateY(0); }\n" +
                  "}\n" +
                  "\n" +
                  "/* Sticky Top Bar with curved top corners and straight bottom */\n" +
                  ".top-bar {\n" +
                  "    position: sticky;\n" +
                  "    top: 0;\n" +
                  "    z-index: 10;\n" +
                  "    display: flex;\n" +
                  "    align-items: center;\n" +
                  "    gap: 1vw;\n" +
                  "    padding: 1vh 1vw;\n" +
                  "    background: rgba(0,0,0,0); /* fully transparent */\n" +
                  "    backdrop-filter: blur(20px) saturate(150%);\n" +
                  "    -webkit-backdrop-filter: blur(20px) saturate(150%);\n" +
                  "    border-top-left-radius: 16px;\n" +
                  "    border-top-right-radius: 16px;\n" +
                  "    border-bottom-left-radius: 0;\n" +
                  "    border-bottom-right-radius: 0;\n" +
                  "    border-bottom: 2px solid #990000;\n" +
                  "}\n" +
                  "\n" +
                  "/* Logo */\n" +
                  ".logo-container img {\n" +
                  "    height: 5vh;\n" +
                  "    width: auto;\n" +
                  "    border-radius: 4px;\n" +
                  "    box-shadow: 0 0 6px rgba(255,68,68,0.4);\n" +
                  "}\n" +
                  "\n" +
                  "/* Top buttons */\n" +
                  ".top-buttons {\n" +
                  "    display: flex;\n" +
                  "    gap: 1vw;\n" +
                  "    margin-left: 1vw;\n" +
                  "}\n" +
                  ".top-buttons button {\n" +
                  "    background: linear-gradient(145deg, rgba(139,0,0,0.7), rgba(139,0,0,0.5));\n" +
                  "    border: 2px solid #FF4444;\n" +
                  "    color: #fff;\n" +
                  "    padding: 0.5vh 1vw;\n" +
                  "    cursor: pointer;\n" +
                  "    border-radius: 0.8vh;\n" +
                  "    transition: all 0.3s ease;\n" +
                  "    backdrop-filter: blur(8px);\n" +
                  "    font-weight: bold;\n" +
                  "    box-shadow: 0 0.5vh 1vh rgba(0,0,0,0.5);\n" +
                  "    font-size: 1.5vh;\n" +
                  "}\n" +
                  ".top-buttons button:hover {\n" +
                  "    background: linear-gradient(145deg, rgba(255,68,68,0.8), rgba(255,68,68,0.6));\n" +
                  "    border-color: #FFAAAA;\n" +
                  "    box-shadow: 0 1vh 2vh rgba(255,68,68,0.6);\n" +
                  "    transform: scale(1.05) translateY(-0.2vh);\n" +
                  "}\n" +
                  "\n" +
                  "/* Middle content */\n" +
                  ".middle-content {\n" +
                  "    display: flex;\n" +
                  "    gap: 2vw;\n" +
                  "    flex-wrap: wrap;\n" +
                  "    justify-content: space-between;\n" +
                  "    flex: 1;\n" +
                  "    opacity: 0;\n" +
                  "    animation: fadeInContent 0.7s 0.4s forwards;\n" +
                  "}\n" +
                  "@keyframes fadeInContent {\n" +
                  "    0% { opacity: 0; transform: translateY(1vh); }\n" +
                  "    100% { opacity: 1; transform: translateY(0); }\n" +
                  "}\n" +
                  "\n" +
                  "/* Character panel */\n" +
                  ".character-panel {\n" +
                  "    background: rgba(28,28,28,0.45);\n" +
                  "    border-radius: 1vh;\n" +
                  "    padding: 1.5vh;\n" +
                  "    width: 15vw;\n" +
                  "    display: flex;\n" +
                  "    flex-direction: column;\n" +
                  "    align-items: center;\n" +
                  "    backdrop-filter: blur(18px);\n" +
                  "    border: 0.3vh solid #8B0000;\n" +
                  "    box-shadow: 0 0 2vh rgba(0,0,0,0.6), inset 0 0 0.5vh rgba(255,255,255,0.08);\n" +
                  "    transition: transform 0.3s ease, box-shadow 0.3s ease;\n" +
                  "}\n" +
                  ".character-panel:hover { transform: translateY(-0.5vh); box-shadow: 0 0 2.5vh rgba(255,68,68,0.6), inset 0 0 0.8vh rgba(255,255,255,0.12);}\n" +
                  ".character-panel img { width: 6vw; height: auto; border: 0.3vh solid #FF4444; border-radius: 0.5vh; margin-bottom: 1vh; box-shadow: 0 0 1vh rgba(255,68,68,0.3); transition: transform 0.3s ease;}\n" +
                  ".character-panel img:hover { transform: scale(1.03); }\n" +
                  ".character-panel h2 { color: #FF6666; margin-bottom: 0.5vh; font-size: 2vh; text-align:center; }\n" +
                  ".character-panel p { margin-bottom: 0.3vh; font-size: 1.5vh; text-align:center; }\n" +
                  ".stat-bar { position: relative; background: rgba(50,50,50,0.5); border-radius: 0.5vh; height: 1.5vh; width: 100%; margin-bottom: 0.5vh; overflow:hidden; box-shadow: inset 0 0 0.2vh rgba(255,255,255,0.1);}\n" +
                  ".stat-fill { height:100%; width:100%; background: linear-gradient(90deg,#FF4444,#FF8888); transition: width 0.3s ease;}\n" +
                  "\n" +
                  "/* Inventory panel */\n" +
                  ".inventory-panel {\n" +
                  "    flex:1; background: rgba(28,28,28,0.45); border-radius: 1vh;\n" +
                  "    padding: 1.5vh; display: grid;\n" +
                  "    grid-template-columns: repeat(auto-fill,minmax(8vw,1fr));\n" +
                  "    gap: 1vw; backdrop-filter: blur(18px); border: 0.3vh solid #8B0000;\n" +
                  "    box-shadow: 0 0 2vh rgba(0,0,0,0.5), inset 0 0 0.5vh rgba(255,255,255,0.08);\n" +
                  "}\n" +
                  ".inventory-slot {\n" +
                  "    background: rgba(10,10,10,0.6);\n" +
                  "    border: 0.3vh solid #8B0000;\n" +
                  "    border-radius: 0.8vh;\n" +
                  "    width: 100%;\n" +
                  "    padding-top: 100%;\n" +
                  "    position: relative;\n" +
                  "    cursor: pointer;\n" +
                  "    transition: 0.3s;\n" +
                  "    box-shadow: inset 0 0 0.2vh rgba(255,255,255,0.1);\n" +
                  "}\n" +
                  ".inventory-slot:hover {\n" +
                  "    border-color:#FF6666; \n" +
                  "    box-shadow:0 0 1.5vh #FF6666, inset 0 0 0.2vh rgba(255,255,255,0.1);\n" +
                  "    transform: scale(1.05);\n" +
                  "}\n" +
                  ".inventory-slot span {\n" +
                  "    position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);\n" +
                  "    font-size: 1.8vh; font-weight:bold;\n" +
                  "}\n" +
                  "\n" +
                  "/* Config panel */\n" +
                  ".bottom-panel {\n" +
                  "    background: rgba(28,28,28,0.45);\n" +
                  "    border-radius: 1vh;\n" +
                  "    padding: 1.5vh;\n" +
                  "    display: flex;\n" +
                  "    justify-content: space-between;\n" +
                  "    flex-wrap: wrap;\n" +
                  "    gap: 2vw;\n" +
                  "    backdrop-filter: blur(18px);\n" +
                  "    border: 0.3vh solid #8B0000;\n" +
                  "    box-shadow: 0 0 2vh rgba(0,0,0,0.5), inset 0 0 0.5vh rgba(255,255,255,0.08);\n" +
                  "}\n" +
                  ".config-section { flex:1; min-width: 20vw; display:flex; flex-direction:column; gap: 0.5vh; }\n" +
                  ".config-section h3 { color:#FF6666; margin-bottom:0.5vh; font-size:1.8vh; }\n" +
                  ".config-section label { display:flex; justify-content:space-between; align-items:center; font-size:1.5vh; color:#fff;}\n" +
                  ".config-section input[type=\"range\"]{ width: 12vw; }\n" +
                  ".config-section input[type=\"color\"]{ cursor:pointer; }\n" +
                  ".config-section button { background: linear-gradient(145deg, rgba(139,0,0,0.7), rgba(139,0,0,0.5)); border:none; padding:0.5vh 1vw; border-radius:0.8vh; color:#fff; cursor:pointer; transition: all 0.3s; font-weight:bold; font-size:1.5vh;}\n" +
                  ".config-section button:hover { background: linear-gradient(145deg, rgba(255,68,68,0.8), rgba(255,68,68,0.6)); transform: scale(1.05);}\n" +
                  "\n" +
                  "/* Custom Scrollbar */\n" +
                  ".client-container::-webkit-scrollbar {\n" +
                  "    width: 1vw;\n" +
                  "}\n" +
                  ".client-container::-webkit-scrollbar-track {\n" +
                  "    background: rgba(0,0,0,0.2);\n" +
                  "    border-radius: 1vw;\n" +
                  "}\n" +
                  ".client-container::-webkit-scrollbar-thumb {\n" +
                  "    background: #FF4444;\n" +
                  "    border-radius: 1vw;\n" +
                  "    transition: background 0.3s;\n" +
                  "}\n" +
                  ".client-container::-webkit-scrollbar-thumb:hover {\n" +
                  "    background: #FF6666;\n" +
                  "}\n" +
                  "\n" +
                  "</style>\n" +
                  "\n" +
                  "<div class=\"ui-wrapper\">\n" +
                  "  <div class=\"client-container\" id=\"uiContainer\">\n" +
                  "    <!-- Top bar -->\n" +
                  "    <div class=\"top-bar\">\n" +
                  "      <div class=\"logo-container\">\n" +
                  "        <img src=\"https://see.fontimg.com/api/rf5/KdzD/MTk5MTRjNDhjY2NmNDIwYzk2NzQ0YjhjZjE4ZjA3ODQub3Rm/U09MT01PTiBDTElFTlQ/techno.png?r=fs&h=81&w=1250&fg=FFFFFF&bg=353D4B&tb=1&s=65\" alt=\"Solomon Client Logo\">\n" +
                  "      </div>\n" +
                  "      <div class=\"top-buttons\">\n" +
                  "        <button>Home</button>\n" +
                  "        <button>Inventory</button>\n" +
                  "        <button>Modules</button>\n" +
                  "        <button>Stats</button>\n" +
                  "        <button>Settings</button>\n" +
                  "      </div>\n" +
                  "    </div>\n" +
                  "\n" +
                  "    <!-- Middle content -->\n" +
                  "    <div class=\"middle-content\" id=\"middleContent\">\n" +
                  "      <div class=\"character-panel\">\n" +
                  "        <img src=\"https://via.placeholder.com/160x280.png?text=Character\" alt=\"Character\">\n" +
                  "        <h2>Agent Solomon</h2>\n" +
                  "        <p>Level 42</p>\n" +
                  "        <p>HP</p>\n" +
                  "        <div class=\"stat-bar\"><div class=\"stat-fill\" style=\"width:100%\"></div></div>\n" +
                  "        <p>Energy</p>\n" +
                  "        <div class=\"stat-bar\"><div class=\"stat-fill\" style=\"width:75%\"></div></div>\n" +
                  "      </div>\n" +
                  "      <div class=\"inventory-panel\">\n" +
                  "        <div class=\"inventory-slot\"><span>1</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>2</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>3</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>4</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>5</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>6</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>7</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>8</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>9</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>10</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>11</span></div>\n" +
                  "        <div class=\"inventory-slot\"><span>12</span></div>\n" +
                  "      </div>\n" +
                  "    </div>\n" +
                  "\n" +
                  "    <!-- Config panel always visible -->\n" +
                  "    <div class=\"bottom-panel\" id=\"configPanel\">\n" +
                  "      <div class=\"config-section\">\n" +
                  "        <h3>UI Settings</h3>\n" +
                  "        <label>UI Scale\n" +
                  "          <input type=\"range\" min=\"0.5\" max=\"1.5\" step=\"0.05\" value=\"1\" id=\"uiScale\">\n" +
                  "        </label>\n" +
                  "        <label>Highlight Color\n" +
                  "          <input type=\"color\" id=\"highlightColor\" value=\"#FF4444\">\n" +
                  "        </label>\n" +
                  "        <button onclick=\"applySettings()\">Apply</button>\n" +
                  "      </div>\n" +
                  "      <div class=\"config-section\">\n" +
                  "        <h3>Client Info</h3>\n" +
                  "        <p>Version: 1.0.0</p>\n" +
                  "        <p>Author: Solomon Dev</p>\n" +
                  "        <p>Status: Connected</p>\n" +
                  "        <button onclick=\"alert('Example action')\">Check Server</button>\n" +
                  "      </div>\n" +
                  "      <div class=\"config-section\">\n" +
                  "        <h3>Notes / Logs</h3>\n" +
                  "        <p>This panel can show notifications, logs, or instructions.</p>\n" +
                  "        <p>Hover over inventory slots to see effects.</p>\n" +
                  "      </div>\n" +
                  "    </div>\n" +
                  "  </div>\n" +
                  "</div>\n" +
                  "\n" +
                  "<script>\n" +
                  "// Hardcoded default scale\n" +
                  "const DEFAULT_UI_SCALE = 1;\n" +
                  "document.documentElement.style.setProperty('--default-scale', DEFAULT_UI_SCALE);\n" +
                  "const uiContainer = document.getElementById('uiContainer');\n" +
                  "uiContainer.style.transform = `scale(${DEFAULT_UI_SCALE})`;\n" +
                  "\n" +
                  "const uiScaleSlider = document.getElementById('uiScale');\n" +
                  "uiScaleSlider.value = DEFAULT_UI_SCALE;\n" +
                  "\n" +
                  "function applySettings() {\n" +
                  "    const scale = parseFloat(uiScaleSlider.value);\n" +
                  "    uiContainer.style.transform = `scale(${scale})`;\n" +
                  "    const color = document.getElementById('highlightColor').value;\n" +
                  "    document.querySelectorAll('.inventory-slot').forEach(slot => slot.style.borderColor = color);\n" +
                  "}\n" +
                  "</script>\n" +
                  "</body>\n" +
                  "</html>";

    private final float[] vertices = {
        0.7f,  0.9f, 0.0f,  // top right
        0.95f, 0.9f, 0.0f,  // top right corner
        0.95f, -0.9f, 0.0f, // bottom right corner
        0.7f, -0.9f, 0.0f   // bottom left
    };

    private final int[] indices = {
        0, 1, 2,
        2, 3, 0
    };

    private final float[] uiQuadVertices = {
        // positions   // texture coords
        -0.7f,  0.9f,   0.0f, 0.0f,  // top left
        0.7f,  0.9f,   1.0f, 0.0f,  // top right
        0.7f, -0.9f,   1.0f, 1.0f,  // bottom right
        -0.7f, -0.9f,   0.0f, 1.0f   // bottom left
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
        //glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);

        this.window = glfwCreateWindow(1280, 720, "LWJGL Ultralight Demo", MemoryUtil.NULL, MemoryUtil.NULL);
        if (this.window == MemoryUtil.NULL) {
            throw new IllegalStateException("Window creation failed!");
        }

        GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        Objects.requireNonNull(vidMode);

        // Setup callbacks
        glfwSetWindowCloseCallback(this.window, glfwWindow -> this.isRunning = false);

        glfwSetFramebufferSizeCallback(this.window, (window1, width, height) ->
        {
            ulViewResize(this.ultralightView, width, height);
            glViewport(0, 0, width, height);
        });

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

        this.ultralightView = ulCreateView(ultralightRenderer, 1600, 900, ultralightViewConfig, MemoryUtil.NULL);
        //ulViewLoadHTML(ultralightView, ulCreateString("<h1>Hello World!</h1><p>Welcome to the Ultralight demo using OpenGL!</p>"));
        ulViewLoadHTML(ultralightView, ulCreateString(this.html));

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
}
