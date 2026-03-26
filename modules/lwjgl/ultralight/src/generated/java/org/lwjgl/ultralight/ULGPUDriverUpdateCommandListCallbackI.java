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
 *     ULCommandList *list
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverUpdateCommandListCallback")
public interface ULGPUDriverUpdateCommandListCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args))
        );
    }

    /**
     * Callback for users to implement ULGPUDriver::update_command_list.
     * 
     * <p>Update the pending command list with commands to execute on the GPU.</p>
     * 
     * <p>Commands are dispatched to the GPU driver asynchronously via this method. The GPU driver implementation should consume these commands and execute them at an appropriate time.</p>
     * 
     * <p>Warning: Implementations should make a deep copy of the command list, it will not persist beyond this call.</p>
     *
     * @param list The list of commands to execute.
     */
    void invoke(@NativeType("ULCommandList *") long list);

}