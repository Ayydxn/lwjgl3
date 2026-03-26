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
 * struct ULMatrix4x4 {
 *     float data[16];
 * }</code></pre>
 */
public class ULMatrix4x4 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    /**
     * Creates a {@code ULMatrix4x4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULMatrix4x4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code data} field. */
    @NativeType("float[16]")
    public FloatBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    public float data(int index) { return ndata(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
    public ULMatrix4x4 data(@NativeType("float[16]") FloatBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    public ULMatrix4x4 data(int index, float value) { ndata(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULMatrix4x4 set(ULMatrix4x4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULMatrix4x4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULMatrix4x4 malloc() {
        return wrap(ULMatrix4x4.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULMatrix4x4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULMatrix4x4 calloc() {
        return wrap(ULMatrix4x4.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULMatrix4x4} instance allocated with {@link BufferUtils}. */
    public static ULMatrix4x4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULMatrix4x4.class, memAddress(container), container);
    }

    /** Returns a new {@code ULMatrix4x4} instance for the specified memory address. */
    public static ULMatrix4x4 create(long address) {
        return wrap(ULMatrix4x4.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULMatrix4x4 createSafe(long address) {
        return address == NULL ? null : wrap(ULMatrix4x4.class, address);
    }

    /**
     * Returns a new {@link ULMatrix4x4.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULMatrix4x4.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULMatrix4x4.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULMatrix4x4.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULMatrix4x4.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULMatrix4x4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULMatrix4x4 malloc(MemoryStack stack) {
        return wrap(ULMatrix4x4.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULMatrix4x4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULMatrix4x4 calloc(MemoryStack stack) {
        return wrap(ULMatrix4x4.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULMatrix4x4.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULMatrix4x4.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULMatrix4x4.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static FloatBuffer ndata(long struct) { return memFloatBuffer(struct + ULMatrix4x4.DATA, 16); }
    /** Unsafe version of {@link #data(int) data}. */
    public static float ndata(long struct, int index) {
        return UNSAFE.getFloat(null, struct + ULMatrix4x4.DATA + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #data(FloatBuffer) data}. */
    public static void ndata(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + ULMatrix4x4.DATA, value.remaining() * 4);
    }
    /** Unsafe version of {@link #data(int, float) data}. */
    public static void ndata(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + ULMatrix4x4.DATA + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link ULMatrix4x4} structs. */
    public static class Buffer extends StructBuffer<ULMatrix4x4, Buffer> implements NativeResource {

        private static final ULMatrix4x4 ELEMENT_FACTORY = ULMatrix4x4.create(-1L);

        /**
         * Creates a new {@code ULMatrix4x4.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULMatrix4x4#SIZEOF}, and its mark will be undefined.
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
        protected ULMatrix4x4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code data} field. */
        @NativeType("float[16]")
        public FloatBuffer data() { return ULMatrix4x4.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        public float data(int index) { return ULMatrix4x4.ndata(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
        public ULMatrix4x4.Buffer data(@NativeType("float[16]") FloatBuffer value) { ULMatrix4x4.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        public ULMatrix4x4.Buffer data(int index, float value) { ULMatrix4x4.ndata(address(), index, value); return this; }

    }

}