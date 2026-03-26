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
 *     ULLogLevel logLevel,
 *     C_String *message
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULLoggerLogMessageCallback")
public interface ULLoggerLogMessageCallbackI extends CallbackI {

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

    /** The callback invoked when the library wants to print a message to the log. */
    void invoke(@NativeType("ULLogLevel") int logLevel, @NativeType("C_String *") long message);

}