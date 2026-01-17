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
 * struct ULGPUState {
 *     unsigned int viewport_width;
 *     unsigned int viewport_height;
 *     {@link ULMatrix4x4 ULMatrix4x4} * transform;
 *     bool enableTexturing;
 *     bool enableBlend;
 *     unsigned char shaderType;
 *     unsigned int renderBufferID;
 *     unsigned int texture1ID;
 *     unsigned int texture2ID;
 *     unsigned int texture3ID;
 *     float uniformScalar[8];
 *     {@link ULVec4 ULvec4} uniformVector[8];
 *     unsigned char clipSize;
 *     {@link ULMatrix4x4 ULMatrix4x4} clip[8];
 *     bool enableScissor;
 *     {@link ULIntRect ULIntRect} scissorRect;
 * }</code></pre>
 */
public class ULGPUState extends Struct<ULGPUState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VIEWPORT_WIDTH,
        VIEWPORT_HEIGHT,
        TRANSFORM,
        ENABLETEXTURING,
        ENABLEBLEND,
        SHADERTYPE,
        RENDERBUFFERID,
        TEXTURE1ID,
        TEXTURE2ID,
        TEXTURE3ID,
        UNIFORMSCALAR,
        UNIFORMVECTOR,
        CLIPSIZE,
        CLIP,
        ENABLESCISSOR,
        SCISSORRECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 8),
            __array(ULVec4.SIZEOF, ULVec4.ALIGNOF, 8),
            __member(1),
            __array(ULMatrix4x4.SIZEOF, ULMatrix4x4.ALIGNOF, 8),
            __member(1),
            __member(ULIntRect.SIZEOF, ULIntRect.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VIEWPORT_WIDTH = layout.offsetof(0);
        VIEWPORT_HEIGHT = layout.offsetof(1);
        TRANSFORM = layout.offsetof(2);
        ENABLETEXTURING = layout.offsetof(3);
        ENABLEBLEND = layout.offsetof(4);
        SHADERTYPE = layout.offsetof(5);
        RENDERBUFFERID = layout.offsetof(6);
        TEXTURE1ID = layout.offsetof(7);
        TEXTURE2ID = layout.offsetof(8);
        TEXTURE3ID = layout.offsetof(9);
        UNIFORMSCALAR = layout.offsetof(10);
        UNIFORMVECTOR = layout.offsetof(11);
        CLIPSIZE = layout.offsetof(12);
        CLIP = layout.offsetof(13);
        ENABLESCISSOR = layout.offsetof(14);
        SCISSORRECT = layout.offsetof(15);
    }

    protected ULGPUState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ULGPUState create(long address, @Nullable ByteBuffer container) {
        return new ULGPUState(address, container);
    }

    /**
     * Creates a {@code ULGPUState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULGPUState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code viewport_width} field. */
    @NativeType("unsigned int")
    public int viewport_width() { return nviewport_width(address()); }
    /** @return the value of the {@code viewport_height} field. */
    @NativeType("unsigned int")
    public int viewport_height() { return nviewport_height(address()); }
    /** @return a {@link ULMatrix4x4} view of the struct pointed to by the {@code transform} field. */
    @NativeType("ULMatrix4x4 *")
    public ULMatrix4x4 transform() { return ntransform(address()); }
    /** @return the value of the {@code enableTexturing} field. */
    @NativeType("bool")
    public boolean enableTexturing() { return nenableTexturing(address()); }
    /** @return the value of the {@code enableBlend} field. */
    @NativeType("bool")
    public boolean enableBlend() { return nenableBlend(address()); }
    /** @return the value of the {@code shaderType} field. */
    @NativeType("unsigned char")
    public byte shaderType() { return nshaderType(address()); }
    /** @return the value of the {@code renderBufferID} field. */
    @NativeType("unsigned int")
    public int renderBufferID() { return nrenderBufferID(address()); }
    /** @return the value of the {@code texture1ID} field. */
    @NativeType("unsigned int")
    public int texture1ID() { return ntexture1ID(address()); }
    /** @return the value of the {@code texture2ID} field. */
    @NativeType("unsigned int")
    public int texture2ID() { return ntexture2ID(address()); }
    /** @return the value of the {@code texture3ID} field. */
    @NativeType("unsigned int")
    public int texture3ID() { return ntexture3ID(address()); }
    /** @return a {@link FloatBuffer} view of the {@code uniformScalar} field. */
    @NativeType("float[8]")
    public FloatBuffer uniformScalar() { return nuniformScalar(address()); }
    /** @return the value at the specified index of the {@code uniformScalar} field. */
    public float uniformScalar(int index) { return nuniformScalar(address(), index); }
    /** @return a {@link ULVec4}.Buffer view of the {@code uniformVector} field. */
    @NativeType("ULvec4[8]")
    public ULVec4.Buffer uniformVector() { return nuniformVector(address()); }
    /** @return a {@link ULVec4} view of the struct at the specified index of the {@code uniformVector} field. */
    @NativeType("ULvec4")
    public ULVec4 uniformVector(int index) { return nuniformVector(address(), index); }
    /** @return the value of the {@code clipSize} field. */
    @NativeType("unsigned char")
    public byte clipSize() { return nclipSize(address()); }
    /** @return a {@link ULMatrix4x4}.Buffer view of the {@code clip} field. */
    @NativeType("ULMatrix4x4[8]")
    public ULMatrix4x4.Buffer clip() { return nclip(address()); }
    /** @return a {@link ULMatrix4x4} view of the struct at the specified index of the {@code clip} field. */
    public ULMatrix4x4 clip(int index) { return nclip(address(), index); }
    /** @return the value of the {@code enableScissor} field. */
    @NativeType("bool")
    public boolean enableScissor() { return nenableScissor(address()); }
    /** @return a {@link ULIntRect} view of the {@code scissorRect} field. */
    public ULIntRect scissorRect() { return nscissorRect(address()); }

    /** Sets the specified value to the {@code viewport_width} field. */
    public ULGPUState viewport_width(@NativeType("unsigned int") int value) { nviewport_width(address(), value); return this; }
    /** Sets the specified value to the {@code viewport_height} field. */
    public ULGPUState viewport_height(@NativeType("unsigned int") int value) { nviewport_height(address(), value); return this; }
    /** Sets the address of the specified {@link ULMatrix4x4} to the {@code transform} field. */
    public ULGPUState transform(@NativeType("ULMatrix4x4 *") ULMatrix4x4 value) { ntransform(address(), value); return this; }
    /** Sets the specified value to the {@code enableTexturing} field. */
    public ULGPUState enableTexturing(@NativeType("bool") boolean value) { nenableTexturing(address(), value); return this; }
    /** Sets the specified value to the {@code enableBlend} field. */
    public ULGPUState enableBlend(@NativeType("bool") boolean value) { nenableBlend(address(), value); return this; }
    /** Sets the specified value to the {@code shaderType} field. */
    public ULGPUState shaderType(@NativeType("unsigned char") byte value) { nshaderType(address(), value); return this; }
    /** Sets the specified value to the {@code renderBufferID} field. */
    public ULGPUState renderBufferID(@NativeType("unsigned int") int value) { nrenderBufferID(address(), value); return this; }
    /** Sets the specified value to the {@code texture1ID} field. */
    public ULGPUState texture1ID(@NativeType("unsigned int") int value) { ntexture1ID(address(), value); return this; }
    /** Sets the specified value to the {@code texture2ID} field. */
    public ULGPUState texture2ID(@NativeType("unsigned int") int value) { ntexture2ID(address(), value); return this; }
    /** Sets the specified value to the {@code texture3ID} field. */
    public ULGPUState texture3ID(@NativeType("unsigned int") int value) { ntexture3ID(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code uniformScalar} field. */
    public ULGPUState uniformScalar(@NativeType("float[8]") FloatBuffer value) { nuniformScalar(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code uniformScalar} field. */
    public ULGPUState uniformScalar(int index, float value) { nuniformScalar(address(), index, value); return this; }
    /** Copies the specified {@link ULVec4.Buffer} to the {@code uniformVector} field. */
    public ULGPUState uniformVector(@NativeType("ULvec4[8]") ULVec4.Buffer value) { nuniformVector(address(), value); return this; }
    /** Copies the specified {@link ULVec4} at the specified index of the {@code uniformVector} field. */
    public ULGPUState uniformVector(int index, @NativeType("ULvec4") ULVec4 value) { nuniformVector(address(), index, value); return this; }
    /** Passes the {@code uniformVector} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ULGPUState uniformVector(java.util.function.Consumer<ULVec4.Buffer> consumer) { consumer.accept(uniformVector()); return this; }
    /** Passes the element at {@code index} of the {@code uniformVector} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ULGPUState uniformVector(int index, java.util.function.Consumer<ULVec4> consumer) { consumer.accept(uniformVector(index)); return this; }
    /** Sets the specified value to the {@code clipSize} field. */
    public ULGPUState clipSize(@NativeType("unsigned char") byte value) { nclipSize(address(), value); return this; }
    /** Copies the specified {@link ULMatrix4x4.Buffer} to the {@code clip} field. */
    public ULGPUState clip(@NativeType("ULMatrix4x4[8]") ULMatrix4x4.Buffer value) { nclip(address(), value); return this; }
    /** Copies the specified {@link ULMatrix4x4} at the specified index of the {@code clip} field. */
    public ULGPUState clip(int index, ULMatrix4x4 value) { nclip(address(), index, value); return this; }
    /** Passes the {@code clip} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ULGPUState clip(java.util.function.Consumer<ULMatrix4x4.Buffer> consumer) { consumer.accept(clip()); return this; }
    /** Passes the element at {@code index} of the {@code clip} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ULGPUState clip(int index, java.util.function.Consumer<ULMatrix4x4> consumer) { consumer.accept(clip(index)); return this; }
    /** Sets the specified value to the {@code enableScissor} field. */
    public ULGPUState enableScissor(@NativeType("bool") boolean value) { nenableScissor(address(), value); return this; }
    /** Copies the specified {@link ULIntRect} to the {@code scissorRect} field. */
    public ULGPUState scissorRect(ULIntRect value) { nscissorRect(address(), value); return this; }
    /** Passes the {@code scissorRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ULGPUState scissorRect(java.util.function.Consumer<ULIntRect> consumer) { consumer.accept(scissorRect()); return this; }

    /** Initializes this struct with the specified values. */
    public ULGPUState set(
        int viewport_width,
        int viewport_height,
        ULMatrix4x4 transform,
        boolean enableTexturing,
        boolean enableBlend,
        byte shaderType,
        int renderBufferID,
        int texture1ID,
        int texture2ID,
        int texture3ID,
        FloatBuffer uniformScalar,
        ULVec4.Buffer uniformVector,
        byte clipSize,
        ULMatrix4x4.Buffer clip,
        boolean enableScissor,
        ULIntRect scissorRect
    ) {
        viewport_width(viewport_width);
        viewport_height(viewport_height);
        transform(transform);
        enableTexturing(enableTexturing);
        enableBlend(enableBlend);
        shaderType(shaderType);
        renderBufferID(renderBufferID);
        texture1ID(texture1ID);
        texture2ID(texture2ID);
        texture3ID(texture3ID);
        uniformScalar(uniformScalar);
        uniformVector(uniformVector);
        clipSize(clipSize);
        clip(clip);
        enableScissor(enableScissor);
        scissorRect(scissorRect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULGPUState set(ULGPUState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULGPUState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULGPUState malloc() {
        return new ULGPUState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ULGPUState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULGPUState calloc() {
        return new ULGPUState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ULGPUState} instance allocated with {@link BufferUtils}. */
    public static ULGPUState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ULGPUState(memAddress(container), container);
    }

    /** Returns a new {@code ULGPUState} instance for the specified memory address. */
    public static ULGPUState create(long address) {
        return new ULGPUState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ULGPUState createSafe(long address) {
        return address == NULL ? null : new ULGPUState(address, null);
    }

    /**
     * Returns a new {@link ULGPUState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULGPUState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULGPUState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ULGPUState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ULGPUState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ULGPUState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULGPUState malloc(MemoryStack stack) {
        return new ULGPUState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ULGPUState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULGPUState calloc(MemoryStack stack) {
        return new ULGPUState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ULGPUState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULGPUState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULGPUState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #viewport_width}. */
    public static int nviewport_width(long struct) { return memGetInt(struct + ULGPUState.VIEWPORT_WIDTH); }
    /** Unsafe version of {@link #viewport_height}. */
    public static int nviewport_height(long struct) { return memGetInt(struct + ULGPUState.VIEWPORT_HEIGHT); }
    /** Unsafe version of {@link #transform}. */
    public static ULMatrix4x4 ntransform(long struct) { return ULMatrix4x4.create(memGetAddress(struct + ULGPUState.TRANSFORM)); }
    /** Unsafe version of {@link #enableTexturing}. */
    public static boolean nenableTexturing(long struct) { return memGetByte(struct + ULGPUState.ENABLETEXTURING) != 0; }
    /** Unsafe version of {@link #enableBlend}. */
    public static boolean nenableBlend(long struct) { return memGetByte(struct + ULGPUState.ENABLEBLEND) != 0; }
    /** Unsafe version of {@link #shaderType}. */
    public static byte nshaderType(long struct) { return memGetByte(struct + ULGPUState.SHADERTYPE); }
    /** Unsafe version of {@link #renderBufferID}. */
    public static int nrenderBufferID(long struct) { return memGetInt(struct + ULGPUState.RENDERBUFFERID); }
    /** Unsafe version of {@link #texture1ID}. */
    public static int ntexture1ID(long struct) { return memGetInt(struct + ULGPUState.TEXTURE1ID); }
    /** Unsafe version of {@link #texture2ID}. */
    public static int ntexture2ID(long struct) { return memGetInt(struct + ULGPUState.TEXTURE2ID); }
    /** Unsafe version of {@link #texture3ID}. */
    public static int ntexture3ID(long struct) { return memGetInt(struct + ULGPUState.TEXTURE3ID); }
    /** Unsafe version of {@link #uniformScalar}. */
    public static FloatBuffer nuniformScalar(long struct) { return memFloatBuffer(struct + ULGPUState.UNIFORMSCALAR, 8); }
    /** Unsafe version of {@link #uniformScalar(int) uniformScalar}. */
    public static float nuniformScalar(long struct, int index) {
        return memGetFloat(struct + ULGPUState.UNIFORMSCALAR + check(index, 8) * 4);
    }
    /** Unsafe version of {@link #uniformVector}. */
    public static ULVec4.Buffer nuniformVector(long struct) { return ULVec4.create(struct + ULGPUState.UNIFORMVECTOR, 8); }
    /** Unsafe version of {@link #uniformVector(int) uniformVector}. */
    public static ULVec4 nuniformVector(long struct, int index) {
        return ULVec4.create(struct + ULGPUState.UNIFORMVECTOR + check(index, 8) * ULVec4.SIZEOF);
    }
    /** Unsafe version of {@link #clipSize}. */
    public static byte nclipSize(long struct) { return memGetByte(struct + ULGPUState.CLIPSIZE); }
    /** Unsafe version of {@link #clip}. */
    public static ULMatrix4x4.Buffer nclip(long struct) { return ULMatrix4x4.create(struct + ULGPUState.CLIP, 8); }
    /** Unsafe version of {@link #clip(int) clip}. */
    public static ULMatrix4x4 nclip(long struct, int index) {
        return ULMatrix4x4.create(struct + ULGPUState.CLIP + check(index, 8) * ULMatrix4x4.SIZEOF);
    }
    /** Unsafe version of {@link #enableScissor}. */
    public static boolean nenableScissor(long struct) { return memGetByte(struct + ULGPUState.ENABLESCISSOR) != 0; }
    /** Unsafe version of {@link #scissorRect}. */
    public static ULIntRect nscissorRect(long struct) { return ULIntRect.create(struct + ULGPUState.SCISSORRECT); }

    /** Unsafe version of {@link #viewport_width(int) viewport_width}. */
    public static void nviewport_width(long struct, int value) { memPutInt(struct + ULGPUState.VIEWPORT_WIDTH, value); }
    /** Unsafe version of {@link #viewport_height(int) viewport_height}. */
    public static void nviewport_height(long struct, int value) { memPutInt(struct + ULGPUState.VIEWPORT_HEIGHT, value); }
    /** Unsafe version of {@link #transform(ULMatrix4x4) transform}. */
    public static void ntransform(long struct, ULMatrix4x4 value) { memPutAddress(struct + ULGPUState.TRANSFORM, value.address()); }
    /** Unsafe version of {@link #enableTexturing(boolean) enableTexturing}. */
    public static void nenableTexturing(long struct, boolean value) { memPutByte(struct + ULGPUState.ENABLETEXTURING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enableBlend(boolean) enableBlend}. */
    public static void nenableBlend(long struct, boolean value) { memPutByte(struct + ULGPUState.ENABLEBLEND, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #shaderType(byte) shaderType}. */
    public static void nshaderType(long struct, byte value) { memPutByte(struct + ULGPUState.SHADERTYPE, value); }
    /** Unsafe version of {@link #renderBufferID(int) renderBufferID}. */
    public static void nrenderBufferID(long struct, int value) { memPutInt(struct + ULGPUState.RENDERBUFFERID, value); }
    /** Unsafe version of {@link #texture1ID(int) texture1ID}. */
    public static void ntexture1ID(long struct, int value) { memPutInt(struct + ULGPUState.TEXTURE1ID, value); }
    /** Unsafe version of {@link #texture2ID(int) texture2ID}. */
    public static void ntexture2ID(long struct, int value) { memPutInt(struct + ULGPUState.TEXTURE2ID, value); }
    /** Unsafe version of {@link #texture3ID(int) texture3ID}. */
    public static void ntexture3ID(long struct, int value) { memPutInt(struct + ULGPUState.TEXTURE3ID, value); }
    /** Unsafe version of {@link #uniformScalar(FloatBuffer) uniformScalar}. */
    public static void nuniformScalar(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(memAddress(value), struct + ULGPUState.UNIFORMSCALAR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #uniformScalar(int, float) uniformScalar}. */
    public static void nuniformScalar(long struct, int index, float value) {
        memPutFloat(struct + ULGPUState.UNIFORMSCALAR + check(index, 8) * 4, value);
    }
    /** Unsafe version of {@link #uniformVector(ULVec4.Buffer) uniformVector}. */
    public static void nuniformVector(long struct, ULVec4.Buffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(value.address(), struct + ULGPUState.UNIFORMVECTOR, value.remaining() * ULVec4.SIZEOF);
    }
    /** Unsafe version of {@link #uniformVector(int, ULVec4) uniformVector}. */
    public static void nuniformVector(long struct, int index, ULVec4 value) {
        memCopy(value.address(), struct + ULGPUState.UNIFORMVECTOR + check(index, 8) * ULVec4.SIZEOF, ULVec4.SIZEOF);
    }
    /** Unsafe version of {@link #clipSize(byte) clipSize}. */
    public static void nclipSize(long struct, byte value) { memPutByte(struct + ULGPUState.CLIPSIZE, value); }
    /** Unsafe version of {@link #clip(ULMatrix4x4.Buffer) clip}. */
    public static void nclip(long struct, ULMatrix4x4.Buffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(value.address(), struct + ULGPUState.CLIP, value.remaining() * ULMatrix4x4.SIZEOF);
    }
    /** Unsafe version of {@link #clip(int, ULMatrix4x4) clip}. */
    public static void nclip(long struct, int index, ULMatrix4x4 value) {
        memCopy(value.address(), struct + ULGPUState.CLIP + check(index, 8) * ULMatrix4x4.SIZEOF, ULMatrix4x4.SIZEOF);
    }
    /** Unsafe version of {@link #enableScissor(boolean) enableScissor}. */
    public static void nenableScissor(long struct, boolean value) { memPutByte(struct + ULGPUState.ENABLESCISSOR, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #scissorRect(ULIntRect) scissorRect}. */
    public static void nscissorRect(long struct, ULIntRect value) { memCopy(value.address(), struct + ULGPUState.SCISSORRECT, ULIntRect.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULGPUState.TRANSFORM));
    }

    // -----------------------------------

    /** An array of {@link ULGPUState} structs. */
    public static class Buffer extends StructBuffer<ULGPUState, Buffer> implements NativeResource {

        private static final ULGPUState ELEMENT_FACTORY = ULGPUState.create(-1L);

        /**
         * Creates a new {@code ULGPUState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULGPUState#SIZEOF}, and its mark will be undefined.</p>
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
        protected ULGPUState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code viewport_width} field. */
        @NativeType("unsigned int")
        public int viewport_width() { return ULGPUState.nviewport_width(address()); }
        /** @return the value of the {@code viewport_height} field. */
        @NativeType("unsigned int")
        public int viewport_height() { return ULGPUState.nviewport_height(address()); }
        /** @return a {@link ULMatrix4x4} view of the struct pointed to by the {@code transform} field. */
        @NativeType("ULMatrix4x4 *")
        public ULMatrix4x4 transform() { return ULGPUState.ntransform(address()); }
        /** @return the value of the {@code enableTexturing} field. */
        @NativeType("bool")
        public boolean enableTexturing() { return ULGPUState.nenableTexturing(address()); }
        /** @return the value of the {@code enableBlend} field. */
        @NativeType("bool")
        public boolean enableBlend() { return ULGPUState.nenableBlend(address()); }
        /** @return the value of the {@code shaderType} field. */
        @NativeType("unsigned char")
        public byte shaderType() { return ULGPUState.nshaderType(address()); }
        /** @return the value of the {@code renderBufferID} field. */
        @NativeType("unsigned int")
        public int renderBufferID() { return ULGPUState.nrenderBufferID(address()); }
        /** @return the value of the {@code texture1ID} field. */
        @NativeType("unsigned int")
        public int texture1ID() { return ULGPUState.ntexture1ID(address()); }
        /** @return the value of the {@code texture2ID} field. */
        @NativeType("unsigned int")
        public int texture2ID() { return ULGPUState.ntexture2ID(address()); }
        /** @return the value of the {@code texture3ID} field. */
        @NativeType("unsigned int")
        public int texture3ID() { return ULGPUState.ntexture3ID(address()); }
        /** @return a {@link FloatBuffer} view of the {@code uniformScalar} field. */
        @NativeType("float[8]")
        public FloatBuffer uniformScalar() { return ULGPUState.nuniformScalar(address()); }
        /** @return the value at the specified index of the {@code uniformScalar} field. */
        public float uniformScalar(int index) { return ULGPUState.nuniformScalar(address(), index); }
        /** @return a {@link ULVec4}.Buffer view of the {@code uniformVector} field. */
        @NativeType("ULvec4[8]")
        public ULVec4.Buffer uniformVector() { return ULGPUState.nuniformVector(address()); }
        /** @return a {@link ULVec4} view of the struct at the specified index of the {@code uniformVector} field. */
        @NativeType("ULvec4")
        public ULVec4 uniformVector(int index) { return ULGPUState.nuniformVector(address(), index); }
        /** @return the value of the {@code clipSize} field. */
        @NativeType("unsigned char")
        public byte clipSize() { return ULGPUState.nclipSize(address()); }
        /** @return a {@link ULMatrix4x4}.Buffer view of the {@code clip} field. */
        @NativeType("ULMatrix4x4[8]")
        public ULMatrix4x4.Buffer clip() { return ULGPUState.nclip(address()); }
        /** @return a {@link ULMatrix4x4} view of the struct at the specified index of the {@code clip} field. */
        public ULMatrix4x4 clip(int index) { return ULGPUState.nclip(address(), index); }
        /** @return the value of the {@code enableScissor} field. */
        @NativeType("bool")
        public boolean enableScissor() { return ULGPUState.nenableScissor(address()); }
        /** @return a {@link ULIntRect} view of the {@code scissorRect} field. */
        public ULIntRect scissorRect() { return ULGPUState.nscissorRect(address()); }

        /** Sets the specified value to the {@code viewport_width} field. */
        public ULGPUState.Buffer viewport_width(@NativeType("unsigned int") int value) { ULGPUState.nviewport_width(address(), value); return this; }
        /** Sets the specified value to the {@code viewport_height} field. */
        public ULGPUState.Buffer viewport_height(@NativeType("unsigned int") int value) { ULGPUState.nviewport_height(address(), value); return this; }
        /** Sets the address of the specified {@link ULMatrix4x4} to the {@code transform} field. */
        public ULGPUState.Buffer transform(@NativeType("ULMatrix4x4 *") ULMatrix4x4 value) { ULGPUState.ntransform(address(), value); return this; }
        /** Sets the specified value to the {@code enableTexturing} field. */
        public ULGPUState.Buffer enableTexturing(@NativeType("bool") boolean value) { ULGPUState.nenableTexturing(address(), value); return this; }
        /** Sets the specified value to the {@code enableBlend} field. */
        public ULGPUState.Buffer enableBlend(@NativeType("bool") boolean value) { ULGPUState.nenableBlend(address(), value); return this; }
        /** Sets the specified value to the {@code shaderType} field. */
        public ULGPUState.Buffer shaderType(@NativeType("unsigned char") byte value) { ULGPUState.nshaderType(address(), value); return this; }
        /** Sets the specified value to the {@code renderBufferID} field. */
        public ULGPUState.Buffer renderBufferID(@NativeType("unsigned int") int value) { ULGPUState.nrenderBufferID(address(), value); return this; }
        /** Sets the specified value to the {@code texture1ID} field. */
        public ULGPUState.Buffer texture1ID(@NativeType("unsigned int") int value) { ULGPUState.ntexture1ID(address(), value); return this; }
        /** Sets the specified value to the {@code texture2ID} field. */
        public ULGPUState.Buffer texture2ID(@NativeType("unsigned int") int value) { ULGPUState.ntexture2ID(address(), value); return this; }
        /** Sets the specified value to the {@code texture3ID} field. */
        public ULGPUState.Buffer texture3ID(@NativeType("unsigned int") int value) { ULGPUState.ntexture3ID(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code uniformScalar} field. */
        public ULGPUState.Buffer uniformScalar(@NativeType("float[8]") FloatBuffer value) { ULGPUState.nuniformScalar(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code uniformScalar} field. */
        public ULGPUState.Buffer uniformScalar(int index, float value) { ULGPUState.nuniformScalar(address(), index, value); return this; }
        /** Copies the specified {@link ULVec4.Buffer} to the {@code uniformVector} field. */
        public ULGPUState.Buffer uniformVector(@NativeType("ULvec4[8]") ULVec4.Buffer value) { ULGPUState.nuniformVector(address(), value); return this; }
        /** Copies the specified {@link ULVec4} at the specified index of the {@code uniformVector} field. */
        public ULGPUState.Buffer uniformVector(int index, @NativeType("ULvec4") ULVec4 value) { ULGPUState.nuniformVector(address(), index, value); return this; }
        /** Passes the {@code uniformVector} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ULGPUState.Buffer uniformVector(java.util.function.Consumer<ULVec4.Buffer> consumer) { consumer.accept(uniformVector()); return this; }
        /** Passes the element at {@code index} of the {@code uniformVector} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ULGPUState.Buffer uniformVector(int index, java.util.function.Consumer<ULVec4> consumer) { consumer.accept(uniformVector(index)); return this; }
        /** Sets the specified value to the {@code clipSize} field. */
        public ULGPUState.Buffer clipSize(@NativeType("unsigned char") byte value) { ULGPUState.nclipSize(address(), value); return this; }
        /** Copies the specified {@link ULMatrix4x4.Buffer} to the {@code clip} field. */
        public ULGPUState.Buffer clip(@NativeType("ULMatrix4x4[8]") ULMatrix4x4.Buffer value) { ULGPUState.nclip(address(), value); return this; }
        /** Copies the specified {@link ULMatrix4x4} at the specified index of the {@code clip} field. */
        public ULGPUState.Buffer clip(int index, ULMatrix4x4 value) { ULGPUState.nclip(address(), index, value); return this; }
        /** Passes the {@code clip} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ULGPUState.Buffer clip(java.util.function.Consumer<ULMatrix4x4.Buffer> consumer) { consumer.accept(clip()); return this; }
        /** Passes the element at {@code index} of the {@code clip} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ULGPUState.Buffer clip(int index, java.util.function.Consumer<ULMatrix4x4> consumer) { consumer.accept(clip(index)); return this; }
        /** Sets the specified value to the {@code enableScissor} field. */
        public ULGPUState.Buffer enableScissor(@NativeType("bool") boolean value) { ULGPUState.nenableScissor(address(), value); return this; }
        /** Copies the specified {@link ULIntRect} to the {@code scissorRect} field. */
        public ULGPUState.Buffer scissorRect(ULIntRect value) { ULGPUState.nscissorRect(address(), value); return this; }
        /** Passes the {@code scissorRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ULGPUState.Buffer scissorRect(java.util.function.Consumer<ULIntRect> consumer) { consumer.accept(scissorRect()); return this; }

    }

}