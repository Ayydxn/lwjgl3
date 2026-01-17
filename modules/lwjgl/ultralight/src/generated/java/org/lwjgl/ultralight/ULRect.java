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
 * struct ULRect {
 *     float left;
 *     float top;
 *     float right;
 *     float bottom;
 * }}</pre>
 */
public class ULRect extends Struct<ULRect> implements NativeResource {

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

    protected ULRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULRect create(long address, @Nullable ByteBuffer container) {
        return new ULRect(address, container);
    }

    /**
     * Creates a {@code ULRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code left} field. */
    public float left() { return nleft(address()); }
    /** @return the value of the {@code top} field. */
    public float top() { return ntop(address()); }
    /** @return the value of the {@code right} field. */
    public float right() { return nright(address()); }
    /** @return the value of the {@code bottom} field. */
    public float bottom() { return nbottom(address()); }

    /** Sets the specified value to the {@code left} field. */
    public ULRect left(float value) { nleft(address(), value); return this; }
    /** Sets the specified value to the {@code top} field. */
    public ULRect top(float value) { ntop(address(), value); return this; }
    /** Sets the specified value to the {@code right} field. */
    public ULRect right(float value) { nright(address(), value); return this; }
    /** Sets the specified value to the {@code bottom} field. */
    public ULRect bottom(float value) { nbottom(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULRect set(
        float left,
        float top,
        float right,
        float bottom
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
    public ULRect set(ULRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULRect malloc() {
        return new ULRect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULRect calloc() {
        return new ULRect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULRect} instance allocated with {@link BufferUtils}. */
    public static ULRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULRect(memAddress(container), container);
    }

    /** Returns a new {@code ULRect} instance for the specified memory address. */
    public static ULRect create(long address) {
        return new ULRect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULRect createSafe(long address) {
        return address == NULL ? null : new ULRect(address, null);
    }

    /**
     * Returns a new {@link ULRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULRect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRect malloc(MemoryStack stack) {
        return new ULRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRect calloc(MemoryStack stack) {
        return new ULRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #left}. */
    public static float nleft(long struct) { return memGetFloat(struct + ULRect.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static float ntop(long struct) { return memGetFloat(struct + ULRect.TOP); }
    /** Unsafe version of {@link #right}. */
    public static float nright(long struct) { return memGetFloat(struct + ULRect.RIGHT); }
    /** Unsafe version of {@link #bottom}. */
    public static float nbottom(long struct) { return memGetFloat(struct + ULRect.BOTTOM); }

    /** Unsafe version of {@link #left(float) left}. */
    public static void nleft(long struct, float value) { memPutFloat(struct + ULRect.LEFT, value); }
    /** Unsafe version of {@link #top(float) top}. */
    public static void ntop(long struct, float value) { memPutFloat(struct + ULRect.TOP, value); }
    /** Unsafe version of {@link #right(float) right}. */
    public static void nright(long struct, float value) { memPutFloat(struct + ULRect.RIGHT, value); }
    /** Unsafe version of {@link #bottom(float) bottom}. */
    public static void nbottom(long struct, float value) { memPutFloat(struct + ULRect.BOTTOM, value); }

    // -----------------------------------

    /** An array of {@link ULRect} structs. */
    public static class Buffer extends StructBuffer<ULRect, Buffer> implements NativeResource {

        private static final ULRect ELEMENT_FACTORY = ULRect.create(-1L);

        /**
         * Creates a new {@code ULRect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULRect#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code left} field. */
        public float left() { return ULRect.nleft(address()); }
        /** @return the value of the {@code top} field. */
        public float top() { return ULRect.ntop(address()); }
        /** @return the value of the {@code right} field. */
        public float right() { return ULRect.nright(address()); }
        /** @return the value of the {@code bottom} field. */
        public float bottom() { return ULRect.nbottom(address()); }

        /** Sets the specified value to the {@code left} field. */
        public ULRect.Buffer left(float value) { ULRect.nleft(address(), value); return this; }
        /** Sets the specified value to the {@code top} field. */
        public ULRect.Buffer top(float value) { ULRect.ntop(address(), value); return this; }
        /** Sets the specified value to the {@code right} field. */
        public ULRect.Buffer right(float value) { ULRect.nright(address(), value); return this; }
        /** Sets the specified value to the {@code bottom} field. */
        public ULRect.Buffer bottom(float value) { ULRect.nbottom(address(), value); return this; }

    }

}