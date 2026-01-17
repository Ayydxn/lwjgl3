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

/** Callback function: {@link #invoke ULSurfaceDefinitionCreateCallback} */
@FunctionalInterface
@NativeType("ULSurfaceDefinitionCreateCallback")
public interface ULSurfaceDefinitionCreateCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_pointer,
            ffi_type_uint32, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (* ULSurfaceDefinitionCreateCallback) (unsigned int width, unsigned int height)} */
    @NativeType("void *") long invoke(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height);

}