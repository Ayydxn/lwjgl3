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
 *     unsigned int renderBufferID,
 *     ULRenderBuffer *buffer
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverCreateRenderBufferCallback")
public interface ULGPUDriverCreateRenderBufferCallbackI extends CallbackI {

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
     * Callback for users to implement ULGPUDriver::create_render_buffer.
     * 
     * <p>Create a render buffer with certain ID and buffer description.</p>
     *
     * @param renderBufferID The render buffer ID to use for the new render buffer.
     * @param buffer         The render buffer description.
     */
    void invoke(@NativeType("unsigned int") int renderBufferID, @NativeType("ULRenderBuffer *") long buffer);

}