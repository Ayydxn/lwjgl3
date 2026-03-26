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
 *     OpaqueJSValue *constructor,
 *     OpaqueJSValue const *possibleInstance,
 *     OpaqueJSValue const *exception
 * )</code></pre>
 */
public abstract class JSObjectHasInstanceCallback extends Callback implements JSObjectHasInstanceCallbackI {

    /**
     * Creates a {@code JSObjectHasInstanceCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectHasInstanceCallback}
     */
    public static JSObjectHasInstanceCallback create(long functionPointer) {
        JSObjectHasInstanceCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectHasInstanceCallback
            ? (JSObjectHasInstanceCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static JSObjectHasInstanceCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectHasInstanceCallback} instance that delegates to the specified {@code JSObjectHasInstanceCallbackI} instance. */
    public static JSObjectHasInstanceCallback create(JSObjectHasInstanceCallbackI instance) {
        return instance instanceof JSObjectHasInstanceCallback
            ? (JSObjectHasInstanceCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectHasInstanceCallback() {
        super(CIF);
    }

    JSObjectHasInstanceCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectHasInstanceCallback {

        private final JSObjectHasInstanceCallbackI delegate;

        Container(long functionPointer, JSObjectHasInstanceCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long context, long constructor, long possibleInstance, long exception) {
            return delegate.invoke(context, constructor, possibleInstance, exception);
        }

    }

}