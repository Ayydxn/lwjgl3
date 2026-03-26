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
 * void (*{@link #invoke}) (
 *     void *userData,
 *     C_View *caller,
 *     C_String *title
 * )</code></pre>
 */
public abstract class ULChangeTitleCallback extends Callback implements ULChangeTitleCallbackI {

    /**
     * Creates a {@code ULChangeTitleCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULChangeTitleCallback}
     */
    public static ULChangeTitleCallback create(long functionPointer) {
        ULChangeTitleCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULChangeTitleCallback
            ? (ULChangeTitleCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULChangeTitleCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULChangeTitleCallback} instance that delegates to the specified {@code ULChangeTitleCallbackI} instance. */
    public static ULChangeTitleCallback create(ULChangeTitleCallbackI instance) {
        return instance instanceof ULChangeTitleCallback
            ? (ULChangeTitleCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULChangeTitleCallback() {
        super(CIF);
    }

    ULChangeTitleCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULChangeTitleCallback {

        private final ULChangeTitleCallbackI delegate;

        Container(long functionPointer, ULChangeTitleCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long title) {
            delegate.invoke(userData, caller, title);
        }

    }

}