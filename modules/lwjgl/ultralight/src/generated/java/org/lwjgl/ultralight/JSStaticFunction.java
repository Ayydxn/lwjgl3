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
 * struct JSStaticFunction {
 *     char * name;
 *     {@link JSObjectCallAsFunctionCallbackI JSObjectCallAsFunctionCallback} * callAsFunction;
 *     JSPropertyAttributes * attributes;
 * }</code></pre>
 */
public class JSStaticFunction extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        CALLASFUNCTION,
        ATTRIBUTES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        CALLASFUNCTION = layout.offsetof(1);
        ATTRIBUTES = layout.offsetof(2);
    }

    /**
     * Creates a {@code JSStaticFunction} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JSStaticFunction(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsFunction} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("JSObjectCallAsFunctionCallback *")
    public PointerBuffer callAsFunction(int capacity) { return ncallAsFunction(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("JSPropertyAttributes *")
    public IntBuffer attributes(int capacity) { return nattributes(address(), capacity); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public JSStaticFunction name(@NativeType("char *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsFunction} field. */
    public JSStaticFunction callAsFunction(@NativeType("JSObjectCallAsFunctionCallback *") PointerBuffer value) { ncallAsFunction(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
    public JSStaticFunction attributes(@NativeType("JSPropertyAttributes *") IntBuffer value) { nattributes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JSStaticFunction set(
        ByteBuffer name,
        PointerBuffer callAsFunction,
        IntBuffer attributes
    ) {
        name(name);
        callAsFunction(callAsFunction);
        attributes(attributes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JSStaticFunction set(JSStaticFunction src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JSStaticFunction} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JSStaticFunction malloc() {
        return wrap(JSStaticFunction.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code JSStaticFunction} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JSStaticFunction calloc() {
        return wrap(JSStaticFunction.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code JSStaticFunction} instance allocated with {@link BufferUtils}. */
    public static JSStaticFunction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(JSStaticFunction.class, memAddress(container), container);
    }

    /** Returns a new {@code JSStaticFunction} instance for the specified memory address. */
    public static JSStaticFunction create(long address) {
        return wrap(JSStaticFunction.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JSStaticFunction createSafe(long address) {
        return address == NULL ? null : wrap(JSStaticFunction.class, address);
    }

    /**
     * Returns a new {@link JSStaticFunction.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link JSStaticFunction.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSStaticFunction.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link JSStaticFunction.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JSStaticFunction.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code JSStaticFunction} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JSStaticFunction malloc(MemoryStack stack) {
        return wrap(JSStaticFunction.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code JSStaticFunction} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JSStaticFunction calloc(MemoryStack stack) {
        return wrap(JSStaticFunction.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link JSStaticFunction.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSStaticFunction.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSStaticFunction.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + JSStaticFunction.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + JSStaticFunction.NAME)); }
    /** Unsafe version of {@link #callAsFunction(int) callAsFunction}. */
    public static PointerBuffer ncallAsFunction(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSStaticFunction.CALLASFUNCTION), capacity); }
    /** Unsafe version of {@link #attributes(int) attributes}. */
    public static IntBuffer nattributes(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + JSStaticFunction.ATTRIBUTES), capacity); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + JSStaticFunction.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #callAsFunction(PointerBuffer) callAsFunction}. */
    public static void ncallAsFunction(long struct, PointerBuffer value) { memPutAddress(struct + JSStaticFunction.CALLASFUNCTION, memAddress(value)); }
    /** Unsafe version of {@link #attributes(IntBuffer) attributes}. */
    public static void nattributes(long struct, IntBuffer value) { memPutAddress(struct + JSStaticFunction.ATTRIBUTES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + JSStaticFunction.NAME));
        check(memGetAddress(struct + JSStaticFunction.CALLASFUNCTION));
        check(memGetAddress(struct + JSStaticFunction.ATTRIBUTES));
    }

    // -----------------------------------

    /** An array of {@link JSStaticFunction} structs. */
    public static class Buffer extends StructBuffer<JSStaticFunction, Buffer> implements NativeResource {

        private static final JSStaticFunction ELEMENT_FACTORY = JSStaticFunction.create(-1L);

        /**
         * Creates a new {@code JSStaticFunction.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JSStaticFunction#SIZEOF}, and its mark will be undefined.
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
        protected JSStaticFunction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return JSStaticFunction.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return JSStaticFunction.nnameString(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsFunction} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("JSObjectCallAsFunctionCallback *")
        public PointerBuffer callAsFunction(int capacity) { return JSStaticFunction.ncallAsFunction(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("JSPropertyAttributes *")
        public IntBuffer attributes(int capacity) { return JSStaticFunction.nattributes(address(), capacity); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public JSStaticFunction.Buffer name(@NativeType("char *") ByteBuffer value) { JSStaticFunction.nname(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsFunction} field. */
        public JSStaticFunction.Buffer callAsFunction(@NativeType("JSObjectCallAsFunctionCallback *") PointerBuffer value) { JSStaticFunction.ncallAsFunction(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
        public JSStaticFunction.Buffer attributes(@NativeType("JSPropertyAttributes *") IntBuffer value) { JSStaticFunction.nattributes(address(), value); return this; }

    }

}