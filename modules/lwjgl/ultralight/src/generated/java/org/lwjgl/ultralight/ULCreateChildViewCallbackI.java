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

/** Callback function: {@link #invoke ULCreateChildViewCallback} */
@FunctionalInterface
@NativeType("ULCreateChildViewCallback")
public interface ULCreateChildViewCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint8, ffi_type_pointer
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
            memGetByte(memGetAddress(args + 4 * POINTER_SIZE)) != 0,
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
    }

    /** {@code void (* ULCreateChildViewCallback) (void * userData, C_View * caller, C_String * openerURL, C_String * targetURL, bool isPopup, ULIntRect * popupRect)} */
    void invoke(@NativeType("void *") long userData, @NativeType("C_View *") long caller, @NativeType("C_String *") long openerURL, @NativeType("C_String *") long targetURL, @NativeType("bool") boolean isPopup, @NativeType("ULIntRect *") long popupRect);

}