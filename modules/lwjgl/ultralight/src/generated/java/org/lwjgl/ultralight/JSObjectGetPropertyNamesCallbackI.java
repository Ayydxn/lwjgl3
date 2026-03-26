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
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *object,
 *     OpaqueJSPropertyNameAccumulator *propertyNames
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("JSObjectGetPropertyNamesCallback")
public interface JSObjectGetPropertyNamesCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    void invoke(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSPropertyNameAccumulator *") long propertyNames);

}