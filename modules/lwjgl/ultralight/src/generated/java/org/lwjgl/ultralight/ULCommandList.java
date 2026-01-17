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
 * struct ULCommandList {
 *     unsigned int size;
 *     {@link ULCommand ULCommand} * commands;
 * }</code></pre>
 */
public class ULCommandList extends Struct<ULCommandList> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        COMMANDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        COMMANDS = layout.offsetof(1);
    }

    protected ULCommandList(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULCommandList create(long address, @Nullable ByteBuffer container) {
        return new ULCommandList(address, container);
    }

    /**
     * Creates a {@code ULCommandList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULCommandList(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("unsigned int")
    public int size() { return nsize(address()); }
    /** @return a {@link ULCommand} view of the struct pointed to by the {@code commands} field. */
    @NativeType("ULCommand *")
    public ULCommand commands() { return ncommands(address()); }

    /** Sets the specified value to the {@code size} field. */
    public ULCommandList size(@NativeType("unsigned int") int value) { nsize(address(), value); return this; }
    /** Sets the address of the specified {@link ULCommand} to the {@code commands} field. */
    public ULCommandList commands(@NativeType("ULCommand *") ULCommand value) { ncommands(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULCommandList set(
        int size,
        ULCommand commands
    ) {
        size(size);
        commands(commands);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULCommandList set(ULCommandList src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULCommandList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULCommandList malloc() {
        return new ULCommandList(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULCommandList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULCommandList calloc() {
        return new ULCommandList(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULCommandList} instance allocated with {@link BufferUtils}. */
    public static ULCommandList create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULCommandList(memAddress(container), container);
    }

    /** Returns a new {@code ULCommandList} instance for the specified memory address. */
    public static ULCommandList create(long address) {
        return new ULCommandList(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULCommandList createSafe(long address) {
        return address == NULL ? null : new ULCommandList(address, null);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULCommandList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULCommandList.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULCommandList} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommandList malloc(MemoryStack stack) {
        return new ULCommandList(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULCommandList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommandList calloc(MemoryStack stack) {
        return new ULCommandList(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + ULCommandList.SIZE); }
    /** Unsafe version of {@link #commands}. */
    public static ULCommand ncommands(long struct) { return ULCommand.create(memGetAddress(struct + ULCommandList.COMMANDS)); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + ULCommandList.SIZE, value); }
    /** Unsafe version of {@link #commands(ULCommand) commands}. */
    public static void ncommands(long struct, ULCommand value) { memPutAddress(struct + ULCommandList.COMMANDS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long commands = memGetAddress(struct + ULCommandList.COMMANDS);
        check(commands);
        ULCommand.validate(commands);
    }

    // -----------------------------------

    /** An array of {@link ULCommandList} structs. */
    public static class Buffer extends StructBuffer<ULCommandList, Buffer> implements NativeResource {

        private static final ULCommandList ELEMENT_FACTORY = ULCommandList.create(-1L);

        /**
         * Creates a new {@code ULCommandList.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULCommandList#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULCommandList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("unsigned int")
        public int size() { return ULCommandList.nsize(address()); }
        /** @return a {@link ULCommand} view of the struct pointed to by the {@code commands} field. */
        @NativeType("ULCommand *")
        public ULCommand commands() { return ULCommandList.ncommands(address()); }

        /** Sets the specified value to the {@code size} field. */
        public ULCommandList.Buffer size(@NativeType("unsigned int") int value) { ULCommandList.nsize(address(), value); return this; }
        /** Sets the address of the specified {@link ULCommand} to the {@code commands} field. */
        public ULCommandList.Buffer commands(@NativeType("ULCommand *") ULCommand value) { ULCommandList.ncommands(address(), value); return this; }

    }

}