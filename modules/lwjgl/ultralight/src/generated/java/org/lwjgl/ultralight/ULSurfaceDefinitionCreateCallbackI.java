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
 * void * (*{@link #invoke}) (
 *     unsigned int width,
 *     unsigned int height
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULSurfaceDefinitionCreateCallback")
public interface ULSurfaceDefinitionCreateCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * This callback should return a pointer to user-defined data for the instance. This user data pointer will be passed to all other callbacks when operating on the instance.
     *
     * @param width  The width in pixels.
     * @param height The height in pixels.
     */
    @NativeType("void *") long invoke(@NativeType("unsigned int") int width, @NativeType("unsigned int") int height);

}