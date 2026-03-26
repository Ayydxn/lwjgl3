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
 *     unsigned int textureID,
 *     C_Bitmap *bitmap
 * )</code></pre>
 */
public abstract class ULGPUDriverCreateTextureCallback extends Callback implements ULGPUDriverCreateTextureCallbackI {

    /**
     * Creates a {@code ULGPUDriverCreateTextureCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverCreateTextureCallback}
     */
    public static ULGPUDriverCreateTextureCallback create(long functionPointer) {
        ULGPUDriverCreateTextureCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverCreateTextureCallback
            ? (ULGPUDriverCreateTextureCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverCreateTextureCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverCreateTextureCallback} instance that delegates to the specified {@code ULGPUDriverCreateTextureCallbackI} instance. */
    public static ULGPUDriverCreateTextureCallback create(ULGPUDriverCreateTextureCallbackI instance) {
        return instance instanceof ULGPUDriverCreateTextureCallback
            ? (ULGPUDriverCreateTextureCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverCreateTextureCallback() {
        super(CIF);
    }

    ULGPUDriverCreateTextureCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverCreateTextureCallback {

        private final ULGPUDriverCreateTextureCallbackI delegate;

        Container(long functionPointer, ULGPUDriverCreateTextureCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int textureID, long bitmap) {
            delegate.invoke(textureID, bitmap);
        }

    }

}