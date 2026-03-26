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
 *     void *userData,
 *     C_View *caller,
 *     unsigned long long frameID,
 *     bool isMainFrame,
 *     C_String *url
 * )</code></pre>
 */
public abstract class ULDOMReadyCallback extends Callback implements ULDOMReadyCallbackI {

    /**
     * Creates a {@code ULDOMReadyCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULDOMReadyCallback}
     */
    public static ULDOMReadyCallback create(long functionPointer) {
        ULDOMReadyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULDOMReadyCallback
            ? (ULDOMReadyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULDOMReadyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULDOMReadyCallback} instance that delegates to the specified {@code ULDOMReadyCallbackI} instance. */
    public static ULDOMReadyCallback create(ULDOMReadyCallbackI instance) {
        return instance instanceof ULDOMReadyCallback
            ? (ULDOMReadyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULDOMReadyCallback() {
        super(CIF);
    }

    ULDOMReadyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULDOMReadyCallback {

        private final ULDOMReadyCallbackI delegate;

        Container(long functionPointer, ULDOMReadyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long frameID, boolean isMainFrame, long url) {
            delegate.invoke(userData, caller, frameID, isMainFrame, url);
        }

    }

}