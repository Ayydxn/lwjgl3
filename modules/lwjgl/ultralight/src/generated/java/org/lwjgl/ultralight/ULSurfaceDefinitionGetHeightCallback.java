/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULSurfaceDefinitionGetHeightCallback} */
public abstract class ULSurfaceDefinitionGetHeightCallback extends Callback implements ULSurfaceDefinitionGetHeightCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionGetHeightCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionGetHeightCallback}
     */
    public static ULSurfaceDefinitionGetHeightCallback create(long functionPointer) {
        ULSurfaceDefinitionGetHeightCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionGetHeightCallback
            ? (ULSurfaceDefinitionGetHeightCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULSurfaceDefinitionGetHeightCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionGetHeightCallback} instance that delegates to the specified {@code ULSurfaceDefinitionGetHeightCallbackI} instance. */
    public static ULSurfaceDefinitionGetHeightCallback create(ULSurfaceDefinitionGetHeightCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionGetHeightCallback
            ? (ULSurfaceDefinitionGetHeightCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionGetHeightCallback() {
        super(DESCRIPTOR);
    }

    ULSurfaceDefinitionGetHeightCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionGetHeightCallback {

        private final ULSurfaceDefinitionGetHeightCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionGetHeightCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}