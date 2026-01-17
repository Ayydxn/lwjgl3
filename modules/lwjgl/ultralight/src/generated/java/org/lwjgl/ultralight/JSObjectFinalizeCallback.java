/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectFinalizeCallback} */
public abstract class JSObjectFinalizeCallback extends Callback implements JSObjectFinalizeCallbackI {

    /**
     * Creates a {@code JSObjectFinalizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectFinalizeCallback}
     */
    public static JSObjectFinalizeCallback create(long functionPointer) {
        JSObjectFinalizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectFinalizeCallback
            ? (JSObjectFinalizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectFinalizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectFinalizeCallback} instance that delegates to the specified {@code JSObjectFinalizeCallbackI} instance. */
    public static JSObjectFinalizeCallback create(JSObjectFinalizeCallbackI instance) {
        return instance instanceof JSObjectFinalizeCallback
            ? (JSObjectFinalizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectFinalizeCallback() {
        super(DESCRIPTOR);
    }

    JSObjectFinalizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectFinalizeCallback {

        private final JSObjectFinalizeCallbackI delegate;

        Container(long functionPointer, JSObjectFinalizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long object) {
            delegate.invoke(object);
        }

    }

}