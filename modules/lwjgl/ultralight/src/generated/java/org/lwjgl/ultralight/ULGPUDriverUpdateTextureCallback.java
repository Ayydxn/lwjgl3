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
public abstract class ULGPUDriverUpdateTextureCallback extends Callback implements ULGPUDriverUpdateTextureCallbackI {

    /**
     * Creates a {@code ULGPUDriverUpdateTextureCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverUpdateTextureCallback}
     */
    public static ULGPUDriverUpdateTextureCallback create(long functionPointer) {
        ULGPUDriverUpdateTextureCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverUpdateTextureCallback
            ? (ULGPUDriverUpdateTextureCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverUpdateTextureCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverUpdateTextureCallback} instance that delegates to the specified {@code ULGPUDriverUpdateTextureCallbackI} instance. */
    public static ULGPUDriverUpdateTextureCallback create(ULGPUDriverUpdateTextureCallbackI instance) {
        return instance instanceof ULGPUDriverUpdateTextureCallback
            ? (ULGPUDriverUpdateTextureCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverUpdateTextureCallback() {
        super(CIF);
    }

    ULGPUDriverUpdateTextureCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverUpdateTextureCallback {

        private final ULGPUDriverUpdateTextureCallbackI delegate;

        Container(long functionPointer, ULGPUDriverUpdateTextureCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int textureID, long bitmap) {
            delegate.invoke(textureID, bitmap);
        }

    }

}