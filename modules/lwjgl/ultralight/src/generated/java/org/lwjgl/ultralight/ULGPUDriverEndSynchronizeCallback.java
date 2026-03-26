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
public abstract class ULGPUDriverEndSynchronizeCallback extends Callback implements ULGPUDriverEndSynchronizeCallbackI {

    /**
     * Creates a {@code ULGPUDriverEndSynchronizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverEndSynchronizeCallback}
     */
    public static ULGPUDriverEndSynchronizeCallback create(long functionPointer) {
        ULGPUDriverEndSynchronizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverEndSynchronizeCallback
            ? (ULGPUDriverEndSynchronizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverEndSynchronizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverEndSynchronizeCallback} instance that delegates to the specified {@code ULGPUDriverEndSynchronizeCallbackI} instance. */
    public static ULGPUDriverEndSynchronizeCallback create(ULGPUDriverEndSynchronizeCallbackI instance) {
        return instance instanceof ULGPUDriverEndSynchronizeCallback
            ? (ULGPUDriverEndSynchronizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverEndSynchronizeCallback() {
        super(CIF);
    }

    ULGPUDriverEndSynchronizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverEndSynchronizeCallback {

        private final ULGPUDriverEndSynchronizeCallbackI delegate;

        Container(long functionPointer, ULGPUDriverEndSynchronizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}