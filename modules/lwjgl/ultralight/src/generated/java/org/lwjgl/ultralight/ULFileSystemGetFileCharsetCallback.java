/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ULFileSystemGetFileCharsetCallback} */
public abstract class ULFileSystemGetFileCharsetCallback extends Callback implements ULFileSystemGetFileCharsetCallbackI {

    /**
     * Creates a {@code ULFileSystemGetFileCharsetCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULFileSystemGetFileCharsetCallback}
     */
    public static ULFileSystemGetFileCharsetCallback create(long functionPointer) {
        ULFileSystemGetFileCharsetCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULFileSystemGetFileCharsetCallback
            ? (ULFileSystemGetFileCharsetCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ULFileSystemGetFileCharsetCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFileSystemGetFileCharsetCallback} instance that delegates to the specified {@code ULFileSystemGetFileCharsetCallbackI} instance. */
    public static ULFileSystemGetFileCharsetCallback create(ULFileSystemGetFileCharsetCallbackI instance) {
        return instance instanceof ULFileSystemGetFileCharsetCallback
            ? (ULFileSystemGetFileCharsetCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULFileSystemGetFileCharsetCallback() {
        super(DESCRIPTOR);
    }

    ULFileSystemGetFileCharsetCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFileSystemGetFileCharsetCallback {

        private final ULFileSystemGetFileCharsetCallbackI delegate;

        Container(long functionPointer, ULFileSystemGetFileCharsetCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long path) {
            return delegate.invoke(path);
        }

    }

}