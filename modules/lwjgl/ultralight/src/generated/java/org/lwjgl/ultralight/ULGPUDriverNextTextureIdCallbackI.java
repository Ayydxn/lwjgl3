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
@NativeType("ULGPUDriverNextTextureIdCallback")
public interface ULGPUDriverNextTextureIdCallbackI extends CallbackI {

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
     * Callback for users to implement ULGPUDriver::next_texture_id.
     * 
     * <p>Get the next available texture ID.</p>
     * 
     * <p>This is used to generate a unique texture ID for each texture created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID.
Note: Numbering should start 1. 0 is reserved for "no texture"</p>
     */
    void invoke();

}