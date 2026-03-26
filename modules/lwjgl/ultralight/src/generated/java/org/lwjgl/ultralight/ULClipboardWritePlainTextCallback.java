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
 *     C_String *text
 * )</code></pre>
 */
public abstract class ULClipboardWritePlainTextCallback extends Callback implements ULClipboardWritePlainTextCallbackI {

    /**
     * Creates a {@code ULClipboardWritePlainTextCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULClipboardWritePlainTextCallback}
     */
    public static ULClipboardWritePlainTextCallback create(long functionPointer) {
        ULClipboardWritePlainTextCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULClipboardWritePlainTextCallback
            ? (ULClipboardWritePlainTextCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULClipboardWritePlainTextCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULClipboardWritePlainTextCallback} instance that delegates to the specified {@code ULClipboardWritePlainTextCallbackI} instance. */
    public static ULClipboardWritePlainTextCallback create(ULClipboardWritePlainTextCallbackI instance) {
        return instance instanceof ULClipboardWritePlainTextCallback
            ? (ULClipboardWritePlainTextCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULClipboardWritePlainTextCallback() {
        super(CIF);
    }

    ULClipboardWritePlainTextCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULClipboardWritePlainTextCallback {

        private final ULClipboardWritePlainTextCallbackI delegate;

        Container(long functionPointer, ULClipboardWritePlainTextCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long text) {
            delegate.invoke(text);
        }

    }

}