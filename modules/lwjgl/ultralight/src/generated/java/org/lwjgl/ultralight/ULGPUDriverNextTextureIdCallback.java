/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULGPUDriverNextTextureIdCallback} */
public abstract class ULGPUDriverNextTextureIdCallback extends Callback implements ULGPUDriverNextTextureIdCallbackI {

    /**
     * Creates a {@code ULGPUDriverNextTextureIdCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverNextTextureIdCallback}
     */
    public static ULGPUDriverNextTextureIdCallback create(long functionPointer) {
        ULGPUDriverNextTextureIdCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverNextTextureIdCallback
            ? (ULGPUDriverNextTextureIdCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULGPUDriverNextTextureIdCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverNextTextureIdCallback} instance that delegates to the specified {@code ULGPUDriverNextTextureIdCallbackI} instance. */
    public static ULGPUDriverNextTextureIdCallback create(ULGPUDriverNextTextureIdCallbackI instance) {
        return instance instanceof ULGPUDriverNextTextureIdCallback
            ? (ULGPUDriverNextTextureIdCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverNextTextureIdCallback() {
        super(DESCRIPTOR);
    }

    ULGPUDriverNextTextureIdCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverNextTextureIdCallback {

        private final ULGPUDriverNextTextureIdCallbackI delegate;

        Container(long functionPointer, ULGPUDriverNextTextureIdCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}