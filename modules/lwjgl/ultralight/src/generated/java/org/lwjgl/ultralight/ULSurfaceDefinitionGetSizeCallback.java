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
public abstract class ULSurfaceDefinitionGetSizeCallback extends Callback implements ULSurfaceDefinitionGetSizeCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionGetSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionGetSizeCallback}
     */
    public static ULSurfaceDefinitionGetSizeCallback create(long functionPointer) {
        ULSurfaceDefinitionGetSizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionGetSizeCallback
            ? (ULSurfaceDefinitionGetSizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionGetSizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionGetSizeCallback} instance that delegates to the specified {@code ULSurfaceDefinitionGetSizeCallbackI} instance. */
    public static ULSurfaceDefinitionGetSizeCallback create(ULSurfaceDefinitionGetSizeCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionGetSizeCallback
            ? (ULSurfaceDefinitionGetSizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionGetSizeCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionGetSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionGetSizeCallback {

        private final ULSurfaceDefinitionGetSizeCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionGetSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}