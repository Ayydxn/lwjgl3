/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULChangeCursorCallback} */
public abstract class ULChangeCursorCallback extends Callback implements ULChangeCursorCallbackI {

    /**
     * Creates a {@code ULChangeCursorCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULChangeCursorCallback}
     */
    public static ULChangeCursorCallback create(long functionPointer) {
        ULChangeCursorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULChangeCursorCallback
            ? (ULChangeCursorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULChangeCursorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULChangeCursorCallback} instance that delegates to the specified {@code ULChangeCursorCallbackI} instance. */
    public static ULChangeCursorCallback create(ULChangeCursorCallbackI instance) {
        return instance instanceof ULChangeCursorCallback
            ? (ULChangeCursorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULChangeCursorCallback() {
        super(DESCRIPTOR);
    }

    ULChangeCursorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULChangeCursorCallback {

        private final ULChangeCursorCallbackI delegate;

        Container(long functionPointer, ULChangeCursorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long cursor) {
            delegate.invoke(userData, caller, cursor);
        }

    }

}