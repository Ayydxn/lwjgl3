/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULResizeCallback} */
public abstract class ULResizeCallback extends Callback implements ULResizeCallbackI {

    /**
     * Creates a {@code ULResizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULResizeCallback}
     */
    public static ULResizeCallback create(long functionPointer) {
        ULResizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULResizeCallback
            ? (ULResizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULResizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULResizeCallback} instance that delegates to the specified {@code ULResizeCallbackI} instance. */
    public static ULResizeCallback create(ULResizeCallbackI instance) {
        return instance instanceof ULResizeCallback
            ? (ULResizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULResizeCallback() {
        super(DESCRIPTOR);
    }

    ULResizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULResizeCallback {

        private final ULResizeCallbackI delegate;

        Container(long functionPointer, ULResizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long window, int width, int height) {
            delegate.invoke(userData, window, width, height);
        }

    }

}