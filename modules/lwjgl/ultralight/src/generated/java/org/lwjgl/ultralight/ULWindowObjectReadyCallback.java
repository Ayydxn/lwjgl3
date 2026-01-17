/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULWindowObjectReadyCallback} */
public abstract class ULWindowObjectReadyCallback extends Callback implements ULWindowObjectReadyCallbackI {

    /**
     * Creates a {@code ULWindowObjectReadyCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULWindowObjectReadyCallback}
     */
    public static ULWindowObjectReadyCallback create(long functionPointer) {
        ULWindowObjectReadyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULWindowObjectReadyCallback
            ? (ULWindowObjectReadyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULWindowObjectReadyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULWindowObjectReadyCallback} instance that delegates to the specified {@code ULWindowObjectReadyCallbackI} instance. */
    public static ULWindowObjectReadyCallback create(ULWindowObjectReadyCallbackI instance) {
        return instance instanceof ULWindowObjectReadyCallback
            ? (ULWindowObjectReadyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULWindowObjectReadyCallback() {
        super(DESCRIPTOR);
    }

    ULWindowObjectReadyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULWindowObjectReadyCallback {

        private final ULWindowObjectReadyCallbackI delegate;

        Container(long functionPointer, ULWindowObjectReadyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long frameID, boolean isMainFrame, long url) {
            delegate.invoke(userData, caller, frameID, isMainFrame, url);
        }

    }

}