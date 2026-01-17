/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke JSTypedArrayBytesDeallocator} */
public abstract class JSTypedArrayBytesDeallocator extends Callback implements JSTypedArrayBytesDeallocatorI {

    /**
     * Creates a {@code JSTypedArrayBytesDeallocator} instance from the specified function pointer.
     *
     * @return the new {@code JSTypedArrayBytesDeallocator}
     */
    public static JSTypedArrayBytesDeallocator create(long functionPointer) {
        JSTypedArrayBytesDeallocatorI instance = Callback.get(functionPointer);
        return instance instanceof JSTypedArrayBytesDeallocator
            ? (JSTypedArrayBytesDeallocator)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable JSTypedArrayBytesDeallocator createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code JSTypedArrayBytesDeallocator} instance that delegates to the specified {@code JSTypedArrayBytesDeallocatorI} instance. */
    public static JSTypedArrayBytesDeallocator create(JSTypedArrayBytesDeallocatorI instance) {
        return instance instanceof JSTypedArrayBytesDeallocator
            ? (JSTypedArrayBytesDeallocator)instance
            : new Container(instance.address(), instance);
    }

    protected JSTypedArrayBytesDeallocator() {
        super(DESCRIPTOR);
    }

    JSTypedArrayBytesDeallocator(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends JSTypedArrayBytesDeallocator {

        private final JSTypedArrayBytesDeallocatorI delegate;

        Container(long functionPointer, JSTypedArrayBytesDeallocatorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long bytes, long deallocatorContext) {
            delegate.invoke(bytes, deallocatorContext);
        }

    }

}