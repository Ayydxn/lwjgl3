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
 *     C_View *caller,
 *     unsigned long long frameID,
 *     bool isMainFrame,
 *     C_String *url
 * )</code></pre>
 */
public abstract class ULFinishLoadingCallback extends Callback implements ULFinishLoadingCallbackI {

    /**
     * Creates a {@code ULFinishLoadingCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFinishLoadingCallback}
     */
    public static ULFinishLoadingCallback create(long functionPointer) {
        ULFinishLoadingCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFinishLoadingCallback
            ? (ULFinishLoadingCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFinishLoadingCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFinishLoadingCallback} instance that delegates to the specified {@code ULFinishLoadingCallbackI} instance. */
    public static ULFinishLoadingCallback create(ULFinishLoadingCallbackI instance) {
        return instance instanceof ULFinishLoadingCallback
            ? (ULFinishLoadingCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFinishLoadingCallback() {
        super(CIF);
    }

    ULFinishLoadingCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFinishLoadingCallback {

        private final ULFinishLoadingCallbackI delegate;

        Container(long functionPointer, ULFinishLoadingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long frameID, boolean isMainFrame, long url) {
            delegate.invoke(userData, caller, frameID, isMainFrame, url);
        }

    }

}