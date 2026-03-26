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
        "",

        void.p("userData", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("data", ""),

        nativeType = "ulDestroyBufferCallback"
    )
}

val ULClipboardClearCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardClearCallback",
        "",

        nativeType = "ULClipboardClearCallback"
    )
}

val ULClipboardReadPlainTextCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardReadPlainTextCallback",
        "",

        ULString.p("result", ""),

        nativeType = "ULClipboardReadPlainTextCallback"
    )
}

val ULClipboardWritePlainTextCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULClipboardWritePlainTextCallback",
        "",

        ULString.p("text", ""),

        nativeType = "ULClipboardWritePlainTextCallback"
    )
}

val ULFileSystemFileExistsCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "ULFileSystemFileExistsCallback",
        "",

        ULString.p("path", ""),

        nativeType = "ULFileSystemFileExistsCallback"
    )
}

val ULFileSystemGetFileMimeTypeCallback = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFileSystemGetFileMimeTypeCallback",
        "",

        ULString.p("path", ""),

        nativeType = "ULFileSystemGetFileMimeTypeCallback"
    )
}

val ULFileSystemGetFileCharsetCallback = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFileSystemGetFileCharsetCallback",
        "",

        ULString.p("path", ""),

        nativeType = "ULFileSystemGetFileCharsetCallback"
    )
}

val ULFileSystemOpenFileCallback = Module.ULTRALIGHT.callback {
    ULBuffer.p(
        className = "ULFileSystemOpenFileCallback",
        "",

        ULString.p("path", ""),

        nativeType = "ULFileSystemOpenFileCallback"
    )
}

val ULFontLoaderGetFallbackFont = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderGetFallbackFont",
        "",

        nativeType = "ULFontLoaderGetFallbackFont"
    )
}

val ULFontLoaderGetFallbackFontForCharacters = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderGetFallbackFontForCharacters",
        "",

        ULString.p("characters", ""),
        int("weight", ""),
        bool("italic", ""),

        nativeType = "ULFontLoaderGetFallbackFontForCharacters"
    )
}

val ULFontLoaderLoad = Module.ULTRALIGHT.callback {
    ULString.p(
        className = "ULFontLoaderLoad",
        "",

        ULString.p("family", ""),
        int("weight", ""),
        bool("italic", ""),

        nativeType = "ULFontLoaderLoad"
    )
}

val ULRenderBuffer = struct(Module.ULTRALIGHT, className = "ULRenderBuffer") {
    unsigned_int("textureID", "The backing texture for this RenderBuffer.")
    unsigned_int("width", "The width of the RenderBuffer texture.")
    unsigned_int("height", "The height of the RenderBuffer texture.")
    bool("hasStencilBuffer", "Currently unused, always false.")
    bool("hasDepthBuffer", "Currently unsued, always false.")
}

val ULVertexBuffer = struct(Module.ULTRALIGHT, className = "ULVertexBuffer") {
    ULVertexBufferFormat("format", "The format of the vertex buffer.")
    unsigned_int("size", "The size of the vertex buffer in bytes.")
    unsigned_char("data", "The raw vertex buffer data.")
}

val ULIndexBuffer = struct(Module.ULTRALIGHT, className = "ULIndexBuffer") {
    unsigned_int("size", "The size of the index buffer in bytes.")
    unsigned_char("data", "The raw index buffer data.")
}

val ULMatrix4x4 = struct(Module.ULTRALIGHT, className = "ULMatrix4x4") {
    float("data", "")[16]
}

val ULVec4 = struct(Module.ULTRALIGHT, className = "ULVec4", nativeName = "ULvec4") {
    float("value", "")[4]
}

val ULIntRect = struct(Module.ULTRALIGHT, "ULIntRect") {
    int("left", "")
    int("top", "")
    int("right", "")
    int("bottom", "")
}

val ULGPUState = struct(Module.ULTRALIGHT, className = "ULGPUState") {
    unsigned_int("viewport_width", "Viewport width in pixels.")
    unsigned_int("viewport_height", "Viewport height in pixels.")
    ULMatrix4x4.p("transform", "Transform matrix– you should multiply this with the screen-space orthographic projection matrix then pass to the vertex shader.")
    bool("enableTexturing", "Whether or not we should enable texturing for the current draw command.")
    bool("enableBlend", "Whether or not we should enable blending for the current draw command.")
    unsigned_char("shaderType", "The vertex/pixel shader program pair to use for the current draw command.")
    unsigned_int("renderBufferID", "The render buffer to use for the current draw command.")
    unsigned_int("texture1ID", "The texture id to bind to slot 1. (Will be 0 if none)")
    unsigned_int("texture2ID", "The texture id to bind to slot 2. (Will be 0 if none)")
    unsigned_int("texture3ID", "The texture id to bind to slot 3. (Will be 0 if none)")
    float("uniformScalar", "The uniform scalars (passed to the pixel shader via uniforms).")[8]
    ULVec4("uniformVector", "The uniform vectors (passed to the pixel shader via uniforms).")[8]
    unsigned_char("clipSize", "The clip size (passed to the pixel shader via uniforms).")
    ULMatrix4x4("clip", "The clip stack (passed to the pixel shader via uniforms).")[8]
    bool("enableScissor", "Whether or not scissor testing should be used for the current draw command.")
    ULIntRect("scissorRect", "The scissor rect to use for scissor testing (units in pixels)")
}

val ULCommand = struct(Module.ULTRALIGHT, className = "ULCommand") {
    unsigned_char("commandType", "The type of command to dispatch.")
    ULGPUState.p("gpuState", "The current GPU state.")
    unsigned_int("geometryID", "The geometry ID to bind. (used with kCommandType_DrawGeometry)")
    unsigned_int("indicesCount", "The number of indices. (used with kCommandType_DrawGeometry)")
    unsigned_int("indicesOffset", "The index to start from. (used with kCommandType_DrawGeometry)")
}

val ULCommandList = struct(Module.ULTRALIGHT, className = "ULCommandList") {
    unsigned_int("size", "The number of commands in the list.")
    ULCommand.p("commands", "The raw command list data.")
}

val ULGPUDriverBeginSynchronizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverBeginSynchronizeCallback",
        "Callback for users to implement ULGPUDriver::begin_synchronize.\n" +
        "\n" +
        "Called before any state (eg, create_texture(), update_texture(), destroy_texture(), etc.) is updated during a call to ulRender().\n" +
        "\n" +
        "This is a good time to prepare the GPU for any state updates.",

        nativeType = "ULGPUDriverBeginSynchronizeCallback"
    )
}

val ULGPUDriverEndSynchronizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverEndSynchronizeCallback",
        "Callback for users to implement ULGPUDriver::end_synchronize.\n" +
        "\n" +
        "Called after all state has been updated during a call to ulRender().",

        nativeType = "ULGPUDriverEndSynchronizeCallback"
    )
}

val ULGPUDriverNextTextureIdCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextTextureIdCallback",
        "Callback for users to implement ULGPUDriver::next_texture_id.\n" +
        "\n" +
        "Get the next available texture ID.\n" +
        "\n" +
        "This is used to generate a unique texture ID for each texture created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID." +
        "\n" +
        "Note: Numbering should start 1. 0 is reserved for \"no texture\"",

        nativeType = "ULGPUDriverNextTextureIdCallback"
    )
}

val ULGPUDriverCreateTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateTextureCallback",
        "Callback for users to implement ULGPUDriver::create_texture.\n" +
        "\n" +
        "Create a texture with a certain ID and optional bitmap." +
        "\n" +
        "Note: If the Bitmap is empty (ulBitmapIsEmpty()), then a RTT Texture should be created instead. This will be used as a backing texture for a new RenderBuffer.",

        unsigned_int("textureID", "The texture ID to use for the new texture."),
        ULBitmap.p("bitmap", "The bitmap to initialize the texture with (can be empty)."),

        nativeType = "ULGPUDriverCreateTextureCallback"
    )
}

val ULGPUDriverUpdateTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateTextureCallback",
        "Callback for users to implement ULGPUDriver::update_texture.\n" +
        "\n" +
        "Update an existing non-RTT texture with new bitmap data." +
        "\n" +
        "Warning: A deep copy of the bitmap data should be made if you are uploading it to the GPU asynchronously, it will not persist beyond this call.",

        unsigned_int("textureID", "The texture to update."),
        ULBitmap.p("bitmap", "The new bitmap data."),

        nativeType = "ULGPUDriverUpdateTextureCallback"
    )
}

val ULGPUDriverDestroyTextureCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyTextureCallback",
        "Callback for users to implement ULGPUDriver::destroy_texture.\n" +
        "\n" +
        "Destroy a texture.",

        unsigned_int("textureID", "The texture to destroy."),

        nativeType = "ULGPUDriverDestroyTextureCallback"
    )
}

val ULGPUDriverNextRenderBufferIDCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextRenderBufferIDCallback",
        "Callback for users to implement ULGPUDriver::next_render_buffer_id.\n" +
        "\n" +
        "Get the next available render buffer ID.\n" +
        "\n" +
        "This is used to generate a unique render buffer ID for each render buffer created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID." +
        "\n" +
        "Note: Numbering should start at 1, 0 is reserved for \"no render buffer\".",

        nativeType = "ULGPUDriverNextRenderBufferIdCallback"
    )
}

val ULGPUDriverCreateRenderBufferCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateRenderBufferCallback",
        "Callback for users to implement ULGPUDriver::create_render_buffer.\n" +
        "\n" +
        "Create a render buffer with certain ID and buffer description.",

        unsigned_int("renderBufferID", "The render buffer ID to use for the new render buffer."),
        ULRenderBuffer.p("buffer", "The render buffer description."),

        nativeType = "ULGPUDriverCreateRenderBufferCallback"
    )
}

val ULGPUDriverDestroyRenderBufferCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyRenderBufferCallback",
        "Callback for users to implement ULGPUDriver::destroy_render_buffer.\n" +
        "\n" +
        "Destroy a render buffer.",

        unsigned_int("renderBufferID", "The render buffer to destroy."),

        nativeType = "ULGPUDriverDestroyRenderBufferCallback"
    )
}

val ULGPUDriverNextGeometryIDCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverNextGeometryIDCallback",
        "Callback for users to implement ULGPUDriver::next_geometry_id.\n" +
        "\n" +
        "Get the next available geometry ID.\n" +
        "\n" +
        "This is used to generate a unique geometry ID for each geometry created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID." +
        "\n" +
        "Note: Numbering should start at 1, 0 is reserved for \"no geometry\".",

        nativeType = "ULGPUDriverNextGeometryIdCallback"
    )
}

val ULGPUDriverCreateGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverCreateGeometryCallback",
        "Callback for users to implement ULGPUDriver::create_geometry.\n" +
        "\n" +
        "Create geometry with certain ID and vertex/index data." +
        "\n" +
        "Warning: A deep copy of the vertex/index data should be made if you are uploading it to the GPU asynchronously, it will not persist beyond this call.",

        unsigned_int("geometryID", "The geometry ID to use for the new geometry."),
        ULVertexBuffer.p("vertices", "The vertex buffer data."),
        ULIndexBuffer.p("indices", "The index buffer data."),

        nativeType = "ULGPUDriverCreateGeometryCallback"
    )
}

val ULGPUDriverUpdateGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateGeometryCallback",
        "Callback for users to implement ULGPUDriver::update_geometry.\n" +
        "\n" +
        "Update existing geometry with new vertex/index data." + "\n" +
        "\n" +
        "Warning: A deep copy of the vertex/index data should be made if you are uploading it to the GPU asynchronously, it will not persist beyond this call.",

        unsigned_int("geometryID", "The geometry to update"),
        ULVertexBuffer.p("vertices", "The new vertex buffer data"),
        ULIndexBuffer.p("indices", "The new vertex buffer data"),

        nativeType = "ULGPUDriverUpdateGeometryCallback"
    )
}

val ULGPUDriverDestroyGeometryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverDestroyGeometryCallback",
        "Callback for users to implement ULGPUDriver::destroy_geometry.\n" +
        "\n" +
        "Destroy geometry.",

        unsigned_int("geometryID", "The geometry to destroy."),

        nativeType = "ULGPUDriverDestroyGeometryCallback"
    )
}

val ULGPUDriverUpdateCommandListCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULGPUDriverUpdateCommandListCallback",
        "Callback for users to implement ULGPUDriver::update_command_list.\n" +
        "\n" +
        "Update the pending command list with commands to execute on the GPU.\n" +
        "\n" +
        "Commands are dispatched to the GPU driver asynchronously via this method. The GPU driver implementation should consume these commands and execute them at an appropriate time.\n" +
        "\n" +
        "Warning: Implementations should make a deep copy of the command list, it will not persist beyond this call.",

        ULCommandList.p("list", "The list of commands to execute."),

        nativeType = "ULGPUDriverUpdateCommandListCallback"
    )
}

val ULLoggerLogMessageCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULLoggerLogMessageCallback",
        "The callback invoked when the library wants to print a message to the log.",

        ULLogLevel("logLevel", ""),
        ULString.p("message", ""),

        nativeType = "ULLoggerLogMessageCallback"
    )
}

val ULSurfaceDefinitionCreateCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionCreateCallback",
        "This callback should return a pointer to user-defined data for the instance. This user data pointer will be passed to all other callbacks when operating on the instance.",

        unsigned_int("width", "The width in pixels."),
        unsigned_int("height", "The height in pixels."),

        nativeType = "ULSurfaceDefinitionCreateCallback"
    )
}

val ULSurfaceDefinitionDestroyCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionDestroyCallback",
        "The callback invoked when a Surface is destroyed.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionDestroyCallback"
    )
}

val ULSurfaceDefinitionGetWidthCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetWidthCallback",
        "The callback invoked when a Surface's width (in pixels) is requested.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionGetWidthCallback"
    )
}

val ULSurfaceDefinitionGetHeightCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetHeightCallback",
        "The callback invoked when a Surface's height (in pixels) is requested.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionGetHeightCallback"
    )
}

val ULSurfaceDefinitionGetRowBytesCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetRowBytesCallback",
        "The callback invoked when a Surface's row bytes is requested.\n" +
        "\n" +
        "This value is also known as \"stride\". Usually width * 4.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionGetRowBytesCallback"
    )
}

val ULSurfaceDefinitionGetSizeCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionGetSizeCallback",
        "The callback invoked when a Surface's size (in bytes) is requested.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionGetSizeCallback"
    )
}

val ULSurfaceDefinitionLockPixelsCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionLockPixelsCallback",
        "The callback invoked when a Surface's pixel buffer is requested to be locked for reading/writing (should return a pointer to locked bytes).",

        opaque_p("userData", "\tUser data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionLockPixelsCallback"
    )
}

val ULSurfaceDefinitionUnlockPixelsCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionUnlockPixelsCallback",
        "The callback invoked when a Surface's pixel buffer is requested to be unlocked after previously being locked.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),

        nativeType = "ULSurfaceDefinitionUnlockPixelsCallback"
    )
}

val ULSurfaceDefinitionResizeCallback = Module.ULTRALIGHT.callback {
    opaque_p(
        className = "ULSurfaceDefinitionResizeCallback",
        "The callback invoked when a Surface is requested to be resized to a certain width/height.",

        opaque_p("userData", "User data pointer uniquely identifying the surface."),
        unsigned_int("width", "Width in pixels."),
        unsigned_int("height", "Height in pixels."),

        nativeType = "ULSurfaceDefinitionResizeCallback"
    )
}

val ULChangeTitleCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeTitleCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULString.p("title", ""),

        nativeType = "ULChangeTitleCallback"
    )
}

val ULChangeURLCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeURLCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULString.p("url", ""),

        nativeType = "ULChangeURLCallback"
    )
}

val ULChangeTooltipCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeTooltipCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULString.p("tooltip", ""),

        nativeType = "ULChangeTooltipCallback"
    )
}

val ULChangeCursorCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULChangeCursorCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULCursor.p("cursor", ""),

        nativeType = "ULChangeCursorCallback"
    )
}

val ULAddConsoleMessageCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULAddConsoleMessageCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULMessageSource("source", ""),
        ULMessageLevel("level", ""),
        ULString.p("message", ""),
        unsigned_int("line_number", ""),
        unsigned_int("column_number", ""),
        ULString.p("sourceID", ""),

        nativeType = "ULAddConsoleMessageCallback"
    )
}

val ULCreateChildViewCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULCreateChildViewCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        ULString.p("openerURL", ""),
        ULString.p("targetURL", ""),
        bool("isPopup", ""),
        ULIntRect.p("popupRect", ""),

        nativeType = "ULCreateChildViewCallback"
    )
}

val ULCreateInspectorViewCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULCreateInspectorViewCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        bool("isLocal", ""),
        ULString.p("inspectedURL", ""),

        nativeType = "ULCreateInspectorViewCallback"
    )
}

val ULBeginLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULBeginLoadingCallback",
        "",

        opaque_p("userData", ""),
        unsigned_long_long("frameID", ""),
        bool("isMainFrame", ""),
        ULString.p("url", ""),

        nativeType = "ULBeginLoadingCallback"
    )
}

val ULFinishLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULFinishLoadingCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        unsigned_long_long("frameID", ""),
        bool("isMainFrame", ""),
        ULString.p("url", ""),

        nativeType = "ULFinishLoadingCallback"
    )
}

val ULFailLoadingCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULFailLoadingCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        unsigned_long_long("frameID", ""),
        bool("isMainFrame", ""),
        ULString.p("url", ""),
        ULString.p("description", ""),
        ULString.p("errorDomain", ""),
        int("errorCode", ""),

        nativeType = "ULFailLoadingCallback"
    )
}

val ULWindowObjectReadyCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULWindowObjectReadyCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        unsigned_long_long("frameID", ""),
        bool("isMainFrame", ""),
        ULString.p("url", ""),

        nativeType = "ULWindowObjectReadyCallback"
    )
}

val ULDOMReadyCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULDOMReadyCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),
        unsigned_long_long("frameID", ""),
        bool("isMainFrame", ""),
        ULString.p("url", ""),

        nativeType = "ULDOMReadyCallback"
    )
}

val ULUpdateHistoryCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULUpdateHistoryCallback",
        "",

        opaque_p("userData", ""),
        ULView.p("caller", ""),

        nativeType = "ULUpdateHistoryCallback"
    )
}

val ULRect = struct(Module.ULTRALIGHT, "ULRect") {
    float("left", "")
    float("top", "")
    float("right", "")
    float("bottom", "")
}

val ULRenderTarget = struct(Module.ULTRALIGHT, "ULRenderTarget") {
    bool("isEmpty", "")
    unsigned_int("width", "")
    unsigned_int("height", "")
    unsigned_int("textureID", "")
    unsigned_int("textureWidth", "")
    unsigned_int("textureHeight", "")
    ULBitmapFormat("textureFormat", "")
    ULRect.p("uvCoords", "")
    unsigned_int("renderBufferID", "")
}

val ULClipboard = struct(Module.ULTRALIGHT, "ULClipboard") {
    ULClipboardClearCallback("clear", "")
    ULClipboardReadPlainTextCallback("readPlainText", "")
    ULClipboardWritePlainTextCallback("writePlainText", "")
}

val ULFileSystem = struct(Module.ULTRALIGHT, className = "ULFileSystem") {
    ULFileSystemFileExistsCallback("fileExists", "")
    ULFileSystemGetFileMimeTypeCallback("getFileMimeType", "")
    ULFileSystemGetFileCharsetCallback("getFileCharset", "")
    ULFileSystemOpenFileCallback("openfile", "")
}

val ULFontLoader = struct(Module.ULTRALIGHT, className = "ULFileSystem") {
    ULFontLoaderGetFallbackFont("getFallbackFont", "")
    ULFontLoaderGetFallbackFontForCharacters("getFallbackFontForCharacters", "")
    ULFontLoaderLoad("load", "")
}

// (Ayydxn) Ultralight single-byte alings this. If this not being causes any issues, we need to fix that.
val ULVertex2F4UB2F = struct(Module.ULTRALIGHT, className = "ULVertex2F4UB2F", nativeName = "ULVertex_2f_4ub_2f") {
    float("pos", "")[2]
    unsigned_char("color", "")[4]
    float("obj", "")[2]
}

// (Ayydxn) Ultralight single-byte alings this. If this not being causes any issues, we need to fix that.
val ULVertex2F4UB2F2F28F = struct(Module.ULTRALIGHT, className = "ULVertex2F4UB2F", nativeName = "ULVertex_2f_4ub_2f_2f_28f") {
    float("pos", "")[2]
    unsigned_char("color", "")[4]
    float("tex", "")[2]
    float("obj", "")[2]
    float("data0", "")[4]
    float("data1", "")[4]
    float("data2", "")[4]
    float("data3", "")[4]
    float("data4", "")[4]
    float("data5", "")[4]
    float("data6", "")[4]
}

val ULGPUDriver = struct(Module.ULTRALIGHT, "ULGPUDriver") {
    ULGPUDriverBeginSynchronizeCallback("begin_synchronize", "")
    ULGPUDriverEndSynchronizeCallback("end_synchronize", "")
    ULGPUDriverNextTextureIdCallback("next_texture_id", "")
    ULGPUDriverCreateTextureCallback("create_texture", "")
    ULGPUDriverUpdateTextureCallback("update_texture", "")
    ULGPUDriverDestroyTextureCallback("destroy_texture", "")
    ULGPUDriverNextRenderBufferIDCallback("next_render_buffer_id", "")
    ULGPUDriverCreateRenderBufferCallback("create_render_buffer", "")
    ULGPUDriverDestroyRenderBufferCallback("destroy_render_buffer", "")
    ULGPUDriverNextGeometryIDCallback("next_geometry_id", "")
    ULGPUDriverCreateGeometryCallback("create_geometry", "")
    ULGPUDriverUpdateGeometryCallback("update_geometry", "")
    ULGPUDriverDestroyGeometryCallback("destroy_geometry", "")
    ULGPUDriverUpdateCommandListCallback("update_command_list", "")
}

val ULLogger = struct(Module.ULTRALIGHT, className = "ULLogger") {
    ULLoggerLogMessageCallback("logMessage", "")
}

val ULSurfaceDefinition = struct(Module.ULTRALIGHT, className = "ULSurfaceDefinition") {
    ULSurfaceDefinitionCreateCallback.p("create", "")
    ULSurfaceDefinitionDestroyCallback.p("destroy", "")
    ULSurfaceDefinitionGetWidthCallback.p("getWidth", "")
    ULSurfaceDefinitionGetHeightCallback.p("getHeight", "")
    ULSurfaceDefinitionGetRowBytesCallback.p("getRowBytes", "")
    ULSurfaceDefinitionGetSizeCallback.p("getSize", "")
    ULSurfaceDefinitionLockPixelsCallback.p("lockPixels", "")
    ULSurfaceDefinitionUnlockPixelsCallback.p("unlockPixels", "")
    ULSurfaceDefinitionResizeCallback.p("resize", "")
}