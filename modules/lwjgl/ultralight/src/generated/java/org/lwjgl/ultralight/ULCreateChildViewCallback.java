/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULCreateChildViewCallback} */
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
    public static @Nullable ULCreateChildViewCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULCreateChildViewCallback} instance that delegates to the specified {@code ULCreateChildViewCallbackI} instance. */
    public static ULCreateChildViewCallback create(ULCreateChildViewCallbackI instance) {
        return instance instanceof ULCreateChildViewCallback
            ? (ULCreateChildViewCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULCreateChildViewCallback() {
        super(DESCRIPTOR);
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