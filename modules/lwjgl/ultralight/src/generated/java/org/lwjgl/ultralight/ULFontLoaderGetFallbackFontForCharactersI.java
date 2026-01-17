/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke ULFontLoaderGetFallbackFontForCharacters} */
@FunctionalInterface
@NativeType("ULFontLoaderGetFallbackFontForCharacters")
public interface ULFontLoaderGetFallbackFontForCharactersI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_pointer,
            ffi_type_pointer, ffi_type_sint32, ffi_type_uint8
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetByte(memGetAddress(args + 2 * POINTER_SIZE)) != 0
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code C_String * (* ULFontLoaderGetFallbackFontForCharacters) (C_String * characters, int weight, bool italic)} */
    @NativeType("C_String *") long invoke(@NativeType("C_String *") long characters, int weight, @NativeType("bool") boolean italic);

}