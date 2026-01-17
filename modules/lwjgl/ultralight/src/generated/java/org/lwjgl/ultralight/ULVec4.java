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
 * <pre>{@code
 * struct ULvec4 {
 *     float value[4];
 * }}</pre>
 */
@NativeType("struct ULvec4")
public class ULVec4 extends Struct<ULVec4> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE;

    static {
        Layout layout = __struct(
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(0);
    }

    protected ULVec4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULVec4 create(long address, @Nullable ByteBuffer container) {
        return new ULVec4(address, container);
    }

    /**
     * Creates a {@code ULVec4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULVec4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code value} field. */
    @NativeType("float[4]")
    public FloatBuffer value() { return nvalue(address()); }
    /** @return the value at the specified index of the {@code value} field. */
    public float value(int index) { return nvalue(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code value} field. */
    public ULVec4 value(@NativeType("float[4]") FloatBuffer value) { nvalue(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code value} field. */
    public ULVec4 value(int index, float value) { nvalue(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULVec4 set(ULVec4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULVec4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULVec4 malloc() {
        return new ULVec4(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULVec4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULVec4 calloc() {
        return new ULVec4(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULVec4} instance allocated with {@link BufferUtils}. */
    public static ULVec4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULVec4(memAddress(container), container);
    }

    /** Returns a new {@code ULVec4} instance for the specified memory address. */
    public static ULVec4 create(long address) {
        return new ULVec4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULVec4 createSafe(long address) {
        return address == NULL ? null : new ULVec4(address, null);
    }

    /**
     * Returns a new {@link ULVec4.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULVec4.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVec4.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULVec4.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULVec4.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULVec4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVec4 malloc(MemoryStack stack) {
        return new ULVec4(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULVec4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVec4 calloc(MemoryStack stack) {
        return new ULVec4(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULVec4.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVec4.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVec4.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static FloatBuffer nvalue(long struct) { return memFloatBuffer(struct + ULVec4.VALUE, 4); }
    /** Unsafe version of {@link #value(int) value}. */
    public static float nvalue(long struct, int index) {
        return memGetFloat(struct + ULVec4.VALUE + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #value(FloatBuffer) value}. */
    public static void nvalue(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ULVec4.VALUE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #value(int, float) value}. */
    public static void nvalue(long struct, int index, float value) {
        memPutFloat(struct + ULVec4.VALUE + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link ULVec4} structs. */
    public static class Buffer extends StructBuffer<ULVec4, Buffer> implements NativeResource {

        private static final ULVec4 ELEMENT_FACTORY = ULVec4.create(-1L);

        /**
         * Creates a new {@code ULVec4.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULVec4#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULVec4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code value} field. */
        @NativeType("float[4]")
        public FloatBuffer value() { return ULVec4.nvalue(address()); }
        /** @return the value at the specified index of the {@code value} field. */
        public float value(int index) { return ULVec4.nvalue(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code value} field. */
        public ULVec4.Buffer value(@NativeType("float[4]") FloatBuffer value) { ULVec4.nvalue(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code value} field. */
        public ULVec4.Buffer value(int index, float value) { ULVec4.nvalue(address(), index, value); return this; }

    }

}