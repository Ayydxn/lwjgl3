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

/** Callback function: {@link #invoke ULGPUDriverDestroyRenderBufferCallback} */
@FunctionalInterface
@NativeType("ULGPUDriverDestroyRenderBufferCallback")
public interface ULGPUDriverDestroyRenderBufferCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args))
        );
    }

    /** {@code void (* ULGPUDriverDestroyRenderBufferCallback) (unsigned int renderBufferID)} */
    void invoke(@NativeType("unsigned int") int renderBufferID);

}