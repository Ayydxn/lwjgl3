/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke JSObjectCallAsFunctionCallback} */
@FunctionalInterface
@NativeType("JSObjectCallAsFunctionCallback")
public interface JSObjectCallAsFunctionCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /** {@code void (* JSObjectCallAsFunctionCallback) (OpaqueJSContext const * context, OpaqueJSValue * function, OpaqueJSValue * thisObject, size_t argumentCount, OpaqueJSValue const * exception)} */
    void invoke(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long function, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long exception);

}