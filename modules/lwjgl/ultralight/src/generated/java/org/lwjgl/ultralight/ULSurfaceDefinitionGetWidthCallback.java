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
public abstract class ULSurfaceDefinitionGetWidthCallback extends Callback implements ULSurfaceDefinitionGetWidthCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionGetWidthCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionGetWidthCallback}
     */
    public static ULSurfaceDefinitionGetWidthCallback create(long functionPointer) {
        ULSurfaceDefinitionGetWidthCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionGetWidthCallback
            ? (ULSurfaceDefinitionGetWidthCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionGetWidthCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionGetWidthCallback} instance that delegates to the specified {@code ULSurfaceDefinitionGetWidthCallbackI} instance. */
    public static ULSurfaceDefinitionGetWidthCallback create(ULSurfaceDefinitionGetWidthCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionGetWidthCallback
            ? (ULSurfaceDefinitionGetWidthCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionGetWidthCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionGetWidthCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionGetWidthCallback {

        private final ULSurfaceDefinitionGetWidthCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionGetWidthCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}