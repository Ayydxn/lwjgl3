/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectCallAsFunctionCallback} */
public abstract class JSObjectCallAsFunctionCallback extends Callback implements JSObjectCallAsFunctionCallbackI {

    /**
     * Creates a {@code JSObjectCallAsFunctionCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectCallAsFunctionCallback}
     */
    public static JSObjectCallAsFunctionCallback create(long functionPointer) {
        JSObjectCallAsFunctionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectCallAsFunctionCallback
            ? (JSObjectCallAsFunctionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectCallAsFunctionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectCallAsFunctionCallback} instance that delegates to the specified {@code JSObjectCallAsFunctionCallbackI} instance. */
    public static JSObjectCallAsFunctionCallback create(JSObjectCallAsFunctionCallbackI instance) {
        return instance instanceof JSObjectCallAsFunctionCallback
            ? (JSObjectCallAsFunctionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectCallAsFunctionCallback() {
        super(DESCRIPTOR);
    }

    JSObjectCallAsFunctionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectCallAsFunctionCallback {

        private final JSObjectCallAsFunctionCallbackI delegate;

        Container(long functionPointer, JSObjectCallAsFunctionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long context, long function, long thisObject, long argumentCount, long exception) {
            delegate.invoke(context, function, thisObject, argumentCount, exception);
        }

    }

}