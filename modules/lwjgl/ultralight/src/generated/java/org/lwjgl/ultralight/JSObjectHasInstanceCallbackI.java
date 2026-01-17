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

/** Callback function: {@link #invoke JSObjectHasInstanceCallback} */
@FunctionalInterface
@NativeType("JSObjectHasInstanceCallback")
public interface JSObjectHasInstanceCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (* JSObjectHasInstanceCallback) (OpaqueJSContext const * context, OpaqueJSValue * constructor, OpaqueJSValue const * possibleInstance, OpaqueJSValue const * exception)} */
    @NativeType("bool") boolean invoke(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long constructor, @NativeType("OpaqueJSValue const *") long possibleInstance, @NativeType("OpaqueJSValue const *") long exception);

}