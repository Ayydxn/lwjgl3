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
 *     C_String *path
 * )</code></pre>
 */
public abstract class ULFileSystemFileExistsCallback extends Callback implements ULFileSystemFileExistsCallbackI {

    /**
     * Creates a {@code ULFileSystemFileExistsCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFileSystemFileExistsCallback}
     */
    public static ULFileSystemFileExistsCallback create(long functionPointer) {
        ULFileSystemFileExistsCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFileSystemFileExistsCallback
            ? (ULFileSystemFileExistsCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFileSystemFileExistsCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFileSystemFileExistsCallback} instance that delegates to the specified {@code ULFileSystemFileExistsCallbackI} instance. */
    public static ULFileSystemFileExistsCallback create(ULFileSystemFileExistsCallbackI instance) {
        return instance instanceof ULFileSystemFileExistsCallback
            ? (ULFileSystemFileExistsCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFileSystemFileExistsCallback() {
        super(CIF);
    }

    ULFileSystemFileExistsCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFileSystemFileExistsCallback {

        private final ULFileSystemFileExistsCallbackI delegate;

        Container(long functionPointer, ULFileSystemFileExistsCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long path) {
            return delegate.invoke(path);
        }

    }

}