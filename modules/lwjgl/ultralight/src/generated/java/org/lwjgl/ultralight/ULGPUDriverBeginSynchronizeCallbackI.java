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
@NativeType("ULGPUDriverBeginSynchronizeCallback")
public interface ULGPUDriverBeginSynchronizeCallbackI extends CallbackI {

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
     * Callback for users to implement ULGPUDriver::begin_synchronize.
     * 
     * <p>Called before any state (eg, create_texture(), update_texture(), destroy_texture(), etc.) is updated during a call to ulRender().</p>
     * 
     * <p>This is a good time to prepare the GPU for any state updates.</p>
     */
    void invoke();

}