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

/** Callback function: {@link #invoke ULBeginLoadingCallback} */
@FunctionalInterface
@NativeType("ULBeginLoadingCallback")
public interface ULBeginLoadingCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_uint64, ffi_type_uint8, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetByte(memGetAddress(args + 2 * POINTER_SIZE)) != 0,
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /** {@code void (* ULBeginLoadingCallback) (void * userData, unsigned long long frameID, bool isMainFrame, C_String * url)} */
    void invoke(@NativeType("void *") long userData, @NativeType("unsigned long long") long frameID, @NativeType("bool") boolean isMainFrame, @NativeType("C_String *") long url);

}