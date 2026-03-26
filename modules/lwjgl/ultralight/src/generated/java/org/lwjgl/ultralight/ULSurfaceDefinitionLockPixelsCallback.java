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
 * void * (*{@link #invoke}) (
 *     void *userData
 * )</code></pre>
 */
public abstract class ULSurfaceDefinitionLockPixelsCallback extends Callback implements ULSurfaceDefinitionLockPixelsCallbackI {

    /**
     * Creates a {@code ULSurfaceDefinitionLockPixelsCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULSurfaceDefinitionLockPixelsCallback}
     */
    public static ULSurfaceDefinitionLockPixelsCallback create(long functionPointer) {
        ULSurfaceDefinitionLockPixelsCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULSurfaceDefinitionLockPixelsCallback
            ? (ULSurfaceDefinitionLockPixelsCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinitionLockPixelsCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULSurfaceDefinitionLockPixelsCallback} instance that delegates to the specified {@code ULSurfaceDefinitionLockPixelsCallbackI} instance. */
    public static ULSurfaceDefinitionLockPixelsCallback create(ULSurfaceDefinitionLockPixelsCallbackI instance) {
        return instance instanceof ULSurfaceDefinitionLockPixelsCallback
            ? (ULSurfaceDefinitionLockPixelsCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULSurfaceDefinitionLockPixelsCallback() {
        super(CIF);
    }

    ULSurfaceDefinitionLockPixelsCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULSurfaceDefinitionLockPixelsCallback {

        private final ULSurfaceDefinitionLockPixelsCallbackI delegate;

        Container(long functionPointer, ULSurfaceDefinitionLockPixelsCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userData) {
            return delegate.invoke(userData);
        }

    }

}