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
 *     void *userData,
 *     void const *data
 * )</code></pre>
 */
public abstract class ULDestroyBufferCallback extends Callback implements ULDestroyBufferCallbackI {

    /**
     * Creates a {@code ULDestroyBufferCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULDestroyBufferCallback}
     */
    public static ULDestroyBufferCallback create(long functionPointer) {
        ULDestroyBufferCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULDestroyBufferCallback
            ? (ULDestroyBufferCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULDestroyBufferCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULDestroyBufferCallback} instance that delegates to the specified {@code ULDestroyBufferCallbackI} instance. */
    public static ULDestroyBufferCallback create(ULDestroyBufferCallbackI instance) {
        return instance instanceof ULDestroyBufferCallback
            ? (ULDestroyBufferCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULDestroyBufferCallback() {
        super(CIF);
    }

    ULDestroyBufferCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULDestroyBufferCallback {

        private final ULDestroyBufferCallbackI delegate;

        Container(long functionPointer, ULDestroyBufferCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long data) {
            delegate.invoke(userData, data);
        }

    }

}