/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULChangeURLCallback} */
public abstract class ULChangeURLCallback extends Callback implements ULChangeURLCallbackI {

    /**
     * Creates a {@code ULChangeURLCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULChangeURLCallback}
     */
    public static ULChangeURLCallback create(long functionPointer) {
        ULChangeURLCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULChangeURLCallback
            ? (ULChangeURLCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULChangeURLCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULChangeURLCallback} instance that delegates to the specified {@code ULChangeURLCallbackI} instance. */
    public static ULChangeURLCallback create(ULChangeURLCallbackI instance) {
        return instance instanceof ULChangeURLCallback
            ? (ULChangeURLCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULChangeURLCallback() {
        super(DESCRIPTOR);
    }

    ULChangeURLCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULChangeURLCallback {

        private final ULChangeURLCallbackI delegate;

        Container(long functionPointer, ULChangeURLCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long url) {
            delegate.invoke(userData, caller, url);
        }

    }

}