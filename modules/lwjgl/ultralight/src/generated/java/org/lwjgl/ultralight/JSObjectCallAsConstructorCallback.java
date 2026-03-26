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
 * OpaqueJSValue * (*{@link #invoke}) (
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *constructor,
 *     size_t argumentCount,
 *     OpaqueJSValue const **arguments,
 *     OpaqueJSValue const *exception
 * )</code></pre>
 */
public abstract class JSObjectCallAsConstructorCallback extends Callback implements JSObjectCallAsConstructorCallbackI {

    /**
     * Creates a {@code JSObjectCallAsConstructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectCallAsConstructorCallback}
     */
    public static JSObjectCallAsConstructorCallback create(long functionPointer) {
        JSObjectCallAsConstructorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectCallAsConstructorCallback
            ? (JSObjectCallAsConstructorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static JSObjectCallAsConstructorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectCallAsConstructorCallback} instance that delegates to the specified {@code JSObjectCallAsConstructorCallbackI} instance. */
    public static JSObjectCallAsConstructorCallback create(JSObjectCallAsConstructorCallbackI instance) {
        return instance instanceof JSObjectCallAsConstructorCallback
            ? (JSObjectCallAsConstructorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectCallAsConstructorCallback() {
        super(CIF);
    }

    JSObjectCallAsConstructorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectCallAsConstructorCallback {

        private final JSObjectCallAsConstructorCallbackI delegate;

        Container(long functionPointer, JSObjectCallAsConstructorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long context, long constructor, long argumentCount, long arguments, long exception) {
            return delegate.invoke(context, constructor, argumentCount, arguments, exception);
        }

    }

}