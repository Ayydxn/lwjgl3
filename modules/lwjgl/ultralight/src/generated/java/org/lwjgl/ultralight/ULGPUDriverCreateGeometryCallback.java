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
 *     unsigned int geometryID,
 *     ULVertexBuffer *vertices,
 *     ULIndexBuffer *indices
 * )</code></pre>
 */
public abstract class ULGPUDriverCreateGeometryCallback extends Callback implements ULGPUDriverCreateGeometryCallbackI {

    /**
     * Creates a {@code ULGPUDriverCreateGeometryCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverCreateGeometryCallback}
     */
    public static ULGPUDriverCreateGeometryCallback create(long functionPointer) {
        ULGPUDriverCreateGeometryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverCreateGeometryCallback
            ? (ULGPUDriverCreateGeometryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverCreateGeometryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverCreateGeometryCallback} instance that delegates to the specified {@code ULGPUDriverCreateGeometryCallbackI} instance. */
    public static ULGPUDriverCreateGeometryCallback create(ULGPUDriverCreateGeometryCallbackI instance) {
        return instance instanceof ULGPUDriverCreateGeometryCallback
            ? (ULGPUDriverCreateGeometryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverCreateGeometryCallback() {
        super(CIF);
    }

    ULGPUDriverCreateGeometryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverCreateGeometryCallback {

        private final ULGPUDriverCreateGeometryCallbackI delegate;

        Container(long functionPointer, ULGPUDriverCreateGeometryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int geometryID, long vertices, long indices) {
            delegate.invoke(geometryID, vertices, indices);
        }

    }

}