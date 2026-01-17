/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectDeletePropertyCallback} */
public abstract class JSObjectDeletePropertyCallback extends Callback implements JSObjectDeletePropertyCallbackI {

    /**
     * Creates a {@code JSObjectDeletePropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectDeletePropertyCallback}
     */
    public static JSObjectDeletePropertyCallback create(long functionPointer) {
        JSObjectDeletePropertyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectDeletePropertyCallback
            ? (JSObjectDeletePropertyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectDeletePropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectDeletePropertyCallback} instance that delegates to the specified {@code JSObjectDeletePropertyCallbackI} instance. */
    public static JSObjectDeletePropertyCallback create(JSObjectDeletePropertyCallbackI instance) {
        return instance instanceof JSObjectDeletePropertyCallback
            ? (JSObjectDeletePropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectDeletePropertyCallback() {
        super(DESCRIPTOR);
    }

    JSObjectDeletePropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectDeletePropertyCallback {

        private final JSObjectDeletePropertyCallbackI delegate;

        Container(long functionPointer, JSObjectDeletePropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long context, long object, long propertyName, long exception) {
            return delegate.invoke(context, object, propertyName, exception);
        }

    }

}