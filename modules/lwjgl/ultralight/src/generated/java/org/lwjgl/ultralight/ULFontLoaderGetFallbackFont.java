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
 * C_String * (*{@link #invoke}) (void)</code></pre>
 */
public abstract class ULFontLoaderGetFallbackFont extends Callback implements ULFontLoaderGetFallbackFontI {

    /**
     * Creates a {@code ULFontLoaderGetFallbackFont} instance from the specified function pointer.
     *
     * @return the new {@code ULFontLoaderGetFallbackFont}
     */
    public static ULFontLoaderGetFallbackFont create(long functionPointer) {
        ULFontLoaderGetFallbackFontI instance = Callback.get(functionPointer);
        return instance instanceof ULFontLoaderGetFallbackFont
            ? (ULFontLoaderGetFallbackFont)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFontLoaderGetFallbackFont createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFontLoaderGetFallbackFont} instance that delegates to the specified {@code ULFontLoaderGetFallbackFontI} instance. */
    public static ULFontLoaderGetFallbackFont create(ULFontLoaderGetFallbackFontI instance) {
        return instance instanceof ULFontLoaderGetFallbackFont
            ? (ULFontLoaderGetFallbackFont)instance
            : new Container(instance.address(), instance);
    }

    protected ULFontLoaderGetFallbackFont() {
        super(CIF);
    }

    ULFontLoaderGetFallbackFont(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFontLoaderGetFallbackFont {

        private final ULFontLoaderGetFallbackFontI delegate;

        Container(long functionPointer, ULFontLoaderGetFallbackFontI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke() {
            return delegate.invoke();
        }

    }

}