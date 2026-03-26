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
@NativeType("ULGPUDriverEndSynchronizeCallback")
public interface ULGPUDriverEndSynchronizeCallbackI extends CallbackI {

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
     * Callback for users to implement ULGPUDriver::end_synchronize.
     * 
     * <p>Called after all state has been updated during a call to ulRender().</p>
     */
    void invoke();

}