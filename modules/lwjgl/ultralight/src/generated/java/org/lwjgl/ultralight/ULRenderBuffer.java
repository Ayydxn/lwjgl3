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
 * struct ULRenderBuffer {
 *     unsigned int {@link #textureID};
 *     unsigned int {@link #width};
 *     unsigned int {@link #height};
 *     bool {@link #hasStencilBuffer};
 *     bool {@link #hasDepthBuffer};
 * }</code></pre>
 */
public class ULRenderBuffer extends Struct implements NativeResource {

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

    /** The backing texture for this RenderBuffer. */
    @NativeType("unsigned int")
    public int textureID() { return ntextureID(address()); }
    /** The width of the RenderBuffer texture. */
    @NativeType("unsigned int")
    public int width() { return nwidth(address()); }
    /** The height of the RenderBuffer texture. */
    @NativeType("unsigned int")
    public int height() { return nheight(address()); }
    /** Currently unused, always false. */
    @NativeType("bool")
    public boolean hasStencilBuffer() { return nhasStencilBuffer(address()); }
    /** Currently unsued, always false. */
    @NativeType("bool")
    public boolean hasDepthBuffer() { return nhasDepthBuffer(address()); }

    /** Sets the specified value to the {@link #textureID} field. */
    public ULRenderBuffer textureID(@NativeType("unsigned int") int value) { ntextureID(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public ULRenderBuffer width(@NativeType("unsigned int") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public ULRenderBuffer height(@NativeType("unsigned int") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #hasStencilBuffer} field. */
    public ULRenderBuffer hasStencilBuffer(@NativeType("bool") boolean value) { nhasStencilBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #hasDepthBuffer} field. */
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
        return wrap(ULRenderBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULRenderBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULRenderBuffer calloc() {
        return wrap(ULRenderBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULRenderBuffer} instance allocated with {@link BufferUtils}. */
    public static ULRenderBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULRenderBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code ULRenderBuffer} instance for the specified memory address. */
    public static ULRenderBuffer create(long address) {
        return wrap(ULRenderBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULRenderBuffer createSafe(long address) {
        return address == NULL ? null : wrap(ULRenderBuffer.class, address);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULRenderBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULRenderBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULRenderBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderBuffer malloc(MemoryStack stack) {
        return wrap(ULRenderBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULRenderBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderBuffer calloc(MemoryStack stack) {
        return wrap(ULRenderBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #textureID}. */
    public static int ntextureID(long struct) { return UNSAFE.getInt(null, struct + ULRenderBuffer.TEXTUREID); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + ULRenderBuffer.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + ULRenderBuffer.HEIGHT); }
    /** Unsafe version of {@link #hasStencilBuffer}. */
    public static boolean nhasStencilBuffer(long struct) { return UNSAFE.getByte(null, struct + ULRenderBuffer.HASSTENCILBUFFER) != 0; }
    /** Unsafe version of {@link #hasDepthBuffer}. */
    public static boolean nhasDepthBuffer(long struct) { return UNSAFE.getByte(null, struct + ULRenderBuffer.HASDEPTHBUFFER) != 0; }

    /** Unsafe version of {@link #textureID(int) textureID}. */
    public static void ntextureID(long struct, int value) { UNSAFE.putInt(null, struct + ULRenderBuffer.TEXTUREID, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + ULRenderBuffer.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + ULRenderBuffer.HEIGHT, value); }
    /** Unsafe version of {@link #hasStencilBuffer(boolean) hasStencilBuffer}. */
    public static void nhasStencilBuffer(long struct, boolean value) { UNSAFE.putByte(null, struct + ULRenderBuffer.HASSTENCILBUFFER, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #hasDepthBuffer(boolean) hasDepthBuffer}. */
    public static void nhasDepthBuffer(long struct, boolean value) { UNSAFE.putByte(null, struct + ULRenderBuffer.HASDEPTHBUFFER, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link ULRenderBuffer} structs. */
    public static class Buffer extends StructBuffer<ULRenderBuffer, Buffer> implements NativeResource {

        private static final ULRenderBuffer ELEMENT_FACTORY = ULRenderBuffer.create(-1L);

        /**
         * Creates a new {@code ULRenderBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULRenderBuffer#SIZEOF}, and its mark will be undefined.
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
        protected ULRenderBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ULRenderBuffer#textureID} field. */
        @NativeType("unsigned int")
        public int textureID() { return ULRenderBuffer.ntextureID(address()); }
        /** @return the value of the {@link ULRenderBuffer#width} field. */
        @NativeType("unsigned int")
        public int width() { return ULRenderBuffer.nwidth(address()); }
        /** @return the value of the {@link ULRenderBuffer#height} field. */
        @NativeType("unsigned int")
        public int height() { return ULRenderBuffer.nheight(address()); }
        /** @return the value of the {@link ULRenderBuffer#hasStencilBuffer} field. */
        @NativeType("bool")
        public boolean hasStencilBuffer() { return ULRenderBuffer.nhasStencilBuffer(address()); }
        /** @return the value of the {@link ULRenderBuffer#hasDepthBuffer} field. */
        @NativeType("bool")
        public boolean hasDepthBuffer() { return ULRenderBuffer.nhasDepthBuffer(address()); }

        /** Sets the specified value to the {@link ULRenderBuffer#textureID} field. */
        public ULRenderBuffer.Buffer textureID(@NativeType("unsigned int") int value) { ULRenderBuffer.ntextureID(address(), value); return this; }
        /** Sets the specified value to the {@link ULRenderBuffer#width} field. */
        public ULRenderBuffer.Buffer width(@NativeType("unsigned int") int value) { ULRenderBuffer.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link ULRenderBuffer#height} field. */
        public ULRenderBuffer.Buffer height(@NativeType("unsigned int") int value) { ULRenderBuffer.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link ULRenderBuffer#hasStencilBuffer} field. */
        public ULRenderBuffer.Buffer hasStencilBuffer(@NativeType("bool") boolean value) { ULRenderBuffer.nhasStencilBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link ULRenderBuffer#hasDepthBuffer} field. */
        public ULRenderBuffer.Buffer hasDepthBuffer(@NativeType("bool") boolean value) { ULRenderBuffer.nhasDepthBuffer(address(), value); return this; }

    }

}