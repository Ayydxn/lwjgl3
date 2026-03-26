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
 *     unsigned int renderBufferID,
 *     ULRenderBuffer *buffer
 * )</code></pre>
 */
public abstract class ULGPUDriverCreateRenderBufferCallback extends Callback implements ULGPUDriverCreateRenderBufferCallbackI {

    /**
     * Creates a {@code ULGPUDriverCreateRenderBufferCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverCreateRenderBufferCallback}
     */
    public static ULGPUDriverCreateRenderBufferCallback create(long functionPointer) {
        ULGPUDriverCreateRenderBufferCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverCreateRenderBufferCallback
            ? (ULGPUDriverCreateRenderBufferCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverCreateRenderBufferCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverCreateRenderBufferCallback} instance that delegates to the specified {@code ULGPUDriverCreateRenderBufferCallbackI} instance. */
    public static ULGPUDriverCreateRenderBufferCallback create(ULGPUDriverCreateRenderBufferCallbackI instance) {
        return instance instanceof ULGPUDriverCreateRenderBufferCallback
            ? (ULGPUDriverCreateRenderBufferCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverCreateRenderBufferCallback() {
        super(CIF);
    }

    ULGPUDriverCreateRenderBufferCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverCreateRenderBufferCallback {

        private final ULGPUDriverCreateRenderBufferCallbackI delegate;

        Container(long functionPointer, ULGPUDriverCreateRenderBufferCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int renderBufferID, long buffer) {
            delegate.invoke(renderBufferID, buffer);
        }

    }

}