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
 *     unsigned int renderBufferID
 * )</code></pre>
 */
public abstract class ULGPUDriverDestroyRenderBufferCallback extends Callback implements ULGPUDriverDestroyRenderBufferCallbackI {

    /**
     * Creates a {@code ULGPUDriverDestroyRenderBufferCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverDestroyRenderBufferCallback}
     */
    public static ULGPUDriverDestroyRenderBufferCallback create(long functionPointer) {
        ULGPUDriverDestroyRenderBufferCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverDestroyRenderBufferCallback
            ? (ULGPUDriverDestroyRenderBufferCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverDestroyRenderBufferCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverDestroyRenderBufferCallback} instance that delegates to the specified {@code ULGPUDriverDestroyRenderBufferCallbackI} instance. */
    public static ULGPUDriverDestroyRenderBufferCallback create(ULGPUDriverDestroyRenderBufferCallbackI instance) {
        return instance instanceof ULGPUDriverDestroyRenderBufferCallback
            ? (ULGPUDriverDestroyRenderBufferCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverDestroyRenderBufferCallback() {
        super(CIF);
    }

    ULGPUDriverDestroyRenderBufferCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverDestroyRenderBufferCallback {

        private final ULGPUDriverDestroyRenderBufferCallbackI delegate;

        Container(long functionPointer, ULGPUDriverDestroyRenderBufferCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int renderBufferID) {
            delegate.invoke(renderBufferID);
        }

    }

}