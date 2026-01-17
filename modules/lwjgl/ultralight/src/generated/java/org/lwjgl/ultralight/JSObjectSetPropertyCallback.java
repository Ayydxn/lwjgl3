/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectSetPropertyCallback} */
public abstract class JSObjectSetPropertyCallback extends Callback implements JSObjectSetPropertyCallbackI {

    /**
     * Creates a {@code JSObjectSetPropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectSetPropertyCallback}
     */
    public static JSObjectSetPropertyCallback create(long functionPointer) {
        JSObjectSetPropertyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectSetPropertyCallback
            ? (JSObjectSetPropertyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectSetPropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectSetPropertyCallback} instance that delegates to the specified {@code JSObjectSetPropertyCallbackI} instance. */
    public static JSObjectSetPropertyCallback create(JSObjectSetPropertyCallbackI instance) {
        return instance instanceof JSObjectSetPropertyCallback
            ? (JSObjectSetPropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectSetPropertyCallback() {
        super(DESCRIPTOR);
    }

    JSObjectSetPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectSetPropertyCallback {

        private final JSObjectSetPropertyCallbackI delegate;

        Container(long functionPointer, JSObjectSetPropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long context, long object, long propertyName, long value, long exception) {
            return delegate.invoke(context, object, propertyName, value, exception);
        }

    }

}