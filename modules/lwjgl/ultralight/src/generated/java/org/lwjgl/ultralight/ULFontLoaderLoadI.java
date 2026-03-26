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
 * C_String * (*{@link #invoke}) (
 *     C_String *family,
 *     int weight,
 *     bool italic
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULFontLoaderLoad")
public interface ULFontLoaderLoadI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_sint32, ffi_type_uint8
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetByte(memGetAddress(args + 2 * POINTER_SIZE)) != 0
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("C_String *") long invoke(@NativeType("C_String *") long family, int weight, @NativeType("bool") boolean italic);

}