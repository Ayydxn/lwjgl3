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
 * OpaqueJSValue const * (*{@link #invoke}) (
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *object,
 *     OpaqueJSString *propertyName,
 *     OpaqueJSValue const *exception
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("JSObjectGetPropertyCallback")
public interface JSObjectGetPropertyCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("OpaqueJSValue const *") long invoke(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long exception);

}