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
@NativeType("ULGPUDriverUpdateTextureCallback")
public interface ULGPUDriverUpdateTextureCallbackI extends CallbackI {

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
     * Callback for users to implement ULGPUDriver::update_texture.
     * 
     * <p>Update an existing non-RTT texture with new bitmap data.
Warning: A deep copy of the bitmap data should be made if you are uploading it to the GPU asynchronously, it will not persist beyond this call.</p>
     *
     * @param textureID The texture to update.
     * @param bitmap    The new bitmap data.
     */
    void invoke(@NativeType("unsigned int") int textureID, @NativeType("C_Bitmap *") long bitmap);

}