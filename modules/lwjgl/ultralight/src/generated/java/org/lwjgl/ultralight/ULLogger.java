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
 * struct ULLogger {
 *     {@link ULLoggerLogMessageCallbackI ULLoggerLogMessageCallback} logMessage;
 * }</code></pre>
 */
public class ULLogger extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOGMESSAGE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOGMESSAGE = layout.offsetof(0);
    }

    /**
     * Creates a {@code ULLogger} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULLogger(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code logMessage} field. */
    public ULLoggerLogMessageCallback logMessage() { return nlogMessage(address()); }

    /** Sets the specified value to the {@code logMessage} field. */
    public ULLogger logMessage(@NativeType("ULLoggerLogMessageCallback") ULLoggerLogMessageCallbackI value) { nlogMessage(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULLogger set(ULLogger src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULLogger} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULLogger malloc() {
        return wrap(ULLogger.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULLogger} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULLogger calloc() {
        return wrap(ULLogger.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULLogger} instance allocated with {@link BufferUtils}. */
    public static ULLogger create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULLogger.class, memAddress(container), container);
    }

    /** Returns a new {@code ULLogger} instance for the specified memory address. */
    public static ULLogger create(long address) {
        return wrap(ULLogger.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULLogger createSafe(long address) {
        return address == NULL ? null : wrap(ULLogger.class, address);
    }

    /**
     * Returns a new {@link ULLogger.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULLogger.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULLogger.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULLogger.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULLogger.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULLogger} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULLogger malloc(MemoryStack stack) {
        return wrap(ULLogger.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULLogger} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULLogger calloc(MemoryStack stack) {
        return wrap(ULLogger.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULLogger.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULLogger.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULLogger.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #logMessage}. */
    public static ULLoggerLogMessageCallback nlogMessage(long struct) { return ULLoggerLogMessageCallback.create(memGetAddress(struct + ULLogger.LOGMESSAGE)); }

    /** Unsafe version of {@link #logMessage(ULLoggerLogMessageCallbackI) logMessage}. */
    public static void nlogMessage(long struct, ULLoggerLogMessageCallbackI value) { memPutAddress(struct + ULLogger.LOGMESSAGE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULLogger.LOGMESSAGE));
    }

    // -----------------------------------

    /** An array of {@link ULLogger} structs. */
    public static class Buffer extends StructBuffer<ULLogger, Buffer> implements NativeResource {

        private static final ULLogger ELEMENT_FACTORY = ULLogger.create(-1L);

        /**
         * Creates a new {@code ULLogger.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULLogger#SIZEOF}, and its mark will be undefined.
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
        protected ULLogger getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code logMessage} field. */
        public ULLoggerLogMessageCallback logMessage() { return ULLogger.nlogMessage(address()); }

        /** Sets the specified value to the {@code logMessage} field. */
        public ULLogger.Buffer logMessage(@NativeType("ULLoggerLogMessageCallback") ULLoggerLogMessageCallbackI value) { ULLogger.nlogMessage(address(), value); return this; }

    }

}