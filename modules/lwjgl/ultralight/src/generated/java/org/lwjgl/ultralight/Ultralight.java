/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Ultralight {

    private static final SharedLibrary ULTRALIGHT = Library.loadNative(Ultralight.class, "org.lwjgl.ultralight", "Ultralight");

    /** Contains the function pointers loaded from the Ultralight {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            VersionString                        = apiGetFunctionAddress(ULTRALIGHT, "ulVersionString"),
            VersionMajor                         = apiGetFunctionAddress(ULTRALIGHT, "ulVersionMajor"),
            VersionMinor                         = apiGetFunctionAddress(ULTRALIGHT, "ulVersionMinor"),
            VersionPatch                         = apiGetFunctionAddress(ULTRALIGHT, "ulVersionPatch"),
            WebKitVersionString                  = apiGetFunctionAddress(ULTRALIGHT, "ulWebKitVersionString"),
            CreateBitmap                         = apiGetFunctionAddress(ULTRALIGHT, "ulCreateBitmap"),
            CreateBitmapFromPixels               = apiGetFunctionAddress(ULTRALIGHT, "ulCreateBitmapFromPixels"),
            CreateBitmapFromCopy                 = apiGetFunctionAddress(ULTRALIGHT, "ulCreateBitmapFromCopy"),
            DestroyBitmap                        = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyBitmap"),
            BitmapGetWidth                       = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetWidth"),
            BitmapGetHeight                      = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetHeight"),
            BitmapGetFormat                      = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetFormat"),
            BitmapGetBpp                         = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetBpp"),
            BitmapGetRowBytes                    = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetRowBytes"),
            BitmapGetSize                        = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapGetSize"),
            BitmapOwnsPixels                     = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapOwnsPixels"),
            BitmapLockPixels                     = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapLockPixels"),
            BitmapUnlockPixels                   = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapUnlockPixels"),
            BitmapRawPixels                      = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapRawPixels"),
            BitmapIsEmpty                        = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapIsEmpty"),
            BitmapErase                          = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapErase"),
            BitmapWritePNG                       = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapWritePNG"),
            BitmapSwapRedBlueChannels            = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapSwapRedBlueChannels"),
            CreateBuffer                         = apiGetFunctionAddress(ULTRALIGHT, "ulCreateBuffer"),
            CreateBufferFromCopy                 = apiGetFunctionAddress(ULTRALIGHT, "ulCreateBufferFromCopy"),
            DestroyBuffer                        = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyBuffer"),
            BufferGetData                        = apiGetFunctionAddress(ULTRALIGHT, "ulBufferGetData"),
            BufferGetSize                        = apiGetFunctionAddress(ULTRALIGHT, "ulBufferGetSize"),
            BufferGetUserData                    = apiGetFunctionAddress(ULTRALIGHT, "ulBufferGetUserData"),
            BufferOwnsData                       = apiGetFunctionAddress(ULTRALIGHT, "ulBufferOwnsData"),
            CreateConfig                         = apiGetFunctionAddress(ULTRALIGHT, "ulCreateConfig"),
            DestroyConfig                        = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyConfig"),
            ConfigSetCachePath                   = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetCachePath"),
            ConfigSetResourcePathPrefix          = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetResourcePathPrefix"),
            ConfigSetFaceWinding                 = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetFaceWinding"),
            ConfigSetFontHinting                 = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetFontHinting"),
            ConfigSetFontGamma                   = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetFontGamma"),
            ConfigSetUserStylesheet              = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetUserStylesheet"),
            ConfigSetForceRepaint                = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetForceRepaint"),
            ConfigSetAnimationTimerDelay         = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetAnimationTimerDelay"),
            ConfigSetScrollTimerDelay            = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetScrollTimerDelay"),
            ConfigSetRecycleDelay                = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetRecycleDelay"),
            ConfigSetMemoryCacheSize             = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetMemoryCacheSize"),
            ConfigSetPageCacheSize               = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetPageCacheSize"),
            ConfigSetOverrideRAMSize             = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetOverrideRAMSize"),
            ConfigSetMinLargeHeapSize            = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetMinLargeHeapSize"),
            ConfigSetMinSmallHeapSize            = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetMinSmallHeapSize"),
            ConfigSetNumRendererThreads          = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetNumRendererThreads"),
            ConfigSetMaxUpdateTime               = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetMaxUpdateTime"),
            ConfigSetBitmapAlignment             = apiGetFunctionAddress(ULTRALIGHT, "ulConfigSetBitmapAlignment"),
            FontFileCreateFromFilePath           = apiGetFunctionAddress(ULTRALIGHT, "ulFontFileCreateFromFilePath"),
            FontFileCreateFromBuffer             = apiGetFunctionAddress(ULTRALIGHT, "ulFontFileCreateFromBuffer"),
            DestroyFontFile                      = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyFontFile"),
            CreateGamepadEvent                   = apiGetFunctionAddress(ULTRALIGHT, "ulCreateGamepadEvent"),
            DestroyGamepadEvent                  = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyGamepadEvent"),
            CreateGamepadAxisEvent               = apiGetFunctionAddress(ULTRALIGHT, "ulCreateGamepadAxisEvent"),
            DestroyGamepadAxisEvent              = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyGamepadAxisEvent"),
            CreateGamepadButtonEvent             = apiGetFunctionAddress(ULTRALIGHT, "ulCreateGamepadButtonEvent"),
            DestroyGamepadButtonEvent            = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyGamepadButtonEvent"),
            RectIsEmpty                          = apiGetFunctionAddress(ULTRALIGHT, "ulRectIsEmpty"),
            RectMakeEmpty                        = apiGetFunctionAddress(ULTRALIGHT, "ulRectMakeEmpty"),
            IntRectIsEmpty                       = apiGetFunctionAddress(ULTRALIGHT, "ulIntRectIsEmpty"),
            IntRectMakeEmpty                     = apiGetFunctionAddress(ULTRALIGHT, "ulIntRectMakeEmpty"),
            ApplyProjection                      = apiGetFunctionAddress(ULTRALIGHT, "ulApplyProjection"),
            CreateImageSourceFromTexture         = apiGetFunctionAddress(ULTRALIGHT, "ulCreateImageSourceFromTexture"),
            CreateImageSourceFromBitmap          = apiGetFunctionAddress(ULTRALIGHT, "ulCreateImageSourceFromBitmap"),
            DestroyImageSource                   = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyImageSource"),
            ImageSourceInvalidate                = apiGetFunctionAddress(ULTRALIGHT, "ulImageSourceInvalidate"),
            ImageSourceProviderAddImageSource    = apiGetFunctionAddress(ULTRALIGHT, "ulImageSourceProviderAddImageSource"),
            ImageSourceProviderRemoveImageSource = apiGetFunctionAddress(ULTRALIGHT, "ulImageSourceProviderRemoveImageSource"),
            CreateKeyEvent                       = apiGetFunctionAddress(ULTRALIGHT, "ulCreateKeyEvent"),
            DestroyKeyEvent                      = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyKeyEvent"),
            CreateMouseEvent                     = apiGetFunctionAddress(ULTRALIGHT, "ulCreateMouseEvent"),
            DestroyMouseEvent                    = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyMouseEvent"),
            PlatformSetLogger                    = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetLogger"),
            PlatformSetFileSystem                = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetFileSystem"),
            PlatformSetFontLoader                = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetFontLoader"),
            PlatformSetSurfaceDefinition         = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetSurfaceDefinition"),
            PlatformSetGPUDriver                 = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetGPUDriver"),
            PlatformSetClipboard                 = apiGetFunctionAddress(ULTRALIGHT, "ulPlatformSetClipboard"),
            CreateRenderer                       = apiGetFunctionAddress(ULTRALIGHT, "ulCreateRenderer"),
            DestroyRenderer                      = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyRenderer"),
            Update                               = apiGetFunctionAddress(ULTRALIGHT, "ulUpdate"),
            RefreshDisplay                       = apiGetFunctionAddress(ULTRALIGHT, "ulRefreshDisplay"),
            Render                               = apiGetFunctionAddress(ULTRALIGHT, "ulRender"),
            PurgeMemory                          = apiGetFunctionAddress(ULTRALIGHT, "ulPurgeMemory"),
            LogMemoryUsage                       = apiGetFunctionAddress(ULTRALIGHT, "ulLogMemoryUsage"),
            StartRemoteInspectorServer           = apiGetFunctionAddress(ULTRALIGHT, "ulStartRemoteInspectorServer"),
            SetGamepadDetails                    = apiGetFunctionAddress(ULTRALIGHT, "ulSetGamepadDetails"),
            FireGamepadEvent                     = apiGetFunctionAddress(ULTRALIGHT, "ulFireGamepadEvent"),
            FireGamepadAxisEvent                 = apiGetFunctionAddress(ULTRALIGHT, "ulFireGamepadAxisEvent"),
            FireGamepadButtonEvent               = apiGetFunctionAddress(ULTRALIGHT, "ulFireGamepadButtonEvent"),
            CreateScrollEvent                    = apiGetFunctionAddress(ULTRALIGHT, "ulCreateScrollEvent"),
            DestroyScrollEvent                   = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyScrollEvent"),
            CreateSession                        = apiGetFunctionAddress(ULTRALIGHT, "ulCreateSession"),
            DestroySession                       = apiGetFunctionAddress(ULTRALIGHT, "ulDestroySession"),
            DefaultSession                       = apiGetFunctionAddress(ULTRALIGHT, "ulDefaultSession"),
            SessionIsPersistent                  = apiGetFunctionAddress(ULTRALIGHT, "ulSessionIsPersistent"),
            SessionGetName                       = apiGetFunctionAddress(ULTRALIGHT, "ulSessionGetName"),
            SessionGetId                         = apiGetFunctionAddress(ULTRALIGHT, "ulSessionGetId"),
            SessionGetDiskPath                   = apiGetFunctionAddress(ULTRALIGHT, "ulSessionGetDiskPath"),
            CreateString                         = apiGetFunctionAddress(ULTRALIGHT, "ulCreateString"),
            CreateStringUTF8                     = apiGetFunctionAddress(ULTRALIGHT, "ulCreateStringUTF8"),
            CreateStringUTF16                    = apiGetFunctionAddress(ULTRALIGHT, "ulCreateStringUTF16"),
            DestroyString                        = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyString"),
            StringGetData                        = apiGetFunctionAddress(ULTRALIGHT, "ulStringGetData"),
            StringGetLength                      = apiGetFunctionAddress(ULTRALIGHT, "ulStringGetLength"),
            StringIsEmpty                        = apiGetFunctionAddress(ULTRALIGHT, "ulStringIsEmpty"),
            StringAssignString                   = apiGetFunctionAddress(ULTRALIGHT, "ulStringAssignString"),
            StringAssignCString                  = apiGetFunctionAddress(ULTRALIGHT, "ulStringAssignCString"),
            SurfaceGetWidth                      = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetWidth"),
            SurfaceGetHeight                     = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetHeight"),
            SurfaceGetRowBytes                   = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetRowBytes"),
            SurfaceGetSize                       = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetSize"),
            SurfaceLockPixels                    = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceLockPixels"),
            SurfaceUnlockPixels                  = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceUnlockPixels"),
            SurfaceResize                        = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceResize"),
            SurfaceSetDirtyBounds                = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceSetDirtyBounds"),
            SurfaceGetDirtyBounds                = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetDirtyBounds"),
            SurfaceClearDirtyBounds              = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceClearDirtyBounds"),
            SurfaceGetUserData                   = apiGetFunctionAddress(ULTRALIGHT, "ulSurfaceGetUserData"),
            BitmapSurfaceGetBitmap               = apiGetFunctionAddress(ULTRALIGHT, "ulBitmapSurfaceGetBitmap"),
            CreateViewConfig                     = apiGetFunctionAddress(ULTRALIGHT, "ulCreateViewConfig"),
            DestroyViewConfig                    = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyViewConfig"),
            ViewConfigSetDisplayId               = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetDisplayId"),
            ViewConfigSetIsAccelerated           = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetIsAccelerated"),
            ViewConfigSetIsTransparent           = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetIsTransparent"),
            ViewConfigSetInitialDeviceScale      = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetInitialDeviceScale"),
            ViewConfigSetInitialFocus            = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetInitialFocus"),
            ViewConfigSetEnableImages            = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetEnableImages"),
            ViewConfigSetEnableJavaScript        = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetEnableJavaScript"),
            ViewConfigSetFontFamilyStandard      = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetFontFamilyStandard"),
            ViewConfigSetFontFamilyFixed         = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetFontFamilyFixed"),
            ViewConfigSetFontFamilySerif         = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetFontFamilySerif"),
            ViewConfigSetFontFamilySansSerif     = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetFontFamilySansSerif"),
            ViewConfigSetUserAgent               = apiGetFunctionAddress(ULTRALIGHT, "ulViewConfigSetUserAgent"),
            CreateView                           = apiGetFunctionAddress(ULTRALIGHT, "ulCreateView"),
            DestroyView                          = apiGetFunctionAddress(ULTRALIGHT, "ulDestroyView"),
            ViewGetURL                           = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetURL"),
            ViewGetTitle                         = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetTitle"),
            ViewGetWidth                         = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetWidth"),
            ViewGetHeight                        = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetHeight"),
            ViewGetDisplayId                     = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetDisplayId"),
            ViewSetDisplayId                     = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetDisplayId"),
            ViewGetDeviceScale                   = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetDeviceScale"),
            ViewSetDeviceScale                   = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetDeviceScale"),
            ViewIsAccelerated                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewIsAccelerated"),
            ViewIsTransparent                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewIsTransparent"),
            ViewIsLoading                        = apiGetFunctionAddress(ULTRALIGHT, "ulViewIsLoading"),
            ViewGetRenderTarget                  = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetRenderTarget"),
            ViewGetSurface                       = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetSurface"),
            ViewLoadHTML                         = apiGetFunctionAddress(ULTRALIGHT, "ulViewLoadHTML"),
            ViewLoadURL                          = apiGetFunctionAddress(ULTRALIGHT, "ulViewLoadURL"),
            ViewResize                           = apiGetFunctionAddress(ULTRALIGHT, "ulViewResize"),
            ViewLockJSContext                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewLockJSContext"),
            ViewUnlockJSContext                  = apiGetFunctionAddress(ULTRALIGHT, "ulViewUnlockJSContext"),
            ViewEvaluateScript                   = apiGetFunctionAddress(ULTRALIGHT, "ulViewEvaluateScript"),
            ViewCanGoBack                        = apiGetFunctionAddress(ULTRALIGHT, "ulViewCanGoBack"),
            ViewCanGoForward                     = apiGetFunctionAddress(ULTRALIGHT, "ulViewCanGoForward"),
            ViewGoToHistoryOffset                = apiGetFunctionAddress(ULTRALIGHT, "ulViewGoToHistoryOffset"),
            ViewReload                           = apiGetFunctionAddress(ULTRALIGHT, "ulViewReload"),
            ViewStop                             = apiGetFunctionAddress(ULTRALIGHT, "ulViewStop"),
            ViewFocus                            = apiGetFunctionAddress(ULTRALIGHT, "ulViewFocus"),
            ViewUnfocus                          = apiGetFunctionAddress(ULTRALIGHT, "ulViewUnfocus"),
            ViewHasInputFocus                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewHasInputFocus"),
            ViewFireKeyEvent                     = apiGetFunctionAddress(ULTRALIGHT, "ulViewFireKeyEvent"),
            ViewFireMouseEvent                   = apiGetFunctionAddress(ULTRALIGHT, "ulViewFireMouseEvent"),
            ViewFireScrollEvent                  = apiGetFunctionAddress(ULTRALIGHT, "ulViewFireScrollEvent"),
            ViewSetChangeTitleCallback           = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetChangeTitleCallback"),
            ViewSetChangeURLCallback             = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetChangeURLCallback"),
            ViewSetChangeTooltipCallback         = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetChangeTooltipCallback"),
            ViewSetChangeCursorCallback          = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetChangeCursorCallback"),
            ViewSetAddConsoleMessageCallback     = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetAddConsoleMessageCallback"),
            ViewSetCreateChildViewCallback       = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetCreateChildViewCallback"),
            ViewSetCreateInspectorViewCallback   = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetCreateInspectorViewCallback"),
            ViewSetBeginLoadingCallback          = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetBeginLoadingCallback"),
            ViewSetFinishLoadingCallback         = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetFinishLoadingCallback"),
            ViewSetFailLoadingCallback           = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetFailLoadingCallback"),
            ViewSetWindowObjectReadyCallback     = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetWindowObjectReadyCallback"),
            ViewSetDOMReadyCallback              = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetDOMReadyCallback"),
            ViewSetUpdateHistoryCallback         = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetUpdateHistoryCallback"),
            ViewSetNeedsPaint                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewSetNeedsPaint"),
            ViewGetNeedsPaint                    = apiGetFunctionAddress(ULTRALIGHT, "ulViewGetNeedsPaint"),
            ViewCreateLocalInspectorView         = apiGetFunctionAddress(ULTRALIGHT, "ulViewCreateLocalInspectorView");

    }

    /** Returns the Ultralight {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return ULTRALIGHT;
    }

    public static final int
        kMessageSource_XML                     = 0x0,
        kMessageSource_JS                      = 0x1,
        kMessageSource_Network                 = 0x2,
        kMessageSource_ConsoleAPI              = 0x3,
        kMessageSource_Storage                 = 0x4,
        kMessageSource_AppCache                = 0x5,
        kMessageSource_Rendering               = 0x6,
        kMessageSource_CSS                     = 0x7,
        kMessageSource_Security                = 0x8,
        kMessageSource_ContentBlocker          = 0x9,
        kMessageSource_Media                   = 0xA,
        kMessageSource_MediaSource             = 0xB,
        kMessageSource_WebRTC                  = 0xC,
        kMessageSource_ITPDebug                = 0xD,
        kMessageSource_PrivateClickMeasurement = 0xE,
        kMessageSource_PaymentRequest          = 0xF,
        kMessageSource_Other                   = 0x10;

    public static final int
        kMessageLevel_Log     = 0x0,
        kMessageLevel_Warning = 0x1,
        kMessageLevel_Error   = 0x2,
        kMessageLevel_Debug   = 0x3,
        kMessageLevel_Info    = 0x4;

    public static final int
        kCursor_Pointer                  = 0x0,
        kCursor_Cross                    = 0x1,
        kCursor_Hand                     = 0x2,
        kCursor_IBeam                    = 0x3,
        kCursor_Wait                     = 0x4,
        kCursor_Help                     = 0x5,
        kCursor_EastResize               = 0x6,
        kCursor_NorthResize              = 0x7,
        kCursor_NorthEastResize          = 0x9,
        kCursor_NorthWestResize          = 0xA,
        kCursor_SouthResize              = 0xB,
        kCursor_SouthEastResize          = 0xC,
        kCursor_SouthWestResize          = 0xD,
        kCursor_WestResize               = 0xE,
        kCursor_NorthSouthResize         = 0xF,
        kCursor_EastWestResize           = 0x10,
        kCursor_NorthEastSouthWestResize = 0x11,
        kCursor_NorthWestSouthEastResize = 0x12,
        kCursor_ColumnResize             = 0x13,
        kCursor_RowResize                = 0x14,
        kCursor_MiddlePanning            = 0x15,
        kCursor_EastPanning              = 0x16,
        kCursor_NorthPanning             = 0x17,
        kCursor_NorthEastPanning         = 0x18,
        kCursor_NorthWestPanning         = 0x19,
        kCursor_SouthPanning             = 0x1A,
        kCursor_SouthEastPanning         = 0x1B,
        kCursor_SouthWestPanning         = 0x1C,
        kCursor_WestPanning              = 0x1D,
        kCursor_Move                     = 0x1E,
        kCursor_VerticalText             = 0x1F,
        kCursor_Cell                     = 0x20,
        kCursor_ContextMenu              = 0x21,
        kCursor_Alias                    = 0x22,
        kCursor_Progress                 = 0x23,
        kCursor_NoDrop                   = 0x24,
        kCursor_Copy                     = 0x25,
        kCursor_None                     = 0x26,
        kCursor_NotAllowed               = 0x27,
        kCursor_ZoomIn                   = 0x28,
        kCursor_ZoomOut                  = 0x29,
        kCursor_Grab                     = 0x2A,
        kCursor_Grabbing                 = 0x2B,
        kCursor_Custom                   = 0x2C;

    public static final int
        kBitmapFormat_A8_UNORM         = 0x0,
        kBitmapFormat_BGRA8_UNORM_SRGB = 0x1;

    public static final int
        kKeyEventType_KeyDown    = 0x0,
        kKeyEventType_KeyUp      = 0x1,
        kKeyEventType_RawKeyDown = 0x2,
        kKeyEventType_Char       = 0x3;

    public static final int
        kMouseEventType_MouseMoved = 0x0,
        kMouseEventType_MouseDown  = 0x1,
        kMouseEventType_MouseUp    = 0x2;

    public static final int
        kMouseButton_None   = 0x0,
        kMouseButton_Left   = 0x1,
        kMouseButton_Middle = 0x2,
        kMouseButton_Right  = 0x3;

    public static final int
        kScrollEventType_ScrollByPixel = 0x0,
        kScrollEventType_ScrollByPage  = 0x1;

    public static final int
        kGamepadEventType_Connected    = 0x0,
        kGamepadEventType_Disconnected = 0x1;

    public static final int
        kFaceWinding_Clockwise        = 0x0,
        kFaceWinding_CounterClockwise = 0x1;

    public static final int
        kFontHinting_Smooth     = 0x0,
        kFontHinting_Normal     = 0x1,
        kFontHinting_Monochrome = 0x2;

    public static final int
        kVertexBufferFormat_2f_4ub_2f        = 0x0,
        kVertexBufferFormat_2f_4ub_2f_2f_28f = 0x1;

    public static final int
        kShaderType_Fill     = 0x0,
        kShaderType_FillPath = 0x1;

    public static final int
        kCommandType_ClearRenderBuffer = 0x0,
        kCommandType_DrawGeometry      = 0x1;

    public static final int
        kLogLevel_Error   = 0x0,
        kLogLevel_Warning = 0x1,
        kLogLevel_Info    = 0x2;

    protected Ultralight() {
        throw new UnsupportedOperationException();
    }

    // --- [ ulVersionString ] ---

    /** {@code char const * ulVersionString(void)} */
    public static long nulVersionString() {
        long __functionAddress = Functions.VersionString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * ulVersionString(void)} */
    @NativeType("char const *")
    public static String ulVersionString() {
        long __result = nulVersionString();
        return memASCII(__result);
    }

    // --- [ ulVersionMajor ] ---

    /** {@code int ulVersionMajor(void)} */
    public static int ulVersionMajor() {
        long __functionAddress = Functions.VersionMajor;
        return invokeI(__functionAddress);
    }

    // --- [ ulVersionMinor ] ---

    /** {@code int ulVersionMinor(void)} */
    public static int ulVersionMinor() {
        long __functionAddress = Functions.VersionMinor;
        return invokeI(__functionAddress);
    }

    // --- [ ulVersionPatch ] ---

    /** {@code int ulVersionPatch(void)} */
    public static int ulVersionPatch() {
        long __functionAddress = Functions.VersionPatch;
        return invokeI(__functionAddress);
    }

    // --- [ ulWebKitVersionString ] ---

    /** {@code char const * ulWebKitVersionString(void)} */
    public static long nulWebKitVersionString() {
        long __functionAddress = Functions.WebKitVersionString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * ulWebKitVersionString(void)} */
    @NativeType("char const *")
    public static String ulWebKitVersionString() {
        long __result = nulWebKitVersionString();
        return memASCII(__result);
    }

    // --- [ ulCreateBitmap ] ---

    /** {@code C_Bitmap * ulCreateBitmap(unsigned int width, unsigned int height, ULBitmapFormat format)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmap(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format) {
        long __functionAddress = Functions.CreateBitmap;
        return invokeP(width, height, format, __functionAddress);
    }

    // --- [ ulCreateBitmapFromPixels ] ---

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    public static long nulCreateBitmapFromPixels(int width, int height, int format, int rowBytes, long pixels, long size, boolean shouldCopy) {
        long __functionAddress = Functions.CreateBitmapFromPixels;
        return invokePPP(width, height, format, rowBytes, pixels, size, shouldCopy, __functionAddress);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") ByteBuffer pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, memAddress(pixels), size, shouldCopy);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") long pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, pixels, size, shouldCopy);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") ShortBuffer pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, memAddress(pixels), size, shouldCopy);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") IntBuffer pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, memAddress(pixels), size, shouldCopy);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") FloatBuffer pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, memAddress(pixels), size, shouldCopy);
    }

    /** {@code C_Bitmap * ulCreateBitmapFromPixels(unsigned int width, unsigned int height, ULBitmapFormat format, unsigned int rowBytes, void const * pixels, size_t size, bool shouldCopy)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromPixels(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("ULBitmapFormat") int format, @NativeType("unsigned int") int rowBytes, @NativeType("void const *") DoubleBuffer pixels, @NativeType("size_t") long size, @NativeType("bool") boolean shouldCopy) {
        return nulCreateBitmapFromPixels(width, height, format, rowBytes, memAddress(pixels), size, shouldCopy);
    }

    // --- [ ulCreateBitmapFromCopy ] ---

    /** {@code C_Bitmap * ulCreateBitmapFromCopy(C_Bitmap * existingBitmap)} */
    @NativeType("C_Bitmap *")
    public static long ulCreateBitmapFromCopy(@NativeType("C_Bitmap *") long existingBitmap) {
        long __functionAddress = Functions.CreateBitmapFromCopy;
        if (CHECKS) {
            check(existingBitmap);
        }
        return invokePP(existingBitmap, __functionAddress);
    }

    // --- [ ulDestroyBitmap ] ---

    /** {@code void ulDestroyBitmap(C_Bitmap * bitmap)} */
    public static void ulDestroyBitmap(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.DestroyBitmap;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetWidth ] ---

    /** {@code unsigned int ulBitmapGetWidth(C_Bitmap * bitmap)} */
    @NativeType("unsigned int")
    public static int ulBitmapGetWidth(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetWidth;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetHeight ] ---

    /** {@code unsigned int ulBitmapGetHeight(C_Bitmap * bitmap)} */
    @NativeType("unsigned int")
    public static int ulBitmapGetHeight(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetHeight;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetFormat ] ---

    /** {@code ULBitmapFormat ulBitmapGetFormat(C_Bitmap * bitmap)} */
    @NativeType("ULBitmapFormat")
    public static int ulBitmapGetFormat(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetFormat;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetBpp ] ---

    /** {@code unsigned int ulBitmapGetBpp(C_Bitmap * bitmap)} */
    @NativeType("unsigned int")
    public static int ulBitmapGetBpp(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetBpp;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetRowBytes ] ---

    /** {@code unsigned int ulBitmapGetRowBytes(C_Bitmap * bitmap)} */
    @NativeType("unsigned int")
    public static int ulBitmapGetRowBytes(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetRowBytes;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ ulBitmapGetSize ] ---

    /** {@code size_t ulBitmapGetSize(C_Bitmap * bitmap)} */
    @NativeType("size_t")
    public static long ulBitmapGetSize(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapGetSize;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePP(bitmap, __functionAddress);
    }

    // --- [ ulBitmapOwnsPixels ] ---

    /** {@code bool ulBitmapOwnsPixels(C_Bitmap * bitmap)} */
    @NativeType("bool")
    public static boolean ulBitmapOwnsPixels(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapOwnsPixels;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePZ(bitmap, __functionAddress);
    }

    // --- [ ulBitmapLockPixels ] ---

    /** {@code void * ulBitmapLockPixels(C_Bitmap * bitmap)} */
    @NativeType("void *")
    public static long ulBitmapLockPixels(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapLockPixels;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePP(bitmap, __functionAddress);
    }

    // --- [ ulBitmapUnlockPixels ] ---

    /** {@code void ulBitmapUnlockPixels(C_Bitmap * bitmap)} */
    public static void ulBitmapUnlockPixels(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapUnlockPixels;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ ulBitmapRawPixels ] ---

    /** {@code void * ulBitmapRawPixels(C_Bitmap * bitmap)} */
    @NativeType("void *")
    public static long ulBitmapRawPixels(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapRawPixels;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePP(bitmap, __functionAddress);
    }

    // --- [ ulBitmapIsEmpty ] ---

    /** {@code bool ulBitmapIsEmpty(C_Bitmap * bitmap)} */
    @NativeType("bool")
    public static boolean ulBitmapIsEmpty(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapIsEmpty;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePZ(bitmap, __functionAddress);
    }

    // --- [ ulBitmapErase ] ---

    /** {@code void ulBitmapErase(C_Bitmap * bitmap)} */
    public static void ulBitmapErase(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapErase;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ ulBitmapWritePNG ] ---

    /** {@code bool ulBitmapWritePNG(C_Bitmap * bitmap, char const * path)} */
    public static boolean nulBitmapWritePNG(long bitmap, long path) {
        long __functionAddress = Functions.BitmapWritePNG;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPZ(bitmap, path, __functionAddress);
    }

    /** {@code bool ulBitmapWritePNG(C_Bitmap * bitmap, char const * path)} */
    @NativeType("bool")
    public static boolean ulBitmapWritePNG(@NativeType("C_Bitmap *") long bitmap, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nulBitmapWritePNG(bitmap, memAddress(path));
    }

    /** {@code bool ulBitmapWritePNG(C_Bitmap * bitmap, char const * path)} */
    @NativeType("bool")
    public static boolean ulBitmapWritePNG(@NativeType("C_Bitmap *") long bitmap, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nulBitmapWritePNG(bitmap, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulBitmapSwapRedBlueChannels ] ---

    /** {@code void ulBitmapSwapRedBlueChannels(C_Bitmap * bitmap)} */
    public static void ulBitmapSwapRedBlueChannels(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.BitmapSwapRedBlueChannels;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ ulCreateBuffer ] ---

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    public static long nulCreateBuffer(long data, long size, long user_data, long destructionCallback) {
        long __functionAddress = Functions.CreateBuffer;
        if (CHECKS) {
            check(user_data);
        }
        return invokePPPPP(data, size, user_data, destructionCallback, __functionAddress);
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") ByteBuffer data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(memAddress(data), size, user_data, memAddressSafe(destructionCallback));
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") long data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(data, size, user_data, memAddressSafe(destructionCallback));
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") ShortBuffer data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(memAddress(data), size, user_data, memAddressSafe(destructionCallback));
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") IntBuffer data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(memAddress(data), size, user_data, memAddressSafe(destructionCallback));
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") FloatBuffer data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(memAddress(data), size, user_data, memAddressSafe(destructionCallback));
    }

    /** {@code C_Buffer * ulCreateBuffer(void * data, size_t size, void * user_data, ulDestroyBufferCallback destructionCallback)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBuffer(@NativeType("void *") DoubleBuffer data, @NativeType("size_t") long size, @NativeType("void *") long user_data, @NativeType("ulDestroyBufferCallback") @Nullable ULDestroyBufferCallbackI destructionCallback) {
        return nulCreateBuffer(memAddress(data), size, user_data, memAddressSafe(destructionCallback));
    }

    // --- [ ulCreateBufferFromCopy ] ---

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    public static long nulCreateBufferFromCopy(long data, long size) {
        long __functionAddress = Functions.CreateBufferFromCopy;
        return invokePPP(data, size, __functionAddress);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") ByteBuffer data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(memAddress(data), size);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") long data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(data, size);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") ShortBuffer data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(memAddress(data), size);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") IntBuffer data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(memAddress(data), size);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") FloatBuffer data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(memAddress(data), size);
    }

    /** {@code C_Buffer * ulCreateBufferFromCopy(void const * data, size_t size)} */
    @NativeType("C_Buffer *")
    public static long ulCreateBufferFromCopy(@NativeType("void const *") DoubleBuffer data, @NativeType("size_t") long size) {
        return nulCreateBufferFromCopy(memAddress(data), size);
    }

    // --- [ ulDestroyBuffer ] ---

    /** {@code void ulDestroyBuffer(C_Buffer * buffer)} */
    public static void ulDestroyBuffer(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.DestroyBuffer;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ ulBufferGetData ] ---

    /** {@code void * ulBufferGetData(C_Buffer * buffer)} */
    @NativeType("void *")
    public static long ulBufferGetData(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.BufferGetData;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ ulBufferGetSize ] ---

    /** {@code size_t ulBufferGetSize(C_Buffer * buffer)} */
    @NativeType("size_t")
    public static long ulBufferGetSize(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.BufferGetSize;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ ulBufferGetUserData ] ---

    /** {@code void * ulBufferGetUserData(C_Buffer * buffer)} */
    @NativeType("void *")
    public static long ulBufferGetUserData(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.BufferGetUserData;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ ulBufferOwnsData ] ---

    /** {@code bool ulBufferOwnsData(C_Buffer * buffer)} */
    @NativeType("bool")
    public static boolean ulBufferOwnsData(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.BufferOwnsData;
        if (CHECKS) {
            check(buffer);
        }
        return invokePZ(buffer, __functionAddress);
    }

    // --- [ ulCreateConfig ] ---

    /** {@code C_Config * ulCreateConfig(void)} */
    @NativeType("C_Config *")
    public static long ulCreateConfig() {
        long __functionAddress = Functions.CreateConfig;
        return invokeP(__functionAddress);
    }

    // --- [ ulDestroyConfig ] ---

    /** {@code void ulDestroyConfig(C_Config * config)} */
    public static void ulDestroyConfig(@NativeType("C_Config *") long config) {
        long __functionAddress = Functions.DestroyConfig;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, __functionAddress);
    }

    // --- [ ulConfigSetCachePath ] ---

    /** {@code void ulConfigSetCachePath(C_Config * config, C_String * cachePath)} */
    public static void ulConfigSetCachePath(@NativeType("C_Config *") long config, @NativeType("C_String *") long cachePath) {
        long __functionAddress = Functions.ConfigSetCachePath;
        if (CHECKS) {
            check(config);
            check(cachePath);
        }
        invokePPV(config, cachePath, __functionAddress);
    }

    // --- [ ulConfigSetResourcePathPrefix ] ---

    /** {@code void ulConfigSetResourcePathPrefix(C_Config * config, C_String * resourcePathPrefix)} */
    public static void ulConfigSetResourcePathPrefix(@NativeType("C_Config *") long config, @NativeType("C_String *") long resourcePathPrefix) {
        long __functionAddress = Functions.ConfigSetResourcePathPrefix;
        if (CHECKS) {
            check(config);
            check(resourcePathPrefix);
        }
        invokePPV(config, resourcePathPrefix, __functionAddress);
    }

    // --- [ ulConfigSetFaceWinding ] ---

    /** {@code void ulConfigSetFaceWinding(C_Config * config, ULFaceWinding winding)} */
    public static void ulConfigSetFaceWinding(@NativeType("C_Config *") long config, @NativeType("ULFaceWinding") int winding) {
        long __functionAddress = Functions.ConfigSetFaceWinding;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, winding, __functionAddress);
    }

    // --- [ ulConfigSetFontHinting ] ---

    /** {@code void ulConfigSetFontHinting(C_Config * config, ULFontHinting fontHinting)} */
    public static void ulConfigSetFontHinting(@NativeType("C_Config *") long config, @NativeType("ULFontHinting") int fontHinting) {
        long __functionAddress = Functions.ConfigSetFontHinting;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, fontHinting, __functionAddress);
    }

    // --- [ ulConfigSetFontGamma ] ---

    /** {@code void ulConfigSetFontGamma(C_Config * config, double fontGamma)} */
    public static void ulConfigSetFontGamma(@NativeType("C_Config *") long config, double fontGamma) {
        long __functionAddress = Functions.ConfigSetFontGamma;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, fontGamma, __functionAddress);
    }

    // --- [ ulConfigSetUserStylesheet ] ---

    /** {@code void ulConfigSetUserStylesheet(C_Config * config, C_String * cssString)} */
    public static void ulConfigSetUserStylesheet(@NativeType("C_Config *") long config, @NativeType("C_String *") long cssString) {
        long __functionAddress = Functions.ConfigSetUserStylesheet;
        if (CHECKS) {
            check(config);
            check(cssString);
        }
        invokePPV(config, cssString, __functionAddress);
    }

    // --- [ ulConfigSetForceRepaint ] ---

    /** {@code void ulConfigSetForceRepaint(C_Config * config, bool enabled)} */
    public static void ulConfigSetForceRepaint(@NativeType("C_Config *") long config, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.ConfigSetForceRepaint;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, enabled, __functionAddress);
    }

    // --- [ ulConfigSetAnimationTimerDelay ] ---

    /** {@code void ulConfigSetAnimationTimerDelay(C_Config * config, double delay)} */
    public static void ulConfigSetAnimationTimerDelay(@NativeType("C_Config *") long config, double delay) {
        long __functionAddress = Functions.ConfigSetAnimationTimerDelay;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, delay, __functionAddress);
    }

    // --- [ ulConfigSetScrollTimerDelay ] ---

    /** {@code void ulConfigSetScrollTimerDelay(C_Config * config, double delay)} */
    public static void ulConfigSetScrollTimerDelay(@NativeType("C_Config *") long config, double delay) {
        long __functionAddress = Functions.ConfigSetScrollTimerDelay;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, delay, __functionAddress);
    }

    // --- [ ulConfigSetRecycleDelay ] ---

    /** {@code void ulConfigSetRecycleDelay(C_Config * config, double delay)} */
    public static void ulConfigSetRecycleDelay(@NativeType("C_Config *") long config, double delay) {
        long __functionAddress = Functions.ConfigSetRecycleDelay;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, delay, __functionAddress);
    }

    // --- [ ulConfigSetMemoryCacheSize ] ---

    /** {@code void ulConfigSetMemoryCacheSize(C_Config * config, unsigned int size)} */
    public static void ulConfigSetMemoryCacheSize(@NativeType("C_Config *") long config, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.ConfigSetMemoryCacheSize;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, size, __functionAddress);
    }

    // --- [ ulConfigSetPageCacheSize ] ---

    /** {@code void ulConfigSetPageCacheSize(C_Config * config, unsigned int size)} */
    public static void ulConfigSetPageCacheSize(@NativeType("C_Config *") long config, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.ConfigSetPageCacheSize;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, size, __functionAddress);
    }

    // --- [ ulConfigSetOverrideRAMSize ] ---

    /** {@code void ulConfigSetOverrideRAMSize(C_Config * config, unsigned int size)} */
    public static void ulConfigSetOverrideRAMSize(@NativeType("C_Config *") long config, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.ConfigSetOverrideRAMSize;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, size, __functionAddress);
    }

    // --- [ ulConfigSetMinLargeHeapSize ] ---

    /** {@code void ulConfigSetMinLargeHeapSize(C_Config * config, unsigned int size)} */
    public static void ulConfigSetMinLargeHeapSize(@NativeType("C_Config *") long config, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.ConfigSetMinLargeHeapSize;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, size, __functionAddress);
    }

    // --- [ ulConfigSetMinSmallHeapSize ] ---

    /** {@code void ulConfigSetMinSmallHeapSize(C_Config * config, unsigned int size)} */
    public static void ulConfigSetMinSmallHeapSize(@NativeType("C_Config *") long config, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.ConfigSetMinSmallHeapSize;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, size, __functionAddress);
    }

    // --- [ ulConfigSetNumRendererThreads ] ---

    /** {@code void ulConfigSetNumRendererThreads(C_Config * config, unsigned int numRendererThreads)} */
    public static void ulConfigSetNumRendererThreads(@NativeType("C_Config *") long config, @NativeType("unsigned int") int numRendererThreads) {
        long __functionAddress = Functions.ConfigSetNumRendererThreads;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, numRendererThreads, __functionAddress);
    }

    // --- [ ulConfigSetMaxUpdateTime ] ---

    /** {@code void ulConfigSetMaxUpdateTime(C_Config * config, double maxUpdateTime)} */
    public static void ulConfigSetMaxUpdateTime(@NativeType("C_Config *") long config, double maxUpdateTime) {
        long __functionAddress = Functions.ConfigSetMaxUpdateTime;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, maxUpdateTime, __functionAddress);
    }

    // --- [ ulConfigSetBitmapAlignment ] ---

    /** {@code void ulConfigSetBitmapAlignment(C_Config * config, unsigned int bitmapAlignment)} */
    public static void ulConfigSetBitmapAlignment(@NativeType("C_Config *") long config, @NativeType("unsigned int") int bitmapAlignment) {
        long __functionAddress = Functions.ConfigSetBitmapAlignment;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, bitmapAlignment, __functionAddress);
    }

    // --- [ ulFontFileCreateFromFilePath ] ---

    /** {@code C_FontFile * ulFontFileCreateFromFilePath(C_String * filepath)} */
    @NativeType("C_FontFile *")
    public static long ulFontFileCreateFromFilePath(@NativeType("C_String *") long filepath) {
        long __functionAddress = Functions.FontFileCreateFromFilePath;
        if (CHECKS) {
            check(filepath);
        }
        return invokePP(filepath, __functionAddress);
    }

    // --- [ ulFontFileCreateFromBuffer ] ---

    /** {@code C_FontFile * ulFontFileCreateFromBuffer(C_Buffer * buffer)} */
    @NativeType("C_FontFile *")
    public static long ulFontFileCreateFromBuffer(@NativeType("C_Buffer *") long buffer) {
        long __functionAddress = Functions.FontFileCreateFromBuffer;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ ulDestroyFontFile ] ---

    /** {@code void ulDestroyFontFile(C_FontFile * fontFile)} */
    public static void ulDestroyFontFile(@NativeType("C_FontFile *") long fontFile) {
        long __functionAddress = Functions.DestroyFontFile;
        if (CHECKS) {
            check(fontFile);
        }
        invokePV(fontFile, __functionAddress);
    }

    // --- [ ulCreateGamepadEvent ] ---

    /** {@code C_GamepadEvent * ulCreateGamepadEvent(unsigned int index, ULGamepadEventType type)} */
    @NativeType("C_GamepadEvent *")
    public static long ulCreateGamepadEvent(@NativeType("unsigned int") int index, @NativeType("ULGamepadEventType") int type) {
        long __functionAddress = Functions.CreateGamepadEvent;
        return invokeP(index, type, __functionAddress);
    }

    // --- [ ulDestroyGamepadEvent ] ---

    /** {@code void ulDestroyGamepadEvent(C_GamepadEvent * event)} */
    public static void ulDestroyGamepadEvent(@NativeType("C_GamepadEvent *") long event) {
        long __functionAddress = Functions.DestroyGamepadEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulCreateGamepadAxisEvent ] ---

    /** {@code C_GamepadAxisEvent * ulCreateGamepadAxisEvent(unsigned int index, unsigned int axisIndex, double value)} */
    @NativeType("C_GamepadAxisEvent *")
    public static long ulCreateGamepadAxisEvent(@NativeType("unsigned int") int index, @NativeType("unsigned int") int axisIndex, double value) {
        long __functionAddress = Functions.CreateGamepadAxisEvent;
        return invokeP(index, axisIndex, value, __functionAddress);
    }

    // --- [ ulDestroyGamepadAxisEvent ] ---

    /** {@code void ulDestroyGamepadAxisEvent(C_GamepadAxisEvent * event)} */
    public static void ulDestroyGamepadAxisEvent(@NativeType("C_GamepadAxisEvent *") long event) {
        long __functionAddress = Functions.DestroyGamepadAxisEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulCreateGamepadButtonEvent ] ---

    /** {@code C_GamepadButtonEvent * ulCreateGamepadButtonEvent(unsigned int index, unsigned int buttonIndex, double value)} */
    @NativeType("C_GamepadButtonEvent *")
    public static long ulCreateGamepadButtonEvent(@NativeType("unsigned int") int index, @NativeType("unsigned int") int buttonIndex, double value) {
        long __functionAddress = Functions.CreateGamepadButtonEvent;
        return invokeP(index, buttonIndex, value, __functionAddress);
    }

    // --- [ ulDestroyGamepadButtonEvent ] ---

    /** {@code void ulDestroyGamepadButtonEvent(C_GamepadButtonEvent * event)} */
    public static void ulDestroyGamepadButtonEvent(@NativeType("C_GamepadButtonEvent *") long event) {
        long __functionAddress = Functions.DestroyGamepadButtonEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulRectIsEmpty ] ---

    /** {@code bool ulRectIsEmpty(ULRect * rect)} */
    public static boolean nulRectIsEmpty(long rect) {
        long __functionAddress = Functions.RectIsEmpty;
        return invokePZ(rect, __functionAddress);
    }

    /** {@code bool ulRectIsEmpty(ULRect * rect)} */
    @NativeType("bool")
    public static boolean ulRectIsEmpty(@NativeType("ULRect *") ULRect rect) {
        return nulRectIsEmpty(rect.address());
    }

    // --- [ ulRectMakeEmpty ] ---

    /** {@code ULRect * ulRectMakeEmpty(void)} */
    public static long nulRectMakeEmpty() {
        long __functionAddress = Functions.RectMakeEmpty;
        return invokeP(__functionAddress);
    }

    /** {@code ULRect * ulRectMakeEmpty(void)} */
    @NativeType("ULRect *")
    public static @Nullable ULRect ulRectMakeEmpty() {
        long __result = nulRectMakeEmpty();
        return ULRect.createSafe(__result);
    }

    // --- [ ulIntRectIsEmpty ] ---

    /** {@code bool ulIntRectIsEmpty(ULIntRect * rect)} */
    public static boolean nulIntRectIsEmpty(long rect) {
        long __functionAddress = Functions.IntRectIsEmpty;
        return invokePZ(rect, __functionAddress);
    }

    /** {@code bool ulIntRectIsEmpty(ULIntRect * rect)} */
    @NativeType("bool")
    public static boolean ulIntRectIsEmpty(@NativeType("ULIntRect *") ULIntRect rect) {
        return nulIntRectIsEmpty(rect.address());
    }

    // --- [ ulIntRectMakeEmpty ] ---

    /** {@code ULIntRect * ulIntRectMakeEmpty(void)} */
    public static long nulIntRectMakeEmpty() {
        long __functionAddress = Functions.IntRectMakeEmpty;
        return invokeP(__functionAddress);
    }

    /** {@code ULIntRect * ulIntRectMakeEmpty(void)} */
    @NativeType("ULIntRect *")
    public static @Nullable ULIntRect ulIntRectMakeEmpty() {
        long __result = nulIntRectMakeEmpty();
        return ULIntRect.createSafe(__result);
    }

    // --- [ ulApplyProjection ] ---

    /** {@code ULMatrix4x4 * ulApplyProjection(ULMatrix4x4 * transform, float viewportWidth, float viewportHeight, bool flipY)} */
    public static long nulApplyProjection(long transform, float viewportWidth, float viewportHeight, boolean flipY) {
        long __functionAddress = Functions.ApplyProjection;
        return invokePP(transform, viewportWidth, viewportHeight, flipY, __functionAddress);
    }

    /** {@code ULMatrix4x4 * ulApplyProjection(ULMatrix4x4 * transform, float viewportWidth, float viewportHeight, bool flipY)} */
    @NativeType("ULMatrix4x4 *")
    public static @Nullable ULMatrix4x4 ulApplyProjection(@NativeType("ULMatrix4x4 *") ULMatrix4x4 transform, float viewportWidth, float viewportHeight, @NativeType("bool") boolean flipY) {
        long __result = nulApplyProjection(transform.address(), viewportWidth, viewportHeight, flipY);
        return ULMatrix4x4.createSafe(__result);
    }

    // --- [ ulCreateImageSourceFromTexture ] ---

    /** {@code C_ImageSource * ulCreateImageSourceFromTexture(unsigned int width, unsigned int height, unsigned int textureID, ULRect * textureUV, C_Bitmap * bitmap)} */
    public static long nulCreateImageSourceFromTexture(int width, int height, int textureID, long textureUV, long bitmap) {
        long __functionAddress = Functions.CreateImageSourceFromTexture;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPP(width, height, textureID, textureUV, bitmap, __functionAddress);
    }

    /** {@code C_ImageSource * ulCreateImageSourceFromTexture(unsigned int width, unsigned int height, unsigned int textureID, ULRect * textureUV, C_Bitmap * bitmap)} */
    @NativeType("C_ImageSource *")
    public static long ulCreateImageSourceFromTexture(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("unsigned int") int textureID, @NativeType("ULRect *") ULRect textureUV, @NativeType("C_Bitmap *") long bitmap) {
        return nulCreateImageSourceFromTexture(width, height, textureID, textureUV.address(), bitmap);
    }

    // --- [ ulCreateImageSourceFromBitmap ] ---

    /** {@code C_ImageSource * ulCreateImageSourceFromBitmap(C_Bitmap * bitmap)} */
    @NativeType("C_ImageSource *")
    public static long ulCreateImageSourceFromBitmap(@NativeType("C_Bitmap *") long bitmap) {
        long __functionAddress = Functions.CreateImageSourceFromBitmap;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePP(bitmap, __functionAddress);
    }

    // --- [ ulDestroyImageSource ] ---

    /** {@code void ulDestroyImageSource(C_ImageSource * imageSource)} */
    public static void ulDestroyImageSource(@NativeType("C_ImageSource *") long imageSource) {
        long __functionAddress = Functions.DestroyImageSource;
        if (CHECKS) {
            check(imageSource);
        }
        invokePV(imageSource, __functionAddress);
    }

    // --- [ ulImageSourceInvalidate ] ---

    /** {@code void ulImageSourceInvalidate(C_ImageSource * imageSource)} */
    public static void ulImageSourceInvalidate(@NativeType("C_ImageSource *") long imageSource) {
        long __functionAddress = Functions.ImageSourceInvalidate;
        if (CHECKS) {
            check(imageSource);
        }
        invokePV(imageSource, __functionAddress);
    }

    // --- [ ulImageSourceProviderAddImageSource ] ---

    /** {@code void ulImageSourceProviderAddImageSource(C_String * id, C_ImageSource * imageSource)} */
    public static void ulImageSourceProviderAddImageSource(@NativeType("C_String *") long id, @NativeType("C_ImageSource *") long imageSource) {
        long __functionAddress = Functions.ImageSourceProviderAddImageSource;
        if (CHECKS) {
            check(id);
            check(imageSource);
        }
        invokePPV(id, imageSource, __functionAddress);
    }

    // --- [ ulImageSourceProviderRemoveImageSource ] ---

    /** {@code void ulImageSourceProviderRemoveImageSource(C_String * id)} */
    public static void ulImageSourceProviderRemoveImageSource(@NativeType("C_String *") long id) {
        long __functionAddress = Functions.ImageSourceProviderRemoveImageSource;
        if (CHECKS) {
            check(id);
        }
        invokePV(id, __functionAddress);
    }

    // --- [ ulCreateKeyEvent ] ---

    /** {@code C_KeyEvent * ulCreateKeyEvent(ULKeyEventType type, unsigned int modifiers, int virtualKeyCode, int nativeKeyCode, C_String * text, C_String * unmodifiedText, bool isKeypad, bool isAutoRepeat, bool isSystemKey)} */
    @NativeType("C_KeyEvent *")
    public static long ulCreateKeyEvent(@NativeType("ULKeyEventType") int type, @NativeType("unsigned int") int modifiers, int virtualKeyCode, int nativeKeyCode, @NativeType("C_String *") long text, @NativeType("C_String *") long unmodifiedText, @NativeType("bool") boolean isKeypad, @NativeType("bool") boolean isAutoRepeat, @NativeType("bool") boolean isSystemKey) {
        long __functionAddress = Functions.CreateKeyEvent;
        if (CHECKS) {
            check(text);
            check(unmodifiedText);
        }
        return invokePPP(type, modifiers, virtualKeyCode, nativeKeyCode, text, unmodifiedText, isKeypad, isAutoRepeat, isSystemKey, __functionAddress);
    }

    // --- [ ulDestroyKeyEvent ] ---

    /** {@code void ulDestroyKeyEvent(C_KeyEvent * event)} */
    public static void ulDestroyKeyEvent(@NativeType("C_KeyEvent *") long event) {
        long __functionAddress = Functions.DestroyKeyEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulCreateMouseEvent ] ---

    /** {@code C_MouseEvent * ulCreateMouseEvent(ULMouseEventType type, int x, int y, ULMouseButton button)} */
    @NativeType("C_MouseEvent *")
    public static long ulCreateMouseEvent(@NativeType("ULMouseEventType") int type, int x, int y, @NativeType("ULMouseButton") int button) {
        long __functionAddress = Functions.CreateMouseEvent;
        return invokeP(type, x, y, button, __functionAddress);
    }

    // --- [ ulDestroyMouseEvent ] ---

    /** {@code void ulDestroyMouseEvent(C_MouseEvent * event)} */
    public static void ulDestroyMouseEvent(@NativeType("C_MouseEvent *") long event) {
        long __functionAddress = Functions.DestroyMouseEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulPlatformSetLogger ] ---

    /** {@code void ulPlatformSetLogger(ULLogger * logger)} */
    public static void nulPlatformSetLogger(long logger) {
        long __functionAddress = Functions.PlatformSetLogger;
        invokePV(logger, __functionAddress);
    }

    /** {@code void ulPlatformSetLogger(ULLogger * logger)} */
    public static void ulPlatformSetLogger(@NativeType("ULLogger *") ULLogger logger) {
        nulPlatformSetLogger(logger.address());
    }

    // --- [ ulPlatformSetFileSystem ] ---

    /** {@code void ulPlatformSetFileSystem(ULFileSystem * filesystem)} */
    public static void nulPlatformSetFileSystem(long filesystem) {
        long __functionAddress = Functions.PlatformSetFileSystem;
        invokePV(filesystem, __functionAddress);
    }

    /** {@code void ulPlatformSetFileSystem(ULFileSystem * filesystem)} */
    public static void ulPlatformSetFileSystem(@NativeType("ULFileSystem *") ULFileSystem filesystem) {
        nulPlatformSetFileSystem(filesystem.address());
    }

    // --- [ ulPlatformSetFontLoader ] ---

    /** {@code void ulPlatformSetFontLoader(ULFontLoaderLoad fontLoader)} */
    public static void nulPlatformSetFontLoader(long fontLoader) {
        long __functionAddress = Functions.PlatformSetFontLoader;
        invokePV(fontLoader, __functionAddress);
    }

    /** {@code void ulPlatformSetFontLoader(ULFontLoaderLoad fontLoader)} */
    public static void ulPlatformSetFontLoader(@NativeType("ULFontLoaderLoad") ULFontLoaderLoadI fontLoader) {
        nulPlatformSetFontLoader(fontLoader.address());
    }

    // --- [ ulPlatformSetSurfaceDefinition ] ---

    /** {@code void ulPlatformSetSurfaceDefinition(ULSurfaceDefinition * surfaceDefinition)} */
    public static void nulPlatformSetSurfaceDefinition(long surfaceDefinition) {
        long __functionAddress = Functions.PlatformSetSurfaceDefinition;
        invokePV(surfaceDefinition, __functionAddress);
    }

    /** {@code void ulPlatformSetSurfaceDefinition(ULSurfaceDefinition * surfaceDefinition)} */
    public static void ulPlatformSetSurfaceDefinition(@NativeType("ULSurfaceDefinition *") ULSurfaceDefinition surfaceDefinition) {
        nulPlatformSetSurfaceDefinition(surfaceDefinition.address());
    }

    // --- [ ulPlatformSetGPUDriver ] ---

    /** {@code void ulPlatformSetGPUDriver(ULGPUDriver * gpuDriver)} */
    public static void nulPlatformSetGPUDriver(long gpuDriver) {
        long __functionAddress = Functions.PlatformSetGPUDriver;
        invokePV(gpuDriver, __functionAddress);
    }

    /** {@code void ulPlatformSetGPUDriver(ULGPUDriver * gpuDriver)} */
    public static void ulPlatformSetGPUDriver(@NativeType("ULGPUDriver *") ULGPUDriver gpuDriver) {
        nulPlatformSetGPUDriver(gpuDriver.address());
    }

    // --- [ ulPlatformSetClipboard ] ---

    /** {@code void ulPlatformSetClipboard(ULClipboard * clipboard)} */
    public static void nulPlatformSetClipboard(long clipboard) {
        long __functionAddress = Functions.PlatformSetClipboard;
        invokePV(clipboard, __functionAddress);
    }

    /** {@code void ulPlatformSetClipboard(ULClipboard * clipboard)} */
    public static void ulPlatformSetClipboard(@NativeType("ULClipboard *") ULClipboard clipboard) {
        nulPlatformSetClipboard(clipboard.address());
    }

    // --- [ ulCreateRenderer ] ---

    /** {@code C_Renderer * ulCreateRenderer(C_Config * config)} */
    @NativeType("C_Renderer *")
    public static long ulCreateRenderer(@NativeType("C_Config *") long config) {
        long __functionAddress = Functions.CreateRenderer;
        if (CHECKS) {
            check(config);
        }
        return invokePP(config, __functionAddress);
    }

    // --- [ ulDestroyRenderer ] ---

    /** {@code void ulDestroyRenderer(C_Renderer * renderer)} */
    public static void ulDestroyRenderer(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.DestroyRenderer;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ ulUpdate ] ---

    /** {@code void ulUpdate(C_Renderer * renderer)} */
    public static void ulUpdate(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.Update;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ ulRefreshDisplay ] ---

    /** {@code void ulRefreshDisplay(C_Renderer * renderer, unsigned int displayID)} */
    public static void ulRefreshDisplay(@NativeType("C_Renderer *") long renderer, @NativeType("unsigned int") int displayID) {
        long __functionAddress = Functions.RefreshDisplay;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, displayID, __functionAddress);
    }

    // --- [ ulRender ] ---

    /** {@code void ulRender(C_Renderer * renderer)} */
    public static void ulRender(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.Render;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ ulPurgeMemory ] ---

    /** {@code void ulPurgeMemory(C_Renderer * renderer)} */
    public static void ulPurgeMemory(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.PurgeMemory;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ ulLogMemoryUsage ] ---

    /** {@code void ulLogMemoryUsage(C_Renderer * renderer)} */
    public static void ulLogMemoryUsage(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.LogMemoryUsage;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ ulStartRemoteInspectorServer ] ---

    /** {@code void ulStartRemoteInspectorServer(C_Renderer * renderer, char const * address, unsigned short port)} */
    public static void nulStartRemoteInspectorServer(long renderer, long address, short port) {
        long __functionAddress = Functions.StartRemoteInspectorServer;
        if (CHECKS) {
            check(renderer);
        }
        invokePPCV(renderer, address, port, __functionAddress);
    }

    /** {@code void ulStartRemoteInspectorServer(C_Renderer * renderer, char const * address, unsigned short port)} */
    public static void ulStartRemoteInspectorServer(@NativeType("C_Renderer *") long renderer, @NativeType("char const *") ByteBuffer address, @NativeType("unsigned short") short port) {
        if (CHECKS) {
            check(address, 1);
        }
        nulStartRemoteInspectorServer(renderer, memAddress(address), port);
    }

    /** {@code void ulStartRemoteInspectorServer(C_Renderer * renderer, char const * address, unsigned short port)} */
    public static void ulStartRemoteInspectorServer(@NativeType("C_Renderer *") long renderer, @NativeType("char const *") CharSequence address, @NativeType("unsigned short") short port) {
        if (CHECKS) {
            check(address, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(address, true);
            long addressEncoded = stack.getPointerAddress();
            nulStartRemoteInspectorServer(renderer, addressEncoded, port);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulSetGamepadDetails ] ---

    /** {@code void ulSetGamepadDetails(C_Renderer * renderer, unsigned int index, C_String * id, unsigned int axisCount, unsigned int buttonCount)} */
    public static void ulSetGamepadDetails(@NativeType("C_Renderer *") long renderer, @NativeType("unsigned int") int index, @NativeType("C_String *") long id, @NativeType("unsigned int") int axisCount, @NativeType("unsigned int") int buttonCount) {
        long __functionAddress = Functions.SetGamepadDetails;
        if (CHECKS) {
            check(renderer);
            check(id);
        }
        invokePPV(renderer, index, id, axisCount, buttonCount, __functionAddress);
    }

    // --- [ ulFireGamepadEvent ] ---

    /** {@code void ulFireGamepadEvent(C_Renderer * renderer, C_GamepadEvent * event)} */
    public static void ulFireGamepadEvent(@NativeType("C_Renderer *") long renderer, @NativeType("C_GamepadEvent *") long event) {
        long __functionAddress = Functions.FireGamepadEvent;
        if (CHECKS) {
            check(renderer);
            check(event);
        }
        invokePPV(renderer, event, __functionAddress);
    }

    // --- [ ulFireGamepadAxisEvent ] ---

    /** {@code void ulFireGamepadAxisEvent(C_Renderer * renderer, C_GamepadAxisEvent * event)} */
    public static void ulFireGamepadAxisEvent(@NativeType("C_Renderer *") long renderer, @NativeType("C_GamepadAxisEvent *") long event) {
        long __functionAddress = Functions.FireGamepadAxisEvent;
        if (CHECKS) {
            check(renderer);
            check(event);
        }
        invokePPV(renderer, event, __functionAddress);
    }

    // --- [ ulFireGamepadButtonEvent ] ---

    /** {@code void ulFireGamepadButtonEvent(C_Renderer * renderer, C_GamepadButtonEvent * event)} */
    public static void ulFireGamepadButtonEvent(@NativeType("C_Renderer *") long renderer, @NativeType("C_GamepadButtonEvent *") long event) {
        long __functionAddress = Functions.FireGamepadButtonEvent;
        if (CHECKS) {
            check(renderer);
            check(event);
        }
        invokePPV(renderer, event, __functionAddress);
    }

    // --- [ ulCreateScrollEvent ] ---

    /** {@code C_ScrollEvent * ulCreateScrollEvent(ULScrollEventType type, int deltaX, int deltaY)} */
    @NativeType("C_ScrollEvent *")
    public static long ulCreateScrollEvent(@NativeType("ULScrollEventType") int type, int deltaX, int deltaY) {
        long __functionAddress = Functions.CreateScrollEvent;
        return invokeP(type, deltaX, deltaY, __functionAddress);
    }

    // --- [ ulDestroyScrollEvent ] ---

    /** {@code void ulDestroyScrollEvent(C_ScrollEvent * event)} */
    public static void ulDestroyScrollEvent(@NativeType("C_ScrollEvent *") long event) {
        long __functionAddress = Functions.DestroyScrollEvent;
        if (CHECKS) {
            check(event);
        }
        invokePV(event, __functionAddress);
    }

    // --- [ ulCreateSession ] ---

    /** {@code C_Session * ulCreateSession(C_Renderer * renderer, bool isPersistent, C_String * name)} */
    @NativeType("C_Session *")
    public static long ulCreateSession(@NativeType("C_Renderer *") long renderer, @NativeType("bool") boolean isPersistent, @NativeType("C_String *") long name) {
        long __functionAddress = Functions.CreateSession;
        if (CHECKS) {
            check(renderer);
            check(name);
        }
        return invokePPP(renderer, isPersistent, name, __functionAddress);
    }

    // --- [ ulDestroySession ] ---

    /** {@code void ulDestroySession(C_Session * session)} */
    public static void ulDestroySession(@NativeType("C_Session *") long session) {
        long __functionAddress = Functions.DestroySession;
        if (CHECKS) {
            check(session);
        }
        invokePV(session, __functionAddress);
    }

    // --- [ ulDefaultSession ] ---

    /** {@code C_Session * ulDefaultSession(C_Renderer * renderer)} */
    @NativeType("C_Session *")
    public static long ulDefaultSession(@NativeType("C_Renderer *") long renderer) {
        long __functionAddress = Functions.DefaultSession;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ ulSessionIsPersistent ] ---

    /** {@code bool ulSessionIsPersistent(C_Session * session)} */
    @NativeType("bool")
    public static boolean ulSessionIsPersistent(@NativeType("C_Session *") long session) {
        long __functionAddress = Functions.SessionIsPersistent;
        if (CHECKS) {
            check(session);
        }
        return invokePZ(session, __functionAddress);
    }

    // --- [ ulSessionGetName ] ---

    /** {@code C_String * ulSessionGetName(C_Session * session)} */
    @NativeType("C_String *")
    public static long ulSessionGetName(@NativeType("C_Session *") long session) {
        long __functionAddress = Functions.SessionGetName;
        if (CHECKS) {
            check(session);
        }
        return invokePP(session, __functionAddress);
    }

    // --- [ ulSessionGetId ] ---

    /** {@code unsigned long long ulSessionGetId(C_Session * session)} */
    @NativeType("unsigned long long")
    public static long ulSessionGetId(@NativeType("C_Session *") long session) {
        long __functionAddress = Functions.SessionGetId;
        if (CHECKS) {
            check(session);
        }
        return invokePJ(session, __functionAddress);
    }

    // --- [ ulSessionGetDiskPath ] ---

    /** {@code C_String * ulSessionGetDiskPath(C_Session * session)} */
    @NativeType("C_String *")
    public static long ulSessionGetDiskPath(@NativeType("C_Session *") long session) {
        long __functionAddress = Functions.SessionGetDiskPath;
        if (CHECKS) {
            check(session);
        }
        return invokePP(session, __functionAddress);
    }

    // --- [ ulCreateString ] ---

    /** {@code C_String * ulCreateString(char const * string)} */
    public static long nulCreateString(long string) {
        long __functionAddress = Functions.CreateString;
        return invokePP(string, __functionAddress);
    }

    /** {@code C_String * ulCreateString(char const * string)} */
    @NativeType("C_String *")
    public static long ulCreateString(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nulCreateString(memAddress(string));
    }

    /** {@code C_String * ulCreateString(char const * string)} */
    @NativeType("C_String *")
    public static long ulCreateString(@NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nulCreateString(stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulCreateStringUTF8 ] ---

    /** {@code C_String * ulCreateStringUTF8(char const * string, size_t len)} */
    public static long nulCreateStringUTF8(long string, long len) {
        long __functionAddress = Functions.CreateStringUTF8;
        return invokePPP(string, len, __functionAddress);
    }

    /** {@code C_String * ulCreateStringUTF8(char const * string, size_t len)} */
    @NativeType("C_String *")
    public static long ulCreateStringUTF8(@NativeType("char const *") ByteBuffer string, @NativeType("size_t") long len) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nulCreateStringUTF8(memAddress(string), len);
    }

    /** {@code C_String * ulCreateStringUTF8(char const * string, size_t len)} */
    @NativeType("C_String *")
    public static long ulCreateStringUTF8(@NativeType("char const *") CharSequence string, @NativeType("size_t") long len) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nulCreateStringUTF8(stringEncoded, len);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulCreateStringUTF16 ] ---

    /** {@code C_String * ulCreateStringUTF16(unsigned short string, size_t len)} */
    @NativeType("C_String *")
    public static long ulCreateStringUTF16(@NativeType("unsigned short") short string, @NativeType("size_t") long len) {
        long __functionAddress = Functions.CreateStringUTF16;
        return invokeCPP(string, len, __functionAddress);
    }

    // --- [ ulDestroyString ] ---

    /** {@code void ulDestroyString(C_String * string)} */
    public static void ulDestroyString(@NativeType("C_String *") long string) {
        long __functionAddress = Functions.DestroyString;
        if (CHECKS) {
            check(string);
        }
        invokePV(string, __functionAddress);
    }

    // --- [ ulStringGetData ] ---

    /** {@code char * ulStringGetData(C_String * string)} */
    public static long nulStringGetData(long string) {
        long __functionAddress = Functions.StringGetData;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    /** {@code char * ulStringGetData(C_String * string)} */
    @NativeType("char *")
    public static @Nullable String ulStringGetData(@NativeType("C_String *") long string) {
        long __result = nulStringGetData(string);
        return memASCIISafe(__result);
    }

    // --- [ ulStringGetLength ] ---

    /** {@code size_t ulStringGetLength(C_String * string)} */
    @NativeType("size_t")
    public static long ulStringGetLength(@NativeType("C_String *") long string) {
        long __functionAddress = Functions.StringGetLength;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ ulStringIsEmpty ] ---

    /** {@code bool ulStringIsEmpty(C_String * string)} */
    @NativeType("bool")
    public static boolean ulStringIsEmpty(@NativeType("C_String *") long string) {
        long __functionAddress = Functions.StringIsEmpty;
        if (CHECKS) {
            check(string);
        }
        return invokePZ(string, __functionAddress);
    }

    // --- [ ulStringAssignString ] ---

    /** {@code void ulStringAssignString(C_String * string, C_String * newString)} */
    public static void ulStringAssignString(@NativeType("C_String *") long string, @NativeType("C_String *") long newString) {
        long __functionAddress = Functions.StringAssignString;
        if (CHECKS) {
            check(string);
            check(newString);
        }
        invokePPV(string, newString, __functionAddress);
    }

    // --- [ ulStringAssignCString ] ---

    /** {@code void ulStringAssignCString(C_String * string, char const * cString)} */
    public static void nulStringAssignCString(long string, long cString) {
        long __functionAddress = Functions.StringAssignCString;
        if (CHECKS) {
            check(string);
        }
        invokePPV(string, cString, __functionAddress);
    }

    /** {@code void ulStringAssignCString(C_String * string, char const * cString)} */
    public static void ulStringAssignCString(@NativeType("C_String *") long string, @NativeType("char const *") ByteBuffer cString) {
        if (CHECKS) {
            checkNT1(cString);
        }
        nulStringAssignCString(string, memAddress(cString));
    }

    /** {@code void ulStringAssignCString(C_String * string, char const * cString)} */
    public static void ulStringAssignCString(@NativeType("C_String *") long string, @NativeType("char const *") CharSequence cString) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(cString, true);
            long cStringEncoded = stack.getPointerAddress();
            nulStringAssignCString(string, cStringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ulSurfaceGetWidth ] ---

    /** {@code unsigned int ulSurfaceGetWidth(C_Surface * surface)} */
    @NativeType("unsigned int")
    public static int ulSurfaceGetWidth(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceGetWidth;
        if (CHECKS) {
            check(surface);
        }
        return invokePI(surface, __functionAddress);
    }

    // --- [ ulSurfaceGetHeight ] ---

    /** {@code unsigned int ulSurfaceGetHeight(C_Surface * surface)} */
    @NativeType("unsigned int")
    public static int ulSurfaceGetHeight(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceGetHeight;
        if (CHECKS) {
            check(surface);
        }
        return invokePI(surface, __functionAddress);
    }

    // --- [ ulSurfaceGetRowBytes ] ---

    /** {@code unsigned int ulSurfaceGetRowBytes(C_Surface * surface)} */
    @NativeType("unsigned int")
    public static int ulSurfaceGetRowBytes(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceGetRowBytes;
        if (CHECKS) {
            check(surface);
        }
        return invokePI(surface, __functionAddress);
    }

    // --- [ ulSurfaceGetSize ] ---

    /** {@code size_t ulSurfaceGetSize(C_Surface * surface)} */
    @NativeType("size_t")
    public static long ulSurfaceGetSize(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceGetSize;
        if (CHECKS) {
            check(surface);
        }
        return invokePP(surface, __functionAddress);
    }

    // --- [ ulSurfaceLockPixels ] ---

    /** {@code void * ulSurfaceLockPixels(C_Surface * surface)} */
    @NativeType("void *")
    public static long ulSurfaceLockPixels(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceLockPixels;
        if (CHECKS) {
            check(surface);
        }
        return invokePP(surface, __functionAddress);
    }

    // --- [ ulSurfaceUnlockPixels ] ---

    /** {@code void ulSurfaceUnlockPixels(C_Surface * surface)} */
    public static void ulSurfaceUnlockPixels(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceUnlockPixels;
        if (CHECKS) {
            check(surface);
        }
        invokePV(surface, __functionAddress);
    }

    // --- [ ulSurfaceResize ] ---

    /** {@code void ulSurfaceResize(C_Surface * surface, unsigned int width, unsigned int height)} */
    public static void ulSurfaceResize(@NativeType("C_Surface *") long surface, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height) {
        long __functionAddress = Functions.SurfaceResize;
        if (CHECKS) {
            check(surface);
        }
        invokePV(surface, width, height, __functionAddress);
    }

    // --- [ ulSurfaceSetDirtyBounds ] ---

    /** {@code void ulSurfaceSetDirtyBounds(C_Surface * surface, ULIntRect * bounds)} */
    public static void nulSurfaceSetDirtyBounds(long surface, long bounds) {
        long __functionAddress = Functions.SurfaceSetDirtyBounds;
        if (CHECKS) {
            check(surface);
        }
        invokePPV(surface, bounds, __functionAddress);
    }

    /** {@code void ulSurfaceSetDirtyBounds(C_Surface * surface, ULIntRect * bounds)} */
    public static void ulSurfaceSetDirtyBounds(@NativeType("C_Surface *") long surface, @NativeType("ULIntRect *") ULIntRect bounds) {
        nulSurfaceSetDirtyBounds(surface, bounds.address());
    }

    // --- [ ulSurfaceGetDirtyBounds ] ---

    /** {@code ULIntRect * ulSurfaceGetDirtyBounds(C_Surface * surface)} */
    public static long nulSurfaceGetDirtyBounds(long surface) {
        long __functionAddress = Functions.SurfaceGetDirtyBounds;
        if (CHECKS) {
            check(surface);
        }
        return invokePP(surface, __functionAddress);
    }

    /** {@code ULIntRect * ulSurfaceGetDirtyBounds(C_Surface * surface)} */
    @NativeType("ULIntRect *")
    public static @Nullable ULIntRect ulSurfaceGetDirtyBounds(@NativeType("C_Surface *") long surface) {
        long __result = nulSurfaceGetDirtyBounds(surface);
        return ULIntRect.createSafe(__result);
    }

    // --- [ ulSurfaceClearDirtyBounds ] ---

    /** {@code void ulSurfaceClearDirtyBounds(C_Surface * surface)} */
    public static void ulSurfaceClearDirtyBounds(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceClearDirtyBounds;
        if (CHECKS) {
            check(surface);
        }
        invokePV(surface, __functionAddress);
    }

    // --- [ ulSurfaceGetUserData ] ---

    /** {@code void * ulSurfaceGetUserData(C_Surface * surface)} */
    @NativeType("void *")
    public static long ulSurfaceGetUserData(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.SurfaceGetUserData;
        if (CHECKS) {
            check(surface);
        }
        return invokePP(surface, __functionAddress);
    }

    // --- [ ulBitmapSurfaceGetBitmap ] ---

    /** {@code C_Bitmap * ulBitmapSurfaceGetBitmap(C_Surface * surface)} */
    @NativeType("C_Bitmap *")
    public static long ulBitmapSurfaceGetBitmap(@NativeType("C_Surface *") long surface) {
        long __functionAddress = Functions.BitmapSurfaceGetBitmap;
        if (CHECKS) {
            check(surface);
        }
        return invokePP(surface, __functionAddress);
    }

    // --- [ ulCreateViewConfig ] ---

    /** {@code C_ViewConfig * ulCreateViewConfig(void)} */
    @NativeType("C_ViewConfig *")
    public static long ulCreateViewConfig() {
        long __functionAddress = Functions.CreateViewConfig;
        return invokeP(__functionAddress);
    }

    // --- [ ulDestroyViewConfig ] ---

    /** {@code void ulDestroyViewConfig(C_ViewConfig * config)} */
    public static void ulDestroyViewConfig(@NativeType("C_ViewConfig *") long config) {
        long __functionAddress = Functions.DestroyViewConfig;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, __functionAddress);
    }

    // --- [ ulViewConfigSetDisplayId ] ---

    /** {@code void ulViewConfigSetDisplayId(C_ViewConfig * config, unsigned int displayID)} */
    public static void ulViewConfigSetDisplayId(@NativeType("C_ViewConfig *") long config, @NativeType("unsigned int") int displayID) {
        long __functionAddress = Functions.ViewConfigSetDisplayId;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, displayID, __functionAddress);
    }

    // --- [ ulViewConfigSetIsAccelerated ] ---

    /** {@code void ulViewConfigSetIsAccelerated(C_ViewConfig * config, bool isAccelerated)} */
    public static void ulViewConfigSetIsAccelerated(@NativeType("C_ViewConfig *") long config, @NativeType("bool") boolean isAccelerated) {
        long __functionAddress = Functions.ViewConfigSetIsAccelerated;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, isAccelerated, __functionAddress);
    }

    // --- [ ulViewConfigSetIsTransparent ] ---

    /** {@code void ulViewConfigSetIsTransparent(C_ViewConfig * config, bool isTransparent)} */
    public static void ulViewConfigSetIsTransparent(@NativeType("C_ViewConfig *") long config, @NativeType("bool") boolean isTransparent) {
        long __functionAddress = Functions.ViewConfigSetIsTransparent;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, isTransparent, __functionAddress);
    }

    // --- [ ulViewConfigSetInitialDeviceScale ] ---

    /** {@code void ulViewConfigSetInitialDeviceScale(C_ViewConfig * config, double initialDeviceScale)} */
    public static void ulViewConfigSetInitialDeviceScale(@NativeType("C_ViewConfig *") long config, double initialDeviceScale) {
        long __functionAddress = Functions.ViewConfigSetInitialDeviceScale;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, initialDeviceScale, __functionAddress);
    }

    // --- [ ulViewConfigSetInitialFocus ] ---

    /** {@code void ulViewConfigSetInitialFocus(C_ViewConfig * config, bool isFocused)} */
    public static void ulViewConfigSetInitialFocus(@NativeType("C_ViewConfig *") long config, @NativeType("bool") boolean isFocused) {
        long __functionAddress = Functions.ViewConfigSetInitialFocus;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, isFocused, __functionAddress);
    }

    // --- [ ulViewConfigSetEnableImages ] ---

    /** {@code void ulViewConfigSetEnableImages(C_ViewConfig * config, bool enabled)} */
    public static void ulViewConfigSetEnableImages(@NativeType("C_ViewConfig *") long config, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.ViewConfigSetEnableImages;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, enabled, __functionAddress);
    }

    // --- [ ulViewConfigSetEnableJavaScript ] ---

    /** {@code void ulViewConfigSetEnableJavaScript(C_ViewConfig * config, bool enabled)} */
    public static void ulViewConfigSetEnableJavaScript(@NativeType("C_ViewConfig *") long config, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.ViewConfigSetEnableJavaScript;
        if (CHECKS) {
            check(config);
        }
        invokePV(config, enabled, __functionAddress);
    }

    // --- [ ulViewConfigSetFontFamilyStandard ] ---

    /** {@code void ulViewConfigSetFontFamilyStandard(C_ViewConfig * config, C_String * fontName)} */
    public static void ulViewConfigSetFontFamilyStandard(@NativeType("C_ViewConfig *") long config, @NativeType("C_String *") long fontName) {
        long __functionAddress = Functions.ViewConfigSetFontFamilyStandard;
        if (CHECKS) {
            check(config);
            check(fontName);
        }
        invokePPV(config, fontName, __functionAddress);
    }

    // --- [ ulViewConfigSetFontFamilyFixed ] ---

    /** {@code void ulViewConfigSetFontFamilyFixed(C_ViewConfig * config, C_String * fontName)} */
    public static void ulViewConfigSetFontFamilyFixed(@NativeType("C_ViewConfig *") long config, @NativeType("C_String *") long fontName) {
        long __functionAddress = Functions.ViewConfigSetFontFamilyFixed;
        if (CHECKS) {
            check(config);
            check(fontName);
        }
        invokePPV(config, fontName, __functionAddress);
    }

    // --- [ ulViewConfigSetFontFamilySerif ] ---

    /** {@code void ulViewConfigSetFontFamilySerif(C_ViewConfig * config, C_String * fontName)} */
    public static void ulViewConfigSetFontFamilySerif(@NativeType("C_ViewConfig *") long config, @NativeType("C_String *") long fontName) {
        long __functionAddress = Functions.ViewConfigSetFontFamilySerif;
        if (CHECKS) {
            check(config);
            check(fontName);
        }
        invokePPV(config, fontName, __functionAddress);
    }

    // --- [ ulViewConfigSetFontFamilySansSerif ] ---

    /** {@code void ulViewConfigSetFontFamilySansSerif(C_ViewConfig * config, C_String * fontName)} */
    public static void ulViewConfigSetFontFamilySansSerif(@NativeType("C_ViewConfig *") long config, @NativeType("C_String *") long fontName) {
        long __functionAddress = Functions.ViewConfigSetFontFamilySansSerif;
        if (CHECKS) {
            check(config);
            check(fontName);
        }
        invokePPV(config, fontName, __functionAddress);
    }

    // --- [ ulViewConfigSetUserAgent ] ---

    /** {@code void ulViewConfigSetUserAgent(C_ViewConfig * config, C_String * agentString)} */
    public static void ulViewConfigSetUserAgent(@NativeType("C_ViewConfig *") long config, @NativeType("C_String *") long agentString) {
        long __functionAddress = Functions.ViewConfigSetUserAgent;
        if (CHECKS) {
            check(config);
            check(agentString);
        }
        invokePPV(config, agentString, __functionAddress);
    }

    // --- [ ulCreateView ] ---

    /** {@code C_View * ulCreateView(C_Renderer * renderer, unsigned int width, unsigned int height, C_ViewConfig * viewConfig, C_Session * session)} */
    @NativeType("C_View *")
    public static long ulCreateView(@NativeType("C_Renderer *") long renderer, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("C_ViewConfig *") long viewConfig, @NativeType("C_Session *") long session) {
        long __functionAddress = Functions.CreateView;
        if (CHECKS) {
            check(renderer);
            check(viewConfig);
        }
        return invokePPPP(renderer, width, height, viewConfig, session, __functionAddress);
    }

    // --- [ ulDestroyView ] ---

    /** {@code void ulDestroyView(C_View * view)} */
    public static void ulDestroyView(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.DestroyView;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewGetURL ] ---

    /** {@code C_String * ulViewGetURL(C_View * view)} */
    @NativeType("C_String *")
    public static long ulViewGetURL(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetURL;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

    // --- [ ulViewGetTitle ] ---

    /** {@code C_String * ulViewGetTitle(C_View * view)} */
    @NativeType("C_String *")
    public static long ulViewGetTitle(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetTitle;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

    // --- [ ulViewGetWidth ] ---

    /** {@code unsigned int ulViewGetWidth(C_View * view)} */
    @NativeType("unsigned int")
    public static int ulViewGetWidth(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetWidth;
        if (CHECKS) {
            check(view);
        }
        return invokePI(view, __functionAddress);
    }

    // --- [ ulViewGetHeight ] ---

    /** {@code unsigned int ulViewGetHeight(C_View * view)} */
    @NativeType("unsigned int")
    public static int ulViewGetHeight(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetHeight;
        if (CHECKS) {
            check(view);
        }
        return invokePI(view, __functionAddress);
    }

    // --- [ ulViewGetDisplayId ] ---

    /** {@code unsigned int ulViewGetDisplayId(C_View * view)} */
    @NativeType("unsigned int")
    public static int ulViewGetDisplayId(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetDisplayId;
        if (CHECKS) {
            check(view);
        }
        return invokePI(view, __functionAddress);
    }

    // --- [ ulViewSetDisplayId ] ---

    /** {@code void ulViewSetDisplayId(C_View * view, unsigned int displayID)} */
    public static void ulViewSetDisplayId(@NativeType("C_View *") long view, @NativeType("unsigned int") int displayID) {
        long __functionAddress = Functions.ViewSetDisplayId;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, displayID, __functionAddress);
    }

    // --- [ ulViewGetDeviceScale ] ---

    /** {@code double ulViewGetDeviceScale(C_View * view)} */
    public static double ulViewGetDeviceScale(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetDeviceScale;
        if (CHECKS) {
            check(view);
        }
        return invokePD(view, __functionAddress);
    }

    // --- [ ulViewSetDeviceScale ] ---

    /** {@code void ulViewSetDeviceScale(C_View * view, double scale)} */
    public static void ulViewSetDeviceScale(@NativeType("C_View *") long view, double scale) {
        long __functionAddress = Functions.ViewSetDeviceScale;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, scale, __functionAddress);
    }

    // --- [ ulViewIsAccelerated ] ---

    /** {@code bool ulViewIsAccelerated(C_View * view)} */
    @NativeType("bool")
    public static boolean ulViewIsAccelerated(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewIsAccelerated;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, __functionAddress);
    }

    // --- [ ulViewIsTransparent ] ---

    /** {@code bool ulViewIsTransparent(C_View * view)} */
    @NativeType("bool")
    public static boolean ulViewIsTransparent(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewIsTransparent;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, __functionAddress);
    }

    // --- [ ulViewIsLoading ] ---

    /** {@code bool ulViewIsLoading(C_View * view)} */
    @NativeType("bool")
    public static boolean ulViewIsLoading(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewIsLoading;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, __functionAddress);
    }

    // --- [ ulViewGetRenderTarget ] ---

    /** {@code ULRenderTarget * ulViewGetRenderTarget(C_View * view)} */
    public static long nulViewGetRenderTarget(long view) {
        long __functionAddress = Functions.ViewGetRenderTarget;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

    /** {@code ULRenderTarget * ulViewGetRenderTarget(C_View * view)} */
    @NativeType("ULRenderTarget *")
    public static @Nullable ULRenderTarget ulViewGetRenderTarget(@NativeType("C_View *") long view) {
        long __result = nulViewGetRenderTarget(view);
        return ULRenderTarget.createSafe(__result);
    }

    // --- [ ulViewGetSurface ] ---

    /** {@code C_Surface * ulViewGetSurface(C_View * view)} */
    @NativeType("C_Surface *")
    public static long ulViewGetSurface(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetSurface;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

    // --- [ ulViewLoadHTML ] ---

    /** {@code void ulViewLoadHTML(C_View * view, C_String * htmlString)} */
    public static void ulViewLoadHTML(@NativeType("C_View *") long view, @NativeType("C_String *") long htmlString) {
        long __functionAddress = Functions.ViewLoadHTML;
        if (CHECKS) {
            check(view);
            check(htmlString);
        }
        invokePPV(view, htmlString, __functionAddress);
    }

    // --- [ ulViewLoadURL ] ---

    /** {@code void ulViewLoadURL(C_View * view, C_String * urlString)} */
    public static void ulViewLoadURL(@NativeType("C_View *") long view, @NativeType("C_String *") long urlString) {
        long __functionAddress = Functions.ViewLoadURL;
        if (CHECKS) {
            check(view);
            check(urlString);
        }
        invokePPV(view, urlString, __functionAddress);
    }

    // --- [ ulViewResize ] ---

    /** {@code void ulViewResize(C_View * view, unsigned int width, unsigned int height)} */
    public static void ulViewResize(@NativeType("C_View *") long view, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height) {
        long __functionAddress = Functions.ViewResize;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, width, height, __functionAddress);
    }

    // --- [ ulViewLockJSContext ] ---

    /** {@code OpaqueJSContext const * ulViewLockJSContext(C_View * view)} */
    @NativeType("OpaqueJSContext const *")
    public static long ulViewLockJSContext(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewLockJSContext;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

    // --- [ ulViewUnlockJSContext ] ---

    /** {@code void ulViewUnlockJSContext(C_View * view)} */
    public static void ulViewUnlockJSContext(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewUnlockJSContext;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewEvaluateScript ] ---

    /** {@code C_String * ulViewEvaluateScript(C_View * view, C_String * jsString, C_String * exception)} */
    @NativeType("C_String *")
    public static long ulViewEvaluateScript(@NativeType("C_View *") long view, @NativeType("C_String *") long jsString, @NativeType("C_String *") long exception) {
        long __functionAddress = Functions.ViewEvaluateScript;
        if (CHECKS) {
            check(view);
            check(jsString);
            check(exception);
        }
        return invokePPPP(view, jsString, exception, __functionAddress);
    }

    // --- [ ulViewCanGoBack ] ---

    /** {@code bool ulViewCanGoBack(C_View * view)} */
    @NativeType("bool")
    public static boolean ulViewCanGoBack(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewCanGoBack;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, __functionAddress);
    }

    // --- [ ulViewCanGoForward ] ---

    /** {@code bool ulViewCanGoForward(C_View * view)} */
    @NativeType("bool")
    public static boolean ulViewCanGoForward(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewCanGoForward;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, __functionAddress);
    }

    // --- [ ulViewGoToHistoryOffset ] ---

    /** {@code bool ulViewGoToHistoryOffset(C_View * view, int offset)} */
    @NativeType("bool")
    public static boolean ulViewGoToHistoryOffset(@NativeType("C_View *") long view, int offset) {
        long __functionAddress = Functions.ViewGoToHistoryOffset;
        if (CHECKS) {
            check(view);
        }
        return invokePZ(view, offset, __functionAddress);
    }

    // --- [ ulViewReload ] ---

    /** {@code void ulViewReload(C_View * view)} */
    public static void ulViewReload(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewReload;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewStop ] ---

    /** {@code void ulViewStop(C_View * view)} */
    public static void ulViewStop(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewStop;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewFocus ] ---

    /** {@code void ulViewFocus(C_View * view)} */
    public static void ulViewFocus(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewFocus;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewUnfocus ] ---

    /** {@code void ulViewUnfocus(C_View * view)} */
    public static void ulViewUnfocus(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewUnfocus;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewHasInputFocus ] ---

    /** {@code void ulViewHasInputFocus(C_View * view)} */
    public static void ulViewHasInputFocus(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewHasInputFocus;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewFireKeyEvent ] ---

    /** {@code void ulViewFireKeyEvent(C_View * view, C_KeyEvent * keyEvent)} */
    public static void ulViewFireKeyEvent(@NativeType("C_View *") long view, @NativeType("C_KeyEvent *") long keyEvent) {
        long __functionAddress = Functions.ViewFireKeyEvent;
        if (CHECKS) {
            check(view);
            check(keyEvent);
        }
        invokePPV(view, keyEvent, __functionAddress);
    }

    // --- [ ulViewFireMouseEvent ] ---

    /** {@code void ulViewFireMouseEvent(C_View * view, C_MouseEvent * mouseEvent)} */
    public static void ulViewFireMouseEvent(@NativeType("C_View *") long view, @NativeType("C_MouseEvent *") long mouseEvent) {
        long __functionAddress = Functions.ViewFireMouseEvent;
        if (CHECKS) {
            check(view);
            check(mouseEvent);
        }
        invokePPV(view, mouseEvent, __functionAddress);
    }

    // --- [ ulViewFireScrollEvent ] ---

    /** {@code void ulViewFireScrollEvent(C_View * view, C_ScrollEvent * scrollEvent)} */
    public static void ulViewFireScrollEvent(@NativeType("C_View *") long view, @NativeType("C_ScrollEvent *") long scrollEvent) {
        long __functionAddress = Functions.ViewFireScrollEvent;
        if (CHECKS) {
            check(view);
            check(scrollEvent);
        }
        invokePPV(view, scrollEvent, __functionAddress);
    }

    // --- [ ulViewSetChangeTitleCallback ] ---

    /** {@code void ulViewSetChangeTitleCallback(ULChangeTitleCallback callback, void * userData)} */
    public static void nulViewSetChangeTitleCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetChangeTitleCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetChangeTitleCallback(ULChangeTitleCallback callback, void * userData)} */
    public static void ulViewSetChangeTitleCallback(@NativeType("ULChangeTitleCallback") ULChangeTitleCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetChangeTitleCallback(callback.address(), userData);
    }

    // --- [ ulViewSetChangeURLCallback ] ---

    /** {@code void ulViewSetChangeURLCallback(ULChangeURLCallback callback, void * userData)} */
    public static void nulViewSetChangeURLCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetChangeURLCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetChangeURLCallback(ULChangeURLCallback callback, void * userData)} */
    public static void ulViewSetChangeURLCallback(@NativeType("ULChangeURLCallback") ULChangeURLCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetChangeURLCallback(callback.address(), userData);
    }

    // --- [ ulViewSetChangeTooltipCallback ] ---

    /** {@code void ulViewSetChangeTooltipCallback(ULChangeTooltipCallback callback, void * userData)} */
    public static void nulViewSetChangeTooltipCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetChangeTooltipCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetChangeTooltipCallback(ULChangeTooltipCallback callback, void * userData)} */
    public static void ulViewSetChangeTooltipCallback(@NativeType("ULChangeTooltipCallback") ULChangeTooltipCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetChangeTooltipCallback(callback.address(), userData);
    }

    // --- [ ulViewSetChangeCursorCallback ] ---

    /** {@code void ulViewSetChangeCursorCallback(ULChangeCursorCallback callback, void * userData)} */
    public static void nulViewSetChangeCursorCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetChangeCursorCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetChangeCursorCallback(ULChangeCursorCallback callback, void * userData)} */
    public static void ulViewSetChangeCursorCallback(@NativeType("ULChangeCursorCallback") ULChangeCursorCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetChangeCursorCallback(callback.address(), userData);
    }

    // --- [ ulViewSetAddConsoleMessageCallback ] ---

    /** {@code void ulViewSetAddConsoleMessageCallback(ULAddConsoleMessageCallback callback, void * userData)} */
    public static void nulViewSetAddConsoleMessageCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetAddConsoleMessageCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetAddConsoleMessageCallback(ULAddConsoleMessageCallback callback, void * userData)} */
    public static void ulViewSetAddConsoleMessageCallback(@NativeType("ULAddConsoleMessageCallback") ULAddConsoleMessageCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetAddConsoleMessageCallback(callback.address(), userData);
    }

    // --- [ ulViewSetCreateChildViewCallback ] ---

    /** {@code void ulViewSetCreateChildViewCallback(ULCreateChildViewCallback callback, void * userData)} */
    public static void nulViewSetCreateChildViewCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetCreateChildViewCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetCreateChildViewCallback(ULCreateChildViewCallback callback, void * userData)} */
    public static void ulViewSetCreateChildViewCallback(@NativeType("ULCreateChildViewCallback") ULCreateChildViewCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetCreateChildViewCallback(callback.address(), userData);
    }

    // --- [ ulViewSetCreateInspectorViewCallback ] ---

    /** {@code void ulViewSetCreateInspectorViewCallback(ULCreateInspectorViewCallback callback, void * userData)} */
    public static void nulViewSetCreateInspectorViewCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetCreateInspectorViewCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetCreateInspectorViewCallback(ULCreateInspectorViewCallback callback, void * userData)} */
    public static void ulViewSetCreateInspectorViewCallback(@NativeType("ULCreateInspectorViewCallback") ULCreateInspectorViewCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetCreateInspectorViewCallback(callback.address(), userData);
    }

    // --- [ ulViewSetBeginLoadingCallback ] ---

    /** {@code void ulViewSetBeginLoadingCallback(ULBeginLoadingCallback callback, void * userData)} */
    public static void nulViewSetBeginLoadingCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetBeginLoadingCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetBeginLoadingCallback(ULBeginLoadingCallback callback, void * userData)} */
    public static void ulViewSetBeginLoadingCallback(@NativeType("ULBeginLoadingCallback") ULBeginLoadingCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetBeginLoadingCallback(callback.address(), userData);
    }

    // --- [ ulViewSetFinishLoadingCallback ] ---

    /** {@code void ulViewSetFinishLoadingCallback(ULFinishLoadingCallback callback, void * userData)} */
    public static void nulViewSetFinishLoadingCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetFinishLoadingCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetFinishLoadingCallback(ULFinishLoadingCallback callback, void * userData)} */
    public static void ulViewSetFinishLoadingCallback(@NativeType("ULFinishLoadingCallback") ULFinishLoadingCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetFinishLoadingCallback(callback.address(), userData);
    }

    // --- [ ulViewSetFailLoadingCallback ] ---

    /** {@code void ulViewSetFailLoadingCallback(ULFailLoadingCallback callback, void * userData)} */
    public static void nulViewSetFailLoadingCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetFailLoadingCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetFailLoadingCallback(ULFailLoadingCallback callback, void * userData)} */
    public static void ulViewSetFailLoadingCallback(@NativeType("ULFailLoadingCallback") ULFailLoadingCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetFailLoadingCallback(callback.address(), userData);
    }

    // --- [ ulViewSetWindowObjectReadyCallback ] ---

    /** {@code void ulViewSetWindowObjectReadyCallback(ULWindowObjectReadyCallback callback, void * userData)} */
    public static void nulViewSetWindowObjectReadyCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetWindowObjectReadyCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetWindowObjectReadyCallback(ULWindowObjectReadyCallback callback, void * userData)} */
    public static void ulViewSetWindowObjectReadyCallback(@NativeType("ULWindowObjectReadyCallback") ULWindowObjectReadyCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetWindowObjectReadyCallback(callback.address(), userData);
    }

    // --- [ ulViewSetDOMReadyCallback ] ---

    /** {@code void ulViewSetDOMReadyCallback(C_View * view, ULDOMReadyCallback callback, void * userData)} */
    public static void nulViewSetDOMReadyCallback(long view, long callback, long userData) {
        long __functionAddress = Functions.ViewSetDOMReadyCallback;
        if (CHECKS) {
            check(view);
        }
        invokePPPV(view, callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetDOMReadyCallback(C_View * view, ULDOMReadyCallback callback, void * userData)} */
    public static void ulViewSetDOMReadyCallback(@NativeType("C_View *") long view, @NativeType("ULDOMReadyCallback") ULDOMReadyCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetDOMReadyCallback(view, callback.address(), userData);
    }

    // --- [ ulViewSetUpdateHistoryCallback ] ---

    /** {@code void ulViewSetUpdateHistoryCallback(ULUpdateHistoryCallback callback, void * userData)} */
    public static void nulViewSetUpdateHistoryCallback(long callback, long userData) {
        long __functionAddress = Functions.ViewSetUpdateHistoryCallback;
        if (CHECKS) {
            check(userData);
        }
        invokePPV(callback, userData, __functionAddress);
    }

    /** {@code void ulViewSetUpdateHistoryCallback(ULUpdateHistoryCallback callback, void * userData)} */
    public static void ulViewSetUpdateHistoryCallback(@NativeType("ULUpdateHistoryCallback") ULUpdateHistoryCallbackI callback, @NativeType("void *") long userData) {
        nulViewSetUpdateHistoryCallback(callback.address(), userData);
    }

    // --- [ ulViewSetNeedsPaint ] ---

    /** {@code void ulViewSetNeedsPaint(C_View * view, bool needsPaint)} */
    public static void ulViewSetNeedsPaint(@NativeType("C_View *") long view, @NativeType("bool") boolean needsPaint) {
        long __functionAddress = Functions.ViewSetNeedsPaint;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, needsPaint, __functionAddress);
    }

    // --- [ ulViewGetNeedsPaint ] ---

    /** {@code void ulViewGetNeedsPaint(C_View * view)} */
    public static void ulViewGetNeedsPaint(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewGetNeedsPaint;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ ulViewCreateLocalInspectorView ] ---

    /** {@code void ulViewCreateLocalInspectorView(C_View * view)} */
    public static void ulViewCreateLocalInspectorView(@NativeType("C_View *") long view) {
        long __functionAddress = Functions.ViewCreateLocalInspectorView;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

}