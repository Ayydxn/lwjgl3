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
 * C_Buffer * (*{@link #invoke}) (
 *     C_String *path
 * )</code></pre>
 */
public abstract class ULFileSystemOpenFileCallback extends Callback implements ULFileSystemOpenFileCallbackI {

    /**
     * Creates a {@code ULFileSystemOpenFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFileSystemOpenFileCallback}
     */
    public static ULFileSystemOpenFileCallback create(long functionPointer) {
        ULFileSystemOpenFileCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFileSystemOpenFileCallback
            ? (ULFileSystemOpenFileCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFileSystemOpenFileCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFileSystemOpenFileCallback} instance that delegates to the specified {@code ULFileSystemOpenFileCallbackI} instance. */
    public static ULFileSystemOpenFileCallback create(ULFileSystemOpenFileCallbackI instance) {
        return instance instanceof ULFileSystemOpenFileCallback
            ? (ULFileSystemOpenFileCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFileSystemOpenFileCallback() {
        super(CIF);
    }

    ULFileSystemOpenFileCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFileSystemOpenFileCallback {

        private final ULFileSystemOpenFileCallbackI delegate;

        Container(long functionPointer, ULFileSystemOpenFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long path) {
            return delegate.invoke(path);
        }

    }

}