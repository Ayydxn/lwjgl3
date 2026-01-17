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
 * struct JSClassDefinition {
 *     int version;
 *     JSClassAttributes * attributes;
 *     char * className;
 *     OpaqueJSClass * parentClass;
 *     {@link JSStaticValue JSStaticValue} const * staticValues;
 *     {@link JSStaticFunction JSStaticFunction} const * staticFunctions;
 *     {@link JSObjectInitializeCallbackI JSObjectInitializeCallback} * initialize;
 *     {@link JSObjectFinalizeCallbackI JSObjectFinalizeCallback} * finalize;
 *     {@link JSObjectHasPropertyCallbackI JSObjectHasPropertyCallback} * hasProperty;
 *     {@link JSObjectGetPropertyCallbackI JSObjectGetPropertyCallback} * getProperty;
 *     {@link JSObjectSetPropertyCallbackI JSObjectSetPropertyCallback} * setProperty;
 *     {@link JSObjectDeletePropertyCallbackI JSObjectDeletePropertyCallback} * deleteProperty;
 *     {@link JSObjectGetPropertyNamesCallbackI JSObjectGetPropertyNamesCallback} * getPropertyNames;
 *     {@link JSObjectCallAsFunctionCallbackI JSObjectCallAsFunctionCallback} * callAsFunction;
 *     {@link JSObjectCallAsConstructorCallbackI JSObjectCallAsConstructorCallback} * callAsConstructor;
 *     {@link JSObjectHasInstanceCallbackI JSObjectHasInstanceCallback} * hasInstance;
 *     {@link JSObjectConvertToTypeCallbackI JSObjectConvertToTypeCallback} * convertToType;
 * }</code></pre>
 */
public class JSClassDefinition extends Struct<JSClassDefinition> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        ATTRIBUTES,
        CLASSNAME,
        PARENTCLASS,
        STATICVALUES,
        STATICFUNCTIONS,
        INITIALIZE,
        FINALIZE,
        HASPROPERTY,
        GETPROPERTY,
        SETPROPERTY,
        DELETEPROPERTY,
        GETPROPERTYNAMES,
        CALLASFUNCTION,
        CALLASCONSTRUCTOR,
        HASINSTANCE,
        CONVERTTOTYPE;

    static {
        Layout layout = __struct(
            __member(4),
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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        ATTRIBUTES = layout.offsetof(1);
        CLASSNAME = layout.offsetof(2);
        PARENTCLASS = layout.offsetof(3);
        STATICVALUES = layout.offsetof(4);
        STATICFUNCTIONS = layout.offsetof(5);
        INITIALIZE = layout.offsetof(6);
        FINALIZE = layout.offsetof(7);
        HASPROPERTY = layout.offsetof(8);
        GETPROPERTY = layout.offsetof(9);
        SETPROPERTY = layout.offsetof(10);
        DELETEPROPERTY = layout.offsetof(11);
        GETPROPERTYNAMES = layout.offsetof(12);
        CALLASFUNCTION = layout.offsetof(13);
        CALLASCONSTRUCTOR = layout.offsetof(14);
        HASINSTANCE = layout.offsetof(15);
        CONVERTTOTYPE = layout.offsetof(16);
    }

    protected JSClassDefinition(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JSClassDefinition create(long address, @Nullable ByteBuffer container) {
        return new JSClassDefinition(address, container);
    }

    /**
     * Creates a {@code JSClassDefinition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JSClassDefinition(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    public int version() { return nversion(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field. */
    @NativeType("JSClassAttributes *")
    public IntBuffer attributes(int capacity) { return nattributes(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code className} field. */
    @NativeType("char *")
    public ByteBuffer className() { return nclassName(address()); }
    /** @return the null-terminated string pointed to by the {@code className} field. */
    @NativeType("char *")
    public String classNameString() { return nclassNameString(address()); }
    /** @return the value of the {@code parentClass} field. */
    @NativeType("OpaqueJSClass *")
    public long parentClass() { return nparentClass(address()); }
    /** @return a {@link JSStaticValue} view of the struct pointed to by the {@code staticValues} field. */
    @NativeType("JSStaticValue const *")
    public JSStaticValue staticValues() { return nstaticValues(address()); }
    /** @return a {@link JSStaticFunction} view of the struct pointed to by the {@code staticFunctions} field. */
    @NativeType("JSStaticFunction const *")
    public JSStaticFunction staticFunctions() { return nstaticFunctions(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code initialize} field. */
    @NativeType("JSObjectInitializeCallback *")
    public PointerBuffer initialize(int capacity) { return ninitialize(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code finalize} field. */
    @NativeType("JSObjectFinalizeCallback *")
    public PointerBuffer finalize(int capacity) { return nfinalize(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code hasProperty} field. */
    @NativeType("JSObjectHasPropertyCallback *")
    public PointerBuffer hasProperty(int capacity) { return nhasProperty(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code getProperty} field. */
    @NativeType("JSObjectGetPropertyCallback *")
    public PointerBuffer getProperty(int capacity) { return ngetProperty(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code setProperty} field. */
    @NativeType("JSObjectSetPropertyCallback *")
    public PointerBuffer setProperty(int capacity) { return nsetProperty(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code deleteProperty} field. */
    @NativeType("JSObjectDeletePropertyCallback *")
    public PointerBuffer deleteProperty(int capacity) { return ndeleteProperty(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code getPropertyNames} field. */
    @NativeType("JSObjectGetPropertyNamesCallback *")
    public PointerBuffer getPropertyNames(int capacity) { return ngetPropertyNames(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsFunction} field. */
    @NativeType("JSObjectCallAsFunctionCallback *")
    public PointerBuffer callAsFunction(int capacity) { return ncallAsFunction(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsConstructor} field. */
    @NativeType("JSObjectCallAsConstructorCallback *")
    public PointerBuffer callAsConstructor(int capacity) { return ncallAsConstructor(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code hasInstance} field. */
    @NativeType("JSObjectHasInstanceCallback *")
    public PointerBuffer hasInstance(int capacity) { return nhasInstance(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code convertToType} field. */
    @NativeType("JSObjectConvertToTypeCallback *")
    public PointerBuffer convertToType(int capacity) { return nconvertToType(address(), capacity); }

    /** Sets the specified value to the {@code version} field. */
    public JSClassDefinition version(int value) { nversion(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
    public JSClassDefinition attributes(@NativeType("JSClassAttributes *") IntBuffer value) { nattributes(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code className} field. */
    public JSClassDefinition className(@NativeType("char *") ByteBuffer value) { nclassName(address(), value); return this; }
    /** Sets the specified value to the {@code parentClass} field. */
    public JSClassDefinition parentClass(@NativeType("OpaqueJSClass *") long value) { nparentClass(address(), value); return this; }
    /** Sets the address of the specified {@link JSStaticValue} to the {@code staticValues} field. */
    public JSClassDefinition staticValues(@NativeType("JSStaticValue const *") JSStaticValue value) { nstaticValues(address(), value); return this; }
    /** Sets the address of the specified {@link JSStaticFunction} to the {@code staticFunctions} field. */
    public JSClassDefinition staticFunctions(@NativeType("JSStaticFunction const *") JSStaticFunction value) { nstaticFunctions(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code initialize} field. */
    public JSClassDefinition initialize(@NativeType("JSObjectInitializeCallback *") PointerBuffer value) { ninitialize(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code finalize} field. */
    public JSClassDefinition finalize(@NativeType("JSObjectFinalizeCallback *") PointerBuffer value) { nfinalize(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code hasProperty} field. */
    public JSClassDefinition hasProperty(@NativeType("JSObjectHasPropertyCallback *") PointerBuffer value) { nhasProperty(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getProperty} field. */
    public JSClassDefinition getProperty(@NativeType("JSObjectGetPropertyCallback *") PointerBuffer value) { ngetProperty(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code setProperty} field. */
    public JSClassDefinition setProperty(@NativeType("JSObjectSetPropertyCallback *") PointerBuffer value) { nsetProperty(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code deleteProperty} field. */
    public JSClassDefinition deleteProperty(@NativeType("JSObjectDeletePropertyCallback *") PointerBuffer value) { ndeleteProperty(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code getPropertyNames} field. */
    public JSClassDefinition getPropertyNames(@NativeType("JSObjectGetPropertyNamesCallback *") PointerBuffer value) { ngetPropertyNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsFunction} field. */
    public JSClassDefinition callAsFunction(@NativeType("JSObjectCallAsFunctionCallback *") PointerBuffer value) { ncallAsFunction(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsConstructor} field. */
    public JSClassDefinition callAsConstructor(@NativeType("JSObjectCallAsConstructorCallback *") PointerBuffer value) { ncallAsConstructor(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code hasInstance} field. */
    public JSClassDefinition hasInstance(@NativeType("JSObjectHasInstanceCallback *") PointerBuffer value) { nhasInstance(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code convertToType} field. */
    public JSClassDefinition convertToType(@NativeType("JSObjectConvertToTypeCallback *") PointerBuffer value) { nconvertToType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JSClassDefinition set(
        int version,
        IntBuffer attributes,
        ByteBuffer className,
        long parentClass,
        JSStaticValue staticValues,
        JSStaticFunction staticFunctions,
        PointerBuffer initialize,
        PointerBuffer finalize,
        PointerBuffer hasProperty,
        PointerBuffer getProperty,
        PointerBuffer setProperty,
        PointerBuffer deleteProperty,
        PointerBuffer getPropertyNames,
        PointerBuffer callAsFunction,
        PointerBuffer callAsConstructor,
        PointerBuffer hasInstance,
        PointerBuffer convertToType
    ) {
        version(version);
        attributes(attributes);
        className(className);
        parentClass(parentClass);
        staticValues(staticValues);
        staticFunctions(staticFunctions);
        initialize(initialize);
        finalize(finalize);
        hasProperty(hasProperty);
        getProperty(getProperty);
        setProperty(setProperty);
        deleteProperty(deleteProperty);
        getPropertyNames(getPropertyNames);
        callAsFunction(callAsFunction);
        callAsConstructor(callAsConstructor);
        hasInstance(hasInstance);
        convertToType(convertToType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JSClassDefinition set(JSClassDefinition src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JSClassDefinition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JSClassDefinition malloc() {
        return new JSClassDefinition(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code JSClassDefinition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JSClassDefinition calloc() {
        return new JSClassDefinition(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code JSClassDefinition} instance allocated with {@link BufferUtils}. */
    public static JSClassDefinition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new JSClassDefinition(memAddress(container), container);
    }

    /** Returns a new {@code JSClassDefinition} instance for the specified memory address. */
    public static JSClassDefinition create(long address) {
        return new JSClassDefinition(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable JSClassDefinition createSafe(long address) {
        return address == NULL ? null : new JSClassDefinition(address, null);
    }

    /**
     * Returns a new {@link JSClassDefinition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link JSClassDefinition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSClassDefinition.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link JSClassDefinition.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static JSClassDefinition.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code JSClassDefinition} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JSClassDefinition malloc(MemoryStack stack) {
        return new JSClassDefinition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code JSClassDefinition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JSClassDefinition calloc(MemoryStack stack) {
        return new JSClassDefinition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link JSClassDefinition.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JSClassDefinition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JSClassDefinition.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + JSClassDefinition.VERSION); }
    /** Unsafe version of {@link #attributes(int) attributes}. */
    public static IntBuffer nattributes(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + JSClassDefinition.ATTRIBUTES), capacity); }
    /** Unsafe version of {@link #className}. */
    public static ByteBuffer nclassName(long struct) { return memByteBufferNT1(memGetAddress(struct + JSClassDefinition.CLASSNAME)); }
    /** Unsafe version of {@link #classNameString}. */
    public static String nclassNameString(long struct) { return memASCII(memGetAddress(struct + JSClassDefinition.CLASSNAME)); }
    /** Unsafe version of {@link #parentClass}. */
    public static long nparentClass(long struct) { return memGetAddress(struct + JSClassDefinition.PARENTCLASS); }
    /** Unsafe version of {@link #staticValues}. */
    public static JSStaticValue nstaticValues(long struct) { return JSStaticValue.create(memGetAddress(struct + JSClassDefinition.STATICVALUES)); }
    /** Unsafe version of {@link #staticFunctions}. */
    public static JSStaticFunction nstaticFunctions(long struct) { return JSStaticFunction.create(memGetAddress(struct + JSClassDefinition.STATICFUNCTIONS)); }
    /** Unsafe version of {@link #initialize(int) initialize}. */
    public static PointerBuffer ninitialize(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.INITIALIZE), capacity); }
    /** Unsafe version of {@link #finalize(int) finalize}. */
    public static PointerBuffer nfinalize(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.FINALIZE), capacity); }
    /** Unsafe version of {@link #hasProperty(int) hasProperty}. */
    public static PointerBuffer nhasProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.HASPROPERTY), capacity); }
    /** Unsafe version of {@link #getProperty(int) getProperty}. */
    public static PointerBuffer ngetProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.GETPROPERTY), capacity); }
    /** Unsafe version of {@link #setProperty(int) setProperty}. */
    public static PointerBuffer nsetProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.SETPROPERTY), capacity); }
    /** Unsafe version of {@link #deleteProperty(int) deleteProperty}. */
    public static PointerBuffer ndeleteProperty(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.DELETEPROPERTY), capacity); }
    /** Unsafe version of {@link #getPropertyNames(int) getPropertyNames}. */
    public static PointerBuffer ngetPropertyNames(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.GETPROPERTYNAMES), capacity); }
    /** Unsafe version of {@link #callAsFunction(int) callAsFunction}. */
    public static PointerBuffer ncallAsFunction(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.CALLASFUNCTION), capacity); }
    /** Unsafe version of {@link #callAsConstructor(int) callAsConstructor}. */
    public static PointerBuffer ncallAsConstructor(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.CALLASCONSTRUCTOR), capacity); }
    /** Unsafe version of {@link #hasInstance(int) hasInstance}. */
    public static PointerBuffer nhasInstance(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.HASINSTANCE), capacity); }
    /** Unsafe version of {@link #convertToType(int) convertToType}. */
    public static PointerBuffer nconvertToType(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + JSClassDefinition.CONVERTTOTYPE), capacity); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + JSClassDefinition.VERSION, value); }
    /** Unsafe version of {@link #attributes(IntBuffer) attributes}. */
    public static void nattributes(long struct, IntBuffer value) { memPutAddress(struct + JSClassDefinition.ATTRIBUTES, memAddress(value)); }
    /** Unsafe version of {@link #className(ByteBuffer) className}. */
    public static void nclassName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + JSClassDefinition.CLASSNAME, memAddress(value));
    }
    /** Unsafe version of {@link #parentClass(long) parentClass}. */
    public static void nparentClass(long struct, long value) { memPutAddress(struct + JSClassDefinition.PARENTCLASS, check(value)); }
    /** Unsafe version of {@link #staticValues(JSStaticValue) staticValues}. */
    public static void nstaticValues(long struct, JSStaticValue value) { memPutAddress(struct + JSClassDefinition.STATICVALUES, value.address()); }
    /** Unsafe version of {@link #staticFunctions(JSStaticFunction) staticFunctions}. */
    public static void nstaticFunctions(long struct, JSStaticFunction value) { memPutAddress(struct + JSClassDefinition.STATICFUNCTIONS, value.address()); }
    /** Unsafe version of {@link #initialize(PointerBuffer) initialize}. */
    public static void ninitialize(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.INITIALIZE, memAddress(value)); }
    /** Unsafe version of {@link #finalize(PointerBuffer) finalize}. */
    public static void nfinalize(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.FINALIZE, memAddress(value)); }
    /** Unsafe version of {@link #hasProperty(PointerBuffer) hasProperty}. */
    public static void nhasProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.HASPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #getProperty(PointerBuffer) getProperty}. */
    public static void ngetProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.GETPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #setProperty(PointerBuffer) setProperty}. */
    public static void nsetProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.SETPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #deleteProperty(PointerBuffer) deleteProperty}. */
    public static void ndeleteProperty(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.DELETEPROPERTY, memAddress(value)); }
    /** Unsafe version of {@link #getPropertyNames(PointerBuffer) getPropertyNames}. */
    public static void ngetPropertyNames(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.GETPROPERTYNAMES, memAddress(value)); }
    /** Unsafe version of {@link #callAsFunction(PointerBuffer) callAsFunction}. */
    public static void ncallAsFunction(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.CALLASFUNCTION, memAddress(value)); }
    /** Unsafe version of {@link #callAsConstructor(PointerBuffer) callAsConstructor}. */
    public static void ncallAsConstructor(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.CALLASCONSTRUCTOR, memAddress(value)); }
    /** Unsafe version of {@link #hasInstance(PointerBuffer) hasInstance}. */
    public static void nhasInstance(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.HASINSTANCE, memAddress(value)); }
    /** Unsafe version of {@link #convertToType(PointerBuffer) convertToType}. */
    public static void nconvertToType(long struct, PointerBuffer value) { memPutAddress(struct + JSClassDefinition.CONVERTTOTYPE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + JSClassDefinition.ATTRIBUTES));
        check(memGetAddress(struct + JSClassDefinition.CLASSNAME));
        check(memGetAddress(struct + JSClassDefinition.PARENTCLASS));
        long staticValues = memGetAddress(struct + JSClassDefinition.STATICVALUES);
        check(staticValues);
        JSStaticValue.validate(staticValues);
        long staticFunctions = memGetAddress(struct + JSClassDefinition.STATICFUNCTIONS);
        check(staticFunctions);
        JSStaticFunction.validate(staticFunctions);
        check(memGetAddress(struct + JSClassDefinition.INITIALIZE));
        check(memGetAddress(struct + JSClassDefinition.FINALIZE));
        check(memGetAddress(struct + JSClassDefinition.HASPROPERTY));
        check(memGetAddress(struct + JSClassDefinition.GETPROPERTY));
        check(memGetAddress(struct + JSClassDefinition.SETPROPERTY));
        check(memGetAddress(struct + JSClassDefinition.DELETEPROPERTY));
        check(memGetAddress(struct + JSClassDefinition.GETPROPERTYNAMES));
        check(memGetAddress(struct + JSClassDefinition.CALLASFUNCTION));
        check(memGetAddress(struct + JSClassDefinition.CALLASCONSTRUCTOR));
        check(memGetAddress(struct + JSClassDefinition.HASINSTANCE));
        check(memGetAddress(struct + JSClassDefinition.CONVERTTOTYPE));
    }

    // -----------------------------------

    /** An array of {@link JSClassDefinition} structs. */
    public static class Buffer extends StructBuffer<JSClassDefinition, Buffer> implements NativeResource {

        private static final JSClassDefinition ELEMENT_FACTORY = JSClassDefinition.create(-1L);

        /**
         * Creates a new {@code JSClassDefinition.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JSClassDefinition#SIZEOF}, and its mark will be undefined.</p>
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
        protected JSClassDefinition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        public int version() { return JSClassDefinition.nversion(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code attributes} field. */
        @NativeType("JSClassAttributes *")
        public IntBuffer attributes(int capacity) { return JSClassDefinition.nattributes(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code className} field. */
        @NativeType("char *")
        public ByteBuffer className() { return JSClassDefinition.nclassName(address()); }
        /** @return the null-terminated string pointed to by the {@code className} field. */
        @NativeType("char *")
        public String classNameString() { return JSClassDefinition.nclassNameString(address()); }
        /** @return the value of the {@code parentClass} field. */
        @NativeType("OpaqueJSClass *")
        public long parentClass() { return JSClassDefinition.nparentClass(address()); }
        /** @return a {@link JSStaticValue} view of the struct pointed to by the {@code staticValues} field. */
        @NativeType("JSStaticValue const *")
        public JSStaticValue staticValues() { return JSClassDefinition.nstaticValues(address()); }
        /** @return a {@link JSStaticFunction} view of the struct pointed to by the {@code staticFunctions} field. */
        @NativeType("JSStaticFunction const *")
        public JSStaticFunction staticFunctions() { return JSClassDefinition.nstaticFunctions(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code initialize} field. */
        @NativeType("JSObjectInitializeCallback *")
        public PointerBuffer initialize(int capacity) { return JSClassDefinition.ninitialize(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code finalize} field. */
        @NativeType("JSObjectFinalizeCallback *")
        public PointerBuffer finalize(int capacity) { return JSClassDefinition.nfinalize(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code hasProperty} field. */
        @NativeType("JSObjectHasPropertyCallback *")
        public PointerBuffer hasProperty(int capacity) { return JSClassDefinition.nhasProperty(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code getProperty} field. */
        @NativeType("JSObjectGetPropertyCallback *")
        public PointerBuffer getProperty(int capacity) { return JSClassDefinition.ngetProperty(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code setProperty} field. */
        @NativeType("JSObjectSetPropertyCallback *")
        public PointerBuffer setProperty(int capacity) { return JSClassDefinition.nsetProperty(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code deleteProperty} field. */
        @NativeType("JSObjectDeletePropertyCallback *")
        public PointerBuffer deleteProperty(int capacity) { return JSClassDefinition.ndeleteProperty(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code getPropertyNames} field. */
        @NativeType("JSObjectGetPropertyNamesCallback *")
        public PointerBuffer getPropertyNames(int capacity) { return JSClassDefinition.ngetPropertyNames(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsFunction} field. */
        @NativeType("JSObjectCallAsFunctionCallback *")
        public PointerBuffer callAsFunction(int capacity) { return JSClassDefinition.ncallAsFunction(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code callAsConstructor} field. */
        @NativeType("JSObjectCallAsConstructorCallback *")
        public PointerBuffer callAsConstructor(int capacity) { return JSClassDefinition.ncallAsConstructor(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code hasInstance} field. */
        @NativeType("JSObjectHasInstanceCallback *")
        public PointerBuffer hasInstance(int capacity) { return JSClassDefinition.nhasInstance(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code convertToType} field. */
        @NativeType("JSObjectConvertToTypeCallback *")
        public PointerBuffer convertToType(int capacity) { return JSClassDefinition.nconvertToType(address(), capacity); }

        /** Sets the specified value to the {@code version} field. */
        public JSClassDefinition.Buffer version(int value) { JSClassDefinition.nversion(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code attributes} field. */
        public JSClassDefinition.Buffer attributes(@NativeType("JSClassAttributes *") IntBuffer value) { JSClassDefinition.nattributes(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code className} field. */
        public JSClassDefinition.Buffer className(@NativeType("char *") ByteBuffer value) { JSClassDefinition.nclassName(address(), value); return this; }
        /** Sets the specified value to the {@code parentClass} field. */
        public JSClassDefinition.Buffer parentClass(@NativeType("OpaqueJSClass *") long value) { JSClassDefinition.nparentClass(address(), value); return this; }
        /** Sets the address of the specified {@link JSStaticValue} to the {@code staticValues} field. */
        public JSClassDefinition.Buffer staticValues(@NativeType("JSStaticValue const *") JSStaticValue value) { JSClassDefinition.nstaticValues(address(), value); return this; }
        /** Sets the address of the specified {@link JSStaticFunction} to the {@code staticFunctions} field. */
        public JSClassDefinition.Buffer staticFunctions(@NativeType("JSStaticFunction const *") JSStaticFunction value) { JSClassDefinition.nstaticFunctions(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code initialize} field. */
        public JSClassDefinition.Buffer initialize(@NativeType("JSObjectInitializeCallback *") PointerBuffer value) { JSClassDefinition.ninitialize(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code finalize} field. */
        public JSClassDefinition.Buffer finalize(@NativeType("JSObjectFinalizeCallback *") PointerBuffer value) { JSClassDefinition.nfinalize(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code hasProperty} field. */
        public JSClassDefinition.Buffer hasProperty(@NativeType("JSObjectHasPropertyCallback *") PointerBuffer value) { JSClassDefinition.nhasProperty(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getProperty} field. */
        public JSClassDefinition.Buffer getProperty(@NativeType("JSObjectGetPropertyCallback *") PointerBuffer value) { JSClassDefinition.ngetProperty(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code setProperty} field. */
        public JSClassDefinition.Buffer setProperty(@NativeType("JSObjectSetPropertyCallback *") PointerBuffer value) { JSClassDefinition.nsetProperty(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code deleteProperty} field. */
        public JSClassDefinition.Buffer deleteProperty(@NativeType("JSObjectDeletePropertyCallback *") PointerBuffer value) { JSClassDefinition.ndeleteProperty(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code getPropertyNames} field. */
        public JSClassDefinition.Buffer getPropertyNames(@NativeType("JSObjectGetPropertyNamesCallback *") PointerBuffer value) { JSClassDefinition.ngetPropertyNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsFunction} field. */
        public JSClassDefinition.Buffer callAsFunction(@NativeType("JSObjectCallAsFunctionCallback *") PointerBuffer value) { JSClassDefinition.ncallAsFunction(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code callAsConstructor} field. */
        public JSClassDefinition.Buffer callAsConstructor(@NativeType("JSObjectCallAsConstructorCallback *") PointerBuffer value) { JSClassDefinition.ncallAsConstructor(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code hasInstance} field. */
        public JSClassDefinition.Buffer hasInstance(@NativeType("JSObjectHasInstanceCallback *") PointerBuffer value) { JSClassDefinition.nhasInstance(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code convertToType} field. */
        public JSClassDefinition.Buffer convertToType(@NativeType("JSObjectConvertToTypeCallback *") PointerBuffer value) { JSClassDefinition.nconvertToType(address(), value); return this; }

    }

}