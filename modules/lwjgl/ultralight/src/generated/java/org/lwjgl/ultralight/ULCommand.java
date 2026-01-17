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
 * struct ULCommand {
 *     unsigned char commandType;
 *     {@link ULGPUState ULGPUState} * gpuState;
 *     unsigned int geometryID;
 *     unsigned int indicesCount;
 *     unsigned int indicesOffset;
 * }</code></pre>
 */
public class ULCommand extends Struct<ULCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMMANDTYPE,
        GPUSTATE,
        GEOMETRYID,
        INDICESCOUNT,
        INDICESOFFSET;

    static {
        Layout layout = __struct(
            __member(1),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMMANDTYPE = layout.offsetof(0);
        GPUSTATE = layout.offsetof(1);
        GEOMETRYID = layout.offsetof(2);
        INDICESCOUNT = layout.offsetof(3);
        INDICESOFFSET = layout.offsetof(4);
    }

    protected ULCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULCommand create(long address, @Nullable ByteBuffer container) {
        return new ULCommand(address, container);
    }

    /**
     * Creates a {@code ULCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code commandType} field. */
    @NativeType("unsigned char")
    public byte commandType() { return ncommandType(address()); }
    /** @return a {@link ULGPUState} view of the struct pointed to by the {@code gpuState} field. */
    @NativeType("ULGPUState *")
    public ULGPUState gpuState() { return ngpuState(address()); }
    /** @return the value of the {@code geometryID} field. */
    @NativeType("unsigned int")
    public int geometryID() { return ngeometryID(address()); }
    /** @return the value of the {@code indicesCount} field. */
    @NativeType("unsigned int")
    public int indicesCount() { return nindicesCount(address()); }
    /** @return the value of the {@code indicesOffset} field. */
    @NativeType("unsigned int")
    public int indicesOffset() { return nindicesOffset(address()); }

    /** Sets the specified value to the {@code commandType} field. */
    public ULCommand commandType(@NativeType("unsigned char") byte value) { ncommandType(address(), value); return this; }
    /** Sets the address of the specified {@link ULGPUState} to the {@code gpuState} field. */
    public ULCommand gpuState(@NativeType("ULGPUState *") ULGPUState value) { ngpuState(address(), value); return this; }
    /** Sets the specified value to the {@code geometryID} field. */
    public ULCommand geometryID(@NativeType("unsigned int") int value) { ngeometryID(address(), value); return this; }
    /** Sets the specified value to the {@code indicesCount} field. */
    public ULCommand indicesCount(@NativeType("unsigned int") int value) { nindicesCount(address(), value); return this; }
    /** Sets the specified value to the {@code indicesOffset} field. */
    public ULCommand indicesOffset(@NativeType("unsigned int") int value) { nindicesOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULCommand set(
        byte commandType,
        ULGPUState gpuState,
        int geometryID,
        int indicesCount,
        int indicesOffset
    ) {
        commandType(commandType);
        gpuState(gpuState);
        geometryID(geometryID);
        indicesCount(indicesCount);
        indicesOffset(indicesOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULCommand set(ULCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULCommand malloc() {
        return new ULCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULCommand calloc() {
        return new ULCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULCommand} instance allocated with {@link BufferUtils}. */
    public static ULCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULCommand(memAddress(container), container);
    }

    /** Returns a new {@code ULCommand} instance for the specified memory address. */
    public static ULCommand create(long address) {
        return new ULCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULCommand createSafe(long address) {
        return address == NULL ? null : new ULCommand(address, null);
    }

    /**
     * Returns a new {@link ULCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommand malloc(MemoryStack stack) {
        return new ULCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULCommand calloc(MemoryStack stack) {
        return new ULCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #commandType}. */
    public static byte ncommandType(long struct) { return memGetByte(struct + ULCommand.COMMANDTYPE); }
    /** Unsafe version of {@link #gpuState}. */
    public static ULGPUState ngpuState(long struct) { return ULGPUState.create(memGetAddress(struct + ULCommand.GPUSTATE)); }
    /** Unsafe version of {@link #geometryID}. */
    public static int ngeometryID(long struct) { return memGetInt(struct + ULCommand.GEOMETRYID); }
    /** Unsafe version of {@link #indicesCount}. */
    public static int nindicesCount(long struct) { return memGetInt(struct + ULCommand.INDICESCOUNT); }
    /** Unsafe version of {@link #indicesOffset}. */
    public static int nindicesOffset(long struct) { return memGetInt(struct + ULCommand.INDICESOFFSET); }

    /** Unsafe version of {@link #commandType(byte) commandType}. */
    public static void ncommandType(long struct, byte value) { memPutByte(struct + ULCommand.COMMANDTYPE, value); }
    /** Unsafe version of {@link #gpuState(ULGPUState) gpuState}. */
    public static void ngpuState(long struct, ULGPUState value) { memPutAddress(struct + ULCommand.GPUSTATE, value.address()); }
    /** Unsafe version of {@link #geometryID(int) geometryID}. */
    public static void ngeometryID(long struct, int value) { memPutInt(struct + ULCommand.GEOMETRYID, value); }
    /** Unsafe version of {@link #indicesCount(int) indicesCount}. */
    public static void nindicesCount(long struct, int value) { memPutInt(struct + ULCommand.INDICESCOUNT, value); }
    /** Unsafe version of {@link #indicesOffset(int) indicesOffset}. */
    public static void nindicesOffset(long struct, int value) { memPutInt(struct + ULCommand.INDICESOFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long gpuState = memGetAddress(struct + ULCommand.GPUSTATE);
        check(gpuState);
        ULGPUState.validate(gpuState);
    }

    // -----------------------------------

    /** An array of {@link ULCommand} structs. */
    public static class Buffer extends StructBuffer<ULCommand, Buffer> implements NativeResource {

        private static final ULCommand ELEMENT_FACTORY = ULCommand.create(-1L);

        /**
         * Creates a new {@code ULCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code commandType} field. */
        @NativeType("unsigned char")
        public byte commandType() { return ULCommand.ncommandType(address()); }
        /** @return a {@link ULGPUState} view of the struct pointed to by the {@code gpuState} field. */
        @NativeType("ULGPUState *")
        public ULGPUState gpuState() { return ULCommand.ngpuState(address()); }
        /** @return the value of the {@code geometryID} field. */
        @NativeType("unsigned int")
        public int geometryID() { return ULCommand.ngeometryID(address()); }
        /** @return the value of the {@code indicesCount} field. */
        @NativeType("unsigned int")
        public int indicesCount() { return ULCommand.nindicesCount(address()); }
        /** @return the value of the {@code indicesOffset} field. */
        @NativeType("unsigned int")
        public int indicesOffset() { return ULCommand.nindicesOffset(address()); }

        /** Sets the specified value to the {@code commandType} field. */
        public ULCommand.Buffer commandType(@NativeType("unsigned char") byte value) { ULCommand.ncommandType(address(), value); return this; }
        /** Sets the address of the specified {@link ULGPUState} to the {@code gpuState} field. */
        public ULCommand.Buffer gpuState(@NativeType("ULGPUState *") ULGPUState value) { ULCommand.ngpuState(address(), value); return this; }
        /** Sets the specified value to the {@code geometryID} field. */
        public ULCommand.Buffer geometryID(@NativeType("unsigned int") int value) { ULCommand.ngeometryID(address(), value); return this; }
        /** Sets the specified value to the {@code indicesCount} field. */
        public ULCommand.Buffer indicesCount(@NativeType("unsigned int") int value) { ULCommand.nindicesCount(address(), value); return this; }
        /** Sets the specified value to the {@code indicesOffset} field. */
        public ULCommand.Buffer indicesOffset(@NativeType("unsigned int") int value) { ULCommand.nindicesOffset(address(), value); return this; }

    }

}