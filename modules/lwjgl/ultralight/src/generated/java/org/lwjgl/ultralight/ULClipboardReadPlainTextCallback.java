/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     C_String *result
 * )</code></pre>
 */
public abstract class ULClipboardReadPlainTextCallback extends Callback implements ULClipboardReadPlainTextCallbackI {

    /**
     * Creates a {@code ULClipboardReadPlainTextCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULClipboardReadPlainTextCallback}
     */
    public static ULClipboardReadPlainTextCallback create(long functionPointer) {
        ULClipboardReadPlainTextCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULClipboardReadPlainTextCallback
            ? (ULClipboardReadPlainTextCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULClipboardReadPlainTextCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULClipboardReadPlainTextCallback} instance that delegates to the specified {@code ULClipboardReadPlainTextCallbackI} instance. */
    public static ULClipboardReadPlainTextCallback create(ULClipboardReadPlainTextCallbackI instance) {
        return instance instanceof ULClipboardReadPlainTextCallback
            ? (ULClipboardReadPlainTextCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULClipboardReadPlainTextCallback() {
        super(CIF);
    }

    ULClipboardReadPlainTextCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULClipboardReadPlainTextCallback {

        private final ULClipboardReadPlainTextCallbackI delegate;

        Container(long functionPointer, ULClipboardReadPlainTextCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long result) {
            delegate.invoke(result);
        }

    }

}