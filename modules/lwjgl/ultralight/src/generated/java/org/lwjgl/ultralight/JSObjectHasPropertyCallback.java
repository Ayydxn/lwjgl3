/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectHasPropertyCallback} */
public abstract class JSObjectHasPropertyCallback extends Callback implements JSObjectHasPropertyCallbackI {

    /**
     * Creates a {@code JSObjectHasPropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectHasPropertyCallback}
     */
    public static JSObjectHasPropertyCallback create(long functionPointer) {
        JSObjectHasPropertyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectHasPropertyCallback
            ? (JSObjectHasPropertyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectHasPropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectHasPropertyCallback} instance that delegates to the specified {@code JSObjectHasPropertyCallbackI} instance. */
    public static JSObjectHasPropertyCallback create(JSObjectHasPropertyCallbackI instance) {
        return instance instanceof JSObjectHasPropertyCallback
            ? (JSObjectHasPropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectHasPropertyCallback() {
        super(DESCRIPTOR);
    }

    JSObjectHasPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectHasPropertyCallback {

        private final JSObjectHasPropertyCallbackI delegate;

        Container(long functionPointer, JSObjectHasPropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long context, long object, long propertyName) {
            return delegate.invoke(context, object, propertyName);
        }

    }

}