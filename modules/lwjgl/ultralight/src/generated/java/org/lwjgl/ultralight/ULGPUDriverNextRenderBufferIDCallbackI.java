/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (void)</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverNextRenderBufferIdCallback")
public interface ULGPUDriverNextRenderBufferIDCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void
        
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke();
    }

    /**
     * Callback for users to implement ULGPUDriver::next_render_buffer_id.
     * 
     * <p>Get the next available render buffer ID.</p>
     * 
     * <p>This is used to generate a unique render buffer ID for each render buffer created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID.
Note: Numbering should start at 1, 0 is reserved for "no render buffer".</p>
     */
    void invoke();

}