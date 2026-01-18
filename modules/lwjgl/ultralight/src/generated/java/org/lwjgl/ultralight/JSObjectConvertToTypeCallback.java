/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectConvertToTypeCallback} */
public abstract class JSObjectConvertToTypeCallback extends Callback implements JSObjectConvertToTypeCallbackI {

    /**
     * Creates a {@code JSObjectConvertToTypeCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectConvertToTypeCallback}
     */
    public static JSObjectConvertToTypeCallback create(long functionPointer) {
        JSObjectConvertToTypeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectConvertToTypeCallback
            ? (JSObjectConvertToTypeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectConvertToTypeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectConvertToTypeCallback} instance that delegates to the specified {@code JSObjectConvertToTypeCallbackI} instance. */
    public static JSObjectConvertToTypeCallback create(JSObjectConvertToTypeCallbackI instance) {
        return instance instanceof JSObjectConvertToTypeCallback
            ? (JSObjectConvertToTypeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectConvertToTypeCallback() {
        super(DESCRIPTOR);
    }

    JSObjectConvertToTypeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectConvertToTypeCallback {

        private final JSObjectConvertToTypeCallbackI delegate;

        Container(long functionPointer, JSObjectConvertToTypeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long context, long object, int type, long exception) {
            return delegate.invoke(context, object, type, exception);
        }

    }

}