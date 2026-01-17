/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULUpdateHistoryCallback} */
public abstract class ULUpdateHistoryCallback extends Callback implements ULUpdateHistoryCallbackI {

    /**
     * Creates a {@code ULUpdateHistoryCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULUpdateHistoryCallback}
     */
    public static ULUpdateHistoryCallback create(long functionPointer) {
        ULUpdateHistoryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULUpdateHistoryCallback
            ? (ULUpdateHistoryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULUpdateHistoryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULUpdateHistoryCallback} instance that delegates to the specified {@code ULUpdateHistoryCallbackI} instance. */
    public static ULUpdateHistoryCallback create(ULUpdateHistoryCallbackI instance) {
        return instance instanceof ULUpdateHistoryCallback
            ? (ULUpdateHistoryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULUpdateHistoryCallback() {
        super(DESCRIPTOR);
    }

    ULUpdateHistoryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULUpdateHistoryCallback {

        private final ULUpdateHistoryCallbackI delegate;

        Container(long functionPointer, ULUpdateHistoryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller) {
            delegate.invoke(userData, caller);
        }

    }

}