/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AppCore {

    private static final SharedLibrary APPCORE = Library.loadNative(AppCore.class, "org.lwjgl.ultralight", "AppCore");

    /** Contains the function pointers loaded from the AppCore {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateSettings                       = apiGetFunctionAddress(APPCORE, "ulCreateSettings"),
            DestroySettings                      = apiGetFunctionAddress(APPCORE, "ulDestroySettings"),
            SettingsSetDeveloperName             = apiGetFunctionAddress(APPCORE, "ulSettingsSetDeveloperName"),
            SettingsSetAppName                   = apiGetFunctionAddress(APPCORE, "ulSettingsSetAppName"),
            SettingsSetFileSystemPath            = apiGetFunctionAddress(APPCORE, "ulSettingsSetFileSystemPath"),
            SettingsSetLoadShadersFromFileSystem = apiGetFunctionAddress(APPCORE, "ulSettingsSetLoadShadersFromFileSystem"),
            SettingsSetForceCPURenderer          = apiGetFunctionAddress(APPCORE, "ulSettingsSetForceCPURenderer"),
            CreateApp                            = apiGetFunctionAddress(APPCORE, "ulCreateApp"),
            DestroyApp                           = apiGetFunctionAddress(APPCORE, "ulDestroyApp"),
            AppSetUpdateCallback                 = apiGetFunctionAddress(APPCORE, "ulAppSetUpdateCallback"),
            AppIsRunning                         = apiGetFunctionAddress(APPCORE, "ulAppIsRunning"),
            AppGetMainMonitor                    = apiGetFunctionAddress(APPCORE, "ulAppGetMainMonitor"),
            AppGetRenderer                       = apiGetFunctionAddress(APPCORE, "ulAppGetRenderer"),
            AppRun                               = apiGetFunctionAddress(APPCORE, "ulAppRun"),
            AppQuit                              = apiGetFunctionAddress(APPCORE, "ulAppQuit"),
            MonitorGetScale                      = apiGetFunctionAddress(APPCORE, "ulMonitorGetScale"),
            MonitorGetWidth                      = apiGetFunctionAddress(APPCORE, "ulMonitorGetWidth"),
            MonitorGetHeight                     = apiGetFunctionAddress(APPCORE, "ulMonitorGetHeight"),
            CreateWindow                         = apiGetFunctionAddress(APPCORE, "ulCreateWindow"),
            DestroyWindow                        = apiGetFunctionAddress(APPCORE, "ulDestroyWindow"),
            WindowSetCloseCallback               = apiGetFunctionAddress(APPCORE, "ulWindowSetCloseCallback"),
            WindowSetResizeCallback              = apiGetFunctionAddress(APPCORE, "ulWindowSetResizeCallback"),
            WindowGetScreenWidth                 = apiGetFunctionAddress(APPCORE, "ulWindowGetScreenWidth"),
            WindowGetWidth                       = apiGetFunctionAddress(APPCORE, "ulWindowGetWidth"),
            WindowGetScreenHeight                = apiGetFunctionAddress(APPCORE, "ulWindowGetScreenHeight"),
            WindowGetHeight                      = apiGetFunctionAddress(APPCORE, "ulWindowGetHeight"),
            WindowMoveTo                         = apiGetFunctionAddress(APPCORE, "ulWindowMoveTo"),
            WindowMoveToCenter                   = apiGetFunctionAddress(APPCORE, "ulWindowMoveToCenter"),
            WindowGetPositionX                   = apiGetFunctionAddress(APPCORE, "ulWindowGetPositionX"),
            WindowGetPositionY                   = apiGetFunctionAddress(APPCORE, "ulWindowGetPositionY"),
            WindowIsFullscreen                   = apiGetFunctionAddress(APPCORE, "ulWindowIsFullscreen"),
            WindowGetScale                       = apiGetFunctionAddress(APPCORE, "ulWindowGetScale"),
            WindowSetTitle                       = apiGetFunctionAddress(APPCORE, "ulWindowSetTitle"),
            WindowSetCursor                      = apiGetFunctionAddress(APPCORE, "ulWindowSetCursor"),
            WindowShow                           = apiGetFunctionAddress(APPCORE, "ulWindowShow"),
            WindowHide                           = apiGetFunctionAddress(APPCORE, "ulWindowHide"),
            WindowIsVisible                      = apiGetFunctionAddress(APPCORE, "ulWindowIsVisible"),
            WindowClose                          = apiGetFunctionAddress(APPCORE, "ulWindowClose"),
            WindowScreenToPixels                 = apiGetFunctionAddress(APPCORE, "ulWindowScreenToPixels"),
            WindowPixelsToScreen                 = apiGetFunctionAddress(APPCORE, "ulWindowPixelsToScreen"),
            WindowGetNativeHandle                = apiGetFunctionAddress(APPCORE, "ulWindowGetNativeHandle"),
            CreateOverlay                        = apiGetFunctionAddress(APPCORE, "ulCreateOverlay"),
            CreateOverlayWithView                = apiGetFunctionAddress(APPCORE, "ulCreateOverlayWithView"),
            DestroyOverlay                       = apiGetFunctionAddress(APPCORE, "ulDestroyOverlay"),
            OverlayGetView                       = apiGetFunctionAddress(APPCORE, "ulOverlayGetView"),
            OverlayGetWidth                      = apiGetFunctionAddress(APPCORE, "ulOverlayGetWidth"),
            OverlayGetHeight                     = apiGetFunctionAddress(APPCORE, "ulOverlayGetHeight"),
            OverlayGetX                          = apiGetFunctionAddress(APPCORE, "ulOverlayGetX"),
            OverlayGetY                          = apiGetFunctionAddress(APPCORE, "ulOverlayGetY"),
            OverlayMoveTo                        = apiGetFunctionAddress(APPCORE, "ulOverlayMoveTo"),
            OverlayResize                        = apiGetFunctionAddress(APPCORE, "ulOverlayResize"),
            OverlayIsHidden                      = apiGetFunctionAddress(APPCORE, "ulOverlayIsHidden"),
            OverlayHide                          = apiGetFunctionAddress(APPCORE, "ulOverlayHide"),
            OverlayShow                          = apiGetFunctionAddress(APPCORE, "ulOverlayShow"),
            OverlayHasFocus                      = apiGetFunctionAddress(APPCORE, "ulOverlayHasFocus"),
            OverlayFocus                         = apiGetFunctionAddress(APPCORE, "ulOverlayFocus"),
            OverlayUnfocus                       = apiGetFunctionAddress(APPCORE, "ulOverlayUnfocus"),
            EnablePlatformFontLoader             = apiGetFunctionAddress(APPCORE, "ulEnablePlatformFontLoader"),
            EnablePlatformFileSystem             = apiGetFunctionAddress(APPCORE, "ulEnablePlatformFileSystem"),
            EnableDefaultLogger                  = apiGetFunctionAddress(APPCORE, "ulEnableDefaultLogger");

    }

    /** Returns the AppCore {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return APPCORE;
    }

    /**
     * ULWindowFlags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kWindowFlags_Borderless kWindowFlags_Borderless} - 1 << 0</li>
     * <li>{@link #kWindowFlags_Titled kWindowFlags_Titled} - 1 << 1</li>
     * <li>{@link #kWindowFlags_Resizable kWindowFlags_Resizable} - 1 << 2</li>
     * <li>{@link #kWindowFlags_Maximizable kWindowFlags_Maximizable} - 1 << 3</li>
     * <li>{@link #kWindowFlags_Hidden kWindowFlags_Hidden} - 1 << 4</li>
     * </ul>
     */
    public static final int
        kWindowFlags_Borderless  = 0,
        kWindowFlags_Titled      = 1,
        kWindowFlags_Resizable   = 2,
        kWindowFlags_Maximizable = 3,
        kWindowFlags_Hidden      = 4;

    protected AppCore() {
        throw new UnsupportedOperationException();
    }

    // --- [ ulCreateSettings ] ---

    @NativeType("C_Settings *")
    public static long ulCreateSettings() {
        long __functionAddress = Functions.CreateSettings;
        return invokeP(__functionAddress);
    }

    // --- [ ulDestroySettings ] ---

    public static void ulDestroySettings(@NativeType("C_Settings *") long settings) {
        long __functionAddress = Functions.DestroySettings;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, __functionAddress);
    }

    // --- [ ulSettingsSetDeveloperName ] ---

    public static void ulSettingsSetDeveloperName(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long name) {
        long __functionAddress = Functions.SettingsSetDeveloperName;
        if (CHECKS) {
            check(settings);
            check(name);
        }
        invokePPV(settings, name, __functionAddress);
    }

    // --- [ ulSettingsSetAppName ] ---

    public static void ulSettingsSetAppName(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long name) {
        long __functionAddress = Functions.SettingsSetAppName;
        if (CHECKS) {
            check(settings);
            check(name);
        }
        invokePPV(settings, name, __functionAddress);
    }

    // --- [ ulSettingsSetFileSystemPath ] ---

    public static void ulSettingsSetFileSystemPath(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long path) {
        long __functionAddress = Functions.SettingsSetFileSystemPath;
        if (CHECKS) {
            check(settings);
            check(path);
        }
        invokePPV(settings, path, __functionAddress);
    }

    // --- [ ulSettingsSetLoadShadersFromFileSystem ] ---

    public static void ulSettingsSetLoadShadersFromFileSystem(@NativeType("C_Settings *") long settings, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SettingsSetLoadShadersFromFileSystem;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, enabled, __functionAddress);
    }

    // --- [ ulSettingsSetForceCPURenderer ] ---

    public static void ulSettingsSetForceCPURenderer(@NativeType("C_Settings *") long settings, @NativeType("bool") boolean forceCPU) {
        long __functionAddress = Functions.SettingsSetForceCPURenderer;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, forceCPU, __functionAddress);
    }

    // --- [ ulCreateApp ] ---

    @NativeType("C_App *")
    public static long ulCreateApp(@NativeType("C_Settings *") long settings, @NativeType("C_Config *") long config) {
        long __functionAddress = Functions.CreateApp;
        return invokePPP(settings, config, __functionAddress);
    }

    // --- [ ulDestroyApp ] ---

    public static void ulDestroyApp(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.DestroyApp;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulAppSetUpdateCallback ] ---

    public static void nulAppSetUpdateCallback(long callback, long userData) {
        long __functionAddress = Functions.AppSetUpdateCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    public static void ulAppSetUpdateCallback(@NativeType("ULUpdateCallback") ULUpdateCallbackI callback, @NativeType("void *") long userData) {
        nulAppSetUpdateCallback(callback.address(), userData);
    }

    // --- [ ulAppIsRunning ] ---

    @NativeType("bool")
    public static boolean ulAppIsRunning(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppIsRunning;
        if (CHECKS) {
            check(app);
        }
        return invokePZ(app, __functionAddress);
    }

    // --- [ ulAppGetMainMonitor ] ---

    @NativeType("C_Monitor *")
    public static long ulAppGetMainMonitor(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppGetMainMonitor;
        if (CHECKS) {
            check(app);
        }
        return invokePP(app, __functionAddress);
    }

    // --- [ ulAppGetRenderer ] ---

    @NativeType("C_Renderer *")
    public static long ulAppGetRenderer(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppGetRenderer;
        if (CHECKS) {
            check(app);
        }
        return invokePP(app, __functionAddress);
    }

    // --- [ ulAppRun ] ---

    public static void ulAppRun(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppRun;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulAppQuit ] ---

    public static void ulAppQuit(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppQuit;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulMonitorGetScale ] ---

    public static double ulMonitorGetScale(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetScale;
        if (CHECKS) {
            check(monitor);
        }
        return invokePD(monitor, __functionAddress);
    }

    // --- [ ulMonitorGetWidth ] ---

    @NativeType("unsigned int")
    public static int ulMonitorGetWidth(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetWidth;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ ulMonitorGetHeight ] ---

    @NativeType("unsigned int")
    public static int ulMonitorGetHeight(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetHeight;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ ulCreateWindow ] ---

    @NativeType("C_Window *")
    public static long ulCreateWindow(@NativeType("C_Monitor *") long monitor, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("bool") boolean fullscreen, @NativeType("unsigned int") int windowFlags) {
        long __functionAddress = Functions.CreateWindow;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, width, height, fullscreen, windowFlags, __functionAddress);
    }

    // --- [ ulDestroyWindow ] ---

    public static void ulDestroyWindow(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowSetCloseCallback ] ---

    public static void nulWindowSetCloseCallback(long window, long callback, long userData) {
        long __functionAddress = Functions.WindowSetCloseCallback;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, callback, userData, __functionAddress);
    }

    public static void ulWindowSetCloseCallback(@NativeType("C_Window *") long window, @NativeType("ULCloseCallback") ULCloseCallbackI callback, @NativeType("void *") long userData) {
        nulWindowSetCloseCallback(window, callback.address(), userData);
    }

    // --- [ ulWindowSetResizeCallback ] ---

    public static void nulWindowSetResizeCallback(long window, long callback, long userData) {
        long __functionAddress = Functions.WindowSetResizeCallback;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, callback, userData, __functionAddress);
    }

    public static void ulWindowSetResizeCallback(@NativeType("C_Window *") long window, @NativeType("ULResizeCallback") ULResizeCallbackI callback, @NativeType("void *") long userData) {
        nulWindowSetResizeCallback(window, callback.address(), userData);
    }

    // --- [ ulWindowGetScreenWidth ] ---

    @NativeType("unsigned int")
    public static int ulWindowGetScreenWidth(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScreenWidth;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetWidth ] ---

    @NativeType("unsigned int")
    public static int ulWindowGetWidth(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetWidth;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetScreenHeight ] ---

    @NativeType("unsigned int")
    public static int ulWindowGetScreenHeight(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScreenHeight;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetHeight ] ---

    @NativeType("unsigned int")
    public static int ulWindowGetHeight(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetHeight;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowMoveTo ] ---

    public static void ulWindowMoveTo(@NativeType("C_Window *") long window, int x, int y) {
        long __functionAddress = Functions.WindowMoveTo;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, x, y, __functionAddress);
    }

    // --- [ ulWindowMoveToCenter ] ---

    public static void ulWindowMoveToCenter(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowMoveToCenter;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowGetPositionX ] ---

    public static int ulWindowGetPositionX(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetPositionX;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetPositionY ] ---

    public static int ulWindowGetPositionY(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetPositionY;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowIsFullscreen ] ---

    @NativeType("bool")
    public static boolean ulWindowIsFullscreen(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowIsFullscreen;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ ulWindowGetScale ] ---

    public static double ulWindowGetScale(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScale;
        if (CHECKS) {
            check(window);
        }
        return invokePD(window, __functionAddress);
    }

    // --- [ ulWindowSetTitle ] ---

    public static void nulWindowSetTitle(long window, long title) {
        long __functionAddress = Functions.WindowSetTitle;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, title, __functionAddress);
    }

    public static void ulWindowSetTitle(@NativeType("C_Window *") long window, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nulWindowSetTitle(window, memAddress(title));
    }

    public static void ulWindowSetTitle(@NativeType("C_Window *") long window, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(title, true);
            long titleEncoded = stack.getPointerAddress();
            nulWindowSetTitle(window, titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulWindowSetCursor ] ---

    public static void ulWindowSetCursor(@NativeType("C_Window *") long window, @NativeType("ULCursor") int cursor) {
        long __functionAddress = Functions.WindowSetCursor;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, cursor, __functionAddress);
    }

    // --- [ ulWindowShow ] ---

    public static void ulWindowShow(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowShow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowHide ] ---

    public static void ulWindowHide(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowHide;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowIsVisible ] ---

    @NativeType("bool")
    public static boolean ulWindowIsVisible(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowIsVisible;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ ulWindowClose ] ---

    public static void ulWindowClose(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowClose;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowScreenToPixels ] ---

    public static int ulWindowScreenToPixels(@NativeType("C_Window *") long window, int dpiScale) {
        long __functionAddress = Functions.WindowScreenToPixels;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, dpiScale, __functionAddress);
    }

    // --- [ ulWindowPixelsToScreen ] ---

    public static int ulWindowPixelsToScreen(@NativeType("C_Window *") long window, int dpiScale) {
        long __functionAddress = Functions.WindowPixelsToScreen;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, dpiScale, __functionAddress);
    }

    // --- [ ulWindowGetNativeHandle ] ---

    @NativeType("void *")
    public static long ulWindowGetNativeHandle(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetNativeHandle;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ ulCreateOverlay ] ---

    @NativeType("C_Overlay *")
    public static long ulCreateOverlay(@NativeType("C_Window *") long window, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, int x, int y) {
        long __functionAddress = Functions.CreateOverlay;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, width, height, x, y, __functionAddress);
    }

    // --- [ ulCreateOverlayWithView ] ---

    @NativeType("C_Overlay *")
    public static long ulCreateOverlayWithView(@NativeType("C_View *") long view, int x, int y) {
        long __functionAddress = Functions.CreateOverlayWithView;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, x, y, __functionAddress);
    }

    // --- [ ulDestroyOverlay ] ---

    public static void ulDestroyOverlay(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.DestroyOverlay;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetView ] ---

    @NativeType("C_View *")
    public static long ulOverlayGetView(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetView;
        if (CHECKS) {
            check(overlay);
        }
        return invokePP(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetWidth ] ---

    @NativeType("unsigned int")
    public static int ulOverlayGetWidth(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetWidth;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetHeight ] ---

    @NativeType("unsigned int")
    public static int ulOverlayGetHeight(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetHeight;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetX ] ---

    public static int ulOverlayGetX(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetX;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetY ] ---

    public static int ulOverlayGetY(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetY;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayMoveTo ] ---

    public static void ulOverlayMoveTo(@NativeType("C_Overlay *") long overlay, int x, int y) {
        long __functionAddress = Functions.OverlayMoveTo;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, x, y, __functionAddress);
    }

    // --- [ ulOverlayResize ] ---

    public static void ulOverlayResize(@NativeType("C_Overlay *") long overlay, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height) {
        long __functionAddress = Functions.OverlayResize;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, width, height, __functionAddress);
    }

    // --- [ ulOverlayIsHidden ] ---

    @NativeType("bool")
    public static boolean ulOverlayIsHidden(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayIsHidden;
        if (CHECKS) {
            check(overlay);
        }
        return invokePZ(overlay, __functionAddress);
    }

    // --- [ ulOverlayHide ] ---

    public static void ulOverlayHide(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayHide;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayShow ] ---

    public static void ulOverlayShow(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayShow;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayHasFocus ] ---

    @NativeType("bool")
    public static boolean ulOverlayHasFocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayHasFocus;
        if (CHECKS) {
            check(overlay);
        }
        return invokePZ(overlay, __functionAddress);
    }

    // --- [ ulOverlayFocus ] ---

    public static void ulOverlayFocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayFocus;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayUnfocus ] ---

    public static void ulOverlayUnfocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayUnfocus;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulEnablePlatformFontLoader ] ---

    public static void ulEnablePlatformFontLoader() {
        long __functionAddress = Functions.EnablePlatformFontLoader;
        invokeV(__functionAddress);
    }

    // --- [ ulEnablePlatformFileSystem ] ---

    public static void ulEnablePlatformFileSystem(@NativeType("C_String *") long baseDir) {
        long __functionAddress = Functions.EnablePlatformFileSystem;
        if (CHECKS) {
            check(baseDir);
        }
        invokePV(baseDir, __functionAddress);
    }

    // --- [ ulEnableDefaultLogger ] ---

    public static void ulEnableDefaultLogger(@NativeType("C_String *") long logPath) {
        long __functionAddress = Functions.EnableDefaultLogger;
        if (CHECKS) {
            check(logPath);
        }
        invokePV(logPath, __functionAddress);
    }

}