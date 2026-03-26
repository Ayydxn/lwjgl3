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
 * struct JSStaticValue {
 *     char * name;
 *     {@link JSObjectGetPropertyCallbackI JSObjectGetPropertyCallback} * getProperty;
 *     {@link JSObjectSetPropertyCallbackI JSObjectSetPropertyCallback} * setProperty;
 *     JSPropertyAttributes * attributes;
 * }</code></pre>
 */
public class JSStaticValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        GETPROPERTY,
        SETPROPERTY,
        ATTRIBUTES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        GETPROPERTY = layout.offsetof(1);
        SETPROPERTY = layout.offsetof(2);
        ATTRIBUTES = layout.offsetof(3);
    }

    /**
     * Creates a {@code JSStaticValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JSStaticValue(ByteBuffer container) {
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
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code getProperty} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("JSObjectGetPropertyCallback *")
    public PointerBuffer getProperty(int capacity) { return ngetProperty(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code setProperty} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("JSObjectSetPropertyCallback *")
    public PointerBuffer setProperty(int capacity) { return nsetProperty(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("JSPropertyAttributes *")
    public IntBuffer attributes(int capacity) { return nattributes(address(), capacity); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public JSStaticValue name(@NativeType("char *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getProperty} field. */
    public JSStaticValue getProperty(@NativeType("JSObjectGetPropertyCallback *") PointerBuffer value) { ngetProperty(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code setProperty} field. */
    public JSStaticValue setProperty(@NativeType("JSObjectSetPropertyCallback *") PointerBuffer value) { nsetProperty(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
    public JSStaticValue attributes(@NativeType("JSPropertyAttributes *") IntBuffer value) { nattributes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JSStaticValue set(
        ByteBuffer name,
        PointerBuffer getProperty,
        PointerBuffer setProperty,
        IntBuffer attributes
    ) {
        name(name);
        getProperty(getProperty);
        setProperty(setProperty);
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
    public JSStaticValue set(JSStaticValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JSStaticValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JSStaticValue malloc() {
        return wrap(JSStaticValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code JSStaticValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JSStaticValue calloc() {
        return wrap(JSStaticValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code JSStaticValue} instance allocated with {@link BufferUtils}. */
    public static JSStaticValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(JSStaticValue.class, memAddress(container), container);
    }

    /** Returns a new {@code JSStaticValue} instance for the specified memory address. */
    public static JSStaticValue create(long address) {
        return wrap(JSStaticValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JSStaticValue createSafe(long address) {
        return address == NULL ? null : wrap(JSStaticValue.class, address);
    }

    /**
     * Returns a new {@link JSStaticValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link JSStaticValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSStaticValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link JSStaticValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JSStaticValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code JSStaticValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JSStaticValue malloc(MemoryStack stack) {
        return wrap(JSStaticValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code JSStaticValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JSStaticValue calloc(MemoryStack stack) {
        return wrap(JSStaticValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link JSStaticValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSStaticValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSStaticValue.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + JSStaticValue.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + JSStaticValue.NAME)); }
    /** Unsafe version of {@link #getProperty(int) getProperty}. */
    public static PointerBuffer ngetProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSStaticValue.GETPROPERTY), capacity); }
    /** Unsafe version of {@link #setProperty(int) setProperty}. */
    public static PointerBuffer nsetProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSStaticValue.SETPROPERTY), capacity); }
    /** Unsafe version of {@link #attributes(int) attributes}. */
    public static IntBuffer nattributes(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + JSStaticValue.ATTRIBUTES), capacity); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + JSStaticValue.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #getProperty(PointerBuffer) getProperty}. */
    public static void ngetProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSStaticValue.GETPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #setProperty(PointerBuffer) setProperty}. */
    public static void nsetProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSStaticValue.SETPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #attributes(IntBuffer) attributes}. */
    public static void nattributes(long struct, IntBuffer value) { memPutAddress(struct + JSStaticValue.ATTRIBUTES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + JSStaticValue.NAME));
        check(memGetAddress(struct + JSStaticValue.GETPROPERTY));
        check(memGetAddress(struct + JSStaticValue.SETPROPERTY));
        check(memGetAddress(struct + JSStaticValue.ATTRIBUTES));
    }

    // -----------------------------------

    /** An array of {@link JSStaticValue} structs. */
    public static class Buffer extends StructBuffer<JSStaticValue, Buffer> implements NativeResource {

        private static final JSStaticValue ELEMENT_FACTORY = JSStaticValue.create(-1L);

        /**
         * Creates a new {@code JSStaticValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JSStaticValue#SIZEOF}, and its mark will be undefined.
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
        protected JSStaticValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return JSStaticValue.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return JSStaticValue.nnameString(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code getProperty} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("JSObjectGetPropertyCallback *")
        public PointerBuffer getProperty(int capacity) { return JSStaticValue.ngetProperty(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code setProperty} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("JSObjectSetPropertyCallback *")
        public PointerBuffer setProperty(int capacity) { return JSStaticValue.nsetProperty(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("JSPropertyAttributes *")
        public IntBuffer attributes(int capacity) { return JSStaticValue.nattributes(address(), capacity); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public JSStaticValue.Buffer name(@NativeType("char *") ByteBuffer value) { JSStaticValue.nname(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getProperty} field. */
        public JSStaticValue.Buffer getProperty(@NativeType("JSObjectGetPropertyCallback *") PointerBuffer value) { JSStaticValue.ngetProperty(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code setProperty} field. */
        public JSStaticValue.Buffer setProperty(@NativeType("JSObjectSetPropertyCallback *") PointerBuffer value) { JSStaticValue.nsetProperty(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
        public JSStaticValue.Buffer attributes(@NativeType("JSPropertyAttributes *") IntBuffer value) { JSStaticValue.nattributes(address(), value); return this; }

    }

}