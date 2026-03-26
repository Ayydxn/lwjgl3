/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     unsigned int textureID,
 *     C_Bitmap *bitmap
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverCreateTextureCallback")
public interface ULGPUDriverCreateTextureCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Callback for users to implement ULGPUDriver::create_texture.
     * 
     * <p>Create a texture with a certain ID and optional bitmap.
Note: If the Bitmap is empty (ulBitmapIsEmpty()), then a RTT Texture should be created instead. This will be used as a backing texture for a new RenderBuffer.</p>
     *
     * @param textureID The texture ID to use for the new texture.
     * @param bitmap    The bitmap to initialize the texture with (can be empty).
     */
    void invoke(@NativeType("unsigned int") int textureID, @NativeType("C_Bitmap *") long bitmap);

}