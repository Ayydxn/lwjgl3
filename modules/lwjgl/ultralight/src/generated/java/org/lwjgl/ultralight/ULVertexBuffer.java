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
 * struct ULVertexBuffer {
 *     ULVertexBufferFormat {@link #format};
 *     unsigned int {@link #size};
 *     unsigned char {@link #data};
 * }</code></pre>
 */
public class ULVertexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        SIZE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code ULVertexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULVertexBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The format of the vertex buffer. */
    @NativeType("ULVertexBufferFormat")
    public int format() { return nformat(address()); }
    /** The size of the vertex buffer in bytes. */
    @NativeType("unsigned int")
    public int size() { return nsize(address()); }
    /** The raw vertex buffer data. */
    @NativeType("unsigned char")
    public byte data() { return ndata(address()); }

    /** Sets the specified value to the {@link #format} field. */
    public ULVertexBuffer format(@NativeType("ULVertexBufferFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public ULVertexBuffer size(@NativeType("unsigned int") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #data} field. */
    public ULVertexBuffer data(@NativeType("unsigned char") byte value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULVertexBuffer set(
        int format,
        int size,
        byte data
    ) {
        format(format);
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
    public ULVertexBuffer set(ULVertexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULVertexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULVertexBuffer malloc() {
        return wrap(ULVertexBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULVertexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULVertexBuffer calloc() {
        return wrap(ULVertexBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULVertexBuffer} instance allocated with {@link BufferUtils}. */
    public static ULVertexBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULVertexBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code ULVertexBuffer} instance for the specified memory address. */
    public static ULVertexBuffer create(long address) {
        return wrap(ULVertexBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULVertexBuffer createSafe(long address) {
        return address == NULL ? null : wrap(ULVertexBuffer.class, address);
    }

    /**
     * Returns a new {@link ULVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVertexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULVertexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULVertexBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULVertexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVertexBuffer malloc(MemoryStack stack) {
        return wrap(ULVertexBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULVertexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVertexBuffer calloc(MemoryStack stack) {
        return wrap(ULVertexBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVertexBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + ULVertexBuffer.FORMAT); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + ULVertexBuffer.SIZE); }
    /** Unsafe version of {@link #data}. */
    public static byte ndata(long struct) { return UNSAFE.getByte(null, struct + ULVertexBuffer.DATA); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + ULVertexBuffer.FORMAT, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + ULVertexBuffer.SIZE, value); }
    /** Unsafe version of {@link #data(byte) data}. */
    public static void ndata(long struct, byte value) { UNSAFE.putByte(null, struct + ULVertexBuffer.DATA, value); }

    // -----------------------------------

    /** An array of {@link ULVertexBuffer} structs. */
    public static class Buffer extends StructBuffer<ULVertexBuffer, Buffer> implements NativeResource {

        private static final ULVertexBuffer ELEMENT_FACTORY = ULVertexBuffer.create(-1L);

        /**
         * Creates a new {@code ULVertexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULVertexBuffer#SIZEOF}, and its mark will be undefined.
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
        protected ULVertexBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ULVertexBuffer#format} field. */
        @NativeType("ULVertexBufferFormat")
        public int format() { return ULVertexBuffer.nformat(address()); }
        /** @return the value of the {@link ULVertexBuffer#size} field. */
        @NativeType("unsigned int")
        public int size() { return ULVertexBuffer.nsize(address()); }
        /** @return the value of the {@link ULVertexBuffer#data} field. */
        @NativeType("unsigned char")
        public byte data() { return ULVertexBuffer.ndata(address()); }

        /** Sets the specified value to the {@link ULVertexBuffer#format} field. */
        public ULVertexBuffer.Buffer format(@NativeType("ULVertexBufferFormat") int value) { ULVertexBuffer.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link ULVertexBuffer#size} field. */
        public ULVertexBuffer.Buffer size(@NativeType("unsigned int") int value) { ULVertexBuffer.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link ULVertexBuffer#data} field. */
        public ULVertexBuffer.Buffer data(@NativeType("unsigned char") byte value) { ULVertexBuffer.ndata(address(), value); return this; }

    }

}