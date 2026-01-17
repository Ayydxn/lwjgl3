/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULSurfaceDefinitionUnlockPixelsCallback} */
public abstract class ULSurfaceDefinitionUnlockPixelsCallback extends Callback implements ULSurfaceDefinitionUnlockPixelsCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionUnlockPixelsCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionUnlockPixelsCallback}
     */
    public static ULSurfaceDefinitionUnlockPixelsCallback create(long functionPointer) {
        ULSurfaceDefinitionUnlockPixelsCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionUnlockPixelsCallback
            ? (ULSurfaceDefinitionUnlockPixelsCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULSurfaceDefinitionUnlockPixelsCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionUnlockPixelsCallback} instance that delegates to the specified {@code ULSurfaceDefinitionUnlockPixelsCallbackI} instance. */
    public static ULSurfaceDefinitionUnlockPixelsCallback create(ULSurfaceDefinitionUnlockPixelsCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionUnlockPixelsCallback
            ? (ULSurfaceDefinitionUnlockPixelsCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionUnlockPixelsCallback() {
        super(DESCRIPTOR);
    }

    ULSurfaceDefinitionUnlockPixelsCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionUnlockPixelsCallback {

        private final ULSurfaceDefinitionUnlockPixelsCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionUnlockPixelsCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}