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
 *     void *userData,
 *     C_View *caller,
 *     C_String *openerURL,
 *     C_String *targetURL,
 *     bool isPopup,
 *     ULIntRect *popupRect
 * )</code></pre>
 */
public abstract class ULCreateChildViewCallback extends Callback implements ULCreateChildViewCallbackI {

    /**
     * Creates a {@code ULCreateChildViewCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULCreateChildViewCallback}
     */
    public static ULCreateChildViewCallback create(long functionPointer) {
        ULCreateChildViewCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULCreateChildViewCallback
            ? (ULCreateChildViewCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULCreateChildViewCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULCreateChildViewCallback} instance that delegates to the specified {@code ULCreateChildViewCallbackI} instance. */
    public static ULCreateChildViewCallback create(ULCreateChildViewCallbackI instance) {
        return instance instanceof ULCreateChildViewCallback
            ? (ULCreateChildViewCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULCreateChildViewCallback() {
        super(CIF);
    }

    ULCreateChildViewCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULCreateChildViewCallback {

        private final ULCreateChildViewCallbackI delegate;

        Container(long functionPointer, ULCreateChildViewCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long openerURL, long targetURL, boolean isPopup, long popupRect) {
            delegate.invoke(userData, caller, openerURL, targetURL, isPopup, popupRect);
        }

    }

}