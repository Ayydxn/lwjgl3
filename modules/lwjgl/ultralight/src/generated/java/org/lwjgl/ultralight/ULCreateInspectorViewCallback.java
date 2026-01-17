/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULCreateInspectorViewCallback} */
public abstract class ULCreateInspectorViewCallback extends Callback implements ULCreateInspectorViewCallbackI {

    /**
     * Creates a {@code ULCreateInspectorViewCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULCreateInspectorViewCallback}
     */
    public static ULCreateInspectorViewCallback create(long functionPointer) {
        ULCreateInspectorViewCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULCreateInspectorViewCallback
            ? (ULCreateInspectorViewCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULCreateInspectorViewCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULCreateInspectorViewCallback} instance that delegates to the specified {@code ULCreateInspectorViewCallbackI} instance. */
    public static ULCreateInspectorViewCallback create(ULCreateInspectorViewCallbackI instance) {
        return instance instanceof ULCreateInspectorViewCallback
            ? (ULCreateInspectorViewCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULCreateInspectorViewCallback() {
        super(DESCRIPTOR);
    }

    ULCreateInspectorViewCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULCreateInspectorViewCallback {

        private final ULCreateInspectorViewCallbackI delegate;

        Container(long functionPointer, ULCreateInspectorViewCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, boolean isLocal, long inspectedURL) {
            delegate.invoke(userData, caller, isLocal, inspectedURL);
        }

    }

}