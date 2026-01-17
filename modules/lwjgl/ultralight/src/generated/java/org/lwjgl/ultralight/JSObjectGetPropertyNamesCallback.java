/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSObjectGetPropertyNamesCallback} */
public abstract class JSObjectGetPropertyNamesCallback extends Callback implements JSObjectGetPropertyNamesCallbackI {

    /**
     * Creates a {@code JSObjectGetPropertyNamesCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectGetPropertyNamesCallback}
     */
    public static JSObjectGetPropertyNamesCallback create(long functionPointer) {
        JSObjectGetPropertyNamesCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectGetPropertyNamesCallback
            ? (JSObjectGetPropertyNamesCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSObjectGetPropertyNamesCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectGetPropertyNamesCallback} instance that delegates to the specified {@code JSObjectGetPropertyNamesCallbackI} instance. */
    public static JSObjectGetPropertyNamesCallback create(JSObjectGetPropertyNamesCallbackI instance) {
        return instance instanceof JSObjectGetPropertyNamesCallback
            ? (JSObjectGetPropertyNamesCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectGetPropertyNamesCallback() {
        super(DESCRIPTOR);
    }

    JSObjectGetPropertyNamesCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectGetPropertyNamesCallback {

        private final JSObjectGetPropertyNamesCallbackI delegate;

        Container(long functionPointer, JSObjectGetPropertyNamesCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long context, long object, long propertyNames) {
            delegate.invoke(context, object, propertyNames);
        }

    }

}