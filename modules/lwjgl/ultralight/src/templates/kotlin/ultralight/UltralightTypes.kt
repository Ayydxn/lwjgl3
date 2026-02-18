/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight

import org.lwjgl.generator.*

val ULTRALIGHT_BINDING = simpleBinding(
    Module.ULTRALIGHT,
    libraryName = "Ultralight",
    bundledWithLWJGL = false
)

val ULIndexType = typedef(unsigned_int, "ULIndexType")

val ULConfig = "C_Config".opaque
val ULRenderer = "C_Renderer".opaque
val ULSession = "C_Session".opaque
val ULViewConfig = "C_ViewConfig".opaque
val ULView = "C_View".opaque
val ULBitmap = "C_Bitmap".opaque
val ULString = "C_String".opaque
val ULBuffer = "C_Buffer".opaque
val ULKeyEvent = "C_KeyEvent".opaque
val ULMouseEvent = "C_MouseEvent".opaque
val ULScrollEvent = "C_ScrollEvent".opaque
val ULGamepadEvent = "C_GamepadEvent".opaque
val ULGamepadAxisEvent = "C_GamepadAxisEvent".opaque
val ULGamepadButtonEvent = "C_GamepadButtonEvent".opaque
val ULSurface = "C_Surface".opaque
val ULBitmapSurface = "C_Surface".opaque
val ULFontFile = "C_FontFile".opaque
val ULImageSource = "C_ImageSource".opaque

val ULMessageSource = "ULMessageSource".enumType
val ULMessageLevel = "ULMessageLevel".enumType
val ULCursor = "ULCursor".enumType
val ULBitmapFormat = "ULBitmapFormat".enumType
val ULKeyEventType = "ULKeyEventType".enumType
val ULMouseEventType = "ULMouseEventType".enumType
val ULMouseButton = "ULMouseButton".enumType
val ULScrollEventType = "ULScrollEventType".enumType
val ULGamepadEventType = "ULGamepadEventType".enumType
val ULFaceWinding = "ULFaceWinding".enumType
val ULFontHinting = "ULFontHinting".enumType
val ULVertexBufferFormat = "ULVertexBufferFormat".enumType
val ULShaderType = "ULShaderType".enumType
val ULCommandType = "ULCommandType".enumType
val ULLogLevel = "ULLogLevel".enumType

val ULDestroyBufferCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULDestroyBufferCallback",

        void.p("userData"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("data"),

        nativeType = "ulDestroyBufferCallback"
    )
}

val ULClipboardClearCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardClearCallback",

        nativeType = "ULClipboardClearCallback"
    )
}

val ULClipboardReadPlainTextCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardReadPlainTextCallback",

        ULString.p("result"),

        nativeType = "ULClipboardReadPlainTextCallback"
    )
}

val ULClipboardWritePlainTextCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardWritePlainTextCallback",

        ULString.p("text"),

        nativeType = "ULClipboardWritePlainTextCallback"
    )
}

val ULFileSystemFileExistsCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "ULFileSystemFileExistsCallback",

        ULString.p("path"),

        nativeType = "ULFileSystemFileExistsCallback"
    )
}

val ULFileSystemGetFileMimeTypeCallback = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFileSystemGetFileMimeTypeCallback",

        ULString.p("path"),

        nativeType = "ULFileSystemGetFileMimeTypeCallback"
    )
}

val ULFileSystemGetFileCharsetCallback = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFileSystemGetFileCharsetCallback",

        ULString.p("path"),

        nativeType = "ULFileSystemGetFileCharsetCallback"
    )
}

val ULFileSystemOpenFileCallback = Module.ULTRALIGHT.callback {
    ULBuffer.p(
        className = "ULFileSystemOpenFileCallback",

        ULString.p("path"),

        nativeType = "ULFileSystemOpenFileCallback"
    )
}

val ULFontLoaderGetFallbackFont = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderGetFallbackFont",

        nativeType = "ULFontLoaderGetFallbackFont"
    )
}

val ULFontLoaderGetFallbackFontForCharacters = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderGetFallbackFontForCharacters",

        ULString.p("characters"),
        int("weight"),
        bool("italic"),

        nativeType = "ULFontLoaderGetFallbackFontForCharacters"
    )
}

val ULFontLoaderLoad = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderLoad",

        ULString.p("family"),
        int("weight"),
        bool("italic"),

        nativeType = "ULFontLoaderLoad"
    )
}

val ULRenderBuffer = struct(Module.ULTRALIGHT, className = "ULRenderBuffer") {
    unsigned_int("textureID")
    unsigned_int("width")
    unsigned_int("height")
    bool("hasStencilBuffer")
    bool("hasDepthBuffer")
}

val ULVertexBuffer = struct(Module.ULTRALIGHT, className = "ULVertexBuffer") {
    ULVertexBufferFormat("format")
    unsigned_int("size")
    unsigned_char("data")
}

val ULIndexBuffer = struct(Module.ULTRALIGHT, className = "ULIndexBuffer") {
    unsigned_int("size")
    unsigned_char("data")
}

val ULMatrix4x4 = struct(Module.ULTRALIGHT, className = "ULMatrix4x4") {
    float("data")[16]
}

val ULVec4 = struct(Module.ULTRALIGHT, className = "ULVec4", nativeName = "ULvec4") {
    float("value")[4]
}

val ULIntRect = struct(Module.ULTRALIGHT, "ULIntRect") {
    int("left")
    int("top")
    int("right")
    int("bottom")
}

val ULGPUState = struct(Module.ULTRALIGHT, className = "ULGPUState") {
    unsigned_int("viewport_width")
    unsigned_int("viewport_height")
    ULMatrix4x4.p("transform")
    bool("enableTexturing")
    bool("enableBlend")
    unsigned_char("shaderType")
    unsigned_int("renderBufferID")
    unsigned_int("texture1ID")
    unsigned_int("texture2ID")
    unsigned_int("texture3ID")
    float("uniformScalar")[8]
    ULVec4("uniformVector")[8]
    unsigned_char("clipSize")
    ULMatrix4x4("clip")[8]
    bool("enableScissor")
    ULIntRect("scissorRect")
}

val ULCommand = struct(Module.ULTRALIGHT, className = "ULCommand") {
    unsigned_char("commandType")
    ULGPUState.p("gpuState")
    unsigned_int("geometryID")
    unsigned_int("indicesCount")
    unsigned_int("indicesOffset")
}

val ULCommandList = struct(Module.ULTRALIGHT, className = "ULCommandList") {
    unsigned_int("size")
    ULCommand.p("commands")
}

val ULGPUDriverBeginSynchronizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverBeginSynchronizeCallback",

        nativeType = "ULGPUDriverBeginSynchronizeCallback"
    )
}

val ULGPUDriverEndSynchronizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverEndSynchronizeCallback",

        nativeType = "ULGPUDriverEndSynchronizeCallback"
    )
}

val ULGPUDriverNextTextureIdCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextTextureIdCallback",

        nativeType = "ULGPUDriverNextTextureIdCallback"
    )
}

val ULGPUDriverCreateTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateTextureCallback",

        unsigned_int("textureID"),
        ULBitmap.p("bitmap"),

        nativeType = "ULGPUDriverCreateTextureCallback"
    )
}

val ULGPUDriverUpdateTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateTextureCallback",

        unsigned_int("textureID"),
        ULBitmap.p("bitmap"),

        nativeType = "ULGPUDriverUpdateTextureCallback"
    )
}

val ULGPUDriverDestroyTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyTextureCallback",

        unsigned_int("textureID"),

        nativeType = "ULGPUDriverDestroyTextureCallback"
    )
}

val ULGPUDriverNextRenderBufferIDCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextRenderBufferIDCallback",

        nativeType = "ULGPUDriverNextRenderBufferIdCallback"
    )
}

val ULGPUDriverCreateRenderBufferCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateRenderBufferCallback",

        unsigned_int("renderBufferID"),
        ULRenderBuffer.p("buffer"),

        nativeType = "ULGPUDriverCreateRenderBufferCallback"
    )
}

val ULGPUDriverDestroyRenderBufferCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyRenderBufferCallback",

        unsigned_int("renderBufferID"),

        nativeType = "ULGPUDriverDestroyRenderBufferCallback"
    )
}

val ULGPUDriverNextGeometryIDCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextGeometryIDCallback",

        nativeType = "ULGPUDriverNextGeometryIdCallback"
    )
}

val ULGPUDriverCreateGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateGeometryCallback",

        unsigned_int("geometryID"),
        ULVertexBuffer.p("vertices"),
        ULIndexBuffer.p("indices"),

        nativeType = "ULGPUDriverCreateGeometryCallback"
    )
}

val ULGPUDriverUpdateGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateGeometryCallback",

        unsigned_int("geometryID"),
        ULVertexBuffer.p("vertices"),
        ULIndexBuffer.p("indices"),

        nativeType = "ULGPUDriverUpdateGeometryCallback"
    )
}

val ULGPUDriverDestroyGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyGeometryCallback",

        unsigned_int("geometryID"),

        nativeType = "ULGPUDriverDestroyGeometryCallback"
    )
}

val ULGPUDriverUpdateCommandListCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateCommandListCallback",

        ULCommandList.p("list"),

        nativeType = "ULGPUDriverUpdateCommandListCallback"
    )
}

val ULLoggerLogMessageCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULLoggerLogMessageCallback",

        ULLogLevel("logLevel"),
        ULString.p("message"),

        nativeType = "ULLoggerLogMessageCallback"
    )
}

val ULSurfaceDefinitionCreateCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionCreateCallback",

        unsigned_int("width"),
        unsigned_int("height"),

        nativeType = "ULSurfaceDefinitionCreateCallback"
    )
}

val ULSurfaceDefinitionDestroyCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionDestroyCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionDestroyCallback"
    )
}

val ULSurfaceDefinitionGetWidthCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetWidthCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionGetWidthCallback"
    )
}

val ULSurfaceDefinitionGetHeightCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetHeightCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionGetHeightCallback"
    )
}

val ULSurfaceDefinitionGetRowBytesCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetRowBytesCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionGetRowBytesCallback"
    )
}

val ULSurfaceDefinitionGetSizeCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetSizeCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionGetSizeCallback"
    )
}

val ULSurfaceDefinitionLockPixelsCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionLockPixelsCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionLockPixelsCallback"
    )
}

val ULSurfaceDefinitionUnlockPixelsCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionUnlockPixelsCallback",

        opaque_p("userData"),

        nativeType = "ULSurfaceDefinitionUnlockPixelsCallback"
    )
}

val ULSurfaceDefinitionResizeCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionResizeCallback",

        opaque_p("userData"),
        unsigned_int("width"),
        unsigned_int("height"),

        nativeType = "ULSurfaceDefinitionResizeCallback"
    )
}

val ULChangeTitleCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeTitleCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULString.p("title"),

        nativeType = "ULChangeTitleCallback"
    )
}

val ULChangeURLCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeURLCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULString.p("url"),

        nativeType = "ULChangeURLCallback"
    )
}

val ULChangeTooltipCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeTooltipCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULString.p("tooltip"),

        nativeType = "ULChangeTooltipCallback"
    )
}

val ULChangeCursorCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeCursorCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULCursor.p("cursor"),

        nativeType = "ULChangeCursorCallback"
    )
}

val ULAddConsoleMessageCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULAddConsoleMessageCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULMessageSource("source"),
        ULMessageLevel("level"),
        ULString.p("message"),
        unsigned_int("line_number"),
        unsigned_int("column_number"),
        ULString.p("sourceID"),

        nativeType = "ULAddConsoleMessageCallback"
    )
}

val ULCreateChildViewCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULCreateChildViewCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        ULString.p("openerURL"),
        ULString.p("targetURL"),
        bool("isPopup"),
        ULIntRect.p("popupRect"),

        nativeType = "ULCreateChildViewCallback"
    )
}

val ULCreateInspectorViewCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULCreateInspectorViewCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        bool("isLocal"),
        ULString.p("inspectedURL"),

        nativeType = "ULCreateInspectorViewCallback"
    )
}

val ULBeginLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULBeginLoadingCallback",

        opaque_p("userData"),
        unsigned_long_long("frameID"),
        bool("isMainFrame"),
        ULString.p("url"),

        nativeType = "ULBeginLoadingCallback"
    )
}

val ULFinishLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULFinishLoadingCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        unsigned_long_long("frameID"),
        bool("isMainFrame"),
        ULString.p("url"),

        nativeType = "ULFinishLoadingCallback"
    )
}

val ULFailLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULFailLoadingCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        unsigned_long_long("frameID"),
        bool("isMainFrame"),
        ULString.p("url"),
        ULString.p("description"),
        ULString.p("errorDomain"),
        int("errorCode"),

        nativeType = "ULFailLoadingCallback"
    )
}

val ULWindowObjectReadyCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULWindowObjectReadyCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        unsigned_long_long("frameID"),
        bool("isMainFrame"),
        ULString.p("url"),

        nativeType = "ULWindowObjectReadyCallback"
    )
}

val ULDOMReadyCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULDOMReadyCallback",

        opaque_p("userData"),
        ULView.p("caller"),
        unsigned_long_long("frameID"),
        bool("isMainFrame"),
        ULString.p("url"),

        nativeType = "ULDOMReadyCallback"
    )
}

val ULUpdateHistoryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULUpdateHistoryCallback",

        opaque_p("userData"),
        ULView.p("caller"),

        nativeType = "ULUpdateHistoryCallback"
    )
}

val ULRect = struct(Module.ULTRALIGHT, "ULRect") {
    float("left")
    float("top")
    float("right")
    float("bottom")
}

val ULRenderTarget = struct(Module.ULTRALIGHT, "ULRenderTarget") {
    bool("isEmpty")
    unsigned_int("width")
    unsigned_int("height")
    unsigned_int("textureID")
    unsigned_int("textureWidth")
    unsigned_int("textureHeight")
    ULBitmapFormat("textureFormat")
    ULRect.p("pUVCoords")
    unsigned_int("renderBufferID")
}

val ULClipboard = struct(Module.ULTRALIGHT, "ULClipboard") {
    ULClipboardClearCallback("clear")
    ULClipboardReadPlainTextCallback("readPlainText")
    ULClipboardWritePlainTextCallback("writePlainText")
}

val ULFileSystem = struct(Module.ULTRALIGHT, className = "ULFileSystem") {
    ULFileSystemFileExistsCallback("fileExists")
    ULFileSystemGetFileMimeTypeCallback("getFileMimeType")
    ULFileSystemGetFileCharsetCallback("getFileCharset")
    ULFileSystemOpenFileCallback("openfile")
}

val ULFontLoader = struct(Module.ULTRALIGHT, className = "ULFileSystem") {
    ULFontLoaderGetFallbackFont("getFallbackFont")
    ULFontLoaderGetFallbackFontForCharacters("getFallbackFontForCharacters")
    ULFontLoaderLoad("load")
}

// (Ayydxn) Ultralight single-byte alings this. If this not being causes any issues, we need to fix that.
val ULVertex2F4UB2F = struct(Module.ULTRALIGHT, className = "ULVertex2F4UB2F", nativeName = "ULVertex_2f_4ub_2f") {
    float("pos")[2]
    unsigned_char("color")[4]
    float("obj")[2]
}

// (Ayydxn) Ultralight single-byte alings this. If this not being causes any issues, we need to fix that.
val ULVertex2F4UB2F2F28F = struct(Module.ULTRALIGHT, className = "ULVertex2F4UB2F", nativeName = "ULVertex_2f_4ub_2f_2f_28f") {
    float("pos")[2]
    unsigned_char("color")[4]
    float("tex")[2]
    float("obj")[2]
    float("data0")[4]
    float("data1")[4]
    float("data2")[4]
    float("data3")[4]
    float("data4")[4]
    float("data5")[4]
    float("data6")[4]
}

val ULGPUDriver = struct(Module.ULTRALIGHT, "ULGPUDriver") {
    ULGPUDriverBeginSynchronizeCallback("begin_synchronize")
    ULGPUDriverEndSynchronizeCallback("end_synchronize")
    ULGPUDriverNextTextureIdCallback("next_texture_id")
    ULGPUDriverCreateTextureCallback("create_texture")
    ULGPUDriverUpdateTextureCallback("update_texture")
    ULGPUDriverDestroyTextureCallback("destroy_texture")
    ULGPUDriverNextRenderBufferIDCallback("next_render_buffer_id")
    ULGPUDriverCreateRenderBufferCallback("create_render_buffer")
    ULGPUDriverDestroyRenderBufferCallback("destroy_render_buffer")
    ULGPUDriverNextGeometryIDCallback("next_geometry_id")
    ULGPUDriverCreateGeometryCallback("create_geometry")
    ULGPUDriverUpdateGeometryCallback("update_geometry")
    ULGPUDriverDestroyGeometryCallback("destroy_geometry")
    ULGPUDriverUpdateCommandListCallback("update_command_list")
}

val ULLogger = struct(Module.ULTRALIGHT, className = "ULLogger") {
    ULLoggerLogMessageCallback("logMessage")
}

val ULSurfaceDefinition = struct(Module.ULTRALIGHT, className = "ULSurfaceDefinition") {
    ULSurfaceDefinitionCreateCallback.p("create")
    ULSurfaceDefinitionDestroyCallback.p("destroy")
    ULSurfaceDefinitionGetWidthCallback.p("getWidth")
    ULSurfaceDefinitionGetHeightCallback.p("getHeight")
    ULSurfaceDefinitionGetRowBytesCallback.p("getRowBytes")
    ULSurfaceDefinitionGetSizeCallback.p("getSize")
    ULSurfaceDefinitionLockPixelsCallback.p("lockPixels")
    ULSurfaceDefinitionUnlockPixelsCallback.p("unlockPixels")
    ULSurfaceDefinitionResizeCallback.p("resize")
}
