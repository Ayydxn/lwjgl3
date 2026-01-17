/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULGPUDriverNextGeometryIdCallback} */
public abstract class ULGPUDriverNextGeometryIDCallback extends Callback implements ULGPUDriverNextGeometryIDCallbackI {

    /**
     * Creates a {@code ULGPUDriverNextGeometryIDCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULGPUDriverNextGeometryIDCallback}
     */
    public static ULGPUDriverNextGeometryIDCallback create(long functionPointer) {
        ULGPUDriverNextGeometryIDCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULGPUDriverNextGeometryIDCallback
            ? (ULGPUDriverNextGeometryIDCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULGPUDriverNextGeometryIDCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULGPUDriverNextGeometryIDCallback} instance that delegates to the specified {@code ULGPUDriverNextGeometryIDCallbackI} instance. */
    public static ULGPUDriverNextGeometryIDCallback create(ULGPUDriverNextGeometryIDCallbackI instance) {
        return instance instanceof ULGPUDriverNextGeometryIDCallback
            ? (ULGPUDriverNextGeometryIDCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULGPUDriverNextGeometryIDCallback() {
        super(DESCRIPTOR);
    }

    ULGPUDriverNextGeometryIDCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULGPUDriverNextGeometryIDCallback {

        private final ULGPUDriverNextGeometryIDCallbackI delegate;

        Container(long functionPointer, ULGPUDriverNextGeometryIDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}