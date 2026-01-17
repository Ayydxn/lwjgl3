/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ULFileSystem {
 *     {@link ULFileSystemFileExistsCallbackI ULFileSystemFileExistsCallback} fileExists;
 *     {@link ULFileSystemGetFileMimeTypeCallbackI ULFileSystemGetFileMimeTypeCallback} getFileMimeType;
 *     {@link ULFileSystemGetFileCharsetCallbackI ULFileSystemGetFileCharsetCallback} getFileCharset;
 *     {@link ULFileSystemOpenFileCallbackI ULFileSystemOpenFileCallback} openfile;
 * }</code></pre>
 */
public class ULFileSystem extends Struct<ULFileSystem> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILEEXISTS,
        GETFILEMIMETYPE,
        GETFILECHARSET,
        OPENFILE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILEEXISTS = layout.offsetof(0);
        GETFILEMIMETYPE = layout.offsetof(1);
        GETFILECHARSET = layout.offsetof(2);
        OPENFILE = layout.offsetof(3);
    }

    protected ULFileSystem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULFileSystem create(long address, @Nullable ByteBuffer container) {
        return new ULFileSystem(address, container);
    }

    /**
     * Creates a {@code ULFileSystem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULFileSystem(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fileExists} field. */
    public ULFileSystemFileExistsCallback fileExists() { return nfileExists(address()); }
    /** @return the value of the {@code getFileMimeType} field. */
    public ULFileSystemGetFileMimeTypeCallback getFileMimeType() { return ngetFileMimeType(address()); }
    /** @return the value of the {@code getFileCharset} field. */
    public ULFileSystemGetFileCharsetCallback getFileCharset() { return ngetFileCharset(address()); }
    /** @return the value of the {@code openfile} field. */
    public ULFileSystemOpenFileCallback openfile() { return nopenfile(address()); }

    /** Sets the specified value to the {@code fileExists} field. */
    public ULFileSystem fileExists(@NativeType("ULFileSystemFileExistsCallback") ULFileSystemFileExistsCallbackI value) { nfileExists(address(), value); return this; }
    /** Sets the specified value to the {@code getFileMimeType} field. */
    public ULFileSystem getFileMimeType(@NativeType("ULFileSystemGetFileMimeTypeCallback") ULFileSystemGetFileMimeTypeCallbackI value) { ngetFileMimeType(address(), value); return this; }
    /** Sets the specified value to the {@code getFileCharset} field. */
    public ULFileSystem getFileCharset(@NativeType("ULFileSystemGetFileCharsetCallback") ULFileSystemGetFileCharsetCallbackI value) { ngetFileCharset(address(), value); return this; }
    /** Sets the specified value to the {@code openfile} field. */
    public ULFileSystem openfile(@NativeType("ULFileSystemOpenFileCallback") ULFileSystemOpenFileCallbackI value) { nopenfile(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULFileSystem set(
        ULFileSystemFileExistsCallbackI fileExists,
        ULFileSystemGetFileMimeTypeCallbackI getFileMimeType,
        ULFileSystemGetFileCharsetCallbackI getFileCharset,
        ULFileSystemOpenFileCallbackI openfile
    ) {
        fileExists(fileExists);
        getFileMimeType(getFileMimeType);
        getFileCharset(getFileCharset);
        openfile(openfile);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULFileSystem set(ULFileSystem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULFileSystem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULFileSystem malloc() {
        return new ULFileSystem(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULFileSystem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULFileSystem calloc() {
        return new ULFileSystem(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULFileSystem} instance allocated with {@link BufferUtils}. */
    public static ULFileSystem create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULFileSystem(memAddress(container), container);
    }

    /** Returns a new {@code ULFileSystem} instance for the specified memory address. */
    public static ULFileSystem create(long address) {
        return new ULFileSystem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULFileSystem createSafe(long address) {
        return address == NULL ? null : new ULFileSystem(address, null);
    }

    /**
     * Returns a new {@link ULFileSystem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULFileSystem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULFileSystem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULFileSystem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULFileSystem.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULFileSystem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULFileSystem malloc(MemoryStack stack) {
        return new ULFileSystem(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULFileSystem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULFileSystem calloc(MemoryStack stack) {
        return new ULFileSystem(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULFileSystem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULFileSystem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULFileSystem.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fileExists}. */
    public static ULFileSystemFileExistsCallback nfileExists(long struct) { return ULFileSystemFileExistsCallback.create(memGetAddress(struct + ULFileSystem.FILEEXISTS)); }
    /** Unsafe version of {@link #getFileMimeType}. */
    public static ULFileSystemGetFileMimeTypeCallback ngetFileMimeType(long struct) { return ULFileSystemGetFileMimeTypeCallback.create(memGetAddress(struct + ULFileSystem.GETFILEMIMETYPE)); }
    /** Unsafe version of {@link #getFileCharset}. */
    public static ULFileSystemGetFileCharsetCallback ngetFileCharset(long struct) { return ULFileSystemGetFileCharsetCallback.create(memGetAddress(struct + ULFileSystem.GETFILECHARSET)); }
    /** Unsafe version of {@link #openfile}. */
    public static ULFileSystemOpenFileCallback nopenfile(long struct) { return ULFileSystemOpenFileCallback.create(memGetAddress(struct + ULFileSystem.OPENFILE)); }

    /** Unsafe version of {@link #fileExists(ULFileSystemFileExistsCallbackI) fileExists}. */
    public static void nfileExists(long struct, ULFileSystemFileExistsCallbackI value) { memPutAddress(struct + ULFileSystem.FILEEXISTS, value.address()); }
    /** Unsafe version of {@link #getFileMimeType(ULFileSystemGetFileMimeTypeCallbackI) getFileMimeType}. */
    public static void ngetFileMimeType(long struct, ULFileSystemGetFileMimeTypeCallbackI value) { memPutAddress(struct + ULFileSystem.GETFILEMIMETYPE, value.address()); }
    /** Unsafe version of {@link #getFileCharset(ULFileSystemGetFileCharsetCallbackI) getFileCharset}. */
    public static void ngetFileCharset(long struct, ULFileSystemGetFileCharsetCallbackI value) { memPutAddress(struct + ULFileSystem.GETFILECHARSET, value.address()); }
    /** Unsafe version of {@link #openfile(ULFileSystemOpenFileCallbackI) openfile}. */
    public static void nopenfile(long struct, ULFileSystemOpenFileCallbackI value) { memPutAddress(struct + ULFileSystem.OPENFILE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULFileSystem.FILEEXISTS));
        check(memGetAddress(struct + ULFileSystem.GETFILEMIMETYPE));
        check(memGetAddress(struct + ULFileSystem.GETFILECHARSET));
        check(memGetAddress(struct + ULFileSystem.OPENFILE));
    }

    // -----------------------------------

    /** An array of {@link ULFileSystem} structs. */
    public static class Buffer extends StructBuffer<ULFileSystem, Buffer> implements NativeResource {

        private static final ULFileSystem ELEMENT_FACTORY = ULFileSystem.create(-1L);

        /**
         * Creates a new {@code ULFileSystem.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULFileSystem#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected ULFileSystem getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fileExists} field. */
        public ULFileSystemFileExistsCallback fileExists() { return ULFileSystem.nfileExists(address()); }
        /** @return the value of the {@code getFileMimeType} field. */
        public ULFileSystemGetFileMimeTypeCallback getFileMimeType() { return ULFileSystem.ngetFileMimeType(address()); }
        /** @return the value of the {@code getFileCharset} field. */
        public ULFileSystemGetFileCharsetCallback getFileCharset() { return ULFileSystem.ngetFileCharset(address()); }
        /** @return the value of the {@code openfile} field. */
        public ULFileSystemOpenFileCallback openfile() { return ULFileSystem.nopenfile(address()); }

        /** Sets the specified value to the {@code fileExists} field. */
        public ULFileSystem.Buffer fileExists(@NativeType("ULFileSystemFileExistsCallback") ULFileSystemFileExistsCallbackI value) { ULFileSystem.nfileExists(address(), value); return this; }
        /** Sets the specified value to the {@code getFileMimeType} field. */
        public ULFileSystem.Buffer getFileMimeType(@NativeType("ULFileSystemGetFileMimeTypeCallback") ULFileSystemGetFileMimeTypeCallbackI value) { ULFileSystem.ngetFileMimeType(address(), value); return this; }
        /** Sets the specified value to the {@code getFileCharset} field. */
        public ULFileSystem.Buffer getFileCharset(@NativeType("ULFileSystemGetFileCharsetCallback") ULFileSystemGetFileCharsetCallbackI value) { ULFileSystem.ngetFileCharset(address(), value); return this; }
        /** Sets the specified value to the {@code openfile} field. */
        public ULFileSystem.Buffer openfile(@NativeType("ULFileSystemOpenFileCallback") ULFileSystemOpenFileCallbackI value) { ULFileSystem.nopenfile(address(), value); return this; }

    }

}