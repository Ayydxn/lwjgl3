/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULClipboardClearCallback} */
public abstract class ULClipboardClearCallback extends Callback implements ULClipboardClearCallbackI {

    /**
     * Creates a {@code ULClipboardClearCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULClipboardClearCallback}
     */
    public static ULClipboardClearCallback create(long functionPointer) {
        ULClipboardClearCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULClipboardClearCallback
            ? (ULClipboardClearCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULClipboardClearCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULClipboardClearCallback} instance that delegates to the specified {@code ULClipboardClearCallbackI} instance. */
    public static ULClipboardClearCallback create(ULClipboardClearCallbackI instance) {
        return instance instanceof ULClipboardClearCallback
            ? (ULClipboardClearCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULClipboardClearCallback() {
        super(DESCRIPTOR);
    }

    ULClipboardClearCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULClipboardClearCallback {

        private final ULClipboardClearCallbackI delegate;

        Container(long functionPointer, ULClipboardClearCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}