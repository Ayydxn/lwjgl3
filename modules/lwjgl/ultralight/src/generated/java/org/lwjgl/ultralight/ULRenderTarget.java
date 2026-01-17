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
 * <pre><code>
 * struct ULRenderTarget {
 *     bool isEmpty;
 *     unsigned int width;
 *     unsigned int height;
 *     unsigned int textureID;
 *     unsigned int textureWidth;
 *     unsigned int textureHeight;
 *     ULBitmapFormat textureFormat;
 *     {@link ULRect ULRect} * pUVCoords;
 *     unsigned int renderBufferID;
 * }</code></pre>
 */
public class ULRenderTarget extends Struct<ULRenderTarget> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISEMPTY,
        WIDTH,
        HEIGHT,
        TEXTUREID,
        TEXTUREWIDTH,
        TEXTUREHEIGHT,
        TEXTUREFORMAT,
        PUVCOORDS,
        RENDERBUFFERID;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISEMPTY = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        TEXTUREID = layout.offsetof(3);
        TEXTUREWIDTH = layout.offsetof(4);
        TEXTUREHEIGHT = layout.offsetof(5);
        TEXTUREFORMAT = layout.offsetof(6);
        PUVCOORDS = layout.offsetof(7);
        RENDERBUFFERID = layout.offsetof(8);
    }

    protected ULRenderTarget(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULRenderTarget create(long address, @Nullable ByteBuffer container) {
        return new ULRenderTarget(address, container);
    }

    /**
     * Creates a {@code ULRenderTarget} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULRenderTarget(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code isEmpty} field. */
    @NativeType("bool")
    public boolean isEmpty() { return nisEmpty(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("unsigned int")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("unsigned int")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code textureID} field. */
    @NativeType("unsigned int")
    public int textureID() { return ntextureID(address()); }
    /** @return the value of the {@code textureWidth} field. */
    @NativeType("unsigned int")
    public int textureWidth() { return ntextureWidth(address()); }
    /** @return the value of the {@code textureHeight} field. */
    @NativeType("unsigned int")
    public int textureHeight() { return ntextureHeight(address()); }
    /** @return the value of the {@code textureFormat} field. */
    @NativeType("ULBitmapFormat")
    public int textureFormat() { return ntextureFormat(address()); }
    /** @return a {@link ULRect} view of the struct pointed to by the {@code pUVCoords} field. */
    @NativeType("ULRect *")
    public ULRect pUVCoords() { return npUVCoords(address()); }
    /** @return the value of the {@code renderBufferID} field. */
    @NativeType("unsigned int")
    public int renderBufferID() { return nrenderBufferID(address()); }

    /** Sets the specified value to the {@code isEmpty} field. */
    public ULRenderTarget isEmpty(@NativeType("bool") boolean value) { nisEmpty(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ULRenderTarget width(@NativeType("unsigned int") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ULRenderTarget height(@NativeType("unsigned int") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code textureID} field. */
    public ULRenderTarget textureID(@NativeType("unsigned int") int value) { ntextureID(address(), value); return this; }
    /** Sets the specified value to the {@code textureWidth} field. */
    public ULRenderTarget textureWidth(@NativeType("unsigned int") int value) { ntextureWidth(address(), value); return this; }
    /** Sets the specified value to the {@code textureHeight} field. */
    public ULRenderTarget textureHeight(@NativeType("unsigned int") int value) { ntextureHeight(address(), value); return this; }
    /** Sets the specified value to the {@code textureFormat} field. */
    public ULRenderTarget textureFormat(@NativeType("ULBitmapFormat") int value) { ntextureFormat(address(), value); return this; }
    /** Sets the address of the specified {@link ULRect} to the {@code pUVCoords} field. */
    public ULRenderTarget pUVCoords(@NativeType("ULRect *") ULRect value) { npUVCoords(address(), value); return this; }
    /** Sets the specified value to the {@code renderBufferID} field. */
    public ULRenderTarget renderBufferID(@NativeType("unsigned int") int value) { nrenderBufferID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULRenderTarget set(
        boolean isEmpty,
        int width,
        int height,
        int textureID,
        int textureWidth,
        int textureHeight,
        int textureFormat,
        ULRect pUVCoords,
        int renderBufferID
    ) {
        isEmpty(isEmpty);
        width(width);
        height(height);
        textureID(textureID);
        textureWidth(textureWidth);
        textureHeight(textureHeight);
        textureFormat(textureFormat);
        pUVCoords(pUVCoords);
        renderBufferID(renderBufferID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULRenderTarget set(ULRenderTarget src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULRenderTarget} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULRenderTarget malloc() {
        return new ULRenderTarget(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULRenderTarget} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULRenderTarget calloc() {
        return new ULRenderTarget(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULRenderTarget} instance allocated with {@link BufferUtils}. */
    public static ULRenderTarget create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULRenderTarget(memAddress(container), container);
    }

    /** Returns a new {@code ULRenderTarget} instance for the specified memory address. */
    public static ULRenderTarget create(long address) {
        return new ULRenderTarget(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULRenderTarget createSafe(long address) {
        return address == NULL ? null : new ULRenderTarget(address, null);
    }

    /**
     * Returns a new {@link ULRenderTarget.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULRenderTarget.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderTarget.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULRenderTarget.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULRenderTarget.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULRenderTarget} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderTarget malloc(MemoryStack stack) {
        return new ULRenderTarget(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULRenderTarget} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULRenderTarget calloc(MemoryStack stack) {
        return new ULRenderTarget(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULRenderTarget.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULRenderTarget.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULRenderTarget.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #isEmpty}. */
    public static boolean nisEmpty(long struct) { return memGetByte(struct + ULRenderTarget.ISEMPTY) != 0; }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ULRenderTarget.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ULRenderTarget.HEIGHT); }
    /** Unsafe version of {@link #textureID}. */
    public static int ntextureID(long struct) { return memGetInt(struct + ULRenderTarget.TEXTUREID); }
    /** Unsafe version of {@link #textureWidth}. */
    public static int ntextureWidth(long struct) { return memGetInt(struct + ULRenderTarget.TEXTUREWIDTH); }
    /** Unsafe version of {@link #textureHeight}. */
    public static int ntextureHeight(long struct) { return memGetInt(struct + ULRenderTarget.TEXTUREHEIGHT); }
    /** Unsafe version of {@link #textureFormat}. */
    public static int ntextureFormat(long struct) { return memGetInt(struct + ULRenderTarget.TEXTUREFORMAT); }
    /** Unsafe version of {@link #pUVCoords}. */
    public static ULRect npUVCoords(long struct) { return ULRect.create(memGetAddress(struct + ULRenderTarget.PUVCOORDS)); }
    /** Unsafe version of {@link #renderBufferID}. */
    public static int nrenderBufferID(long struct) { return memGetInt(struct + ULRenderTarget.RENDERBUFFERID); }

    /** Unsafe version of {@link #isEmpty(boolean) isEmpty}. */
    public static void nisEmpty(long struct, boolean value) { memPutByte(struct + ULRenderTarget.ISEMPTY, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ULRenderTarget.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ULRenderTarget.HEIGHT, value); }
    /** Unsafe version of {@link #textureID(int) textureID}. */
    public static void ntextureID(long struct, int value) { memPutInt(struct + ULRenderTarget.TEXTUREID, value); }
    /** Unsafe version of {@link #textureWidth(int) textureWidth}. */
    public static void ntextureWidth(long struct, int value) { memPutInt(struct + ULRenderTarget.TEXTUREWIDTH, value); }
    /** Unsafe version of {@link #textureHeight(int) textureHeight}. */
    public static void ntextureHeight(long struct, int value) { memPutInt(struct + ULRenderTarget.TEXTUREHEIGHT, value); }
    /** Unsafe version of {@link #textureFormat(int) textureFormat}. */
    public static void ntextureFormat(long struct, int value) { memPutInt(struct + ULRenderTarget.TEXTUREFORMAT, value); }
    /** Unsafe version of {@link #pUVCoords(ULRect) pUVCoords}. */
    public static void npUVCoords(long struct, ULRect value) { memPutAddress(struct + ULRenderTarget.PUVCOORDS, value.address()); }
    /** Unsafe version of {@link #renderBufferID(int) renderBufferID}. */
    public static void nrenderBufferID(long struct, int value) { memPutInt(struct + ULRenderTarget.RENDERBUFFERID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULRenderTarget.PUVCOORDS));
    }

    // -----------------------------------

    /** An array of {@link ULRenderTarget} structs. */
    public static class Buffer extends StructBuffer<ULRenderTarget, Buffer> implements NativeResource {

        private static final ULRenderTarget ELEMENT_FACTORY = ULRenderTarget.create(-1L);

        /**
         * Creates a new {@code ULRenderTarget.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULRenderTarget#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULRenderTarget getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code isEmpty} field. */
        @NativeType("bool")
        public boolean isEmpty() { return ULRenderTarget.nisEmpty(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("unsigned int")
        public int width() { return ULRenderTarget.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("unsigned int")
        public int height() { return ULRenderTarget.nheight(address()); }
        /** @return the value of the {@code textureID} field. */
        @NativeType("unsigned int")
        public int textureID() { return ULRenderTarget.ntextureID(address()); }
        /** @return the value of the {@code textureWidth} field. */
        @NativeType("unsigned int")
        public int textureWidth() { return ULRenderTarget.ntextureWidth(address()); }
        /** @return the value of the {@code textureHeight} field. */
        @NativeType("unsigned int")
        public int textureHeight() { return ULRenderTarget.ntextureHeight(address()); }
        /** @return the value of the {@code textureFormat} field. */
        @NativeType("ULBitmapFormat")
        public int textureFormat() { return ULRenderTarget.ntextureFormat(address()); }
        /** @return a {@link ULRect} view of the struct pointed to by the {@code pUVCoords} field. */
        @NativeType("ULRect *")
        public ULRect pUVCoords() { return ULRenderTarget.npUVCoords(address()); }
        /** @return the value of the {@code renderBufferID} field. */
        @NativeType("unsigned int")
        public int renderBufferID() { return ULRenderTarget.nrenderBufferID(address()); }

        /** Sets the specified value to the {@code isEmpty} field. */
        public ULRenderTarget.Buffer isEmpty(@NativeType("bool") boolean value) { ULRenderTarget.nisEmpty(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ULRenderTarget.Buffer width(@NativeType("unsigned int") int value) { ULRenderTarget.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ULRenderTarget.Buffer height(@NativeType("unsigned int") int value) { ULRenderTarget.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code textureID} field. */
        public ULRenderTarget.Buffer textureID(@NativeType("unsigned int") int value) { ULRenderTarget.ntextureID(address(), value); return this; }
        /** Sets the specified value to the {@code textureWidth} field. */
        public ULRenderTarget.Buffer textureWidth(@NativeType("unsigned int") int value) { ULRenderTarget.ntextureWidth(address(), value); return this; }
        /** Sets the specified value to the {@code textureHeight} field. */
        public ULRenderTarget.Buffer textureHeight(@NativeType("unsigned int") int value) { ULRenderTarget.ntextureHeight(address(), value); return this; }
        /** Sets the specified value to the {@code textureFormat} field. */
        public ULRenderTarget.Buffer textureFormat(@NativeType("ULBitmapFormat") int value) { ULRenderTarget.ntextureFormat(address(), value); return this; }
        /** Sets the address of the specified {@link ULRect} to the {@code pUVCoords} field. */
        public ULRenderTarget.Buffer pUVCoords(@NativeType("ULRect *") ULRect value) { ULRenderTarget.npUVCoords(address(), value); return this; }
        /** Sets the specified value to the {@code renderBufferID} field. */
        public ULRenderTarget.Buffer renderBufferID(@NativeType("unsigned int") int value) { ULRenderTarget.nrenderBufferID(address(), value); return this; }

    }

}