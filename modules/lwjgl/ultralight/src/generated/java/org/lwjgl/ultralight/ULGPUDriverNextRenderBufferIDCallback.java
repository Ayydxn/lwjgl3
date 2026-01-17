/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULGPUDriverNextRenderBufferIdCallback} */
public abstract class ULGPUDriverNextRenderBufferIDCallback extends Callback implements ULGPUDriverNextRenderBufferIDCallbackI {

    /**
     * Creates a {@code ULGPUDriverNextRenderBufferIDCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverNextRenderBufferIDCallback}
     */
    public static ULGPUDriverNextRenderBufferIDCallback create(long functionPointer) {
        ULGPUDriverNextRenderBufferIDCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverNextRenderBufferIDCallback
            ? (ULGPUDriverNextRenderBufferIDCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULGPUDriverNextRenderBufferIDCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverNextRenderBufferIDCallback} instance that delegates to the specified {@code ULGPUDriverNextRenderBufferIDCallbackI} instance. */
    public static ULGPUDriverNextRenderBufferIDCallback create(ULGPUDriverNextRenderBufferIDCallbackI instance) {
        return instance instanceof ULGPUDriverNextRenderBufferIDCallback
            ? (ULGPUDriverNextRenderBufferIDCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverNextRenderBufferIDCallback() {
        super(DESCRIPTOR);
    }

    ULGPUDriverNextRenderBufferIDCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverNextRenderBufferIDCallback {

        private final ULGPUDriverNextRenderBufferIDCallbackI delegate;

        Container(long functionPointer, ULGPUDriverNextRenderBufferIDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}