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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ULIntRect {
 *     int left;
 *     int top;
 *     int right;
 *     int bottom;
 * }</code></pre>
 */
public class ULIntRect extends Struct implements NativeResource {

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
        return wrap(ULIntRect.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULIntRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULIntRect calloc() {
        return wrap(ULIntRect.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULIntRect} instance allocated with {@link BufferUtils}. */
    public static ULIntRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULIntRect.class, memAddress(container), container);
    }

    /** Returns a new {@code ULIntRect} instance for the specified memory address. */
    public static ULIntRect create(long address) {
        return wrap(ULIntRect.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULIntRect createSafe(long address) {
        return address == NULL ? null : wrap(ULIntRect.class, address);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULIntRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULIntRect.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULIntRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIntRect malloc(MemoryStack stack) {
        return wrap(ULIntRect.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULIntRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIntRect calloc(MemoryStack stack) {
        return wrap(ULIntRect.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIntRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIntRect.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #left}. */
    public static int nleft(long struct) { return UNSAFE.getInt(null, struct + ULIntRect.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static int ntop(long struct) { return UNSAFE.getInt(null, struct + ULIntRect.TOP); }
    /** Unsafe version of {@link #right}. */
    public static int nright(long struct) { return UNSAFE.getInt(null, struct + ULIntRect.RIGHT); }
    /** Unsafe version of {@link #bottom}. */
    public static int nbottom(long struct) { return UNSAFE.getInt(null, struct + ULIntRect.BOTTOM); }

    /** Unsafe version of {@link #left(int) left}. */
    public static void nleft(long struct, int value) { UNSAFE.putInt(null, struct + ULIntRect.LEFT, value); }
    /** Unsafe version of {@link #top(int) top}. */
    public static void ntop(long struct, int value) { UNSAFE.putInt(null, struct + ULIntRect.TOP, value); }
    /** Unsafe version of {@link #right(int) right}. */
    public static void nright(long struct, int value) { UNSAFE.putInt(null, struct + ULIntRect.RIGHT, value); }
    /** Unsafe version of {@link #bottom(int) bottom}. */
    public static void nbottom(long struct, int value) { UNSAFE.putInt(null, struct + ULIntRect.BOTTOM, value); }

    // -----------------------------------

    /** An array of {@link ULIntRect} structs. */
    public static class Buffer extends StructBuffer<ULIntRect, Buffer> implements NativeResource {

        private static final ULIntRect ELEMENT_FACTORY = ULIntRect.create(-1L);

        /**
         * Creates a new {@code ULIntRect.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULIntRect#SIZEOF}, and its mark will be undefined.
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