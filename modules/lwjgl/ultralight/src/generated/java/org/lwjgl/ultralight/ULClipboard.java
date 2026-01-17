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
 * struct ULClipboard {
 *     {@link ULClipboardClearCallbackI ULClipboardClearCallback} clear;
 *     {@link ULClipboardReadPlainTextCallbackI ULClipboardReadPlainTextCallback} readPlainText;
 *     {@link ULClipboardWritePlainTextCallbackI ULClipboardWritePlainTextCallback} writePlainText;
 * }</code></pre>
 */
public class ULClipboard extends Struct<ULClipboard> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLEAR,
        READPLAINTEXT,
        WRITEPLAINTEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLEAR = layout.offsetof(0);
        READPLAINTEXT = layout.offsetof(1);
        WRITEPLAINTEXT = layout.offsetof(2);
    }

    protected ULClipboard(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULClipboard create(long address, @Nullable ByteBuffer container) {
        return new ULClipboard(address, container);
    }

    /**
     * Creates a {@code ULClipboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULClipboard(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clear} field. */
    public ULClipboardClearCallback clear$() { return nclear$(address()); }
    /** @return the value of the {@code readPlainText} field. */
    public ULClipboardReadPlainTextCallback readPlainText() { return nreadPlainText(address()); }
    /** @return the value of the {@code writePlainText} field. */
    public ULClipboardWritePlainTextCallback writePlainText() { return nwritePlainText(address()); }

    /** Sets the specified value to the {@code clear} field. */
    public ULClipboard clear$(@NativeType("ULClipboardClearCallback") ULClipboardClearCallbackI value) { nclear$(address(), value); return this; }
    /** Sets the specified value to the {@code readPlainText} field. */
    public ULClipboard readPlainText(@NativeType("ULClipboardReadPlainTextCallback") ULClipboardReadPlainTextCallbackI value) { nreadPlainText(address(), value); return this; }
    /** Sets the specified value to the {@code writePlainText} field. */
    public ULClipboard writePlainText(@NativeType("ULClipboardWritePlainTextCallback") ULClipboardWritePlainTextCallbackI value) { nwritePlainText(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULClipboard set(
        ULClipboardClearCallbackI clear$,
        ULClipboardReadPlainTextCallbackI readPlainText,
        ULClipboardWritePlainTextCallbackI writePlainText
    ) {
        clear$(clear$);
        readPlainText(readPlainText);
        writePlainText(writePlainText);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULClipboard set(ULClipboard src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULClipboard} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULClipboard malloc() {
        return new ULClipboard(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULClipboard} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULClipboard calloc() {
        return new ULClipboard(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULClipboard} instance allocated with {@link BufferUtils}. */
    public static ULClipboard create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULClipboard(memAddress(container), container);
    }

    /** Returns a new {@code ULClipboard} instance for the specified memory address. */
    public static ULClipboard create(long address) {
        return new ULClipboard(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULClipboard createSafe(long address) {
        return address == NULL ? null : new ULClipboard(address, null);
    }

    /**
     * Returns a new {@link ULClipboard.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULClipboard.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULClipboard.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULClipboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULClipboard.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULClipboard} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULClipboard malloc(MemoryStack stack) {
        return new ULClipboard(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULClipboard} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULClipboard calloc(MemoryStack stack) {
        return new ULClipboard(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULClipboard.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULClipboard.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULClipboard.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clear$}. */
    public static ULClipboardClearCallback nclear$(long struct) { return ULClipboardClearCallback.create(memGetAddress(struct + ULClipboard.CLEAR)); }
    /** Unsafe version of {@link #readPlainText}. */
    public static ULClipboardReadPlainTextCallback nreadPlainText(long struct) { return ULClipboardReadPlainTextCallback.create(memGetAddress(struct + ULClipboard.READPLAINTEXT)); }
    /** Unsafe version of {@link #writePlainText}. */
    public static ULClipboardWritePlainTextCallback nwritePlainText(long struct) { return ULClipboardWritePlainTextCallback.create(memGetAddress(struct + ULClipboard.WRITEPLAINTEXT)); }

    /** Unsafe version of {@link #clear$(ULClipboardClearCallbackI) clear$}. */
    public static void nclear$(long struct, ULClipboardClearCallbackI value) { memPutAddress(struct + ULClipboard.CLEAR, value.address()); }
    /** Unsafe version of {@link #readPlainText(ULClipboardReadPlainTextCallbackI) readPlainText}. */
    public static void nreadPlainText(long struct, ULClipboardReadPlainTextCallbackI value) { memPutAddress(struct + ULClipboard.READPLAINTEXT, value.address()); }
    /** Unsafe version of {@link #writePlainText(ULClipboardWritePlainTextCallbackI) writePlainText}. */
    public static void nwritePlainText(long struct, ULClipboardWritePlainTextCallbackI value) { memPutAddress(struct + ULClipboard.WRITEPLAINTEXT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULClipboard.CLEAR));
        check(memGetAddress(struct + ULClipboard.READPLAINTEXT));
        check(memGetAddress(struct + ULClipboard.WRITEPLAINTEXT));
    }

    // -----------------------------------

    /** An array of {@link ULClipboard} structs. */
    public static class Buffer extends StructBuffer<ULClipboard, Buffer> implements NativeResource {

        private static final ULClipboard ELEMENT_FACTORY = ULClipboard.create(-1L);

        /**
         * Creates a new {@code ULClipboard.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULClipboard#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULClipboard getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clear} field. */
        public ULClipboardClearCallback clear$() { return ULClipboard.nclear$(address()); }
        /** @return the value of the {@code readPlainText} field. */
        public ULClipboardReadPlainTextCallback readPlainText() { return ULClipboard.nreadPlainText(address()); }
        /** @return the value of the {@code writePlainText} field. */
        public ULClipboardWritePlainTextCallback writePlainText() { return ULClipboard.nwritePlainText(address()); }

        /** Sets the specified value to the {@code clear} field. */
        public ULClipboard.Buffer clear$(@NativeType("ULClipboardClearCallback") ULClipboardClearCallbackI value) { ULClipboard.nclear$(address(), value); return this; }
        /** Sets the specified value to the {@code readPlainText} field. */
        public ULClipboard.Buffer readPlainText(@NativeType("ULClipboardReadPlainTextCallback") ULClipboardReadPlainTextCallbackI value) { ULClipboard.nreadPlainText(address(), value); return this; }
        /** Sets the specified value to the {@code writePlainText} field. */
        public ULClipboard.Buffer writePlainText(@NativeType("ULClipboardWritePlainTextCallback") ULClipboardWritePlainTextCallbackI value) { ULClipboard.nwritePlainText(address(), value); return this; }

    }

}