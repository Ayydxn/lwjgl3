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
 * struct ULIndexBuffer {
 *     unsigned int {@link #size};
 *     unsigned char {@link #data};
 * }</code></pre>
 */
public class ULIndexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code ULIndexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULIndexBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The size of the index buffer in bytes. */
    @NativeType("unsigned int")
    public int size() { return nsize(address()); }
    /** The raw index buffer data. */
    @NativeType("unsigned char")
    public byte data() { return ndata(address()); }

    /** Sets the specified value to the {@link #size} field. */
    public ULIndexBuffer size(@NativeType("unsigned int") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #data} field. */
    public ULIndexBuffer data(@NativeType("unsigned char") byte value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULIndexBuffer set(
        int size,
        byte data
    ) {
        size(size);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULIndexBuffer set(ULIndexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULIndexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULIndexBuffer malloc() {
        return wrap(ULIndexBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULIndexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULIndexBuffer calloc() {
        return wrap(ULIndexBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULIndexBuffer} instance allocated with {@link BufferUtils}. */
    public static ULIndexBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULIndexBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code ULIndexBuffer} instance for the specified memory address. */
    public static ULIndexBuffer create(long address) {
        return wrap(ULIndexBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULIndexBuffer createSafe(long address) {
        return address == NULL ? null : wrap(ULIndexBuffer.class, address);
    }

    /**
     * Returns a new {@link ULIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIndexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULIndexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULIndexBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULIndexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIndexBuffer malloc(MemoryStack stack) {
        return wrap(ULIndexBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULIndexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULIndexBuffer calloc(MemoryStack stack) {
        return wrap(ULIndexBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULIndexBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + ULIndexBuffer.SIZE); }
    /** Unsafe version of {@link #data}. */
    public static byte ndata(long struct) { return UNSAFE.getByte(null, struct + ULIndexBuffer.DATA); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + ULIndexBuffer.SIZE, value); }
    /** Unsafe version of {@link #data(byte) data}. */
    public static void ndata(long struct, byte value) { UNSAFE.putByte(null, struct + ULIndexBuffer.DATA, value); }

    // -----------------------------------

    /** An array of {@link ULIndexBuffer} structs. */
    public static class Buffer extends StructBuffer<ULIndexBuffer, Buffer> implements NativeResource {

        private static final ULIndexBuffer ELEMENT_FACTORY = ULIndexBuffer.create(-1L);

        /**
         * Creates a new {@code ULIndexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULIndexBuffer#SIZEOF}, and its mark will be undefined.
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
        protected ULIndexBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ULIndexBuffer#size} field. */
        @NativeType("unsigned int")
        public int size() { return ULIndexBuffer.nsize(address()); }
        /** @return the value of the {@link ULIndexBuffer#data} field. */
        @NativeType("unsigned char")
        public byte data() { return ULIndexBuffer.ndata(address()); }

        /** Sets the specified value to the {@link ULIndexBuffer#size} field. */
        public ULIndexBuffer.Buffer size(@NativeType("unsigned int") int value) { ULIndexBuffer.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link ULIndexBuffer#data} field. */
        public ULIndexBuffer.Buffer data(@NativeType("unsigned char") byte value) { ULIndexBuffer.ndata(address(), value); return this; }

    }

}