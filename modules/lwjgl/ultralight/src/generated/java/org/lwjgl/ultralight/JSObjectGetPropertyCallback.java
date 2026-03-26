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
 * OpaqueJSValue const * (*{@link #invoke}) (
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *object,
 *     OpaqueJSString *propertyName,
 *     OpaqueJSValue const *exception
 * )</code></pre>
 */
public abstract class JSObjectGetPropertyCallback extends Callback implements JSObjectGetPropertyCallbackI {

    /**
     * Creates a {@code JSObjectGetPropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectGetPropertyCallback}
     */
    public static JSObjectGetPropertyCallback create(long functionPointer) {
        JSObjectGetPropertyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectGetPropertyCallback
            ? (JSObjectGetPropertyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static JSObjectGetPropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectGetPropertyCallback} instance that delegates to the specified {@code JSObjectGetPropertyCallbackI} instance. */
    public static JSObjectGetPropertyCallback create(JSObjectGetPropertyCallbackI instance) {
        return instance instanceof JSObjectGetPropertyCallback
            ? (JSObjectGetPropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectGetPropertyCallback() {
        super(CIF);
    }

    JSObjectGetPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectGetPropertyCallback {

        private final JSObjectGetPropertyCallbackI delegate;

        Container(long functionPointer, JSObjectGetPropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long context, long object, long propertyName, long exception) {
            return delegate.invoke(context, object, propertyName, exception);
        }

    }

}