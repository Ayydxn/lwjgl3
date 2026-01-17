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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ULIntRect {
 *     int left;
 *     int top;
 *     int right;
 *     int bottom;
 * }}</pre>
 */
public class ULIntRect extends Struct<ULIntRect> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LEFT,
        TOP,
        RIGHT,
        BOTTOM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LEFT = layout.offsetof(0);
        TOP = layout.offsetof(1);
        RIGHT = layout.offsetof(2);
        BOTTOM = layout.offsetof(3);
    }

    protected ULIntRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULIntRect create(long address, @Nullable ByteBuffer container) {
        return new ULIntRect(address, container);
    }

    /**
     * Creates a {@code ULIntRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULIntRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code left} field. */
    public int left() { return nleft(address()); }
    /** @return the value of the {@code top} field. */
    public int top() { return ntop(address()); }
    /** @return the value of the {@code right} field. */
    public int right() { return nright(address()); }
    /** @return the value of the {@code bottom} field. */
    public int bottom() { return nbottom(address()); }

    /** Sets the specified value to the {@code left} field. */
    public ULIntRect left(int value) { nleft(address(), value); return this; }
    /** Sets the specified value to the {@code top} field. */
    public ULIntRect top(int value) { ntop(address(), value); return this; }
    /** Sets the specified value to the {@code right} field. */
    public ULIntRect right(int value) { nright(address(), value); return this; }
    /** Sets the specified value to the {@code bottom} field. */
    public ULIntRect bottom(int value) { nbottom(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULIntRect set(
        int left,
        int top,
        int right,
        int bottom
    ) {
        left(left);
        top(top);
        right(right);
        bottom(bottom);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULIntRect set(ULIntRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULIntRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULIntRect malloc() {
        return new ULIntRect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULIntRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULIntRect calloc() {
        return new ULIntRect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULIntRect} instance allocated with {@link BufferUtils}. */
    public static ULIntRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULIntRect(memAddress(container), container);
    }

    /** Returns a new {@code ULIntRect} instance for the specified memory address. */
    public static ULIntRect create(long address) {
        return new ULIntRect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULIntRect createSafe(long address) {
        return address == NULL ? null : new ULIntRect(address, null);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULIntRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULIntRect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULIntRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIntRect malloc(MemoryStack stack) {
        return new ULIntRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULIntRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIntRect calloc(MemoryStack stack) {
        return new ULIntRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #left}. */
    public static int nleft(long struct) { return memGetInt(struct + ULIntRect.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static int ntop(long struct) { return memGetInt(struct + ULIntRect.TOP); }
    /** Unsafe version of {@link #right}. */
    public static int nright(long struct) { return memGetInt(struct + ULIntRect.RIGHT); }
    /** Unsafe version of {@link #bottom}. */
    public static int nbottom(long struct) { return memGetInt(struct + ULIntRect.BOTTOM); }

    /** Unsafe version of {@link #left(int) left}. */
    public static void nleft(long struct, int value) { memPutInt(struct + ULIntRect.LEFT, value); }
    /** Unsafe version of {@link #top(int) top}. */
    public static void ntop(long struct, int value) { memPutInt(struct + ULIntRect.TOP, value); }
    /** Unsafe version of {@link #right(int) right}. */
    public static void nright(long struct, int value) { memPutInt(struct + ULIntRect.RIGHT, value); }
    /** Unsafe version of {@link #bottom(int) bottom}. */
    public static void nbottom(long struct, int value) { memPutInt(struct + ULIntRect.BOTTOM, value); }

    // -----------------------------------

    /** An array of {@link ULIntRect} structs. */
    public static class Buffer extends StructBuffer<ULIntRect, Buffer> implements NativeResource {

        private static final ULIntRect ELEMENT_FACTORY = ULIntRect.create(-1L);

        /**
         * Creates a new {@code ULIntRect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULIntRect#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULIntRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code left} field. */
        public int left() { return ULIntRect.nleft(address()); }
        /** @return the value of the {@code top} field. */
        public int top() { return ULIntRect.ntop(address()); }
        /** @return the value of the {@code right} field. */
        public int right() { return ULIntRect.nright(address()); }
        /** @return the value of the {@code bottom} field. */
        public int bottom() { return ULIntRect.nbottom(address()); }

        /** Sets the specified value to the {@code left} field. */
        public ULIntRect.Buffer left(int value) { ULIntRect.nleft(address(), value); return this; }
        /** Sets the specified value to the {@code top} field. */
        public ULIntRect.Buffer top(int value) { ULIntRect.ntop(address(), value); return this; }
        /** Sets the specified value to the {@code right} field. */
        public ULIntRect.Buffer right(int value) { ULIntRect.nright(address(), value); return this; }
        /** Sets the specified value to the {@code bottom} field. */
        public ULIntRect.Buffer bottom(int value) { ULIntRect.nbottom(address(), value); return this; }

    }

}