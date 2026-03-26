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
 *     ULCommandList *list
 * )</code></pre>
 */
public abstract class ULGPUDriverUpdateCommandListCallback extends Callback implements ULGPUDriverUpdateCommandListCallbackI {

    /**
     * Creates a {@code ULGPUDriverUpdateCommandListCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverUpdateCommandListCallback}
     */
    public static ULGPUDriverUpdateCommandListCallback create(long functionPointer) {
        ULGPUDriverUpdateCommandListCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverUpdateCommandListCallback
            ? (ULGPUDriverUpdateCommandListCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULGPUDriverUpdateCommandListCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverUpdateCommandListCallback} instance that delegates to the specified {@code ULGPUDriverUpdateCommandListCallbackI} instance. */
    public static ULGPUDriverUpdateCommandListCallback create(ULGPUDriverUpdateCommandListCallbackI instance) {
        return instance instanceof ULGPUDriverUpdateCommandListCallback
            ? (ULGPUDriverUpdateCommandListCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverUpdateCommandListCallback() {
        super(CIF);
    }

    ULGPUDriverUpdateCommandListCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverUpdateCommandListCallback {

        private final ULGPUDriverUpdateCommandListCallbackI delegate;

        Container(long functionPointer, ULGPUDriverUpdateCommandListCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long list) {
            delegate.invoke(list);
        }

    }

}