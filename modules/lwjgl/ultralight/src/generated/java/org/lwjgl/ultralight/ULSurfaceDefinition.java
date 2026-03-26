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
 * struct ULSurfaceDefinition {
 *     {@link ULSurfaceDefinitionCreateCallbackI ULSurfaceDefinitionCreateCallback} * create;
 *     {@link ULSurfaceDefinitionDestroyCallbackI ULSurfaceDefinitionDestroyCallback} * destroy;
 *     {@link ULSurfaceDefinitionGetWidthCallbackI ULSurfaceDefinitionGetWidthCallback} * getWidth;
 *     {@link ULSurfaceDefinitionGetHeightCallbackI ULSurfaceDefinitionGetHeightCallback} * getHeight;
 *     {@link ULSurfaceDefinitionGetRowBytesCallbackI ULSurfaceDefinitionGetRowBytesCallback} * getRowBytes;
 *     {@link ULSurfaceDefinitionGetSizeCallbackI ULSurfaceDefinitionGetSizeCallback} * getSize;
 *     {@link ULSurfaceDefinitionLockPixelsCallbackI ULSurfaceDefinitionLockPixelsCallback} * lockPixels;
 *     {@link ULSurfaceDefinitionUnlockPixelsCallbackI ULSurfaceDefinitionUnlockPixelsCallback} * unlockPixels;
 *     {@link ULSurfaceDefinitionResizeCallbackI ULSurfaceDefinitionResizeCallback} * resize;
 * }</code></pre>
 */
public class ULSurfaceDefinition extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CREATE,
        DESTROY,
        GETWIDTH,
        GETHEIGHT,
        GETROWBYTES,
        GETSIZE,
        LOCKPIXELS,
        UNLOCKPIXELS,
        RESIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CREATE = layout.offsetof(0);
        DESTROY = layout.offsetof(1);
        GETWIDTH = layout.offsetof(2);
        GETHEIGHT = layout.offsetof(3);
        GETROWBYTES = layout.offsetof(4);
        GETSIZE = layout.offsetof(5);
        LOCKPIXELS = layout.offsetof(6);
        UNLOCKPIXELS = layout.offsetof(7);
        RESIZE = layout.offsetof(8);
    }

    /**
     * Creates a {@code ULSurfaceDefinition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULSurfaceDefinition(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code create} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionCreateCallback *")
    public PointerBuffer create$(int capacity) { return ncreate$(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code destroy} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionDestroyCallback *")
    public PointerBuffer destroy(int capacity) { return ndestroy(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code getWidth} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionGetWidthCallback *")
    public PointerBuffer getWidth(int capacity) { return ngetWidth(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code getHeight} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionGetHeightCallback *")
    public PointerBuffer getHeight(int capacity) { return ngetHeight(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code getRowBytes} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionGetRowBytesCallback *")
    public PointerBuffer getRowBytes(int capacity) { return ngetRowBytes(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code getSize} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionGetSizeCallback *")
    public PointerBuffer getSize(int capacity) { return ngetSize(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code lockPixels} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionLockPixelsCallback *")
    public PointerBuffer lockPixels(int capacity) { return nlockPixels(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code unlockPixels} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionUnlockPixelsCallback *")
    public PointerBuffer unlockPixels(int capacity) { return nunlockPixels(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code resize} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ULSurfaceDefinitionResizeCallback *")
    public PointerBuffer resize(int capacity) { return nresize(address(), capacity); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code create} field. */
    public ULSurfaceDefinition create$(@NativeType("ULSurfaceDefinitionCreateCallback *") PointerBuffer value) { ncreate$(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code destroy} field. */
    public ULSurfaceDefinition destroy(@NativeType("ULSurfaceDefinitionDestroyCallback *") PointerBuffer value) { ndestroy(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getWidth} field. */
    public ULSurfaceDefinition getWidth(@NativeType("ULSurfaceDefinitionGetWidthCallback *") PointerBuffer value) { ngetWidth(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getHeight} field. */
    public ULSurfaceDefinition getHeight(@NativeType("ULSurfaceDefinitionGetHeightCallback *") PointerBuffer value) { ngetHeight(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getRowBytes} field. */
    public ULSurfaceDefinition getRowBytes(@NativeType("ULSurfaceDefinitionGetRowBytesCallback *") PointerBuffer value) { ngetRowBytes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getSize} field. */
    public ULSurfaceDefinition getSize(@NativeType("ULSurfaceDefinitionGetSizeCallback *") PointerBuffer value) { ngetSize(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code lockPixels} field. */
    public ULSurfaceDefinition lockPixels(@NativeType("ULSurfaceDefinitionLockPixelsCallback *") PointerBuffer value) { nlockPixels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code unlockPixels} field. */
    public ULSurfaceDefinition unlockPixels(@NativeType("ULSurfaceDefinitionUnlockPixelsCallback *") PointerBuffer value) { nunlockPixels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code resize} field. */
    public ULSurfaceDefinition resize(@NativeType("ULSurfaceDefinitionResizeCallback *") PointerBuffer value) { nresize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULSurfaceDefinition set(
        PointerBuffer create$,
        PointerBuffer destroy,
        PointerBuffer getWidth,
        PointerBuffer getHeight,
        PointerBuffer getRowBytes,
        PointerBuffer getSize,
        PointerBuffer lockPixels,
        PointerBuffer unlockPixels,
        PointerBuffer resize
    ) {
        create$(create$);
        destroy(destroy);
        getWidth(getWidth);
        getHeight(getHeight);
        getRowBytes(getRowBytes);
        getSize(getSize);
        lockPixels(lockPixels);
        unlockPixels(unlockPixels);
        resize(resize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULSurfaceDefinition set(ULSurfaceDefinition src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULSurfaceDefinition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULSurfaceDefinition malloc() {
        return wrap(ULSurfaceDefinition.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULSurfaceDefinition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULSurfaceDefinition calloc() {
        return wrap(ULSurfaceDefinition.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULSurfaceDefinition} instance allocated with {@link BufferUtils}. */
    public static ULSurfaceDefinition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULSurfaceDefinition.class, memAddress(container), container);
    }

    /** Returns a new {@code ULSurfaceDefinition} instance for the specified memory address. */
    public static ULSurfaceDefinition create(long address) {
        return wrap(ULSurfaceDefinition.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinition createSafe(long address) {
        return address == NULL ? null : wrap(ULSurfaceDefinition.class, address);
    }

    /**
     * Returns a new {@link ULSurfaceDefinition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULSurfaceDefinition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULSurfaceDefinition.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULSurfaceDefinition.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULSurfaceDefinition.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULSurfaceDefinition} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULSurfaceDefinition malloc(MemoryStack stack) {
        return wrap(ULSurfaceDefinition.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULSurfaceDefinition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULSurfaceDefinition calloc(MemoryStack stack) {
        return wrap(ULSurfaceDefinition.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULSurfaceDefinition.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULSurfaceDefinition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULSurfaceDefinition.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #create$(int) create$}. */
    public static PointerBuffer ncreate$(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.CREATE), capacity); }
    /** Unsafe version of {@link #destroy(int) destroy}. */
    public static PointerBuffer ndestroy(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.DESTROY), capacity); }
    /** Unsafe version of {@link #getWidth(int) getWidth}. */
    public static PointerBuffer ngetWidth(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.GETWIDTH), capacity); }
    /** Unsafe version of {@link #getHeight(int) getHeight}. */
    public static PointerBuffer ngetHeight(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.GETHEIGHT), capacity); }
    /** Unsafe version of {@link #getRowBytes(int) getRowBytes}. */
    public static PointerBuffer ngetRowBytes(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.GETROWBYTES), capacity); }
    /** Unsafe version of {@link #getSize(int) getSize}. */
    public static PointerBuffer ngetSize(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.GETSIZE), capacity); }
    /** Unsafe version of {@link #lockPixels(int) lockPixels}. */
    public static PointerBuffer nlockPixels(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.LOCKPIXELS), capacity); }
    /** Unsafe version of {@link #unlockPixels(int) unlockPixels}. */
    public static PointerBuffer nunlockPixels(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.UNLOCKPIXELS), capacity); }
    /** Unsafe version of {@link #resize(int) resize}. */
    public static PointerBuffer nresize(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ULSurfaceDefinition.RESIZE), capacity); }

    /** Unsafe version of {@link #create$(PointerBuffer) create$}. */
    public static void ncreate$(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.CREATE, memAddress(value)); }
    /** Unsafe version of {@link #destroy(PointerBuffer) destroy}. */
    public static void ndestroy(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.DESTROY, memAddress(value)); }
    /** Unsafe version of {@link #getWidth(PointerBuffer) getWidth}. */
    public static void ngetWidth(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.GETWIDTH, memAddress(value)); }
    /** Unsafe version of {@link #getHeight(PointerBuffer) getHeight}. */
    public static void ngetHeight(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.GETHEIGHT, memAddress(value)); }
    /** Unsafe version of {@link #getRowBytes(PointerBuffer) getRowBytes}. */
    public static void ngetRowBytes(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.GETROWBYTES, memAddress(value)); }
    /** Unsafe version of {@link #getSize(PointerBuffer) getSize}. */
    public static void ngetSize(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.GETSIZE, memAddress(value)); }
    /** Unsafe version of {@link #lockPixels(PointerBuffer) lockPixels}. */
    public static void nlockPixels(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.LOCKPIXELS, memAddress(value)); }
    /** Unsafe version of {@link #unlockPixels(PointerBuffer) unlockPixels}. */
    public static void nunlockPixels(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.UNLOCKPIXELS, memAddress(value)); }
    /** Unsafe version of {@link #resize(PointerBuffer) resize}. */
    public static void nresize(long struct, PointerBuffer value) { memPutAddress(struct + ULSurfaceDefinition.RESIZE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULSurfaceDefinition.CREATE));
        check(memGetAddress(struct + ULSurfaceDefinition.DESTROY));
        check(memGetAddress(struct + ULSurfaceDefinition.GETWIDTH));
        check(memGetAddress(struct + ULSurfaceDefinition.GETHEIGHT));
        check(memGetAddress(struct + ULSurfaceDefinition.GETROWBYTES));
        check(memGetAddress(struct + ULSurfaceDefinition.GETSIZE));
        check(memGetAddress(struct + ULSurfaceDefinition.LOCKPIXELS));
        check(memGetAddress(struct + ULSurfaceDefinition.UNLOCKPIXELS));
        check(memGetAddress(struct + ULSurfaceDefinition.RESIZE));
    }

    // -----------------------------------

    /** An array of {@link ULSurfaceDefinition} structs. */
    public static class Buffer extends StructBuffer<ULSurfaceDefinition, Buffer> implements NativeResource {

        private static final ULSurfaceDefinition ELEMENT_FACTORY = ULSurfaceDefinition.create(-1L);

        /**
         * Creates a new {@code ULSurfaceDefinition.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULSurfaceDefinition#SIZEOF}, and its mark will be undefined.
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
        protected ULSurfaceDefinition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code create} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionCreateCallback *")
        public PointerBuffer create$(int capacity) { return ULSurfaceDefinition.ncreate$(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code destroy} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionDestroyCallback *")
        public PointerBuffer destroy(int capacity) { return ULSurfaceDefinition.ndestroy(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code getWidth} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionGetWidthCallback *")
        public PointerBuffer getWidth(int capacity) { return ULSurfaceDefinition.ngetWidth(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code getHeight} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionGetHeightCallback *")
        public PointerBuffer getHeight(int capacity) { return ULSurfaceDefinition.ngetHeight(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code getRowBytes} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionGetRowBytesCallback *")
        public PointerBuffer getRowBytes(int capacity) { return ULSurfaceDefinition.ngetRowBytes(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code getSize} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionGetSizeCallback *")
        public PointerBuffer getSize(int capacity) { return ULSurfaceDefinition.ngetSize(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code lockPixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionLockPixelsCallback *")
        public PointerBuffer lockPixels(int capacity) { return ULSurfaceDefinition.nlockPixels(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code unlockPixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionUnlockPixelsCallback *")
        public PointerBuffer unlockPixels(int capacity) { return ULSurfaceDefinition.nunlockPixels(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code resize} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ULSurfaceDefinitionResizeCallback *")
        public PointerBuffer resize(int capacity) { return ULSurfaceDefinition.nresize(address(), capacity); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code create} field. */
        public ULSurfaceDefinition.Buffer create$(@NativeType("ULSurfaceDefinitionCreateCallback *") PointerBuffer value) { ULSurfaceDefinition.ncreate$(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code destroy} field. */
        public ULSurfaceDefinition.Buffer destroy(@NativeType("ULSurfaceDefinitionDestroyCallback *") PointerBuffer value) { ULSurfaceDefinition.ndestroy(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getWidth} field. */
        public ULSurfaceDefinition.Buffer getWidth(@NativeType("ULSurfaceDefinitionGetWidthCallback *") PointerBuffer value) { ULSurfaceDefinition.ngetWidth(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getHeight} field. */
        public ULSurfaceDefinition.Buffer getHeight(@NativeType("ULSurfaceDefinitionGetHeightCallback *") PointerBuffer value) { ULSurfaceDefinition.ngetHeight(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getRowBytes} field. */
        public ULSurfaceDefinition.Buffer getRowBytes(@NativeType("ULSurfaceDefinitionGetRowBytesCallback *") PointerBuffer value) { ULSurfaceDefinition.ngetRowBytes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getSize} field. */
        public ULSurfaceDefinition.Buffer getSize(@NativeType("ULSurfaceDefinitionGetSizeCallback *") PointerBuffer value) { ULSurfaceDefinition.ngetSize(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code lockPixels} field. */
        public ULSurfaceDefinition.Buffer lockPixels(@NativeType("ULSurfaceDefinitionLockPixelsCallback *") PointerBuffer value) { ULSurfaceDefinition.nlockPixels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code unlockPixels} field. */
        public ULSurfaceDefinition.Buffer unlockPixels(@NativeType("ULSurfaceDefinitionUnlockPixelsCallback *") PointerBuffer value) { ULSurfaceDefinition.nunlockPixels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code resize} field. */
        public ULSurfaceDefinition.Buffer resize(@NativeType("ULSurfaceDefinitionResizeCallback *") PointerBuffer value) { ULSurfaceDefinition.nresize(address(), value); return this; }

    }

}