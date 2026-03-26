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
 *     void *userData,
 *     unsigned int width,
 *     unsigned int height
 * )</code></pre>
 */
public abstract class ULSurfaceDefinitionResizeCallback extends Callback implements ULSurfaceDefinitionResizeCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionResizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionResizeCallback}
     */
    public static ULSurfaceDefinitionResizeCallback create(long functionPointer) {
        ULSurfaceDefinitionResizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionResizeCallback
            ? (ULSurfaceDefinitionResizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionResizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionResizeCallback} instance that delegates to the specified {@code ULSurfaceDefinitionResizeCallbackI} instance. */
    public static ULSurfaceDefinitionResizeCallback create(ULSurfaceDefinitionResizeCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionResizeCallback
            ? (ULSurfaceDefinitionResizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionResizeCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionResizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionResizeCallback {

        private final ULSurfaceDefinitionResizeCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionResizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData, int width, int height) {
            return delegate.invoke(userData, width, height);
        }

    }

}