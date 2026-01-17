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

    public static final int
        kWindowFlags_Borderless  = 1 << 0,
        kWindowFlags_Titled      = 1 << 1,
        kWindowFlags_Resizable   = 1 << 2,
        kWindowFlags_Maximizable = 1 << 3,
        kWindowFlags_Hidden      = 1 << 4;

    protected AppCore() {
        throw new UnsupportedOperationException();
    }

    // --- [ ulCreateSettings ] ---

    /** {@code C_Settings * ulCreateSettings(void)} */
    @NativeType("C_Settings *")
    public static long ulCreateSettings() {
        long __functionAddress = Functions.CreateSettings;
        return invokeP(__functionAddress);
    }

    // --- [ ulDestroySettings ] ---

    /** {@code void ulDestroySettings(C_Settings * settings)} */
    public static void ulDestroySettings(@NativeType("C_Settings *") long settings) {
        long __functionAddress = Functions.DestroySettings;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, __functionAddress);
    }

    // --- [ ulSettingsSetDeveloperName ] ---

    /** {@code void ulSettingsSetDeveloperName(C_Settings * settings, C_String * name)} */
    public static void ulSettingsSetDeveloperName(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long name) {
        long __functionAddress = Functions.SettingsSetDeveloperName;
        if (CHECKS) {
            check(settings);
            check(name);
        }
        invokePPV(settings, name, __functionAddress);
    }

    // --- [ ulSettingsSetAppName ] ---

    /** {@code void ulSettingsSetAppName(C_Settings * settings, C_String * name)} */
    public static void ulSettingsSetAppName(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long name) {
        long __functionAddress = Functions.SettingsSetAppName;
        if (CHECKS) {
            check(settings);
            check(name);
        }
        invokePPV(settings, name, __functionAddress);
    }

    // --- [ ulSettingsSetFileSystemPath ] ---

    /** {@code void ulSettingsSetFileSystemPath(C_Settings * settings, C_String * path)} */
    public static void ulSettingsSetFileSystemPath(@NativeType("C_Settings *") long settings, @NativeType("C_String *") long path) {
        long __functionAddress = Functions.SettingsSetFileSystemPath;
        if (CHECKS) {
            check(settings);
            check(path);
        }
        invokePPV(settings, path, __functionAddress);
    }

    // --- [ ulSettingsSetLoadShadersFromFileSystem ] ---

    /** {@code void ulSettingsSetLoadShadersFromFileSystem(C_Settings * settings, bool enabled)} */
    public static void ulSettingsSetLoadShadersFromFileSystem(@NativeType("C_Settings *") long settings, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SettingsSetLoadShadersFromFileSystem;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, enabled, __functionAddress);
    }

    // --- [ ulSettingsSetForceCPURenderer ] ---

    /** {@code void ulSettingsSetForceCPURenderer(C_Settings * settings, bool forceCPU)} */
    public static void ulSettingsSetForceCPURenderer(@NativeType("C_Settings *") long settings, @NativeType("bool") boolean forceCPU) {
        long __functionAddress = Functions.SettingsSetForceCPURenderer;
        if (CHECKS) {
            check(settings);
        }
        invokePV(settings, forceCPU, __functionAddress);
    }

    // --- [ ulCreateApp ] ---

    /** {@code C_App * ulCreateApp(C_Settings * settings, C_Config * config)} */
    @NativeType("C_App *")
    public static long ulCreateApp(@NativeType("C_Settings *") long settings, @NativeType("C_Config *") long config) {
        long __functionAddress = Functions.CreateApp;
        if (CHECKS) {
            check(settings);
            check(config);
        }
        return invokePPP(settings, config, __functionAddress);
    }

    // --- [ ulDestroyApp ] ---

    /** {@code void ulDestroyApp(C_App * app)} */
    public static void ulDestroyApp(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.DestroyApp;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulAppSetUpdateCallback ] ---

    /** {@code void ulAppSetUpdateCallback(ULUpdateCallback callback, void * userData)} */
    public static void nulAppSetUpdateCallback(long callback, long userData) {
        long __functionAddress = Functions.AppSetUpdateCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulAppSetUpdateCallback(ULUpdateCallback callback, void * userData)} */
    public static void ulAppSetUpdateCallback(@NativeType("ULUpdateCallback") ULUpdateCallbackI callback, @NativeType("void *") long userData) {
        nulAppSetUpdateCallback(callback.address(), userData);
    }

    // --- [ ulAppIsRunning ] ---

    /** {@code bool ulAppIsRunning(C_App * app)} */
    @NativeType("bool")
    public static boolean ulAppIsRunning(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppIsRunning;
        if (CHECKS) {
            check(app);
        }
        return invokePZ(app, __functionAddress);
    }

    // --- [ ulAppGetMainMonitor ] ---

    /** {@code C_Monitor * ulAppGetMainMonitor(C_App * app)} */
    @NativeType("C_Monitor *")
    public static long ulAppGetMainMonitor(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppGetMainMonitor;
        if (CHECKS) {
            check(app);
        }
        return invokePP(app, __functionAddress);
    }

    // --- [ ulAppGetRenderer ] ---

    /** {@code C_Renderer * ulAppGetRenderer(C_App * app)} */
    @NativeType("C_Renderer *")
    public static long ulAppGetRenderer(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppGetRenderer;
        if (CHECKS) {
            check(app);
        }
        return invokePP(app, __functionAddress);
    }

    // --- [ ulAppRun ] ---

    /** {@code void ulAppRun(C_App * app)} */
    public static void ulAppRun(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppRun;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulAppQuit ] ---

    /** {@code void ulAppQuit(C_App * app)} */
    public static void ulAppQuit(@NativeType("C_App *") long app) {
        long __functionAddress = Functions.AppQuit;
        if (CHECKS) {
            check(app);
        }
        invokePV(app, __functionAddress);
    }

    // --- [ ulMonitorGetScale ] ---

    /** {@code double ulMonitorGetScale(C_Monitor * monitor)} */
    public static double ulMonitorGetScale(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetScale;
        if (CHECKS) {
            check(monitor);
        }
        return invokePD(monitor, __functionAddress);
    }

    // --- [ ulMonitorGetWidth ] ---

    /** {@code unsigned int ulMonitorGetWidth(C_Monitor * monitor)} */
    @NativeType("unsigned int")
    public static int ulMonitorGetWidth(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetWidth;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ ulMonitorGetHeight ] ---

    /** {@code unsigned int ulMonitorGetHeight(C_Monitor * monitor)} */
    @NativeType("unsigned int")
    public static int ulMonitorGetHeight(@NativeType("C_Monitor *") long monitor) {
        long __functionAddress = Functions.MonitorGetHeight;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ ulCreateWindow ] ---

    /** {@code C_Window * ulCreateWindow(C_Monitor * monitor, unsigned int width, unsigned int height, bool fullscreen, unsigned int windowFlags)} */
    @NativeType("C_Window *")
    public static long ulCreateWindow(@NativeType("C_Monitor *") long monitor, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("bool") boolean fullscreen, @NativeType("unsigned int") int windowFlags) {
        long __functionAddress = Functions.CreateWindow;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, width, height, fullscreen, windowFlags, __functionAddress);
    }

    // --- [ ulDestroyWindow ] ---

    /** {@code void ulDestroyWindow(C_Window * window)} */
    public static void ulDestroyWindow(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowSetCloseCallback ] ---

    /** {@code void ulWindowSetCloseCallback(C_Window * window, ULCloseCallback callback, void * userData)} */
    public static void nulWindowSetCloseCallback(long window, long callback, long userData) {
        long __functionAddress = Functions.WindowSetCloseCallback;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, callback, userData, __functionAddress);
    }

    /** {@code void ulWindowSetCloseCallback(C_Window * window, ULCloseCallback callback, void * userData)} */
    public static void ulWindowSetCloseCallback(@NativeType("C_Window *") long window, @NativeType("ULCloseCallback") ULCloseCallbackI callback, @NativeType("void *") long userData) {
        nulWindowSetCloseCallback(window, callback.address(), userData);
    }

    // --- [ ulWindowSetResizeCallback ] ---

    /** {@code void ulWindowSetResizeCallback(C_Window * window, ULResizeCallback callback, void * userData)} */
    public static void nulWindowSetResizeCallback(long window, long callback, long userData) {
        long __functionAddress = Functions.WindowSetResizeCallback;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, callback, userData, __functionAddress);
    }

    /** {@code void ulWindowSetResizeCallback(C_Window * window, ULResizeCallback callback, void * userData)} */
    public static void ulWindowSetResizeCallback(@NativeType("C_Window *") long window, @NativeType("ULResizeCallback") ULResizeCallbackI callback, @NativeType("void *") long userData) {
        nulWindowSetResizeCallback(window, callback.address(), userData);
    }

    // --- [ ulWindowGetScreenWidth ] ---

    /** {@code unsigned int ulWindowGetScreenWidth(C_Window * window)} */
    @NativeType("unsigned int")
    public static int ulWindowGetScreenWidth(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScreenWidth;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetWidth ] ---

    /** {@code unsigned int ulWindowGetWidth(C_Window * window)} */
    @NativeType("unsigned int")
    public static int ulWindowGetWidth(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetWidth;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetScreenHeight ] ---

    /** {@code unsigned int ulWindowGetScreenHeight(C_Window * window)} */
    @NativeType("unsigned int")
    public static int ulWindowGetScreenHeight(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScreenHeight;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetHeight ] ---

    /** {@code unsigned int ulWindowGetHeight(C_Window * window)} */
    @NativeType("unsigned int")
    public static int ulWindowGetHeight(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetHeight;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowMoveTo ] ---

    /** {@code void ulWindowMoveTo(C_Window * window, int x, int y)} */
    public static void ulWindowMoveTo(@NativeType("C_Window *") long window, int x, int y) {
        long __functionAddress = Functions.WindowMoveTo;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, x, y, __functionAddress);
    }

    // --- [ ulWindowMoveToCenter ] ---

    /** {@code void ulWindowMoveToCenter(C_Window * window)} */
    public static void ulWindowMoveToCenter(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowMoveToCenter;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowGetPositionX ] ---

    /** {@code int ulWindowGetPositionX(C_Window * window)} */
    public static int ulWindowGetPositionX(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetPositionX;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowGetPositionY ] ---

    /** {@code int ulWindowGetPositionY(C_Window * window)} */
    public static int ulWindowGetPositionY(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetPositionY;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ ulWindowIsFullscreen ] ---

    /** {@code bool ulWindowIsFullscreen(C_Window * window)} */
    @NativeType("bool")
    public static boolean ulWindowIsFullscreen(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowIsFullscreen;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ ulWindowGetScale ] ---

    /** {@code double ulWindowGetScale(C_Window * window)} */
    public static double ulWindowGetScale(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetScale;
        if (CHECKS) {
            check(window);
        }
        return invokePD(window, __functionAddress);
    }

    // --- [ ulWindowSetTitle ] ---

    /** {@code void ulWindowSetTitle(C_Window * window, char const * title)} */
    public static void nulWindowSetTitle(long window, long title) {
        long __functionAddress = Functions.WindowSetTitle;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, title, __functionAddress);
    }

    /** {@code void ulWindowSetTitle(C_Window * window, char const * title)} */
    public static void ulWindowSetTitle(@NativeType("C_Window *") long window, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nulWindowSetTitle(window, memAddress(title));
    }

    /** {@code void ulWindowSetTitle(C_Window * window, char const * title)} */
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

    /** {@code void ulWindowSetCursor(C_Window * window, ULCursor cursor)} */
    public static void ulWindowSetCursor(@NativeType("C_Window *") long window, @NativeType("ULCursor") int cursor) {
        long __functionAddress = Functions.WindowSetCursor;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, cursor, __functionAddress);
    }

    // --- [ ulWindowShow ] ---

    /** {@code void ulWindowShow(C_Window * window)} */
    public static void ulWindowShow(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowShow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowHide ] ---

    /** {@code void ulWindowHide(C_Window * window)} */
    public static void ulWindowHide(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowHide;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowIsVisible ] ---

    /** {@code bool ulWindowIsVisible(C_Window * window)} */
    @NativeType("bool")
    public static boolean ulWindowIsVisible(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowIsVisible;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ ulWindowClose ] ---

    /** {@code void ulWindowClose(C_Window * window)} */
    public static void ulWindowClose(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowClose;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ ulWindowScreenToPixels ] ---

    /** {@code int ulWindowScreenToPixels(C_Window * window, int dpiScale)} */
    public static int ulWindowScreenToPixels(@NativeType("C_Window *") long window, int dpiScale) {
        long __functionAddress = Functions.WindowScreenToPixels;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, dpiScale, __functionAddress);
    }

    // --- [ ulWindowPixelsToScreen ] ---

    /** {@code int ulWindowPixelsToScreen(C_Window * window, int dpiScale)} */
    public static int ulWindowPixelsToScreen(@NativeType("C_Window *") long window, int dpiScale) {
        long __functionAddress = Functions.WindowPixelsToScreen;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, dpiScale, __functionAddress);
    }

    // --- [ ulWindowGetNativeHandle ] ---

    /** {@code void * ulWindowGetNativeHandle(C_Window * window)} */
    @NativeType("void *")
    public static long ulWindowGetNativeHandle(@NativeType("C_Window *") long window) {
        long __functionAddress = Functions.WindowGetNativeHandle;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ ulCreateOverlay ] ---

    /** {@code C_Overlay * ulCreateOverlay(C_Window * window, unsigned int width, unsigned int height, int x, int y)} */
    @NativeType("C_Overlay *")
    public static long ulCreateOverlay(@NativeType("C_Window *") long window, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, int x, int y) {
        long __functionAddress = Functions.CreateOverlay;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, width, height, x, y, __functionAddress);
    }

    // --- [ ulCreateOverlayWithView ] ---

    /** {@code C_Overlay * ulCreateOverlayWithView(C_View * view, int x, int y)} */
    @NativeType("C_Overlay *")
    public static long ulCreateOverlayWithView(@NativeType("C_View *") long view, int x, int y) {
        long __functionAddress = Functions.CreateOverlayWithView;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, x, y, __functionAddress);
    }

    // --- [ ulDestroyOverlay ] ---

    /** {@code void ulDestroyOverlay(C_Overlay * overlay)} */
    public static void ulDestroyOverlay(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.DestroyOverlay;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetView ] ---

    /** {@code C_View * ulOverlayGetView(C_Overlay * overlay)} */
    @NativeType("C_View *")
    public static long ulOverlayGetView(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetView;
        if (CHECKS) {
            check(overlay);
        }
        return invokePP(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetWidth ] ---

    /** {@code unsigned int ulOverlayGetWidth(C_Overlay * overlay)} */
    @NativeType("unsigned int")
    public static int ulOverlayGetWidth(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetWidth;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetHeight ] ---

    /** {@code unsigned int ulOverlayGetHeight(C_Overlay * overlay)} */
    @NativeType("unsigned int")
    public static int ulOverlayGetHeight(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetHeight;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetX ] ---

    /** {@code int ulOverlayGetX(C_Overlay * overlay)} */
    public static int ulOverlayGetX(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetX;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayGetY ] ---

    /** {@code int ulOverlayGetY(C_Overlay * overlay)} */
    public static int ulOverlayGetY(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayGetY;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, __functionAddress);
    }

    // --- [ ulOverlayMoveTo ] ---

    /** {@code void ulOverlayMoveTo(C_Overlay * overlay, int x, int y)} */
    public static void ulOverlayMoveTo(@NativeType("C_Overlay *") long overlay, int x, int y) {
        long __functionAddress = Functions.OverlayMoveTo;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, x, y, __functionAddress);
    }

    // --- [ ulOverlayResize ] ---

    /** {@code void ulOverlayResize(C_Overlay * overlay, unsigned int width, unsigned int height)} */
    public static void ulOverlayResize(@NativeType("C_Overlay *") long overlay, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height) {
        long __functionAddress = Functions.OverlayResize;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, width, height, __functionAddress);
    }

    // --- [ ulOverlayIsHidden ] ---

    /** {@code bool ulOverlayIsHidden(C_Overlay * overlay)} */
    @NativeType("bool")
    public static boolean ulOverlayIsHidden(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayIsHidden;
        if (CHECKS) {
            check(overlay);
        }
        return invokePZ(overlay, __functionAddress);
    }

    // --- [ ulOverlayHide ] ---

    /** {@code void ulOverlayHide(C_Overlay * overlay)} */
    public static void ulOverlayHide(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayHide;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayShow ] ---

    /** {@code void ulOverlayShow(C_Overlay * overlay)} */
    public static void ulOverlayShow(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayShow;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayHasFocus ] ---

    /** {@code bool ulOverlayHasFocus(C_Overlay * overlay)} */
    @NativeType("bool")
    public static boolean ulOverlayHasFocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayHasFocus;
        if (CHECKS) {
            check(overlay);
        }
        return invokePZ(overlay, __functionAddress);
    }

    // --- [ ulOverlayFocus ] ---

    /** {@code void ulOverlayFocus(C_Overlay * overlay)} */
    public static void ulOverlayFocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayFocus;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulOverlayUnfocus ] ---

    /** {@code void ulOverlayUnfocus(C_Overlay * overlay)} */
    public static void ulOverlayUnfocus(@NativeType("C_Overlay *") long overlay) {
        long __functionAddress = Functions.OverlayUnfocus;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ ulEnablePlatformFontLoader ] ---

    /** {@code void ulEnablePlatformFontLoader(void)} */
    public static void ulEnablePlatformFontLoader() {
        long __functionAddress = Functions.EnablePlatformFontLoader;
        invokeV(__functionAddress);
    }

    // --- [ ulEnablePlatformFileSystem ] ---

    /** {@code void ulEnablePlatformFileSystem(C_String * baseDir)} */
    public static void ulEnablePlatformFileSystem(@NativeType("C_String *") long baseDir) {
        long __functionAddress = Functions.EnablePlatformFileSystem;
        if (CHECKS) {
            check(baseDir);
        }
        invokePV(baseDir, __functionAddress);
    }

    // --- [ ulEnableDefaultLogger ] ---

    /** {@code void ulEnableDefaultLogger(C_String * logPath)} */
    public static void ulEnableDefaultLogger(@NativeType("C_String *") long logPath) {
        long __functionAddress = Functions.EnableDefaultLogger;
        if (CHECKS) {
            check(logPath);
        }
        invokePV(logPath, __functionAddress);
    }

}