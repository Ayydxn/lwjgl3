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
 * bool (*{@link #invoke}) (
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *object,
 *     OpaqueJSString *propertyName,
 *     OpaqueJSValue const *value,
 *     OpaqueJSValue const *exception
 * )</code></pre>
 */
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
    @Nullable
    public static JSObjectSetPropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectSetPropertyCallback} instance that delegates to the specified {@code JSObjectSetPropertyCallbackI} instance. */
    public static JSObjectSetPropertyCallback create(JSObjectSetPropertyCallbackI instance) {
        return instance instanceof JSObjectSetPropertyCallback
            ? (JSObjectSetPropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectSetPropertyCallback() {
        super(CIF);
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