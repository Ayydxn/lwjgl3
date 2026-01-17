/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULFailLoadingCallback} */
public abstract class ULFailLoadingCallback extends Callback implements ULFailLoadingCallbackI {

    /**
     * Creates a {@code ULFailLoadingCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFailLoadingCallback}
     */
    public static ULFailLoadingCallback create(long functionPointer) {
        ULFailLoadingCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFailLoadingCallback
            ? (ULFailLoadingCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULFailLoadingCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFailLoadingCallback} instance that delegates to the specified {@code ULFailLoadingCallbackI} instance. */
    public static ULFailLoadingCallback create(ULFailLoadingCallbackI instance) {
        return instance instanceof ULFailLoadingCallback
            ? (ULFailLoadingCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFailLoadingCallback() {
        super(DESCRIPTOR);
    }

    ULFailLoadingCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFailLoadingCallback {

        private final ULFailLoadingCallbackI delegate;

        Container(long functionPointer, ULFailLoadingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long frameID, boolean isMainFrame, long url, long description, long errorDomain, int errorCode) {
            delegate.invoke(userData, caller, frameID, isMainFrame, url, description, errorDomain, errorCode);
        }

    }

}