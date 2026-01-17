/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULCloseCallback} */
public abstract class ULCloseCallback extends Callback implements ULCloseCallbackI {

    /**
     * Creates a {@code ULCloseCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULCloseCallback}
     */
    public static ULCloseCallback create(long functionPointer) {
        ULCloseCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULCloseCallback
            ? (ULCloseCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULCloseCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULCloseCallback} instance that delegates to the specified {@code ULCloseCallbackI} instance. */
    public static ULCloseCallback create(ULCloseCallbackI instance) {
        return instance instanceof ULCloseCallback
            ? (ULCloseCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULCloseCallback() {
        super(DESCRIPTOR);
    }

    ULCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULCloseCallback {

        private final ULCloseCallbackI delegate;

        Container(long functionPointer, ULCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long window) {
            delegate.invoke(userData, window);
        }

    }

}