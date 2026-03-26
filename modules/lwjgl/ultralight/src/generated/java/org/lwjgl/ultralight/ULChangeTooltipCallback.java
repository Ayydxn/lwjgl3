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
 *     C_String *tooltip
 * )</code></pre>
 */
public abstract class ULChangeTooltipCallback extends Callback implements ULChangeTooltipCallbackI {

    /**
     * Creates a {@code ULChangeTooltipCallback} instance from the specified function pointer.
     *
     * @return the new {@code ULChangeTooltipCallback}
     */
    public static ULChangeTooltipCallback create(long functionPointer) {
        ULChangeTooltipCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ULChangeTooltipCallback
            ? (ULChangeTooltipCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULChangeTooltipCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULChangeTooltipCallback} instance that delegates to the specified {@code ULChangeTooltipCallbackI} instance. */
    public static ULChangeTooltipCallback create(ULChangeTooltipCallbackI instance) {
        return instance instanceof ULChangeTooltipCallback
            ? (ULChangeTooltipCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ULChangeTooltipCallback() {
        super(CIF);
    }

    ULChangeTooltipCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULChangeTooltipCallback {

        private final ULChangeTooltipCallbackI delegate;

        Container(long functionPointer, ULChangeTooltipCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, long caller, long tooltip) {
            delegate.invoke(userData, caller, tooltip);
        }

    }

}