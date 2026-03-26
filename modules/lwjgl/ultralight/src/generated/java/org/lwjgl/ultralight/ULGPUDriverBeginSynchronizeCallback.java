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
 * void (*{@link #invoke}) (void)</code></pre>
 */
public abstract class ULGPUDriverBeginSynchronizeCallback extends Callback implements ULGPUDriverBeginSynchronizeCallbackI {

    /**
     * Creates a {@code ULGPUDriverBeginSynchronizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverBeginSynchronizeCallback}
     */
    public static ULGPUDriverBeginSynchronizeCallback create(long functionPointer) {
        ULGPUDriverBeginSynchronizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverBeginSynchronizeCallback
            ? (ULGPUDriverBeginSynchronizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverBeginSynchronizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverBeginSynchronizeCallback} instance that delegates to the specified {@code ULGPUDriverBeginSynchronizeCallbackI} instance. */
    public static ULGPUDriverBeginSynchronizeCallback create(ULGPUDriverBeginSynchronizeCallbackI instance) {
        return instance instanceof ULGPUDriverBeginSynchronizeCallback
            ? (ULGPUDriverBeginSynchronizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverBeginSynchronizeCallback() {
        super(CIF);
    }

    ULGPUDriverBeginSynchronizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverBeginSynchronizeCallback {

        private final ULGPUDriverBeginSynchronizeCallbackI delegate;

        Container(long functionPointer, ULGPUDriverBeginSynchronizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}