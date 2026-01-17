/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULAddConsoleMessageCallback} */
public abstract class ULAddConsoleMessageCallback extends Callback implements ULAddConsoleMessageCallbackI {

    /**
     * Creates a {@code ULAddConsoleMessageCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULAddConsoleMessageCallback}
     */
    public static ULAddConsoleMessageCallback create(long functionPointer) {
        ULAddConsoleMessageCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULAddConsoleMessageCallback
            ? (ULAddConsoleMessageCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULAddConsoleMessageCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULAddConsoleMessageCallback} instance that delegates to the specified {@code ULAddConsoleMessageCallbackI} instance. */
    public static ULAddConsoleMessageCallback create(ULAddConsoleMessageCallbackI instance) {
        return instance instanceof ULAddConsoleMessageCallback
            ? (ULAddConsoleMessageCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULAddConsoleMessageCallback() {
        super(DESCRIPTOR);
    }

    ULAddConsoleMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULAddConsoleMessageCallback {

        private final ULAddConsoleMessageCallbackI delegate;

        Container(long functionPointer, ULAddConsoleMessageCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, int source, int level, long message, int line_number, int column_number, long sourceID) {
            delegate.invoke(userData, caller, source, level, message, line_number, column_number, sourceID);
        }

    }

}