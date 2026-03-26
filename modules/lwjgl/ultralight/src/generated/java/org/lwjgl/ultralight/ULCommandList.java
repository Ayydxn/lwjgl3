/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ULCommandList {
 *     unsigned int {@link #size};
 *     {@link ULCommand ULCommand} * {@link #commands};
 * }</code></pre>
 */
public class ULCommandList extends Struct implements NativeResource {

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

    /** The number of commands in the list. */
    @NativeType("unsigned int")
    public int size() { return nsize(address()); }
    /** The raw command list data. */
    @NativeType("ULCommand *")
    public ULCommand commands() { return ncommands(address()); }

    /** Sets the specified value to the {@link #size} field. */
    public ULCommandList size(@NativeType("unsigned int") int value) { nsize(address(), value); return this; }
    /** Sets the address of the specified {@link ULCommand} to the {@link #commands} field. */
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
        return wrap(ULCommandList.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULCommandList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULCommandList calloc() {
        return wrap(ULCommandList.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULCommandList} instance allocated with {@link BufferUtils}. */
    public static ULCommandList create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULCommandList.class, memAddress(container), container);
    }

    /** Returns a new {@code ULCommandList} instance for the specified memory address. */
    public static ULCommandList create(long address) {
        return wrap(ULCommandList.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULCommandList createSafe(long address) {
        return address == NULL ? null : wrap(ULCommandList.class, address);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULCommandList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULCommandList.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULCommandList} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommandList malloc(MemoryStack stack) {
        return wrap(ULCommandList.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULCommandList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommandList calloc(MemoryStack stack) {
        return wrap(ULCommandList.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommandList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommandList.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + ULCommandList.SIZE); }
    /** Unsafe version of {@link #commands}. */
    public static ULCommand ncommands(long struct) { return ULCommand.create(memGetAddress(struct + ULCommandList.COMMANDS)); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + ULCommandList.SIZE, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULCommandList#SIZEOF}, and its mark will be undefined.
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
        protected ULCommandList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ULCommandList#size} field. */
        @NativeType("unsigned int")
        public int size() { return ULCommandList.nsize(address()); }
        /** @return a {@link ULCommand} view of the struct pointed to by the {@link ULCommandList#commands} field. */
        @NativeType("ULCommand *")
        public ULCommand commands() { return ULCommandList.ncommands(address()); }

        /** Sets the specified value to the {@link ULCommandList#size} field. */
        public ULCommandList.Buffer size(@NativeType("unsigned int") int value) { ULCommandList.nsize(address(), value); return this; }
        /** Sets the address of the specified {@link ULCommand} to the {@link ULCommandList#commands} field. */
        public ULCommandList.Buffer commands(@NativeType("ULCommand *") ULCommand value) { ULCommandList.ncommands(address(), value); return this; }

    }

}