/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (void)</code></pre>
 */
@FunctionalInterface
@NativeType("ULGPUDriverNextGeometryIdCallback")
public interface ULGPUDriverNextGeometryIDCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void
        
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke();
    }

    /**
     * Callback for users to implement ULGPUDriver::next_geometry_id.
     * 
     * <p>Get the next available geometry ID.</p>
     * 
     * <p>This is used to generate a unique geometry ID for each geometry created by the library. The GPU driver implementation is responsible for mapping these IDs to a native ID.
Note: Numbering should start at 1, 0 is reserved for "no geometry".</p>
     */
    void invoke();

}