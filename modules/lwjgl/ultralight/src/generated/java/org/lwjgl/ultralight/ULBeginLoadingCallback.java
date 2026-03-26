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
 *     unsigned long long frameID,
 *     bool isMainFrame,
 *     C_String *url
 * )</code></pre>
 */
public abstract class ULBeginLoadingCallback extends Callback implements ULBeginLoadingCallbackI {

    /**
     * Creates a {@code ULBeginLoadingCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULBeginLoadingCallback}
     */
    public static ULBeginLoadingCallback create(long functionPointer) {
        ULBeginLoadingCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULBeginLoadingCallback
            ? (ULBeginLoadingCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULBeginLoadingCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULBeginLoadingCallback} instance that delegates to the specified {@code ULBeginLoadingCallbackI} instance. */
    public static ULBeginLoadingCallback create(ULBeginLoadingCallbackI instance) {
        return instance instanceof ULBeginLoadingCallback
            ? (ULBeginLoadingCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULBeginLoadingCallback() {
        super(CIF);
    }

    ULBeginLoadingCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULBeginLoadingCallback {

        private final ULBeginLoadingCallbackI delegate;

        Container(long functionPointer, ULBeginLoadingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long frameID, boolean isMainFrame, long url) {
            delegate.invoke(userData, frameID, isMainFrame, url);
        }

    }

}