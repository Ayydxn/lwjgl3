/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight.templates

import org.lwjgl.generator.*
import ultralight.*

val ULTRALIGHT = "Ultralight".nativeClass(Module.ULTRALIGHT, "Ultralight", prefix = "ul", prefixConstant =  "", binding = ULTRALIGHT_BINDING) {
    EnumConstant(
        "kMessageSource_XML".enum(0),
        "kMessageSource_JS".enum(1),
        "kMessageSource_Network".enum(2),
        "kMessageSource_ConsoleAPI".enum(3),
        "kMessageSource_Storage".enum(4),
        "kMessageSource_AppCache".enum(5),
        "kMessageSource_Rendering".enum(6),
        "kMessageSource_CSS".enum(7),
        "kMessageSource_Security".enum(8),
        "kMessageSource_ContentBlocker".enum(9),
        "kMessageSource_Media".enum(10),
        "kMessageSource_MediaSource".enum(11),
        "kMessageSource_WebRTC".enum(12),
        "kMessageSource_ITPDebug".enum(13),
        "kMessageSource_PrivateClickMeasurement".enum(14),
        "kMessageSource_PaymentRequest".enum(15),
        "kMessageSource_Other".enum(16)
    )

    EnumConstant(
        "kMessageLevel_Log".enum(0),
        "kMessageLevel_Warning".enum(1),
        "kMessageLevel_Error".enum(2),
        "kMessageLevel_Debug".enum(3),
        "kMessageLevel_Info".enum(4),
    )

    EnumConstant(
        "kCursor_Pointer".enum(0),
        "kCursor_Cross".enum(1),
        "kCursor_Hand".enum(2),
        "kCursor_IBeam".enum(3),
        "kCursor_Wait".enum(4),
        "kCursor_Help".enum(5),
        "kCursor_EastResize".enum(6),
        "kCursor_NorthResize".enum(7),
        "kCursor_NorthEastResize".enum(9),
        "kCursor_NorthWestResize".enum(10),
        "kCursor_SouthResize".enum(11),
        "kCursor_SouthEastResize".enum(12),
        "kCursor_SouthWestResize".enum(13),
        "kCursor_WestResize".enum(14),
        "kCursor_NorthSouthResize".enum(15),
        "kCursor_EastWestResize".enum(16),
        "kCursor_NorthEastSouthWestResize".enum(17),
        "kCursor_NorthWestSouthEastResize".enum(18),
        "kCursor_ColumnResize".enum(19),
        "kCursor_RowResize".enum(20),
        "kCursor_MiddlePanning".enum(21),
        "kCursor_EastPanning".enum(22),
        "kCursor_NorthPanning".enum(23),
        "kCursor_NorthEastPanning".enum(24),
        "kCursor_NorthWestPanning".enum(25),
        "kCursor_SouthPanning".enum(26),
        "kCursor_SouthEastPanning".enum(27),
        "kCursor_SouthWestPanning".enum(28),
        "kCursor_WestPanning".enum(29),
        "kCursor_Move".enum(30),
        "kCursor_VerticalText".enum(31),
        "kCursor_Cell".enum(32),
        "kCursor_ContextMenu".enum(33),
        "kCursor_Alias".enum(34),
        "kCursor_Progress".enum(35),
        "kCursor_NoDrop".enum(36),
        "kCursor_Copy".enum(37),
        "kCursor_None".enum(38),
        "kCursor_NotAllowed".enum(39),
        "kCursor_ZoomIn".enum(40),
        "kCursor_ZoomOut".enum(41),
        "kCursor_Grab".enum(42),
        "kCursor_Grabbing".enum(43),
        "kCursor_Custom".enum(44)
    )

    EnumConstant(
        "kBitmapFormat_A8_UNORM".enum(0),
        "kBitmapFormat_BGRA8_UNORM_SRGB".enum(1)
    )

    EnumConstant(
        "kKeyEventType_KeyDown".enum(0),
        "kKeyEventType_KeyUp".enum(1),
        "kKeyEventType_RawKeyDown".enum(2),
        "kKeyEventType_Char".enum(3)
    )

    EnumConstant(
        "kMouseEventType_MouseMoved".enum(0),
        "kMouseEventType_MouseDown".enum(1),
        "kMouseEventType_MouseUp".enum(2)
    )

    EnumConstant(
        "kMouseButton_None".enum(0),
        "kMouseButton_Left".enum(1),
        "kMouseButton_Middle".enum(2),
        "kMouseButton_Right".enum(3)
    )

    EnumConstant(
        "kScrollEventType_ScrollByPixel".enum(0),
        "kScrollEventType_ScrollByPage".enum(1)
    )

    EnumConstant(
        "kGamepadEventType_Connected".enum(0),
        "kGamepadEventType_Disconnected".enum(1)
    )

    EnumConstant(
        "kFaceWinding_Clockwise".enum(0),
        "kFaceWinding_CounterClockwise".enum(1)
    )

    EnumConstant(
        "kFontHinting_Smooth".enum(0),
        "kFontHinting_Normal".enum(1),
        "kFontHinting_Monochrome".enum(2)
    )

    EnumConstant(
        "kVertexBufferFormat_2f_4ub_2f".enum(0),
        "kVertexBufferFormat_2f_4ub_2f_2f_28f".enum(1)
    )

    EnumConstant(
        "kShaderType_Fill".enum(0),
        "kShaderType_FillPath".enum(1)
    )

    EnumConstant(
        "kCommandType_ClearRenderBuffer".enum(0),
        "kCommandType_DrawGeometry".enum(1)
    )

    EnumConstant(
        "kLogLevel_Error".enum(0),
        "kLogLevel_Warning".enum(1),
        "kLogLevel_Info".enum(2)
    )

    /*-----------------*/
    /* -- Functions -- */
    /*-----------------*/

    Nonnull..charASCII.const.p(
        "VersionString",
        void()
    )

    int(
        "VersionMajor",
        void()
    )

    int(
        "VersionMinor",
        void()
    )

    int(
        "VersionPatch",
        void()
    )

    Nonnull..charASCII.const.p(
        "WebKitVersionString",
        void()
    )

    /*--------------*/
    /* -- Bitmap -- */
    /*--------------*/

    ULBitmap.p(
        "CreateEmptyBitmap",
    )

    ULBitmap.p(
        "CreateBitmap",
        unsigned_int("width"),
        unsigned_int("height"),
        ULBitmapFormat("format")
    )

    ULBitmap.p(
        "CreateBitmapFromPixels",
        unsigned_int("width"),
        unsigned_int("height"),
        ULBitmapFormat("format"),
        unsigned_int("rowBytes"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels"),
        size_t("size"),
        bool("shouldCopy")
    )

    ULBitmap.p(
        "CreateBitmapFromCopy",
        ULBitmap.p("existingBitmap")
    )

    void(
        "DestroyBitmap",
        ULBitmap.p("bitmap")
    )

    unsigned_int(
        "BitmapGetWidth",
        ULBitmap.p("bitmap")
    )

    unsigned_int(
        "BitmapGetHeight",
        ULBitmap.p("bitmap")
    )

    ULBitmapFormat(
        "BitmapGetFormat",
        ULBitmap.p("bitmap")
    )

    unsigned_int(
        "BitmapGetBpp",
        ULBitmap.p("bitmap")
    )

    unsigned_int(
        "BitmapGetRowBytes",
        ULBitmap.p("bitmap")
    )

    size_t(
        "BitmapGetSize",
        ULBitmap.p("bitmap")
    )

    bool(
        "BitmapOwnsPixels",
        ULBitmap.p("bitmap")
    )

    opaque_p(
        "BitmapLockPixels",
        ULBitmap.p("bitmap")
    )

    void(
        "BitmapUnlockPixels",
        ULBitmap.p("bitmap")
    )

    opaque_p(
        "BitmapRawPixels",
        ULBitmap.p("bitmap")
    )

    bool(
        "BitmapIsEmpty",
        ULBitmap.p("bitmap")
    )

    void(
        "BitmapErase",
        ULBitmap.p("bitmap")
    )

    bool(
        "BitmapWritePNG",
        ULBitmap.p("bitmap"),
        charASCII.const.p("path")
    )

    void(
        "BitmapSwapRedBlueChannels",
        ULBitmap.p("bitmap")
    )

    /*--------------*/
    /* -- Buffer -- */
    /*--------------*/

    ULBuffer.p(
        "CreateBuffer",
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.p("data"),
        size_t("size"),
        opaque_p("user_data"),
        nullable..ULDestroyBufferCallback("destructionCallback")
    )

    ULBuffer.p(
        "CreateBufferFromCopy",
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("data"),
        size_t("size")
    )

    void(
        "DestroyBuffer",
        ULBuffer.p("buffer")
    )

    opaque_p(
        "BufferGetData",
        ULBuffer.p("buffer")
    )

    size_t(
        "BufferGetSize",
        ULBuffer.p("buffer")
    )

    opaque_p(
        "BufferGetUserData",
        ULBuffer.p("buffer")
    )

    bool(
        "BufferOwnsData",
        ULBuffer.p("buffer")
    )

    /*--------------*/
    /* -- Config -- */
    /*--------------*/

    ULConfig.p(
        "CreateConfig",

        void()
    )

    void(
        "DestroyConfig",
        ULConfig.p("config")
    )

    void(
        "ConfigSetCachePath",
        ULConfig.p("config"),
        ULString.p("cachePath")
    )

    void(
        "ConfigSetResourcePathPrefix",
        ULConfig.p("config"),
        ULString.p("resourcePathPrefix")
    )

    void(
        "ConfigSetFaceWinding",
        ULConfig.p("config"),
        ULFaceWinding("winding")
    )

    void(
        "ConfigSetFontHinting",
        ULConfig.p("config"),
        ULFontHinting("fontHinting")
    )

    void(
        "ConfigSetFontGamma",
        ULConfig.p("config"),
        double("fontGamma")
    )

    void(
        "ConfigSetUserStylesheet",
        ULConfig.p("config"),
        ULString.p("cssString")
    )

    void(
        "ConfigSetForceRepaint",
        ULConfig.p("config"),
        bool("enabled")
    )

    void(
        "ConfigSetAnimationTimerDelay",
        ULConfig.p("config"),
        double("delay")
    )

    void(
        "ConfigSetScrollTimerDelay",
        ULConfig.p("config"),
        double("delay")
    )

    void(
        "ConfigSetRecycleDelay",
        ULConfig.p("config"),
        double("delay")
    )

    void(
        "ConfigSetMemoryCacheSize",
        ULConfig.p("config"),
        unsigned_int("size")
    )

    void(
        "ConfigSetPageCacheSize",
        ULConfig.p("config"),
        unsigned_int("size")
    )

    void(
        "ConfigSetOverrideRAMSize",
        ULConfig.p("config"),
        unsigned_int("size")
    )

    void(
        "ConfigSetMinLargeHeapSize",
        ULConfig.p("config"),
        unsigned_int("size")
    )

    void(
        "ConfigSetMinSmallHeapSize",
        ULConfig.p("config"),
        unsigned_int("size")
    )

    void(
        "ConfigSetNumRendererThreads",
        ULConfig.p("config"),
        unsigned_int("numRendererThreads")
    )

    void(
        "ConfigSetMaxUpdateTime",
        ULConfig.p("config"),
        double("maxUpdateTime")
    )

    void(
        "ConfigSetBitmapAlignment",
        ULConfig.p("config"),
        unsigned_int("bitmapAlignment")
    )

    /*-----------------*/
    /* -- Font File -- */
    /*-----------------*/

    ULFontFile.p(
        "FontFileCreateFromFilePath",
        ULString.p("filepath"),
    )

    ULFontFile.p(
        "FontFileCreateFromBuffer",
        ULBuffer.p("buffer"),
    )

    void(
        "DestroyFontFile",
        ULFontFile.p("fontFile"),
    )

    /*---------------------*/
    /* -- Gamepad Event -- */
    /*---------------------*/

    ULGamepadEvent.p(
        "CreateGamepadEvent",
        unsigned_int("index"),
        ULGamepadEventType("type")
    )

    void(
        "DestroyGamepadEvent",
        ULGamepadEvent.p("event"),
    )

    ULGamepadAxisEvent.p(
        "CreateGamepadAxisEvent",
        unsigned_int("index"),
        unsigned_int("axisIndex"),
        double("value")
    )

    void(
        "DestroyGamepadAxisEvent",
        ULGamepadAxisEvent.p("event"),
    )

    ULGamepadButtonEvent.p(
        "CreateGamepadButtonEvent",
        unsigned_int("index"),
        unsigned_int("buttonIndex"),
        double("value"),
    )

    void(
        "DestroyGamepadButtonEvent",
        ULGamepadButtonEvent.p("event"),
    )

    /*----------------*/
    /* -- Geometry -- */
    /*----------------*/

    bool(
        "RectIsEmpty",
        ULRect.p("rect")
    )

    ULRect.p(
        "RectMakeEmpty",
        void()
    )

    bool(
        "IntRectIsEmpty",
        ULIntRect.p("rect")
    )

    ULIntRect.p(
        "IntRectMakeEmpty",
        void()
    )

    /*------------------*/
    /* -- GPU Driver -- */
    /*------------------*/

    ULMatrix4x4.p(
        "ApplyProjection",
        ULMatrix4x4.p("transform"),
        float("viewportWidth"),
        float("viewportHeight"),
        bool("flipY")
    )

    /*------------------------------------------*/
    /* -- Image Source/Image Source Provider -- */
    /*------------------------------------------*/

    ULImageSource.p(
        "CreateImageSourceFromTexture",
        unsigned_int("width"),
        unsigned_int("height"),
        unsigned_int("textureID"),
        ULRect.p("textureUV"),
        ULBitmap.p("bitmap"),
    )

    ULImageSource.p(
        "CreateImageSourceFromBitmap",
        ULBitmap.p("bitmap")
    )

    void(
        "DestroyImageSource",
        ULImageSource.p("imageSource")
    )

    void(
        "ImageSourceInvalidate",
        ULImageSource.p("imageSource")
    )

    void(
        "ImageSourceProviderAddImageSource",
        ULString.p("id"),
        ULImageSource.p("imageSource")
    )

    void(
        "ImageSourceProviderRemoveImageSource",
        ULString.p("id")
    )

    /*-----------------*/
    /* -- Key Event -- */
    /*-----------------*/

    ULKeyEvent.p(
        "CreateKeyEvent",
        ULKeyEventType("type"),
        unsigned_int("modifiers"),
        int("virtualKeyCode"),
        int("nativeKeyCode"),
        ULString.p("text"),
        ULString.p("unmodifiedText"),
        bool("isKeypad"),
        bool("isAutoRepeat"),
        bool("isSystemKey")
    )

    void(
        "DestroyKeyEvent",
        ULKeyEvent.p("event"),
    )

    /*-------------------*/
    /* -- Mouse Event -- */
    /*-------------------*/

    ULMouseEvent.p(
        "CreateMouseEvent",
        ULMouseEventType("type"),
        int("x"),
        int("y"),
        ULMouseButton("button")
    )

    void(
        "DestroyMouseEvent",
        ULMouseEvent.p("event"),
    )

    /*-----------------*/
    /* -- Platforms -- */
    /*-----------------*/

    void(
        "PlatformSetLogger",
        ULLogger.p("logger")
    )

    void(
        "PlatformSetFileSystem",
        ULFileSystem.p("filesystem")
    )

    void(
        "PlatformSetFontLoader",
        ULFontLoaderLoad("fontLoader")
    )

    void(
        "PlatformSetSurfaceDefinition",
        ULSurfaceDefinition.p("surfaceDefinition")
    )

    void(
        "PlatformSetGPUDriver",
        ULGPUDriver.p("gpuDriver")
    )

    void(
        "PlatformSetClipboard",
        ULClipboard.p("clipboard")
    )

    /*----------------*/
    /* -- Renderer -- */
    /*----------------*/

    ULRenderer.p(
        "CreateRenderer",
        ULConfig.p("config")
    )

    void(
        "DestroyRenderer",
        ULRenderer.p("renderer")
    )

    void(
        "Update",
        ULRenderer.p("renderer")
    )

    void(
        "RefreshDisplay",
        ULRenderer.p("renderer"),
        unsigned_int("displayID"),
    )

    void(
        "Render",
        ULRenderer.p("renderer")
    )

    void(
        "PurgeMemory",
        ULRenderer.p("renderer")
    )

    void(
        "LogMemoryUsage",
        ULRenderer.p("renderer")
    )

    void(
        "StartRemoteInspectorServer",
        ULRenderer.p("renderer"),
        Check(1)..charASCII.const.p("address"),
        unsigned_short("port")
    )

    void(
        "SetGamepadDetails",
        ULRenderer.p("renderer"),
        unsigned_int("index"),
        ULString.p("id"),
        unsigned_int("axisCount"),
        unsigned_int("buttonCount"),
    )

    void(
        "FireGamepadEvent",
        ULRenderer.p("renderer"),
        ULGamepadEvent.p("event")
    )

    void(
        "FireGamepadAxisEvent",
        ULRenderer.p("renderer"),
        ULGamepadAxisEvent.p("event")
    )

    void(
        "FireGamepadButtonEvent",
        ULRenderer.p("renderer"),
        ULGamepadButtonEvent.p("event")
    )

    /*--------------------*/
    /* -- Scroll Event -- */
    /*--------------------*/

    ULScrollEvent.p(
        "CreateScrollEvent",
        ULScrollEventType("type"),
        int("deltaX"),
        int("deltaY")
    )

    void(
        "DestroyScrollEvent",
        ULScrollEvent.p("event"),
    )

    /*---------------*/
    /* -- Session -- */
    /*---------------*/

    ULSession.p(
        "CreateSession",
        ULRenderer.p("renderer"),
        bool("isPersistent"),
        ULString.p("name")
    )

    void(
        "DestroySession",
        ULSession.p("session")
    )

    ULSession.p(
        "DefaultSession",
        ULRenderer.p("renderer")
    )

    bool(
        "SessionIsPersistent",
        ULSession.p("session")
    )

    ULString.p(
        "SessionGetName",
        ULSession.p("session")
    )

    unsigned_long_long(
        "SessionGetId",
        ULSession.p("session")
    )

    ULString.p(
        "SessionGetDiskPath",
        ULSession.p("session")
    )

    /*--------------*/
    /* -- String -- */
    /*--------------*/

    ULString.p(
        "CreateString",
        charASCII.const.p("string")
    )

    ULString.p(
        "CreateStringUTF8",
        charASCII.const.p("string"),
        size_t("len")
    )

    ULString.p(
        "CreateStringUTF16",
        unsigned_short("string"),
        size_t("len")
    )

    void(
        "DestroyString",
        ULString.p("string")
    )

    charASCII.p(
        "StringGetData",
        ULString.p("string")
    )

    size_t(
        "StringGetLength",
        ULString.p("string")
    )

    bool(
        "StringIsEmpty",
        ULString.p("string")
    )

    void(
        "StringAssignString",
        ULString.p("string"),
        ULString.p("newString")
    )

    void(
        "StringAssignCString",
        ULString.p("string"),
        charASCII.const.p("cString")
    )

    /*---------------*/
    /* -- Surface -- */
    /*---------------*/

    unsigned_int(
        "SurfaceGetWidth",
        ULSurface.p("surface")
    )

    unsigned_int(
        "SurfaceGetHeight",
        ULSurface.p("surface")
    )

    unsigned_int(
        "SurfaceGetRowBytes",
        ULSurface.p("surface")
    )

    size_t(
        "SurfaceGetSize",
        ULSurface.p("surface")
    )

    opaque_p(
        "SurfaceLockPixels",
        ULSurface.p("surface")
    )

    void(
        "SurfaceUnlockPixels",
        ULSurface.p("surface")
    )

    void(
        "SurfaceResize",
        ULSurface.p("surface"),
        unsigned_int("width"),
        unsigned_int("height")
    )

    void(
        "SurfaceSetDirtyBounds",
        ULSurface.p("surface"),
        ULIntRect.p("bounds")
    )

    ULIntRect.p(
        "SurfaceGetDirtyBounds",
        ULSurface.p("surface")
    )

    void(
        "SurfaceClearDirtyBounds",
        ULSurface.p("surface")
    )

    opaque_p(
        "SurfaceGetUserData",
        ULSurface.p("surface")
    )

    ULBitmap.p(
        "BitmapSurfaceGetBitmap",
        ULBitmapSurface.p("surface")
    )

    /*------------------------*/
    /* -- View/View Config -- */
    /*------------------------*/

    ULViewConfig.p(
        "CreateViewConfig",
        void()
    )

    void(
        "DestroyViewConfig",
        ULViewConfig.p("config")
    )

    void(
        "ViewConfigSetDisplayId",
        ULViewConfig.p("config"),
        unsigned_int("displayID")
    )

    void(
        "ViewConfigSetIsAccelerated",
        ULViewConfig.p("config"),
        bool("isAccelerated")
    )

    void(
        "ViewConfigSetIsTransparent",
        ULViewConfig.p("config"),
        bool("isTransparent")
    )

    void(
        "ViewConfigSetInitialDeviceScale",
        ULViewConfig.p("config"),
        double("initialDeviceScale")
    )

    void(
        "ViewConfigSetInitialFocus",
        ULViewConfig.p("config"),
        bool("isFocused")
    )

    void(
        "ViewConfigSetEnableImages",
        ULViewConfig.p("config"),
        bool("enabled")
    )

    void(
        "ViewConfigSetEnableJavaScript",
        ULViewConfig.p("config"),
        bool("enabled")
    )

    void(
        "ViewConfigSetFontFamilyStandard",
        ULViewConfig.p("config"),
        ULString.p("fontName")
    )

    void(
        "ViewConfigSetFontFamilyFixed",
        ULViewConfig.p("config"),
        ULString.p("fontName")
    )

    void(
        "ViewConfigSetFontFamilySerif",
        ULViewConfig.p("config"),
        ULString.p("fontName")
    )

    void(
        "ViewConfigSetFontFamilySansSerif",
        ULViewConfig.p("config"),
        ULString.p("fontName")
    )

    void(
        "ViewConfigSetUserAgent",
        ULViewConfig.p("config"),
        ULString.p("agentString")
    )

    ULView.p(
        "CreateView",
        ULRenderer.p("renderer"),
        unsigned_int("width"),
        unsigned_int("height"),
        ULViewConfig.p("viewConfig"),
        nullable..ULSession.p("session")
    )

    void(
        "DestroyView",
        ULView.p("view")
    )

    ULString.p(
        "ViewGetURL",
        ULView.p("view")
    )

    ULString.p(
        "ViewGetTitle",
        ULView.p("view")
    )

    unsigned_int(
        "ViewGetWidth",
        ULView.p("view")
    )

    unsigned_int(
        "ViewGetHeight",
        ULView.p("view")
    )

    unsigned_int(
        "ViewGetDisplayId",
        ULView.p("view")
    )

    void(
        "ViewSetDisplayId",
        ULView.p("view"),
        unsigned_int("displayID"),
    )

    double(
        "ViewGetDeviceScale",
        ULView.p("view")
    )

    void(
        "ViewSetDeviceScale",
        ULView.p("view"),
        double("scale")
    )

    bool(
        "ViewIsAccelerated",
        ULView.p("view")
    )

    bool(
        "ViewIsTransparent",
        ULView.p("view")
    )

    bool(
        "ViewIsLoading",
        ULView.p("view")
    )

    ULRenderTarget.p(
        "ViewGetRenderTarget",
        ULView.p("view")
    )

    ULSurface.p(
        "ViewGetSurface",
        ULView.p("view")
    )

    void(
        "ViewLoadHTML",
        ULView.p("view"),
        ULString.p("htmlString")
    )

    void(
        "ViewLoadURL",
        ULView.p("view"),
        ULString.p("urlString")
    )

    void(
        "ViewResize",
        ULView.p("view"),
        unsigned_int("width"),
        unsigned_int("height")
    )

    JSContextRef.p(
        "ViewLockJSContext",
        ULView.p("view")
    )

    void(
        "ViewUnlockJSContext",
        ULView.p("view"),
    )

    ULString.p(
        "ViewEvaluateScript",
        ULView.p("view"),
        ULString.p("jsString"),
        ULString.p("exception")
    )

    bool(
        "ViewCanGoBack",
        ULView.p("view")
    )

    bool(
        "ViewCanGoForward",
        ULView.p("view")
    )

    bool(
        "ViewGoToHistoryOffset",
        ULView.p("view"),
        int("offset")
    )

    void(
        "ViewReload",
        ULView.p("view")
    )

    void(
        "ViewStop",
        ULView.p("view")
    )

    void(
        "ViewFocus",
        ULView.p("view")
    )

    void(
        "ViewUnfocus",
        ULView.p("view")
    )

    bool(
        "ViewHasFocus",
        ULView.p("view")
    )

    bool(
        "ViewHasInputFocus",
        ULView.p("view")
    )

    void(
        "ViewFireKeyEvent",
        ULView.p("view"),
        ULKeyEvent.p("keyEvent")
    )

    void(
        "ViewFireMouseEvent",
        ULView.p("view"),
        ULMouseEvent.p("mouseEvent")
    )

    void(
        "ViewFireScrollEvent",
        ULView.p("view"),
        ULScrollEvent.p("scrollEvent")
    )

    void(
        "ViewSetChangeTitleCallback",
        ULChangeTitleCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetChangeURLCallback",
        ULChangeURLCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetChangeTooltipCallback",
        ULChangeTooltipCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetChangeCursorCallback",
        ULChangeCursorCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetAddConsoleMessageCallback",
        ULAddConsoleMessageCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetCreateChildViewCallback",
        ULCreateChildViewCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetCreateInspectorViewCallback",
        ULCreateInspectorViewCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetBeginLoadingCallback",
        ULBeginLoadingCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetFinishLoadingCallback",
        ULFinishLoadingCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetFailLoadingCallback",
        ULFailLoadingCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetWindowObjectReadyCallback",
        ULWindowObjectReadyCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetDOMReadyCallback",
        ULView.p("view"),
        ULDOMReadyCallback("callback"),
        nullable..opaque_p("userData")
    )

    void(
        "ViewSetUpdateHistoryCallback",
        ULUpdateHistoryCallback("callback"),
        opaque_p("userData")
    )

    void(
        "ViewSetNeedsPaint",
        ULView.p("view"),
        bool("needsPaint")
    )

    void(
        "ViewGetNeedsPaint",
        ULView.p("view")
    )

    void(
        "ViewCreateLocalInspectorView",
        ULView.p("view")
    )
}
