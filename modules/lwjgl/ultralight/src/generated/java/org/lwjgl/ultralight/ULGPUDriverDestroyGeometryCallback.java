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
 * void (*{@link #invoke}) (
 *     unsigned int geometryID
 * )</code></pre>
 */
public abstract class ULGPUDriverDestroyGeometryCallback extends Callback implements ULGPUDriverDestroyGeometryCallbackI {

    /**
     * Creates a {@code ULGPUDriverDestroyGeometryCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverDestroyGeometryCallback}
     */
    public static ULGPUDriverDestroyGeometryCallback create(long functionPointer) {
        ULGPUDriverDestroyGeometryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverDestroyGeometryCallback
            ? (ULGPUDriverDestroyGeometryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverDestroyGeometryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverDestroyGeometryCallback} instance that delegates to the specified {@code ULGPUDriverDestroyGeometryCallbackI} instance. */
    public static ULGPUDriverDestroyGeometryCallback create(ULGPUDriverDestroyGeometryCallbackI instance) {
        return instance instanceof ULGPUDriverDestroyGeometryCallback
            ? (ULGPUDriverDestroyGeometryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverDestroyGeometryCallback() {
        super(CIF);
    }

    ULGPUDriverDestroyGeometryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverDestroyGeometryCallback {

        private final ULGPUDriverDestroyGeometryCallbackI delegate;

        Container(long functionPointer, ULGPUDriverDestroyGeometryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int geometryID) {
            delegate.invoke(geometryID);
        }

    }

}