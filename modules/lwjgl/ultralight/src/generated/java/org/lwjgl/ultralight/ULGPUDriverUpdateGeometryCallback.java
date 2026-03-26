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
public abstract class ULGPUDriverUpdateGeometryCallback extends Callback implements ULGPUDriverUpdateGeometryCallbackI {

    /**
     * Creates a {@code ULGPUDriverUpdateGeometryCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverUpdateGeometryCallback}
     */
    public static ULGPUDriverUpdateGeometryCallback create(long functionPointer) {
        ULGPUDriverUpdateGeometryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverUpdateGeometryCallback
            ? (ULGPUDriverUpdateGeometryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverUpdateGeometryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverUpdateGeometryCallback} instance that delegates to the specified {@code ULGPUDriverUpdateGeometryCallbackI} instance. */
    public static ULGPUDriverUpdateGeometryCallback create(ULGPUDriverUpdateGeometryCallbackI instance) {
        return instance instanceof ULGPUDriverUpdateGeometryCallback
            ? (ULGPUDriverUpdateGeometryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverUpdateGeometryCallback() {
        super(CIF);
    }

    ULGPUDriverUpdateGeometryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverUpdateGeometryCallback {

        private final ULGPUDriverUpdateGeometryCallbackI delegate;

        Container(long functionPointer, ULGPUDriverUpdateGeometryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int geometryID, long vertices, long indices) {
            delegate.invoke(geometryID, vertices, indices);
        }

    }

}