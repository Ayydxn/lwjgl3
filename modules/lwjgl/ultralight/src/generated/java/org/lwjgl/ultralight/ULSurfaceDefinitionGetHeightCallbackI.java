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
 *     void *userData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ULSurfaceDefinitionGetHeightCallback")
public interface ULSurfaceDefinitionGetHeightCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * The callback invoked when a Surface's height (in pixels) is requested.
     *
     * @param userData User data pointer uniquely identifying the surface.
     */
    @NativeType("void *") long invoke(@NativeType("void *") long userData);

}