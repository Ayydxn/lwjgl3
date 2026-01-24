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

/** Callback function: {@link #invoke JSObjectCallAsConstructorCallback} */
@FunctionalInterface
@NativeType("JSObjectCallAsConstructorCallback")
public interface JSObjectCallAsConstructorCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_pointer,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code OpaqueJSValue * (* JSObjectCallAsConstructorCallback) (OpaqueJSContext const * context, OpaqueJSValue * constructor, size_t argumentCount, OpaqueJSValue const ** arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *") long invoke(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long constructor, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const **") long arguments, @NativeType("OpaqueJSValue const *") long exception);

}