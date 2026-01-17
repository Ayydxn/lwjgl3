/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight.templates

import org.lwjgl.generator.*
import ultralight.*

val APPCORE = "AppCore".nativeClass(Module.ULTRALIGHT, "AppCore", prefix = "ul", prefixConstant =  "", binding = APPCORE_BINDING) {
    EnumConstant(
        "kWindowFlags_Borderless".enum("1 << 0"),
        "kWindowFlags_Titled".enum("1 << 1"),
        "kWindowFlags_Resizable".enum("1 << 2"),
        "kWindowFlags_Maximizable".enum("1 << 3"),
        "kWindowFlags_Hidden".enum("1 << 4")
    )

    ULSettings.p(
        "CreateSettings",
        void()
    )

    void(
        "DestroySettings",
        ULSettings.p("settings")
    )

    void(
        "SettingsSetDeveloperName",
        ULSettings.p("settings"),
        ULString.p("name")
    )

    void(
        "SettingsSetAppName",
        ULSettings.p("settings"),
        ULString.p("name")
    )

    void(
        "SettingsSetFileSystemPath",
        ULSettings.p("settings"),
        ULString.p("path")
    )

    void(
        "SettingsSetLoadShadersFromFileSystem",
        ULSettings.p("settings"),
        bool("enabled")
    )

    void(
        "SettingsSetForceCPURenderer",
        ULSettings.p("settings"),
        bool("forceCPU")
    )

    ULApp.p(
        "CreateApp",
        ULSettings.p("settings"),
        ULConfig.p("config")
    )

    void(
        "DestroyApp",
        ULApp.p("app")
    )

    void(
        "AppSetUpdateCallback",
        ULUpdateCallback("callback"),
        opaque_p("userData")
    )

    bool(
        "AppIsRunning",
        ULApp.p("app")
    )

    ULMonitor.p(
        "AppGetMainMonitor",
        ULApp.p("app")
    )

    ULRenderer.p(
        "AppGetRenderer",
        ULApp.p("app")
    )

    void(
        "AppRun",
        ULApp.p("app")
    )

    void(
        "AppQuit",
        ULApp.p("app")
    )

    double(
        "MonitorGetScale",
        ULMonitor.p("monitor")
    )

    unsigned_int(
        "MonitorGetWidth",
        ULMonitor.p("monitor")
    )

    unsigned_int(
        "MonitorGetHeight",
        ULMonitor.p("monitor")
    )

    ULWindow.p(
        "CreateWindow",
        ULMonitor.p("monitor"),
        unsigned_int("width"),
        unsigned_int("height"),
        bool("fullscreen"),
        unsigned_int("windowFlags")
    )

    void(
        "DestroyWindow",
        ULWindow.p("window")
    )

    void(
        "WindowSetCloseCallback",
        ULWindow.p("window"),
        ULCloseCallback("callback"),
        nullable..opaque_p("userData")
    )

    void(
        "WindowSetResizeCallback",
        ULWindow.p("window"),
        ULResizeCallback("callback"),
        nullable..opaque_p("userData")
    )

    unsigned_int(
        "WindowGetScreenWidth",
        ULWindow.p("window")
    )

    unsigned_int(
        "WindowGetWidth",
        ULWindow.p("window")
    )

    unsigned_int(
        "WindowGetScreenHeight",
        ULWindow.p("window")
    )

    unsigned_int(
        "WindowGetHeight",
        ULWindow.p("window")
    )

    void(
        "WindowMoveTo",
        ULWindow.p("window"),
        int("x"),
        int("y")
    )

    void(
        "WindowMoveToCenter",
        ULWindow.p("window")
    )

    int(
        "WindowGetPositionX",
        ULWindow.p("window")
    )

    int(
        "WindowGetPositionY",
        ULWindow.p("window")
    )

    bool(
        "WindowIsFullscreen",
        ULWindow.p("window")
    )

    double(
        "WindowGetScale",
        ULWindow.p("window")
    )

    void(
        "WindowSetTitle",
        ULWindow.p("window"),
        charASCII.const.p("title")
    )

    void(
        "WindowSetCursor",
        ULWindow.p("window"),
        ULCursor("cursor")
    )

    void(
        "WindowShow",
        ULWindow.p("window")
    )

    void(
        "WindowHide",
        ULWindow.p("window")
    )

    bool(
        "WindowIsVisible",
        ULWindow.p("window")
    )

    void(
        "WindowClose",
        ULWindow.p("window")
    )

    int(
        "WindowScreenToPixels",
        ULWindow.p("window"),
        int("dpiScale")
    )

    int(
        "WindowPixelsToScreen",
        ULWindow.p("window"),
        int("dpiScale")
    )

    opaque_p(
        "WindowGetNativeHandle",
        ULWindow.p("window")
    )

    ULOverlay.p(
        "CreateOverlay",
        ULWindow.p("window"),
        unsigned_int("width"),
        unsigned_int("height"),
        int("x"),
        int("y")
    )

    ULOverlay.p(
        "CreateOverlayWithView",
        ULView.p("view"),
        int("x"),
        int("y")
    )

    void(
        "DestroyOverlay",
        ULOverlay.p("overlay")
    )

    ULView.p(
        "OverlayGetView",
        ULOverlay.p("overlay")
    )

    unsigned_int(
        "OverlayGetWidth",
        ULOverlay.p("overlay")
    )

    unsigned_int(
        "OverlayGetHeight",
        ULOverlay.p("overlay")
    )

    int(
        "OverlayGetX",
        ULOverlay.p("overlay")
    )

    int(
        "OverlayGetY",
        ULOverlay.p("overlay")
    )

    void(
        "OverlayMoveTo",
        ULOverlay.p("overlay"),
        int("x"),
        int("y")
    )

    void(
        "OverlayResize",
        ULOverlay.p("overlay"),
        unsigned_int("width"),
        unsigned_int("height")
    )

    bool(
        "OverlayIsHidden",
        ULOverlay.p("overlay")
    )

    void(
        "OverlayHide",
        ULOverlay.p("overlay")
    )

    void(
        "OverlayShow",
        ULOverlay.p("overlay")
    )

    bool(
        "OverlayHasFocus",
        ULOverlay.p("overlay")
    )

    void(
        "OverlayFocus",
        ULOverlay.p("overlay")
    )

    void(
        "OverlayUnfocus",
        ULOverlay.p("overlay")
    )

    void(
        "EnablePlatformFontLoader",
        void()
    )

    void(
        "EnablePlatformFileSystem",
        ULString.p("baseDir")
    )

    void(
        "EnableDefaultLogger",
        ULString.p("logPath")
    )
}
