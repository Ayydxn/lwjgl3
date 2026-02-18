/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULLoggerLogMessageCallback} */
public abstract class ULLoggerLogMessageCallback extends Callback implements ULLoggerLogMessageCallbackI {

    /**
     * Creates a {@code ULLoggerLogMessageCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULLoggerLogMessageCallback}
     */
    public static ULLoggerLogMessageCallback create(long functionPointer) {
        ULLoggerLogMessageCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULLoggerLogMessageCallback
            ? (ULLoggerLogMessageCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULLoggerLogMessageCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULLoggerLogMessageCallback} instance that delegates to the specified {@code ULLoggerLogMessageCallbackI} instance. */
    public static ULLoggerLogMessageCallback create(ULLoggerLogMessageCallbackI instance) {
        return instance instanceof ULLoggerLogMessageCallback
            ? (ULLoggerLogMessageCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULLoggerLogMessageCallback() {
        super(DESCRIPTOR);
    }

    ULLoggerLogMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULLoggerLogMessageCallback {

        private final ULLoggerLogMessageCallbackI delegate;

        Container(long functionPointer, ULLoggerLogMessageCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int logLevel, long message) {
            delegate.invoke(logLevel, message);
        }

    }

}