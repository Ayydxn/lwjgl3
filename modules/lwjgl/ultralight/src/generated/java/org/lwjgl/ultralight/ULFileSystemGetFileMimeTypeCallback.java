/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULFileSystemGetFileMimeTypeCallback} */
public abstract class ULFileSystemGetFileMimeTypeCallback extends Callback implements ULFileSystemGetFileMimeTypeCallbackI {

    /**
     * Creates a {@code ULFileSystemGetFileMimeTypeCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFileSystemGetFileMimeTypeCallback}
     */
    public static ULFileSystemGetFileMimeTypeCallback create(long functionPointer) {
        ULFileSystemGetFileMimeTypeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFileSystemGetFileMimeTypeCallback
            ? (ULFileSystemGetFileMimeTypeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULFileSystemGetFileMimeTypeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFileSystemGetFileMimeTypeCallback} instance that delegates to the specified {@code ULFileSystemGetFileMimeTypeCallbackI} instance. */
    public static ULFileSystemGetFileMimeTypeCallback create(ULFileSystemGetFileMimeTypeCallbackI instance) {
        return instance instanceof ULFileSystemGetFileMimeTypeCallback
            ? (ULFileSystemGetFileMimeTypeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFileSystemGetFileMimeTypeCallback() {
        super(DESCRIPTOR);
    }

    ULFileSystemGetFileMimeTypeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFileSystemGetFileMimeTypeCallback {

        private final ULFileSystemGetFileMimeTypeCallbackI delegate;

        Container(long functionPointer, ULFileSystemGetFileMimeTypeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long path) {
            return delegate.invoke(path);
        }

    }

}