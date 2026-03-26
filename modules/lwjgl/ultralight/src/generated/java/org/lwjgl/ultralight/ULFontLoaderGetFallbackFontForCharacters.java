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
 *     C_String *characters,
 *     int weight,
 *     bool italic
 * )</code></pre>
 */
public abstract class ULFontLoaderGetFallbackFontForCharacters extends Callback implements ULFontLoaderGetFallbackFontForCharactersI {

    /**
     * Creates a {@code ULFontLoaderGetFallbackFontForCharacters} instance from the specified function pointer.
     *
     * @return the new {@code ULFontLoaderGetFallbackFontForCharacters}
     */
    public static ULFontLoaderGetFallbackFontForCharacters create(long functionPointer) {
        ULFontLoaderGetFallbackFontForCharactersI instance = Callback.get(functionPointer);
        return instance instanceof ULFontLoaderGetFallbackFontForCharacters
            ? (ULFontLoaderGetFallbackFontForCharacters)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ULFontLoaderGetFallbackFontForCharacters createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ULFontLoaderGetFallbackFontForCharacters} instance that delegates to the specified {@code ULFontLoaderGetFallbackFontForCharactersI} instance. */
    public static ULFontLoaderGetFallbackFontForCharacters create(ULFontLoaderGetFallbackFontForCharactersI instance) {
        return instance instanceof ULFontLoaderGetFallbackFontForCharacters
            ? (ULFontLoaderGetFallbackFontForCharacters)instance
            : new Container(instance.address(), instance);
    }

    protected ULFontLoaderGetFallbackFontForCharacters() {
        super(CIF);
    }

    ULFontLoaderGetFallbackFontForCharacters(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ULFontLoaderGetFallbackFontForCharacters {

        private final ULFontLoaderGetFallbackFontForCharactersI delegate;

        Container(long functionPointer, ULFontLoaderGetFallbackFontForCharactersI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long characters, int weight, boolean italic) {
            return delegate.invoke(characters, weight, italic);
        }

    }

}