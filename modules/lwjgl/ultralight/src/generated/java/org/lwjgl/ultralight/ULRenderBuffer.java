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
 * struct ULRenderBuffer {
 *     unsigned int textureID;
 *     unsigned int width;
 *     unsigned int height;
 *     bool hasStencilBuffer;
 *     bool hasDepthBuffer;
 * }}</pre>
 */
public class ULRenderBuffer extends Struct<ULRenderBuffer> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTUREID,
        WIDTH,
        HEIGHT,
        HASSTENCILBUFFER,
        HASDEPTHBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTUREID = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        HASSTENCILBUFFER = layout.offsetof(3);
        HASDEPTHBUFFER = layout.offsetof(4);
    }

    protected ULRenderBuffer(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULRenderBuffer create(long address, @Nullable ByteBuffer container) {
        return new ULRenderBuffer(address, container);
    }

    /**
     * Creates a {@code ULRenderBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULRenderBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code textureID} field. */
    @NativeType("unsigned int")
    public int textureID() { return ntextureID(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("unsigned int")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("unsigned int")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code hasStencilBuffer} field. */
    @NativeType("bool")
    public boolean hasStencilBuffer() { return nhasStencilBuffer(address()); }
    /** @return the value of the {@code hasDepthBuffer} field. */
    @NativeType("bool")
    public boolean hasDepthBuffer() { return nhasDepthBuffer(address()); }

    /** Sets the specified value to the {@code textureID} field. */
    public ULRenderBuffer textureID(@NativeType("unsigned int") int value) { ntextureID(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ULRenderBuffer width(@NativeType("unsigned int") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ULRenderBuffer height(@NativeType("unsigned int") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code hasStencilBuffer} field. */
    public ULRenderBuffer hasStencilBuffer(@NativeType("bool") boolean value) { nhasStencilBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code hasDepthBuffer} field. */
    public ULRenderBuffer hasDepthBuffer(@NativeType("bool") boolean value) { nhasDepthBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULRenderBuffer set(
        int textureID,
        int width,
        int height,
        boolean hasStencilBuffer,
        boolean hasDepthBuffer
    ) {
        textureID(textureID);
        width(width);
        height(height);
        hasStencilBuffer(hasStencilBuffer);
        hasDepthBuffer(hasDepthBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULRenderBuffer set(ULRenderBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULRenderBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULRenderBuffer malloc() {
        return new ULRenderBuffer(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULRenderBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULRenderBuffer calloc() {
        return new ULRenderBuffer(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULRenderBuffer} instance allocated with {@link BufferUtils}. */
    public static ULRenderBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULRenderBuffer(memAddress(container), container);
    }

    /** Returns a new {@code ULRenderBuffer} instance for the specified memory address. */
    public static ULRenderBuffer create(long address) {
        return new ULRenderBuffer(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULRenderBuffer createSafe(long address) {
        return address == NULL ? null : new ULRenderBuffer(address, null);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULRenderBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULRenderBuffer.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULRenderBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderBuffer malloc(MemoryStack stack) {
        return new ULRenderBuffer(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULRenderBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderBuffer calloc(MemoryStack stack) {
        return new ULRenderBuffer(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #textureID}. */
    public static int ntextureID(long struct) { return memGetInt(struct + ULRenderBuffer.TEXTUREID); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ULRenderBuffer.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ULRenderBuffer.HEIGHT); }
    /** Unsafe version of {@link #hasStencilBuffer}. */
    public static boolean nhasStencilBuffer(long struct) { return memGetByte(struct + ULRenderBuffer.HASSTENCILBUFFER) != 0; }
    /** Unsafe version of {@link #hasDepthBuffer}. */
    public static boolean nhasDepthBuffer(long struct) { return memGetByte(struct + ULRenderBuffer.HASDEPTHBUFFER) != 0; }

    /** Unsafe version of {@link #textureID(int) textureID}. */
    public static void ntextureID(long struct, int value) { memPutInt(struct + ULRenderBuffer.TEXTUREID, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ULRenderBuffer.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ULRenderBuffer.HEIGHT, value); }
    /** Unsafe version of {@link #hasStencilBuffer(boolean) hasStencilBuffer}. */
    public static void nhasStencilBuffer(long struct, boolean value) { memPutByte(struct + ULRenderBuffer.HASSTENCILBUFFER, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #hasDepthBuffer(boolean) hasDepthBuffer}. */
    public static void nhasDepthBuffer(long struct, boolean value) { memPutByte(struct + ULRenderBuffer.HASDEPTHBUFFER, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link ULRenderBuffer} structs. */
    public static class Buffer extends StructBuffer<ULRenderBuffer, Buffer> implements NativeResource {

        private static final ULRenderBuffer ELEMENT_FACTORY = ULRenderBuffer.create(-1L);

        /**
         * Creates a new {@code ULRenderBuffer.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULRenderBuffer#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULRenderBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code textureID} field. */
        @NativeType("unsigned int")
        public int textureID() { return ULRenderBuffer.ntextureID(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("unsigned int")
        public int width() { return ULRenderBuffer.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("unsigned int")
        public int height() { return ULRenderBuffer.nheight(address()); }
        /** @return the value of the {@code hasStencilBuffer} field. */
        @NativeType("bool")
        public boolean hasStencilBuffer() { return ULRenderBuffer.nhasStencilBuffer(address()); }
        /** @return the value of the {@code hasDepthBuffer} field. */
        @NativeType("bool")
        public boolean hasDepthBuffer() { return ULRenderBuffer.nhasDepthBuffer(address()); }

        /** Sets the specified value to the {@code textureID} field. */
        public ULRenderBuffer.Buffer textureID(@NativeType("unsigned int") int value) { ULRenderBuffer.ntextureID(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ULRenderBuffer.Buffer width(@NativeType("unsigned int") int value) { ULRenderBuffer.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ULRenderBuffer.Buffer height(@NativeType("unsigned int") int value) { ULRenderBuffer.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code hasStencilBuffer} field. */
        public ULRenderBuffer.Buffer hasStencilBuffer(@NativeType("bool") boolean value) { ULRenderBuffer.nhasStencilBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code hasDepthBuffer} field. */
        public ULRenderBuffer.Buffer hasDepthBuffer(@NativeType("bool") boolean value) { ULRenderBuffer.nhasDepthBuffer(address(), value); return this; }

    }

}