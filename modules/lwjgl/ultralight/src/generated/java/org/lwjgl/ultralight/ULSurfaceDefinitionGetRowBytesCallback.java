/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULSurfaceDefinitionGetRowBytesCallback} */
public abstract class ULSurfaceDefinitionGetRowBytesCallback extends Callback implements ULSurfaceDefinitionGetRowBytesCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionGetRowBytesCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionGetRowBytesCallback}
     */
    public static ULSurfaceDefinitionGetRowBytesCallback create(long functionPointer) {
        ULSurfaceDefinitionGetRowBytesCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionGetRowBytesCallback
            ? (ULSurfaceDefinitionGetRowBytesCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULSurfaceDefinitionGetRowBytesCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionGetRowBytesCallback} instance that delegates to the specified {@code ULSurfaceDefinitionGetRowBytesCallbackI} instance. */
    public static ULSurfaceDefinitionGetRowBytesCallback create(ULSurfaceDefinitionGetRowBytesCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionGetRowBytesCallback
            ? (ULSurfaceDefinitionGetRowBytesCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionGetRowBytesCallback() {
        super(DESCRIPTOR);
    }

    ULSurfaceDefinitionGetRowBytesCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionGetRowBytesCallback {

        private final ULSurfaceDefinitionGetRowBytesCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionGetRowBytesCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}