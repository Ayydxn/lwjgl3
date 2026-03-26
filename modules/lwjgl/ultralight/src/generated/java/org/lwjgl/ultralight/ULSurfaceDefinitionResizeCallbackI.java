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
 *     void *userData,
 *     unsigned int width,
 *     unsigned int height
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULSurfaceDefinitionResizeCallback")
public interface ULSurfaceDefinitionResizeCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * The callback invoked when a Surface is requested to be resized to a certain width/height.
     *
     * @param userData User data pointer uniquely identifying the surface.
     * @param width    Width in pixels.
     * @param height   Height in pixels.
     */
    @NativeType("void *") long invoke(@NativeType("void *") long userData, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height);

}