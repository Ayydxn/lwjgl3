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
 *     unsigned int geometryID
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverDestroyGeometryCallback")
public interface ULGPUDriverDestroyGeometryCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args))
        );
    }

    /**
     * Callback for users to implement ULGPUDriver::destroy_geometry.
     * 
     * <p>Destroy geometry.</p>
     *
     * @param geometryID The geometry to destroy.
     */
    void invoke(@NativeType("unsigned int") int geometryID);

}