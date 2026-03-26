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
 *     unsigned int width,
 *     unsigned int height
 * )</code></pre>
 */
public abstract class ULSurfaceDefinitionCreateCallback extends Callback implements ULSurfaceDefinitionCreateCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionCreateCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionCreateCallback}
     */
    public static ULSurfaceDefinitionCreateCallback create(long functionPointer) {
        ULSurfaceDefinitionCreateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionCreateCallback
            ? (ULSurfaceDefinitionCreateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionCreateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionCreateCallback} instance that delegates to the specified {@code ULSurfaceDefinitionCreateCallbackI} instance. */
    public static ULSurfaceDefinitionCreateCallback create(ULSurfaceDefinitionCreateCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionCreateCallback
            ? (ULSurfaceDefinitionCreateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionCreateCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionCreateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionCreateCallback {

        private final ULSurfaceDefinitionCreateCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionCreateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int width, int height) {
            return delegate.invoke(width, height);
        }

    }

}