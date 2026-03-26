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
 * bool (*{@link #invoke}) (
 *     C_String *path
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULFileSystemFileExistsCallback")
public interface ULFileSystemFileExistsCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint8,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    @NativeType("bool") boolean invoke(@NativeType("C_String *") long path);

}