/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     void *userData
 * )</code></pre>
 */
public abstract class ULSurfaceDefinitionDestroyCallback extends Callback implements ULSurfaceDefinitionDestroyCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionDestroyCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionDestroyCallback}
     */
    public static ULSurfaceDefinitionDestroyCallback create(long functionPointer) {
        ULSurfaceDefinitionDestroyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionDestroyCallback
            ? (ULSurfaceDefinitionDestroyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionDestroyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionDestroyCallback} instance that delegates to the specified {@code ULSurfaceDefinitionDestroyCallbackI} instance. */
    public static ULSurfaceDefinitionDestroyCallback create(ULSurfaceDefinitionDestroyCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionDestroyCallback
            ? (ULSurfaceDefinitionDestroyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionDestroyCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionDestroyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionDestroyCallback {

        private final ULSurfaceDefinitionDestroyCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionDestroyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}