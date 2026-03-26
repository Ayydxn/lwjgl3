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
 * void (*{@link #invoke}) (
 *     OpaqueJSContext const *context,
 *     OpaqueJSValue *object
 * )</code></pre>
 */
public abstract class JSObjectInitializeCallback extends Callback implements JSObjectInitializeCallbackI {

    /**
     * Creates a {@code JSObjectInitializeCallback} instance from the specified function pointer.
     *
     * @return the new {@code JSObjectInitializeCallback}
     */
    public static JSObjectInitializeCallback create(long functionPointer) {
        JSObjectInitializeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof JSObjectInitializeCallback
            ? (JSObjectInitializeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static JSObjectInitializeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSObjectInitializeCallback} instance that delegates to the specified {@code JSObjectInitializeCallbackI} instance. */
    public static JSObjectInitializeCallback create(JSObjectInitializeCallbackI instance) {
        return instance instanceof JSObjectInitializeCallback
            ? (JSObjectInitializeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected JSObjectInitializeCallback() {
        super(CIF);
    }

    JSObjectInitializeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSObjectInitializeCallback {

        private final JSObjectInitializeCallbackI delegate;

        Container(long functionPointer, JSObjectInitializeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long context, long object) {
            delegate.invoke(context, object);
        }

    }

}