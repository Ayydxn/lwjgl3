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
 *     void *userData,
 *     C_View *caller,
 *     ULMessageSource source,
 *     ULMessageLevel level,
 *     C_String *message,
 *     unsigned int line_number,
 *     unsigned int column_number,
 *     C_String *sourceID
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULAddConsoleMessageCallback")
public interface ULAddConsoleMessageCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
    }

    void invoke(@NativeType("void *") long userData, @NativeType("C_View *") long caller, @NativeType("ULMessageSource") int source, @NativeType("ULMessageLevel") int level, @NativeType("C_String *") long message, @NativeType("unsigned int") int line_number, @NativeType("unsigned int") int column_number, @NativeType("C_String *") long sourceID);

}