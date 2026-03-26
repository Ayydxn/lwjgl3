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
 * C_String * (*{@link #invoke}) (
 *     C_String *family,
 *     int weight,
 *     bool italic
 * )</code></pre>
 */
public abstract class ULFontLoaderLoad extends Callback implements ULFontLoaderLoadI {

    /**
     * Creates a {@code ULFontLoaderLoad} instance from the specified function pointer.
     *
     * @return the new {@code ULFontLoaderLoad}
     */
    public static ULFontLoaderLoad create(long functionPointer) {
        ULFontLoaderLoadI instance = Callback.get(functionPointer);
        return instance instanceof ULFontLoaderLoad
            ? (ULFontLoaderLoad)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFontLoaderLoad createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFontLoaderLoad} instance that delegates to the specified {@code ULFontLoaderLoadI} instance. */
    public static ULFontLoaderLoad create(ULFontLoaderLoadI instance) {
        return instance instanceof ULFontLoaderLoad
            ? (ULFontLoaderLoad)instance
            : new Container(instance.address(), instance);
    }

    protected ULFontLoaderLoad() {
        super(CIF);
    }

    ULFontLoaderLoad(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFontLoaderLoad {

        private final ULFontLoaderLoadI delegate;

        Container(long functionPointer, ULFontLoaderLoadI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long family, int weight, boolean italic) {
            return delegate.invoke(family, weight, italic);
        }

    }

}