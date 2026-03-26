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
 *     unsigned int geometryID,
 *     ULVertexBuffer *vertices,
 *     ULIndexBuffer *indices
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverUpdateGeometryCallback")
public interface ULGPUDriverUpdateGeometryCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * Callback for users to implement ULGPUDriver::update_geometry.
     * 
     * <p>Update existing geometry with new vertex/index data.</p>
     * 
     * <p>Warning: A deep copy of the vertex/index data should be made if you are uploading it to the GPU asynchronously, it will not persist beyond this call.</p>
     *
     * @param geometryID The geometry to update
     * @param vertices   The new vertex buffer data
     * @param indices    The new vertex buffer data
     */
    void invoke(@NativeType("unsigned int") int geometryID, @NativeType("ULVertexBuffer *") long vertices, @NativeType("ULIndexBuffer *") long indices);

}