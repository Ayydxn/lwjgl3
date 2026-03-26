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
 * struct ULGPUDriver {
 *     {@link ULGPUDriverBeginSynchronizeCallbackI ULGPUDriverBeginSynchronizeCallback} begin_synchronize;
 *     {@link ULGPUDriverEndSynchronizeCallbackI ULGPUDriverEndSynchronizeCallback} end_synchronize;
 *     {@link ULGPUDriverNextTextureIdCallbackI ULGPUDriverNextTextureIdCallback} next_texture_id;
 *     {@link ULGPUDriverCreateTextureCallbackI ULGPUDriverCreateTextureCallback} create_texture;
 *     {@link ULGPUDriverUpdateTextureCallbackI ULGPUDriverUpdateTextureCallback} update_texture;
 *     {@link ULGPUDriverDestroyTextureCallbackI ULGPUDriverDestroyTextureCallback} destroy_texture;
 *     {@link ULGPUDriverNextRenderBufferIDCallbackI ULGPUDriverNextRenderBufferIdCallback} next_render_buffer_id;
 *     {@link ULGPUDriverCreateRenderBufferCallbackI ULGPUDriverCreateRenderBufferCallback} create_render_buffer;
 *     {@link ULGPUDriverDestroyRenderBufferCallbackI ULGPUDriverDestroyRenderBufferCallback} destroy_render_buffer;
 *     {@link ULGPUDriverNextGeometryIDCallbackI ULGPUDriverNextGeometryIdCallback} next_geometry_id;
 *     {@link ULGPUDriverCreateGeometryCallbackI ULGPUDriverCreateGeometryCallback} create_geometry;
 *     {@link ULGPUDriverUpdateGeometryCallbackI ULGPUDriverUpdateGeometryCallback} update_geometry;
 *     {@link ULGPUDriverDestroyGeometryCallbackI ULGPUDriverDestroyGeometryCallback} destroy_geometry;
 *     {@link ULGPUDriverUpdateCommandListCallbackI ULGPUDriverUpdateCommandListCallback} update_command_list;
 * }</code></pre>
 */
public class ULGPUDriver extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BEGIN_SYNCHRONIZE,
        END_SYNCHRONIZE,
        NEXT_TEXTURE_ID,
        CREATE_TEXTURE,
        UPDATE_TEXTURE,
        DESTROY_TEXTURE,
        NEXT_RENDER_BUFFER_ID,
        CREATE_RENDER_BUFFER,
        DESTROY_RENDER_BUFFER,
        NEXT_GEOMETRY_ID,
        CREATE_GEOMETRY,
        UPDATE_GEOMETRY,
        DESTROY_GEOMETRY,
        UPDATE_COMMAND_LIST;

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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BEGIN_SYNCHRONIZE = layout.offsetof(0);
        END_SYNCHRONIZE = layout.offsetof(1);
        NEXT_TEXTURE_ID = layout.offsetof(2);
        CREATE_TEXTURE = layout.offsetof(3);
        UPDATE_TEXTURE = layout.offsetof(4);
        DESTROY_TEXTURE = layout.offsetof(5);
        NEXT_RENDER_BUFFER_ID = layout.offsetof(6);
        CREATE_RENDER_BUFFER = layout.offsetof(7);
        DESTROY_RENDER_BUFFER = layout.offsetof(8);
        NEXT_GEOMETRY_ID = layout.offsetof(9);
        CREATE_GEOMETRY = layout.offsetof(10);
        UPDATE_GEOMETRY = layout.offsetof(11);
        DESTROY_GEOMETRY = layout.offsetof(12);
        UPDATE_COMMAND_LIST = layout.offsetof(13);
    }

    /**
     * Creates a {@code ULGPUDriver} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ULGPUDriver(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code begin_synchronize} field. */
    public ULGPUDriverBeginSynchronizeCallback begin_synchronize() { return nbegin_synchronize(address()); }
    /** @return the value of the {@code end_synchronize} field. */
    public ULGPUDriverEndSynchronizeCallback end_synchronize() { return nend_synchronize(address()); }
    /** @return the value of the {@code next_texture_id} field. */
    public ULGPUDriverNextTextureIdCallback next_texture_id() { return nnext_texture_id(address()); }
    /** @return the value of the {@code create_texture} field. */
    public ULGPUDriverCreateTextureCallback create_texture() { return ncreate_texture(address()); }
    /** @return the value of the {@code update_texture} field. */
    public ULGPUDriverUpdateTextureCallback update_texture() { return nupdate_texture(address()); }
    /** @return the value of the {@code destroy_texture} field. */
    public ULGPUDriverDestroyTextureCallback destroy_texture() { return ndestroy_texture(address()); }
    /** @return the value of the {@code next_render_buffer_id} field. */
    @NativeType("ULGPUDriverNextRenderBufferIdCallback")
    public ULGPUDriverNextRenderBufferIDCallback next_render_buffer_id() { return nnext_render_buffer_id(address()); }
    /** @return the value of the {@code create_render_buffer} field. */
    public ULGPUDriverCreateRenderBufferCallback create_render_buffer() { return ncreate_render_buffer(address()); }
    /** @return the value of the {@code destroy_render_buffer} field. */
    public ULGPUDriverDestroyRenderBufferCallback destroy_render_buffer() { return ndestroy_render_buffer(address()); }
    /** @return the value of the {@code next_geometry_id} field. */
    @NativeType("ULGPUDriverNextGeometryIdCallback")
    public ULGPUDriverNextGeometryIDCallback next_geometry_id() { return nnext_geometry_id(address()); }
    /** @return the value of the {@code create_geometry} field. */
    public ULGPUDriverCreateGeometryCallback create_geometry() { return ncreate_geometry(address()); }
    /** @return the value of the {@code update_geometry} field. */
    public ULGPUDriverUpdateGeometryCallback update_geometry() { return nupdate_geometry(address()); }
    /** @return the value of the {@code destroy_geometry} field. */
    public ULGPUDriverDestroyGeometryCallback destroy_geometry() { return ndestroy_geometry(address()); }
    /** @return the value of the {@code update_command_list} field. */
    public ULGPUDriverUpdateCommandListCallback update_command_list() { return nupdate_command_list(address()); }

    /** Sets the specified value to the {@code begin_synchronize} field. */
    public ULGPUDriver begin_synchronize(@NativeType("ULGPUDriverBeginSynchronizeCallback") ULGPUDriverBeginSynchronizeCallbackI value) { nbegin_synchronize(address(), value); return this; }
    /** Sets the specified value to the {@code end_synchronize} field. */
    public ULGPUDriver end_synchronize(@NativeType("ULGPUDriverEndSynchronizeCallback") ULGPUDriverEndSynchronizeCallbackI value) { nend_synchronize(address(), value); return this; }
    /** Sets the specified value to the {@code next_texture_id} field. */
    public ULGPUDriver next_texture_id(@NativeType("ULGPUDriverNextTextureIdCallback") ULGPUDriverNextTextureIdCallbackI value) { nnext_texture_id(address(), value); return this; }
    /** Sets the specified value to the {@code create_texture} field. */
    public ULGPUDriver create_texture(@NativeType("ULGPUDriverCreateTextureCallback") ULGPUDriverCreateTextureCallbackI value) { ncreate_texture(address(), value); return this; }
    /** Sets the specified value to the {@code update_texture} field. */
    public ULGPUDriver update_texture(@NativeType("ULGPUDriverUpdateTextureCallback") ULGPUDriverUpdateTextureCallbackI value) { nupdate_texture(address(), value); return this; }
    /** Sets the specified value to the {@code destroy_texture} field. */
    public ULGPUDriver destroy_texture(@NativeType("ULGPUDriverDestroyTextureCallback") ULGPUDriverDestroyTextureCallbackI value) { ndestroy_texture(address(), value); return this; }
    /** Sets the specified value to the {@code next_render_buffer_id} field. */
    public ULGPUDriver next_render_buffer_id(@NativeType("ULGPUDriverNextRenderBufferIdCallback") ULGPUDriverNextRenderBufferIDCallbackI value) { nnext_render_buffer_id(address(), value); return this; }
    /** Sets the specified value to the {@code create_render_buffer} field. */
    public ULGPUDriver create_render_buffer(@NativeType("ULGPUDriverCreateRenderBufferCallback") ULGPUDriverCreateRenderBufferCallbackI value) { ncreate_render_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code destroy_render_buffer} field. */
    public ULGPUDriver destroy_render_buffer(@NativeType("ULGPUDriverDestroyRenderBufferCallback") ULGPUDriverDestroyRenderBufferCallbackI value) { ndestroy_render_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code next_geometry_id} field. */
    public ULGPUDriver next_geometry_id(@NativeType("ULGPUDriverNextGeometryIdCallback") ULGPUDriverNextGeometryIDCallbackI value) { nnext_geometry_id(address(), value); return this; }
    /** Sets the specified value to the {@code create_geometry} field. */
    public ULGPUDriver create_geometry(@NativeType("ULGPUDriverCreateGeometryCallback") ULGPUDriverCreateGeometryCallbackI value) { ncreate_geometry(address(), value); return this; }
    /** Sets the specified value to the {@code update_geometry} field. */
    public ULGPUDriver update_geometry(@NativeType("ULGPUDriverUpdateGeometryCallback") ULGPUDriverUpdateGeometryCallbackI value) { nupdate_geometry(address(), value); return this; }
    /** Sets the specified value to the {@code destroy_geometry} field. */
    public ULGPUDriver destroy_geometry(@NativeType("ULGPUDriverDestroyGeometryCallback") ULGPUDriverDestroyGeometryCallbackI value) { ndestroy_geometry(address(), value); return this; }
    /** Sets the specified value to the {@code update_command_list} field. */
    public ULGPUDriver update_command_list(@NativeType("ULGPUDriverUpdateCommandListCallback") ULGPUDriverUpdateCommandListCallbackI value) { nupdate_command_list(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ULGPUDriver set(
        ULGPUDriverBeginSynchronizeCallbackI begin_synchronize,
        ULGPUDriverEndSynchronizeCallbackI end_synchronize,
        ULGPUDriverNextTextureIdCallbackI next_texture_id,
        ULGPUDriverCreateTextureCallbackI create_texture,
        ULGPUDriverUpdateTextureCallbackI update_texture,
        ULGPUDriverDestroyTextureCallbackI destroy_texture,
        ULGPUDriverNextRenderBufferIDCallbackI next_render_buffer_id,
        ULGPUDriverCreateRenderBufferCallbackI create_render_buffer,
        ULGPUDriverDestroyRenderBufferCallbackI destroy_render_buffer,
        ULGPUDriverNextGeometryIDCallbackI next_geometry_id,
        ULGPUDriverCreateGeometryCallbackI create_geometry,
        ULGPUDriverUpdateGeometryCallbackI update_geometry,
        ULGPUDriverDestroyGeometryCallbackI destroy_geometry,
        ULGPUDriverUpdateCommandListCallbackI update_command_list
    ) {
        begin_synchronize(begin_synchronize);
        end_synchronize(end_synchronize);
        next_texture_id(next_texture_id);
        create_texture(create_texture);
        update_texture(update_texture);
        destroy_texture(destroy_texture);
        next_render_buffer_id(next_render_buffer_id);
        create_render_buffer(create_render_buffer);
        destroy_render_buffer(destroy_render_buffer);
        next_geometry_id(next_geometry_id);
        create_geometry(create_geometry);
        update_geometry(update_geometry);
        destroy_geometry(destroy_geometry);
        update_command_list(update_command_list);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ULGPUDriver set(ULGPUDriver src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ULGPUDriver} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ULGPUDriver malloc() {
        return wrap(ULGPUDriver.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ULGPUDriver} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ULGPUDriver calloc() {
        return wrap(ULGPUDriver.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ULGPUDriver} instance allocated with {@link BufferUtils}. */
    public static ULGPUDriver create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ULGPUDriver.class, memAddress(container), container);
    }

    /** Returns a new {@code ULGPUDriver} instance for the specified memory address. */
    public static ULGPUDriver create(long address) {
        return wrap(ULGPUDriver.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULGPUDriver createSafe(long address) {
        return address == NULL ? null : wrap(ULGPUDriver.class, address);
    }

    /**
     * Returns a new {@link ULGPUDriver.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ULGPUDriver.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULGPUDriver.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ULGPUDriver.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ULGPUDriver.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ULGPUDriver} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ULGPUDriver malloc(MemoryStack stack) {
        return wrap(ULGPUDriver.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ULGPUDriver} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ULGPUDriver calloc(MemoryStack stack) {
        return wrap(ULGPUDriver.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ULGPUDriver.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ULGPUDriver.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ULGPUDriver.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #begin_synchronize}. */
    public static ULGPUDriverBeginSynchronizeCallback nbegin_synchronize(long struct) { return ULGPUDriverBeginSynchronizeCallback.create(memGetAddress(struct + ULGPUDriver.BEGIN_SYNCHRONIZE)); }
    /** Unsafe version of {@link #end_synchronize}. */
    public static ULGPUDriverEndSynchronizeCallback nend_synchronize(long struct) { return ULGPUDriverEndSynchronizeCallback.create(memGetAddress(struct + ULGPUDriver.END_SYNCHRONIZE)); }
    /** Unsafe version of {@link #next_texture_id}. */
    public static ULGPUDriverNextTextureIdCallback nnext_texture_id(long struct) { return ULGPUDriverNextTextureIdCallback.create(memGetAddress(struct + ULGPUDriver.NEXT_TEXTURE_ID)); }
    /** Unsafe version of {@link #create_texture}. */
    public static ULGPUDriverCreateTextureCallback ncreate_texture(long struct) { return ULGPUDriverCreateTextureCallback.create(memGetAddress(struct + ULGPUDriver.CREATE_TEXTURE)); }
    /** Unsafe version of {@link #update_texture}. */
    public static ULGPUDriverUpdateTextureCallback nupdate_texture(long struct) { return ULGPUDriverUpdateTextureCallback.create(memGetAddress(struct + ULGPUDriver.UPDATE_TEXTURE)); }
    /** Unsafe version of {@link #destroy_texture}. */
    public static ULGPUDriverDestroyTextureCallback ndestroy_texture(long struct) { return ULGPUDriverDestroyTextureCallback.create(memGetAddress(struct + ULGPUDriver.DESTROY_TEXTURE)); }
    /** Unsafe version of {@link #next_render_buffer_id}. */
    public static ULGPUDriverNextRenderBufferIDCallback nnext_render_buffer_id(long struct) { return ULGPUDriverNextRenderBufferIDCallback.create(memGetAddress(struct + ULGPUDriver.NEXT_RENDER_BUFFER_ID)); }
    /** Unsafe version of {@link #create_render_buffer}. */
    public static ULGPUDriverCreateRenderBufferCallback ncreate_render_buffer(long struct) { return ULGPUDriverCreateRenderBufferCallback.create(memGetAddress(struct + ULGPUDriver.CREATE_RENDER_BUFFER)); }
    /** Unsafe version of {@link #destroy_render_buffer}. */
    public static ULGPUDriverDestroyRenderBufferCallback ndestroy_render_buffer(long struct) { return ULGPUDriverDestroyRenderBufferCallback.create(memGetAddress(struct + ULGPUDriver.DESTROY_RENDER_BUFFER)); }
    /** Unsafe version of {@link #next_geometry_id}. */
    public static ULGPUDriverNextGeometryIDCallback nnext_geometry_id(long struct) { return ULGPUDriverNextGeometryIDCallback.create(memGetAddress(struct + ULGPUDriver.NEXT_GEOMETRY_ID)); }
    /** Unsafe version of {@link #create_geometry}. */
    public static ULGPUDriverCreateGeometryCallback ncreate_geometry(long struct) { return ULGPUDriverCreateGeometryCallback.create(memGetAddress(struct + ULGPUDriver.CREATE_GEOMETRY)); }
    /** Unsafe version of {@link #update_geometry}. */
    public static ULGPUDriverUpdateGeometryCallback nupdate_geometry(long struct) { return ULGPUDriverUpdateGeometryCallback.create(memGetAddress(struct + ULGPUDriver.UPDATE_GEOMETRY)); }
    /** Unsafe version of {@link #destroy_geometry}. */
    public static ULGPUDriverDestroyGeometryCallback ndestroy_geometry(long struct) { return ULGPUDriverDestroyGeometryCallback.create(memGetAddress(struct + ULGPUDriver.DESTROY_GEOMETRY)); }
    /** Unsafe version of {@link #update_command_list}. */
    public static ULGPUDriverUpdateCommandListCallback nupdate_command_list(long struct) { return ULGPUDriverUpdateCommandListCallback.create(memGetAddress(struct + ULGPUDriver.UPDATE_COMMAND_LIST)); }

    /** Unsafe version of {@link #begin_synchronize(ULGPUDriverBeginSynchronizeCallbackI) begin_synchronize}. */
    public static void nbegin_synchronize(long struct, ULGPUDriverBeginSynchronizeCallbackI value) { memPutAddress(struct + ULGPUDriver.BEGIN_SYNCHRONIZE, value.address()); }
    /** Unsafe version of {@link #end_synchronize(ULGPUDriverEndSynchronizeCallbackI) end_synchronize}. */
    public static void nend_synchronize(long struct, ULGPUDriverEndSynchronizeCallbackI value) { memPutAddress(struct + ULGPUDriver.END_SYNCHRONIZE, value.address()); }
    /** Unsafe version of {@link #next_texture_id(ULGPUDriverNextTextureIdCallbackI) next_texture_id}. */
    public static void nnext_texture_id(long struct, ULGPUDriverNextTextureIdCallbackI value) { memPutAddress(struct + ULGPUDriver.NEXT_TEXTURE_ID, value.address()); }
    /** Unsafe version of {@link #create_texture(ULGPUDriverCreateTextureCallbackI) create_texture}. */
    public static void ncreate_texture(long struct, ULGPUDriverCreateTextureCallbackI value) { memPutAddress(struct + ULGPUDriver.CREATE_TEXTURE, value.address()); }
    /** Unsafe version of {@link #update_texture(ULGPUDriverUpdateTextureCallbackI) update_texture}. */
    public static void nupdate_texture(long struct, ULGPUDriverUpdateTextureCallbackI value) { memPutAddress(struct + ULGPUDriver.UPDATE_TEXTURE, value.address()); }
    /** Unsafe version of {@link #destroy_texture(ULGPUDriverDestroyTextureCallbackI) destroy_texture}. */
    public static void ndestroy_texture(long struct, ULGPUDriverDestroyTextureCallbackI value) { memPutAddress(struct + ULGPUDriver.DESTROY_TEXTURE, value.address()); }
    /** Unsafe version of {@link #next_render_buffer_id(ULGPUDriverNextRenderBufferIDCallbackI) next_render_buffer_id}. */
    public static void nnext_render_buffer_id(long struct, ULGPUDriverNextRenderBufferIDCallbackI value) { memPutAddress(struct + ULGPUDriver.NEXT_RENDER_BUFFER_ID, value.address()); }
    /** Unsafe version of {@link #create_render_buffer(ULGPUDriverCreateRenderBufferCallbackI) create_render_buffer}. */
    public static void ncreate_render_buffer(long struct, ULGPUDriverCreateRenderBufferCallbackI value) { memPutAddress(struct + ULGPUDriver.CREATE_RENDER_BUFFER, value.address()); }
    /** Unsafe version of {@link #destroy_render_buffer(ULGPUDriverDestroyRenderBufferCallbackI) destroy_render_buffer}. */
    public static void ndestroy_render_buffer(long struct, ULGPUDriverDestroyRenderBufferCallbackI value) { memPutAddress(struct + ULGPUDriver.DESTROY_RENDER_BUFFER, value.address()); }
    /** Unsafe version of {@link #next_geometry_id(ULGPUDriverNextGeometryIDCallbackI) next_geometry_id}. */
    public static void nnext_geometry_id(long struct, ULGPUDriverNextGeometryIDCallbackI value) { memPutAddress(struct + ULGPUDriver.NEXT_GEOMETRY_ID, value.address()); }
    /** Unsafe version of {@link #create_geometry(ULGPUDriverCreateGeometryCallbackI) create_geometry}. */
    public static void ncreate_geometry(long struct, ULGPUDriverCreateGeometryCallbackI value) { memPutAddress(struct + ULGPUDriver.CREATE_GEOMETRY, value.address()); }
    /** Unsafe version of {@link #update_geometry(ULGPUDriverUpdateGeometryCallbackI) update_geometry}. */
    public static void nupdate_geometry(long struct, ULGPUDriverUpdateGeometryCallbackI value) { memPutAddress(struct + ULGPUDriver.UPDATE_GEOMETRY, value.address()); }
    /** Unsafe version of {@link #destroy_geometry(ULGPUDriverDestroyGeometryCallbackI) destroy_geometry}. */
    public static void ndestroy_geometry(long struct, ULGPUDriverDestroyGeometryCallbackI value) { memPutAddress(struct + ULGPUDriver.DESTROY_GEOMETRY, value.address()); }
    /** Unsafe version of {@link #update_command_list(ULGPUDriverUpdateCommandListCallbackI) update_command_list}. */
    public static void nupdate_command_list(long struct, ULGPUDriverUpdateCommandListCallbackI value) { memPutAddress(struct + ULGPUDriver.UPDATE_COMMAND_LIST, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ULGPUDriver.BEGIN_SYNCHRONIZE));
        check(memGetAddress(struct + ULGPUDriver.END_SYNCHRONIZE));
        check(memGetAddress(struct + ULGPUDriver.NEXT_TEXTURE_ID));
        check(memGetAddress(struct + ULGPUDriver.CREATE_TEXTURE));
        check(memGetAddress(struct + ULGPUDriver.UPDATE_TEXTURE));
        check(memGetAddress(struct + ULGPUDriver.DESTROY_TEXTURE));
        check(memGetAddress(struct + ULGPUDriver.NEXT_RENDER_BUFFER_ID));
        check(memGetAddress(struct + ULGPUDriver.CREATE_RENDER_BUFFER));
        check(memGetAddress(struct + ULGPUDriver.DESTROY_RENDER_BUFFER));
        check(memGetAddress(struct + ULGPUDriver.NEXT_GEOMETRY_ID));
        check(memGetAddress(struct + ULGPUDriver.CREATE_GEOMETRY));
        check(memGetAddress(struct + ULGPUDriver.UPDATE_GEOMETRY));
        check(memGetAddress(struct + ULGPUDriver.DESTROY_GEOMETRY));
        check(memGetAddress(struct + ULGPUDriver.UPDATE_COMMAND_LIST));
    }

    // -----------------------------------

    /** An array of {@link ULGPUDriver} structs. */
    public static class Buffer extends StructBuffer<ULGPUDriver, Buffer> implements NativeResource {

        private static final ULGPUDriver ELEMENT_FACTORY = ULGPUDriver.create(-1L);

        /**
         * Creates a new {@code ULGPUDriver.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ULGPUDriver#SIZEOF}, and its mark will be undefined.
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
        protected ULGPUDriver getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code begin_synchronize} field. */
        public ULGPUDriverBeginSynchronizeCallback begin_synchronize() { return ULGPUDriver.nbegin_synchronize(address()); }
        /** @return the value of the {@code end_synchronize} field. */
        public ULGPUDriverEndSynchronizeCallback end_synchronize() { return ULGPUDriver.nend_synchronize(address()); }
        /** @return the value of the {@code next_texture_id} field. */
        public ULGPUDriverNextTextureIdCallback next_texture_id() { return ULGPUDriver.nnext_texture_id(address()); }
        /** @return the value of the {@code create_texture} field. */
        public ULGPUDriverCreateTextureCallback create_texture() { return ULGPUDriver.ncreate_texture(address()); }
        /** @return the value of the {@code update_texture} field. */
        public ULGPUDriverUpdateTextureCallback update_texture() { return ULGPUDriver.nupdate_texture(address()); }
        /** @return the value of the {@code destroy_texture} field. */
        public ULGPUDriverDestroyTextureCallback destroy_texture() { return ULGPUDriver.ndestroy_texture(address()); }
        /** @return the value of the {@code next_render_buffer_id} field. */
        @NativeType("ULGPUDriverNextRenderBufferIdCallback")
        public ULGPUDriverNextRenderBufferIDCallback next_render_buffer_id() { return ULGPUDriver.nnext_render_buffer_id(address()); }
        /** @return the value of the {@code create_render_buffer} field. */
        public ULGPUDriverCreateRenderBufferCallback create_render_buffer() { return ULGPUDriver.ncreate_render_buffer(address()); }
        /** @return the value of the {@code destroy_render_buffer} field. */
        public ULGPUDriverDestroyRenderBufferCallback destroy_render_buffer() { return ULGPUDriver.ndestroy_render_buffer(address()); }
        /** @return the value of the {@code next_geometry_id} field. */
        @NativeType("ULGPUDriverNextGeometryIdCallback")
        public ULGPUDriverNextGeometryIDCallback next_geometry_id() { return ULGPUDriver.nnext_geometry_id(address()); }
        /** @return the value of the {@code create_geometry} field. */
        public ULGPUDriverCreateGeometryCallback create_geometry() { return ULGPUDriver.ncreate_geometry(address()); }
        /** @return the value of the {@code update_geometry} field. */
        public ULGPUDriverUpdateGeometryCallback update_geometry() { return ULGPUDriver.nupdate_geometry(address()); }
        /** @return the value of the {@code destroy_geometry} field. */
        public ULGPUDriverDestroyGeometryCallback destroy_geometry() { return ULGPUDriver.ndestroy_geometry(address()); }
        /** @return the value of the {@code update_command_list} field. */
        public ULGPUDriverUpdateCommandListCallback update_command_list() { return ULGPUDriver.nupdate_command_list(address()); }

        /** Sets the specified value to the {@code begin_synchronize} field. */
        public ULGPUDriver.Buffer begin_synchronize(@NativeType("ULGPUDriverBeginSynchronizeCallback") ULGPUDriverBeginSynchronizeCallbackI value) { ULGPUDriver.nbegin_synchronize(address(), value); return this; }
        /** Sets the specified value to the {@code end_synchronize} field. */
        public ULGPUDriver.Buffer end_synchronize(@NativeType("ULGPUDriverEndSynchronizeCallback") ULGPUDriverEndSynchronizeCallbackI value) { ULGPUDriver.nend_synchronize(address(), value); return this; }
        /** Sets the specified value to the {@code next_texture_id} field. */
        public ULGPUDriver.Buffer next_texture_id(@NativeType("ULGPUDriverNextTextureIdCallback") ULGPUDriverNextTextureIdCallbackI value) { ULGPUDriver.nnext_texture_id(address(), value); return this; }
        /** Sets the specified value to the {@code create_texture} field. */
        public ULGPUDriver.Buffer create_texture(@NativeType("ULGPUDriverCreateTextureCallback") ULGPUDriverCreateTextureCallbackI value) { ULGPUDriver.ncreate_texture(address(), value); return this; }
        /** Sets the specified value to the {@code update_texture} field. */
        public ULGPUDriver.Buffer update_texture(@NativeType("ULGPUDriverUpdateTextureCallback") ULGPUDriverUpdateTextureCallbackI value) { ULGPUDriver.nupdate_texture(address(), value); return this; }
        /** Sets the specified value to the {@code destroy_texture} field. */
        public ULGPUDriver.Buffer destroy_texture(@NativeType("ULGPUDriverDestroyTextureCallback") ULGPUDriverDestroyTextureCallbackI value) { ULGPUDriver.ndestroy_texture(address(), value); return this; }
        /** Sets the specified value to the {@code next_render_buffer_id} field. */
        public ULGPUDriver.Buffer next_render_buffer_id(@NativeType("ULGPUDriverNextRenderBufferIdCallback") ULGPUDriverNextRenderBufferIDCallbackI value) { ULGPUDriver.nnext_render_buffer_id(address(), value); return this; }
        /** Sets the specified value to the {@code create_render_buffer} field. */
        public ULGPUDriver.Buffer create_render_buffer(@NativeType("ULGPUDriverCreateRenderBufferCallback") ULGPUDriverCreateRenderBufferCallbackI value) { ULGPUDriver.ncreate_render_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code destroy_render_buffer} field. */
        public ULGPUDriver.Buffer destroy_render_buffer(@NativeType("ULGPUDriverDestroyRenderBufferCallback") ULGPUDriverDestroyRenderBufferCallbackI value) { ULGPUDriver.ndestroy_render_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code next_geometry_id} field. */
        public ULGPUDriver.Buffer next_geometry_id(@NativeType("ULGPUDriverNextGeometryIdCallback") ULGPUDriverNextGeometryIDCallbackI value) { ULGPUDriver.nnext_geometry_id(address(), value); return this; }
        /** Sets the specified value to the {@code create_geometry} field. */
        public ULGPUDriver.Buffer create_geometry(@NativeType("ULGPUDriverCreateGeometryCallback") ULGPUDriverCreateGeometryCallbackI value) { ULGPUDriver.ncreate_geometry(address(), value); return this; }
        /** Sets the specified value to the {@code update_geometry} field. */
        public ULGPUDriver.Buffer update_geometry(@NativeType("ULGPUDriverUpdateGeometryCallback") ULGPUDriverUpdateGeometryCallbackI value) { ULGPUDriver.nupdate_geometry(address(), value); return this; }
        /** Sets the specified value to the {@code destroy_geometry} field. */
        public ULGPUDriver.Buffer destroy_geometry(@NativeType("ULGPUDriverDestroyGeometryCallback") ULGPUDriverDestroyGeometryCallbackI value) { ULGPUDriver.ndestroy_geometry(address(), value); return this; }
        /** Sets the specified value to the {@code update_command_list} field. */
        public ULGPUDriver.Buffer update_command_list(@NativeType("ULGPUDriverUpdateCommandListCallback") ULGPUDriverUpdateCommandListCallbackI value) { ULGPUDriver.nupdate_command_list(address(), value); return this; }

    }

}