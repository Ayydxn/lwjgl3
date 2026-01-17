/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULUpdateCallback} */
public abstract class ULUpdateCallback extends Callback implements ULUpdateCallbackI {

    /**
     * Creates a {@code ULUpdateCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULUpdateCallback}
     */
    public static ULUpdateCallback create(long functionPointer) {
        ULUpdateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULUpdateCallback
            ? (ULUpdateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULUpdateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULUpdateCallback} instance that delegates to the specified {@code ULUpdateCallbackI} instance. */
    public static ULUpdateCallback create(ULUpdateCallbackI instance) {
        return instance instanceof ULUpdateCallback
            ? (ULUpdateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULUpdateCallback() {
        super(DESCRIPTOR);
    }

    ULUpdateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULUpdateCallback {

        private final ULUpdateCallbackI delegate;

        Container(long functionPointer, ULUpdateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData) {
            delegate.invoke(userData);
        }

    }

}