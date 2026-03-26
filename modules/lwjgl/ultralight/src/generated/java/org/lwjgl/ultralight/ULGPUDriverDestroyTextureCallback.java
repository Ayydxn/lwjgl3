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
 *     unsigned int textureID
 * )</code></pre>
 */
public abstract class ULGPUDriverDestroyTextureCallback extends Callback implements ULGPUDriverDestroyTextureCallbackI {

    /**
     * Creates a {@code ULGPUDriverDestroyTextureCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverDestroyTextureCallback}
     */
    public static ULGPUDriverDestroyTextureCallback create(long functionPointer) {
        ULGPUDriverDestroyTextureCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverDestroyTextureCallback
            ? (ULGPUDriverDestroyTextureCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverDestroyTextureCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverDestroyTextureCallback} instance that delegates to the specified {@code ULGPUDriverDestroyTextureCallbackI} instance. */
    public static ULGPUDriverDestroyTextureCallback create(ULGPUDriverDestroyTextureCallbackI instance) {
        return instance instanceof ULGPUDriverDestroyTextureCallback
            ? (ULGPUDriverDestroyTextureCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverDestroyTextureCallback() {
        super(CIF);
    }

    ULGPUDriverDestroyTextureCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverDestroyTextureCallback {

        private final ULGPUDriverDestroyTextureCallbackI delegate;

        Container(long functionPointer, ULGPUDriverDestroyTextureCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int textureID) {
            delegate.invoke(textureID);
        }

    }

}