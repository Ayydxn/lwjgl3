/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.ultralight;

import org.lwjgl.system.*;

import java.io.*;
import java.net.*;
import java.util.*;

import static org.lwjgl.ultralight.AppCore.*;
import static org.lwjgl.ultralight.Ultralight.*;

public class HelloUltralight {

    public static final String TEST_HTML =
        "<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
        "    <style>" +
        "        body { background: gray; color: white; font-size: 24px; padding: 20px; }" +
        "        h1 { color: yellow; }" +
        "    </style>" +
        "</head>" +
        "<body>" +
        "    <h1>TEST - Can you see this?</h1>" +
        "    <p>If you see this text, Ultralight is working!</p>" +
        "</body>" +
        "</html>";

    private HelloUltralight() {
    }

    public static void main(String[] args) throws Exception {
        System.out.printf("Ultralight Version: %s%n", ulVersionString());

        URL resourcesFolderURL = HelloUltralightOpenGL.class.getClassLoader().getResource("./demo/ultralight");
        Objects.requireNonNull(resourcesFolderURL);

        long config = ulCreateConfig();
        ulConfigSetResourcePathPrefix(config, ulCreateString(new File(resourcesFolderURL.toURI()) + "/"));

        long settings = ulCreateSettings();
        ulSettingsSetForceCPURenderer(settings, true);

        long app = ulCreateApp(settings, config);

        ulDestroyConfig(config);
        ulDestroySettings(settings);

        long window = ulCreateWindow(ulAppGetMainMonitor(app), 900, 600, false, kWindowFlags_Titled | kWindowFlags_Resizable);
        ulWindowSetTitle(window, "LWJGL Ultralight Demo");

        long overlay = ulCreateOverlay(window, 900, 600, 0, 0);
        long overlayView = ulOverlayGetView(overlay);
        long htmlString = ulCreateString(TEST_HTML);

        ulViewLoadHTML(overlayView, htmlString);
        ulDestroyString(htmlString);

        ulWindowSetCloseCallback(window, (userData, ulWindow) -> ulAppQuit(app), MemoryUtil.NULL);

        ulAppRun(app);
    }
}
