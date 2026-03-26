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
 * struct ULVertex_2f_4ub_2f {
 *     float pos[2];
 *     unsigned char color[4];
 *     float obj[2];
 * }</code></pre>
 */
@NativeType("struct ULVertex_2f_4ub_2f")
public class ULVertex2F4UB2F extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POS,
        COLOR,
        OBJ;

    static {
        Layout layout = __struct(
            __array(4, 2),
            __array(1, 4),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POS = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        OBJ = layout.offsetof(2);
    }

    /**
     * Creates a {@code ULVertex2F4UB2F} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULVertex2F4UB2F(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code pos} field. */
    @NativeType("float[2]")
    public FloatBuffer pos() { return npos(address()); }
    /** @return the value at the specified index of the {@code pos} field. */
    public float pos(int index) { return npos(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code color} field. */
    @NativeType("unsigned char[4]")
    public ByteBuffer color() { return ncolor(address()); }
    /** @return the value at the specified index of the {@code color} field. */
    @NativeType("unsigned char")
    public byte color(int index) { return ncolor(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code obj} field. */
    @NativeType("float[2]")
    public FloatBuffer obj() { return nobj(address()); }
    /** @return the value at the specified index of the {@code obj} field. */
    public float obj(int index) { return nobj(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code pos} field. */
    public ULVertex2F4UB2F pos(@NativeType("float[2]") FloatBuffer value) { npos(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pos} field. */
    public ULVertex2F4UB2F pos(int index, float value) { npos(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code color} field. */
    public ULVertex2F4UB2F color(@NativeType("unsigned char[4]") ByteBuffer value) { ncolor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code color} field. */
    public ULVertex2F4UB2F color(int index, @NativeType("unsigned char") byte value) { ncolor(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code obj} field. */
    public ULVertex2F4UB2F obj(@NativeType("float[2]") FloatBuffer value) { nobj(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code obj} field. */
    public ULVertex2F4UB2F obj(int index, float value) { nobj(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public ULVertex2F4UB2F set(
        FloatBuffer pos,
        ByteBuffer color,
        FloatBuffer obj
    ) {
        pos(pos);
        color(color);
        obj(obj);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULVertex2F4UB2F set(ULVertex2F4UB2F src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULVertex2F4UB2F} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULVertex2F4UB2F malloc() {
        return wrap(ULVertex2F4UB2F.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULVertex2F4UB2F} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULVertex2F4UB2F calloc() {
        return wrap(ULVertex2F4UB2F.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULVertex2F4UB2F} instance allocated with {@link BufferUtils}. */
    public static ULVertex2F4UB2F create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULVertex2F4UB2F.class, memAddress(container), container);
    }

    /** Returns a new {@code ULVertex2F4UB2F} instance for the specified memory address. */
    public static ULVertex2F4UB2F create(long address) {
        return wrap(ULVertex2F4UB2F.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULVertex2F4UB2F createSafe(long address) {
        return address == NULL ? null : wrap(ULVertex2F4UB2F.class, address);
    }

    /**
     * Returns a new {@link ULVertex2F4UB2F.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULVertex2F4UB2F.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVertex2F4UB2F.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULVertex2F4UB2F.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULVertex2F4UB2F.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULVertex2F4UB2F} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVertex2F4UB2F malloc(MemoryStack stack) {
        return wrap(ULVertex2F4UB2F.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULVertex2F4UB2F} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULVertex2F4UB2F calloc(MemoryStack stack) {
        return wrap(ULVertex2F4UB2F.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULVertex2F4UB2F.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULVertex2F4UB2F.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULVertex2F4UB2F.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pos}. */
    public static FloatBuffer npos(long struct) { return memFloatBuffer(struct + ULVertex2F4UB2F.POS, 2); }
    /** Unsafe version of {@link #pos(int) pos}. */
    public static float npos(long struct, int index) {
        return UNSAFE.getFloat(null, struct + ULVertex2F4UB2F.POS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #color}. */
    public static ByteBuffer ncolor(long struct) { return memByteBuffer(struct + ULVertex2F4UB2F.COLOR, 4); }
    /** Unsafe version of {@link #color(int) color}. */
    public static byte ncolor(long struct, int index) {
        return UNSAFE.getByte(null, struct + ULVertex2F4UB2F.COLOR + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #obj}. */
    public static FloatBuffer nobj(long struct) { return memFloatBuffer(struct + ULVertex2F4UB2F.OBJ, 2); }
    /** Unsafe version of {@link #obj(int) obj}. */
    public static float nobj(long struct, int index) {
        return UNSAFE.getFloat(null, struct + ULVertex2F4UB2F.OBJ + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #pos(FloatBuffer) pos}. */
    public static void npos(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + ULVertex2F4UB2F.POS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #pos(int, float) pos}. */
    public static void npos(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + ULVertex2F4UB2F.POS + check(index, 2) * 4, value);
    }
    /** Unsafe version of {@link #color(ByteBuffer) color}. */
    public static void ncolor(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ULVertex2F4UB2F.COLOR, value.remaining() * 1);
    }
    /** Unsafe version of {@link #color(int, byte) color}. */
    public static void ncolor(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + ULVertex2F4UB2F.COLOR + check(index, 4) * 1, value);
    }
    /** Unsafe version of {@link #obj(FloatBuffer) obj}. */
    public static void nobj(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + ULVertex2F4UB2F.OBJ, value.remaining() * 4);
    }
    /** Unsafe version of {@link #obj(int, float) obj}. */
    public static void nobj(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + ULVertex2F4UB2F.OBJ + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link ULVertex2F4UB2F} structs. */
    public static class Buffer extends StructBuffer<ULVertex2F4UB2F, Buffer> implements NativeResource {

        private static final ULVertex2F4UB2F ELEMENT_FACTORY = ULVertex2F4UB2F.create(-1L);

        /**
         * Creates a new {@code ULVertex2F4UB2F.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULVertex2F4UB2F#SIZEOF}, and its mark will be undefined.
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
        protected ULVertex2F4UB2F getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code pos} field. */
        @NativeType("float[2]")
        public FloatBuffer pos() { return ULVertex2F4UB2F.npos(address()); }
        /** @return the value at the specified index of the {@code pos} field. */
        public float pos(int index) { return ULVertex2F4UB2F.npos(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code color} field. */
        @NativeType("unsigned char[4]")
        public ByteBuffer color() { return ULVertex2F4UB2F.ncolor(address()); }
        /** @return the value at the specified index of the {@code color} field. */
        @NativeType("unsigned char")
        public byte color(int index) { return ULVertex2F4UB2F.ncolor(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code obj} field. */
        @NativeType("float[2]")
        public FloatBuffer obj() { return ULVertex2F4UB2F.nobj(address()); }
        /** @return the value at the specified index of the {@code obj} field. */
        public float obj(int index) { return ULVertex2F4UB2F.nobj(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code pos} field. */
        public ULVertex2F4UB2F.Buffer pos(@NativeType("float[2]") FloatBuffer value) { ULVertex2F4UB2F.npos(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pos} field. */
        public ULVertex2F4UB2F.Buffer pos(int index, float value) { ULVertex2F4UB2F.npos(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code color} field. */
        public ULVertex2F4UB2F.Buffer color(@NativeType("unsigned char[4]") ByteBuffer value) { ULVertex2F4UB2F.ncolor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code color} field. */
        public ULVertex2F4UB2F.Buffer color(int index, @NativeType("unsigned char") byte value) { ULVertex2F4UB2F.ncolor(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code obj} field. */
        public ULVertex2F4UB2F.Buffer obj(@NativeType("float[2]") FloatBuffer value) { ULVertex2F4UB2F.nobj(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code obj} field. */
        public ULVertex2F4UB2F.Buffer obj(int index, float value) { ULVertex2F4UB2F.nobj(address(), index, value); return this; }

    }

}