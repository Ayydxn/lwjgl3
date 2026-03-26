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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class JavaScriptCore {

    private static final SharedLibrary WEBCORE = Library.loadNative(JavaScriptCore.class, "org.lwjgl.ultralight", "WebCore");

    /** Contains the function pointers loaded from the WebCore {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            EvaluateScript                               = apiGetFunctionAddress(WEBCORE, "JSEvaluateScript"),
            CheckScriptSyntax                            = apiGetFunctionAddress(WEBCORE, "JSCheckScriptSyntax"),
            GarbageCollect                               = apiGetFunctionAddress(WEBCORE, "JSGarbageCollect"),
            ContextGroupCreate                           = apiGetFunctionAddress(WEBCORE, "JSContextGroupCreate"),
            ContextGroupRetain                           = apiGetFunctionAddress(WEBCORE, "JSContextGroupRetain"),
            ContextGroupRelease                          = apiGetFunctionAddress(WEBCORE, "JSContextGroupRelease"),
            GlobalContextCreate                          = apiGetFunctionAddress(WEBCORE, "JSGlobalContextCreate"),
            GlobalContextCreateInGroup                   = apiGetFunctionAddress(WEBCORE, "JSGlobalContextCreateInGroup"),
            GlobalContextRetain                          = apiGetFunctionAddress(WEBCORE, "JSGlobalContextRetain"),
            GlobalContextRelease                         = apiGetFunctionAddress(WEBCORE, "JSGlobalContextRelease"),
            ContextGetGlobalObject                       = apiGetFunctionAddress(WEBCORE, "JSContextGetGlobalObject"),
            ContextGetGroup                              = apiGetFunctionAddress(WEBCORE, "JSContextGetGroup"),
            ContextGetGlobalContext                      = apiGetFunctionAddress(WEBCORE, "JSContextGetGlobalContext"),
            GlobalContextCopyName                        = apiGetFunctionAddress(WEBCORE, "JSGlobalContextCopyName"),
            GlobalContextSetName                         = apiGetFunctionAddress(WEBCORE, "JSGlobalContextSetName"),
            GlobalContextIsInspectable                   = apiGetFunctionAddress(WEBCORE, "JSGlobalContextIsInspectable"),
            GlobalContextSetInspectable                  = apiGetFunctionAddress(WEBCORE, "JSGlobalContextSetInspectable"),
            ClassCreate                                  = apiGetFunctionAddress(WEBCORE, "JSClassCreate"),
            ClassRetain                                  = apiGetFunctionAddress(WEBCORE, "JSClassRetain"),
            ClassRelease                                 = apiGetFunctionAddress(WEBCORE, "JSClassRelease"),
            ObjectMake                                   = apiGetFunctionAddress(WEBCORE, "JSObjectMake"),
            ObjectMakeFunctionWithCallback               = apiGetFunctionAddress(WEBCORE, "JSObjectMakeFunctionWithCallback"),
            ObjectMakeArray                              = apiGetFunctionAddress(WEBCORE, "JSObjectMakeArray"),
            ObjectMakeDate                               = apiGetFunctionAddress(WEBCORE, "JSObjectMakeDate"),
            ObjectMakeError                              = apiGetFunctionAddress(WEBCORE, "JSObjectMakeError"),
            ObjectMakeRegExp                             = apiGetFunctionAddress(WEBCORE, "JSObjectMakeRegExp"),
            ObjectMakeDeferredPromise                    = apiGetFunctionAddress(WEBCORE, "JSObjectMakeDeferredPromise"),
            ObjectMakeFunction                           = apiGetFunctionAddress(WEBCORE, "JSObjectMakeFunction"),
            ObjectGetPrototype                           = apiGetFunctionAddress(WEBCORE, "JSObjectGetPrototype"),
            ObjectSetPrototype                           = apiGetFunctionAddress(WEBCORE, "JSObjectSetPrototype"),
            ObjectHasProperty                            = apiGetFunctionAddress(WEBCORE, "JSObjectHasProperty"),
            ObjectGetProperty                            = apiGetFunctionAddress(WEBCORE, "JSObjectGetProperty"),
            ObjectSetProperty                            = apiGetFunctionAddress(WEBCORE, "JSObjectSetProperty"),
            ObjectDeleteProperty                         = apiGetFunctionAddress(WEBCORE, "JSObjectDeleteProperty"),
            ObjectHasPropertyForKey                      = apiGetFunctionAddress(WEBCORE, "JSObjectHasPropertyForKey"),
            ObjectGetPropertyForKey                      = apiGetFunctionAddress(WEBCORE, "JSObjectGetPropertyForKey"),
            ObjectSetPropertyForKey                      = apiGetFunctionAddress(WEBCORE, "JSObjectSetPropertyForKey"),
            ObjectDeletePropertyForKey                   = apiGetFunctionAddress(WEBCORE, "JSObjectDeletePropertyForKey"),
            ObjectGetPropertyAtIndex                     = apiGetFunctionAddress(WEBCORE, "JSObjectGetPropertyAtIndex"),
            ObjectGetPrivate                             = apiGetFunctionAddress(WEBCORE, "JSObjectGetPrivate"),
            ObjectSetPrivate                             = apiGetFunctionAddress(WEBCORE, "JSObjectSetPrivate"),
            ObjectIsFunction                             = apiGetFunctionAddress(WEBCORE, "JSObjectIsFunction"),
            ObjectCallAsFunction                         = apiGetFunctionAddress(WEBCORE, "JSObjectCallAsFunction"),
            ObjectIsConstructor                          = apiGetFunctionAddress(WEBCORE, "JSObjectIsConstructor"),
            ObjectCallAsConstructor                      = apiGetFunctionAddress(WEBCORE, "JSObjectCallAsConstructor"),
            ObjectCopyPropertyNames                      = apiGetFunctionAddress(WEBCORE, "JSObjectCopyPropertyNames"),
            PropertyNameArrayRelease                     = apiGetFunctionAddress(WEBCORE, "JSPropertyNameArrayRelease"),
            PropertyNameArrayGetCount                    = apiGetFunctionAddress(WEBCORE, "JSPropertyNameArrayGetCount"),
            PropertyNameArrayGetNameAtIndex              = apiGetFunctionAddress(WEBCORE, "JSPropertyNameArrayGetNameAtIndex"),
            PropertyNameAccumulatorAddName               = apiGetFunctionAddress(WEBCORE, "JSPropertyNameAccumulatorAddName"),
            ObjectSetPrivateProperty                     = apiGetFunctionAddress(WEBCORE, "JSObjectSetPrivateProperty"),
            ObjectGetPrivateProperty                     = apiGetFunctionAddress(WEBCORE, "JSObjectGetPrivateProperty"),
            ObjectDeletePrivateProperty                  = apiGetFunctionAddress(WEBCORE, "JSObjectDeletePrivateProperty"),
            ObjectGetProxyTarget                         = apiGetFunctionAddress(WEBCORE, "JSObjectGetProxyTarget"),
            ObjectGetGlobalContext                       = apiGetFunctionAddress(WEBCORE, "JSObjectGetGlobalContext"),
            StringCreateWithCharacters                   = apiGetFunctionAddress(WEBCORE, "JSStringCreateWithCharacters"),
            StringCreateWithUTF8CString                  = apiGetFunctionAddress(WEBCORE, "JSStringCreateWithUTF8CString"),
            StringRetain                                 = apiGetFunctionAddress(WEBCORE, "JSStringRetain"),
            StringRelease                                = apiGetFunctionAddress(WEBCORE, "JSStringRelease"),
            StringGetLength                              = apiGetFunctionAddress(WEBCORE, "JSStringGetLength"),
            StringGetCharactersPtr                       = apiGetFunctionAddress(WEBCORE, "JSStringGetCharactersPtr"),
            StringGetMaximumUTF8CStringSize              = apiGetFunctionAddress(WEBCORE, "JSStringGetMaximumUTF8CStringSize"),
            StringGetUTF8CString                         = apiGetFunctionAddress(WEBCORE, "JSStringGetUTF8CString"),
            StringIsEqual                                = apiGetFunctionAddress(WEBCORE, "JSStringIsEqual"),
            StringIsEqualToUTF8CString                   = apiGetFunctionAddress(WEBCORE, "JSStringIsEqualToUTF8CString"),
            ObjectMakeTypedArray                         = apiGetFunctionAddress(WEBCORE, "JSObjectMakeTypedArray"),
            ObjectMakeTypedArrayWithBytesNoCopy          = apiGetFunctionAddress(WEBCORE, "JSObjectMakeTypedArrayWithBytesNoCopy"),
            ObjectMakeTypedArrayWithArrayBuffer          = apiGetFunctionAddress(WEBCORE, "JSObjectMakeTypedArrayWithArrayBuffer"),
            ObjectMakeTypedArrayWithArrayBufferAndOffset = apiGetFunctionAddress(WEBCORE, "JSObjectMakeTypedArrayWithArrayBufferAndOffset"),
            ObjectGetTypedArrayBytesPtr                  = apiGetFunctionAddress(WEBCORE, "JSObjectGetTypedArrayBytesPtr"),
            ObjectGetTypedArrayLength                    = apiGetFunctionAddress(WEBCORE, "JSObjectGetTypedArrayLength"),
            ObjectGetTypedArrayByteOffset                = apiGetFunctionAddress(WEBCORE, "JSObjectGetTypedArrayByteOffset"),
            ObjectGetTypedArrayBuffer                    = apiGetFunctionAddress(WEBCORE, "JSObjectGetTypedArrayBuffer"),
            ObjectMakeArrayBufferWithBytesNoCopy         = apiGetFunctionAddress(WEBCORE, "JSObjectMakeArrayBufferWithBytesNoCopy"),
            ObjectGetArrayBufferBytesPtr                 = apiGetFunctionAddress(WEBCORE, "JSObjectGetArrayBufferBytesPtr"),
            ObjectGetArrayBufferByteLength               = apiGetFunctionAddress(WEBCORE, "JSObjectGetArrayBufferByteLength"),
            ValueGetType                                 = apiGetFunctionAddress(WEBCORE, "JSValueGetType"),
            ValueIsUndefined                             = apiGetFunctionAddress(WEBCORE, "JSValueIsUndefined"),
            ValueIsNull                                  = apiGetFunctionAddress(WEBCORE, "JSValueIsNull"),
            ValueIsBoolean                               = apiGetFunctionAddress(WEBCORE, "JSValueIsBoolean"),
            ValueIsNumber                                = apiGetFunctionAddress(WEBCORE, "JSValueIsNumber"),
            ValueIsString                                = apiGetFunctionAddress(WEBCORE, "JSValueIsString"),
            ValueIsSymbol                                = apiGetFunctionAddress(WEBCORE, "JSValueIsSymbol"),
            ValueIsObject                                = apiGetFunctionAddress(WEBCORE, "JSValueIsObject"),
            ValueIsObjectOfClass                         = apiGetFunctionAddress(WEBCORE, "JSValueIsObjectOfClass"),
            ValueIsArray                                 = apiGetFunctionAddress(WEBCORE, "JSValueIsArray"),
            ValueIsDate                                  = apiGetFunctionAddress(WEBCORE, "JSValueIsDate"),
            ValueGetTypedArrayType                       = apiGetFunctionAddress(WEBCORE, "JSValueGetTypedArrayType"),
            ValueIsEqual                                 = apiGetFunctionAddress(WEBCORE, "JSValueIsEqual"),
            ValueIsStrictEqual                           = apiGetFunctionAddress(WEBCORE, "JSValueIsStrictEqual"),
            ValueIsInstanceOfConstructor                 = apiGetFunctionAddress(WEBCORE, "JSValueIsInstanceOfConstructor"),
            ValueMakeUndefined                           = apiGetFunctionAddress(WEBCORE, "JSValueMakeUndefined"),
            ValueMakeNull                                = apiGetFunctionAddress(WEBCORE, "JSValueMakeNull"),
            ValueMakeBoolean                             = apiGetFunctionAddress(WEBCORE, "JSValueMakeBoolean"),
            ValueMakeNumber                              = apiGetFunctionAddress(WEBCORE, "JSValueMakeNumber"),
            ValueMakeString                              = apiGetFunctionAddress(WEBCORE, "JSValueMakeString"),
            ValueMakeSymbol                              = apiGetFunctionAddress(WEBCORE, "JSValueMakeSymbol"),
            ValueMakeFromJSONString                      = apiGetFunctionAddress(WEBCORE, "JSValueMakeFromJSONString"),
            ValueCreateJSONString                        = apiGetFunctionAddress(WEBCORE, "JSValueCreateJSONString"),
            ValueToBoolean                               = apiGetFunctionAddress(WEBCORE, "JSValueToBoolean"),
            ValueToNumber                                = apiGetFunctionAddress(WEBCORE, "JSValueToNumber"),
            ValueToStringCopy                            = apiGetFunctionAddress(WEBCORE, "JSValueToStringCopy"),
            ValueToObject                                = apiGetFunctionAddress(WEBCORE, "JSValueToObject"),
            ValueProtect                                 = apiGetFunctionAddress(WEBCORE, "JSValueProtect"),
            ValueUnprotect                               = apiGetFunctionAddress(WEBCORE, "JSValueUnprotect");

    }

    /** Returns the WebCore {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return WEBCORE;
    }

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kJSPropertyAttributeNone kJSPropertyAttributeNone}</li>
     * <li>{@link #kJSPropertyAttributeReadOnly kJSPropertyAttributeReadOnly} - 1 << 1</li>
     * <li>{@link #kJSPropertyAttributeDontEnum kJSPropertyAttributeDontEnum} - 1 << 2</li>
     * <li>{@link #kJSPropertyAttributeDontDelete kJSPropertyAttributeDontDelete} - 1 << 3</li>
     * </ul>
     */
    public static final int
        kJSPropertyAttributeNone       = 0x0,
        kJSPropertyAttributeReadOnly   = 0x1,
        kJSPropertyAttributeDontEnum   = 0x2,
        kJSPropertyAttributeDontDelete = 0x3;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kJSClassAttributeNone kJSClassAttributeNone}</li>
     * <li>{@link #kJSClassAttributeNoAutomaticPrototype kJSClassAttributeNoAutomaticPrototype} - 1 << 1</li>
     * </ul>
     */
    public static final int
        kJSClassAttributeNone                 = 0x0,
        kJSClassAttributeNoAutomaticPrototype = 0x1;

    /**
     * JSType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kJSTypeUndefined kJSTypeUndefined}</li>
     * <li>{@link #kJSTypeNull kJSTypeNull}</li>
     * <li>{@link #kJSTypeBoolean kJSTypeBoolean}</li>
     * <li>{@link #kJSTypeNumber kJSTypeNumber}</li>
     * <li>{@link #kJSTypeString kJSTypeString}</li>
     * <li>{@link #kJSTypeObject kJSTypeObject}</li>
     * <li>{@link #kJSTypeSymbol kJSTypeSymbol}</li>
     * </ul>
     */
    public static final int
        kJSTypeUndefined = 0x0,
        kJSTypeNull      = 0x1,
        kJSTypeBoolean   = 0x2,
        kJSTypeNumber    = 0x3,
        kJSTypeString    = 0x4,
        kJSTypeObject    = 0x5,
        kJSTypeSymbol    = 0x5;

    /**
     * JSTypedArrayType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kJSTypedArrayTypeInt8Array kJSTypedArrayTypeInt8Array}</li>
     * <li>{@link #kJSTypedArrayTypeInt16Array kJSTypedArrayTypeInt16Array}</li>
     * <li>{@link #kJSTypedArrayTypeInt32Array kJSTypedArrayTypeInt32Array}</li>
     * <li>{@link #kJSTypedArrayTypeUint8Array kJSTypedArrayTypeUint8Array}</li>
     * <li>{@link #kJSTypedArrayTypeUint8ClampedArray kJSTypedArrayTypeUint8ClampedArray}</li>
     * <li>{@link #kJSTypedArrayTypeUint16Array kJSTypedArrayTypeUint16Array}</li>
     * <li>{@link #kJSTypedArrayTypeUint32Array kJSTypedArrayTypeUint32Array}</li>
     * <li>{@link #kJSTypedArrayTypeFloat32Array kJSTypedArrayTypeFloat32Array}</li>
     * <li>{@link #kJSTypedArrayTypeFloat64Array kJSTypedArrayTypeFloat64Array}</li>
     * <li>{@link #kJSTypedArrayTypeArrayBuffer kJSTypedArrayTypeArrayBuffer}</li>
     * <li>{@link #kJSTypedArrayTypeNone kJSTypedArrayTypeNone}</li>
     * <li>{@link #kJSTypedArrayTypeBigInt64Array kJSTypedArrayTypeBigInt64Array}</li>
     * <li>{@link #kJSTypedArrayTypeBigUint64Array kJSTypedArrayTypeBigUint64Array}</li>
     * </ul>
     */
    public static final int
        kJSTypedArrayTypeInt8Array         = 0x0,
        kJSTypedArrayTypeInt16Array        = 0x1,
        kJSTypedArrayTypeInt32Array        = 0x2,
        kJSTypedArrayTypeUint8Array        = 0x3,
        kJSTypedArrayTypeUint8ClampedArray = 0x4,
        kJSTypedArrayTypeUint16Array       = 0x5,
        kJSTypedArrayTypeUint32Array       = 0x6,
        kJSTypedArrayTypeFloat32Array      = 0x7,
        kJSTypedArrayTypeFloat64Array      = 0x8,
        kJSTypedArrayTypeArrayBuffer       = 0x9,
        kJSTypedArrayTypeNone              = 0xA,
        kJSTypedArrayTypeBigInt64Array     = 0xB,
        kJSTypedArrayTypeBigUint64Array    = 0xC;

    protected JavaScriptCore() {
        throw new UnsupportedOperationException();
    }

    // --- [ JSEvaluateScript ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSEvaluateScript(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long script, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.EvaluateScript;
        if (CHECKS) {
            check(context);
            check(script);
        }
        return invokePPPPPP(context, script, thisObject, sourceURL, startingLineNumber, exception, __functionAddress);
    }

    // --- [ JSCheckScriptSyntax ] ---

    @NativeType("bool")
    public static boolean JSCheckScriptSyntax(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long script, @NativeType("OpaqueJSString *") long sourceURL, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.CheckScriptSyntax;
        if (CHECKS) {
            check(context);
            check(script);
            check(sourceURL);
            check(exception);
        }
        return invokePPPPZ(context, script, sourceURL, exception, __functionAddress);
    }

    // --- [ JSGarbageCollect ] ---

    public static void JSGarbageCollect(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.GarbageCollect;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ JSContextGroupCreate ] ---

    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGroupCreate() {
        long __functionAddress = Functions.ContextGroupCreate;
        return invokeP(__functionAddress);
    }

    // --- [ JSContextGroupRetain ] ---

    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGroupRetain(@NativeType("OpaqueJSContextGroup const *") long group) {
        long __functionAddress = Functions.ContextGroupRetain;
        if (CHECKS) {
            check(group);
        }
        return invokePP(group, __functionAddress);
    }

    // --- [ JSContextGroupRelease ] ---

    public static void JSContextGroupRelease(@NativeType("OpaqueJSContextGroup const *") long group) {
        long __functionAddress = Functions.ContextGroupRelease;
        if (CHECKS) {
            check(group);
        }
        invokePV(group, __functionAddress);
    }

    // --- [ JSGlobalContextCreate ] ---

    @NativeType("OpaqueJSContext *")
    public static long JSGlobalContextCreate(@NativeType("OpaqueJSClass *") long globalObjectClass) {
        long __functionAddress = Functions.GlobalContextCreate;
        if (CHECKS) {
            check(globalObjectClass);
        }
        return invokePP(globalObjectClass, __functionAddress);
    }

    // --- [ JSGlobalContextCreateInGroup ] ---

    @NativeType("OpaqueJSContext *")
    public static long JSGlobalContextCreateInGroup(@NativeType("OpaqueJSContextGroup const *") long group, @NativeType("OpaqueJSClass *") long globalObjectClass) {
        long __functionAddress = Functions.GlobalContextCreateInGroup;
        if (CHECKS) {
            check(group);
            check(globalObjectClass);
        }
        return invokePPP(group, globalObjectClass, __functionAddress);
    }

    // --- [ JSGlobalContextRetain ] ---

    @NativeType("OpaqueJSContext *")
    public static long JSGlobalContextRetain(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextRetain;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextRelease ] ---

    public static void JSGlobalContextRelease(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.GlobalContextRelease;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ JSContextGetGlobalObject ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSContextGetGlobalObject(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGlobalObject;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSContextGetGroup ] ---

    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGetGroup(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGroup;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSContextGetGlobalContext ] ---

    @NativeType("OpaqueJSContext *")
    public static long JSContextGetGlobalContext(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGlobalContext;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextCopyName ] ---

    @NativeType("OpaqueJSString *")
    public static long JSGlobalContextCopyName(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextCopyName;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextSetName ] ---

    public static void JSGlobalContextSetName(@NativeType("OpaqueJSContext *") long context, @NativeType("OpaqueJSString *") long name) {
        long __functionAddress = Functions.GlobalContextSetName;
        if (CHECKS) {
            check(context);
            check(name);
        }
        invokePPV(context, name, __functionAddress);
    }

    // --- [ JSGlobalContextIsInspectable ] ---

    @NativeType("bool")
    public static boolean JSGlobalContextIsInspectable(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextIsInspectable;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ JSGlobalContextSetInspectable ] ---

    public static void JSGlobalContextSetInspectable(@NativeType("OpaqueJSContext *") long context, @NativeType("bool") boolean inspectable) {
        long __functionAddress = Functions.GlobalContextSetInspectable;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, inspectable, __functionAddress);
    }

    // --- [ JSClassCreate ] ---

    public static long nJSClassCreate(long definition) {
        long __functionAddress = Functions.ClassCreate;
        if (CHECKS) {
            JSClassDefinition.validate(definition);
        }
        return invokePP(definition, __functionAddress);
    }

    @NativeType("OpaqueJSClass *")
    public static long JSClassCreate(@NativeType("JSClassDefinition const *") JSClassDefinition definition) {
        return nJSClassCreate(definition.address());
    }

    // --- [ JSClassRetain ] ---

    @NativeType("OpaqueJSClass *")
    public static long JSClassRetain(@NativeType("OpaqueJSClass *") long jsClass) {
        long __functionAddress = Functions.ClassRetain;
        if (CHECKS) {
            check(jsClass);
        }
        return invokePP(jsClass, __functionAddress);
    }

    // --- [ JSClassRelease ] ---

    public static void JSClassRelease(@NativeType("OpaqueJSClass *") long jsClass) {
        long __functionAddress = Functions.ClassRelease;
        if (CHECKS) {
            check(jsClass);
        }
        invokePV(jsClass, __functionAddress);
    }

    // --- [ JSObjectMake ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMake(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSClass *") long jsClass, @NativeType("void *") long data) {
        long __functionAddress = Functions.ObjectMake;
        if (CHECKS) {
            check(context);
            check(jsClass);
            check(data);
        }
        return invokePPPP(context, jsClass, data, __functionAddress);
    }

    // --- [ JSObjectMakeFunctionWithCallback ] ---

    public static long nJSObjectMakeFunctionWithCallback(long context, long name, long callAsFunction) {
        long __functionAddress = Functions.ObjectMakeFunctionWithCallback;
        if (CHECKS) {
            check(context);
            check(name);
        }
        return invokePPPP(context, name, callAsFunction, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunctionWithCallback(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("JSObjectCallAsFunctionCallback") JSObjectCallAsFunctionCallbackI callAsFunction) {
        return nJSObjectMakeFunctionWithCallback(context, name, callAsFunction.address());
    }

    // --- [ JSObjectMakeArray ] ---

    public static long nJSObjectMakeArray(long context, long argumentCount, long arguments, long exception) {
        long __functionAddress = Functions.ObjectMakeArray;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") PointerBuffer arguments, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeArray(context, arguments.remaining(), memAddress(arguments), exception);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long[] arguments, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectMakeArray(context, arguments.length, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long argument, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectMakeArray(context, 1, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectMakeDate ] ---

    public static long nJSObjectMakeDate(long context, long argumentCount, long arguments, long exception) {
        long __functionAddress = Functions.ObjectMakeDate;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeDate(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") PointerBuffer arguments, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeDate(context, arguments.remaining(), memAddress(arguments), exception);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeDate(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long[] arguments, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectMakeDate(context, arguments.length, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeDate(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long argument, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectMakeDate(context, 1, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectMakeError ] ---

    public static long nJSObjectMakeError(long context, long argumentCount, long arguments, long exception) {
        long __functionAddress = Functions.ObjectMakeError;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeError(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") PointerBuffer arguments, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeError(context, arguments.remaining(), memAddress(arguments), exception);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeError(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long[] arguments, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectMakeError(context, arguments.length, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeError(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long argument, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectMakeError(context, 1, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectMakeRegExp ] ---

    public static long nJSObjectMakeRegExp(long context, long argumentCount, long arguments, long exception) {
        long __functionAddress = Functions.ObjectMakeRegExp;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeRegExp(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") PointerBuffer arguments, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeRegExp(context, arguments.remaining(), memAddress(arguments), exception);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeRegExp(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long[] arguments, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectMakeRegExp(context, arguments.length, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeRegExp(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const **") long argument, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectMakeRegExp(context, 1, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectMakeDeferredPromise ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeDeferredPromise(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long resolve, @NativeType("OpaqueJSValue *") long reject, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeDeferredPromise;
        if (CHECKS) {
            check(context);
            check(resolve);
            check(reject);
        }
        return invokePPPPP(context, resolve, reject, exception, __functionAddress);
    }

    // --- [ JSObjectMakeFunction ] ---

    public static long nJSObjectMakeFunction(long context, long name, long parameterCount, long parameterNames, long body, long sourceURL, int startingLineNumber, long exception) {
        long __functionAddress = Functions.ObjectMakeFunction;
        if (CHECKS) {
            check(context);
            check(name);
            check(body);
            check(sourceURL);
        }
        return invokePPPPPPPP(context, name, parameterCount, parameterNames, body, sourceURL, startingLineNumber, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("OpaqueJSValue const **") PointerBuffer parameterNames, @NativeType("OpaqueJSString *") long body, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeFunction(context, name, parameterNames.remaining(), memAddress(parameterNames), body, sourceURL, startingLineNumber, exception);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("OpaqueJSValue const **") long[] parameterNames, @NativeType("OpaqueJSString *") long body, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long parameterNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, parameterNames);
            return nJSObjectMakeFunction(context, name, parameterNames.length, parameterNamesAddress, body, sourceURL, startingLineNumber, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("OpaqueJSValue const **") long parameterName, @NativeType("OpaqueJSString *") long body, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long parameterNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, parameterName);
            return nJSObjectMakeFunction(context, name, 1, parameterNamesAddress, body, sourceURL, startingLineNumber, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectGetPrototype ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectGetPrototype(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectGetPrototype;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPP(context, object, __functionAddress);
    }

    // --- [ JSObjectSetPrototype ] ---

    public static void JSObjectSetPrototype(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ObjectSetPrototype;
        if (CHECKS) {
            check(context);
            check(object);
            check(value);
        }
        invokePPPV(context, object, value, __functionAddress);
    }

    // --- [ JSObjectHasProperty ] ---

    @NativeType("bool")
    public static boolean JSObjectHasProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName) {
        long __functionAddress = Functions.ObjectHasProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
        }
        return invokePPPZ(context, object, propertyName, __functionAddress);
    }

    // --- [ JSObjectGetProperty ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectGetProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
        }
        return invokePPPPP(context, object, propertyName, exception, __functionAddress);
    }

    // --- [ JSObjectSetProperty ] ---

    public static void nJSObjectSetProperty(long context, long object, long propertyName, long value, long attributes, long exception) {
        long __functionAddress = Functions.ObjectSetProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
            check(value);
        }
        invokePPPPPPV(context, object, propertyName, value, attributes, exception, __functionAddress);
    }

    public static void JSObjectSetProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long value, @Nullable @NativeType("JSPropertyAttributes *") IntBuffer attributes, @NativeType("OpaqueJSValue const *") long exception) {
        nJSObjectSetProperty(context, object, propertyName, value, memAddressSafe(attributes), exception);
    }

    // --- [ JSObjectDeleteProperty ] ---

    @NativeType("bool")
    public static boolean JSObjectDeleteProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long propertyValue) {
        long __functionAddress = Functions.ObjectDeleteProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
        }
        return invokePPPPZ(context, object, propertyName, propertyValue, __functionAddress);
    }

    // --- [ JSObjectHasPropertyForKey ] ---

    @NativeType("bool")
    public static boolean JSObjectHasPropertyForKey(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long propertyKey, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectHasPropertyForKey;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyKey);
        }
        return invokePPPPZ(context, object, propertyKey, exception, __functionAddress);
    }

    // --- [ JSObjectGetPropertyForKey ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectGetPropertyForKey(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long property, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetPropertyForKey;
        if (CHECKS) {
            check(context);
            check(object);
            check(property);
        }
        return invokePPPPP(context, object, property, exception, __functionAddress);
    }

    // --- [ JSObjectSetPropertyForKey ] ---

    public static void nJSObjectSetPropertyForKey(long context, long object, long property, long value, long attributes, long exception) {
        long __functionAddress = Functions.ObjectSetPropertyForKey;
        if (CHECKS) {
            check(context);
            check(object);
            check(property);
            check(value);
        }
        invokePPPPPPV(context, object, property, value, attributes, exception, __functionAddress);
    }

    public static void JSObjectSetPropertyForKey(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long property, @NativeType("OpaqueJSValue const *") long value, @NativeType("JSPropertyAttributes *") IntBuffer attributes, @NativeType("OpaqueJSValue const *") long exception) {
        if (CHECKS) {
            check(attributes, 1);
        }
        nJSObjectSetPropertyForKey(context, object, property, value, memAddress(attributes), exception);
    }

    // --- [ JSObjectDeletePropertyForKey ] ---

    @NativeType("bool")
    public static boolean JSObjectDeletePropertyForKey(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long propertyKey, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectDeletePropertyForKey;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyKey);
        }
        return invokePPPPZ(context, object, propertyKey, exception, __functionAddress);
    }

    // --- [ JSObjectGetPropertyAtIndex ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectGetPropertyAtIndex(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("unsigned") int propertyIndex, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetPropertyAtIndex;
        if (CHECKS) {
            check(context);
            check(object);
            check(value);
        }
        return invokePPPPP(context, object, propertyIndex, value, exception, __functionAddress);
    }

    // --- [ JSObjectGetPrivate ] ---

    @NativeType("void *")
    public static long JSObjectGetPrivate(@NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectGetPrivate;
        if (CHECKS) {
            check(object);
        }
        return invokePP(object, __functionAddress);
    }

    // --- [ JSObjectSetPrivate ] ---

    @NativeType("bool")
    public static boolean JSObjectSetPrivate(@NativeType("OpaqueJSValue *") long object, @NativeType("void *") long data) {
        long __functionAddress = Functions.ObjectSetPrivate;
        if (CHECKS) {
            check(object);
            check(data);
        }
        return invokePPZ(object, data, __functionAddress);
    }

    // --- [ JSObjectIsFunction ] ---

    @NativeType("bool")
    public static boolean JSObjectIsFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectIsFunction;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPZ(context, object, __functionAddress);
    }

    // --- [ JSObjectCallAsFunction ] ---

    public static long nJSObjectCallAsFunction(long context, long object, long thisObject, long argumentCount, long arguments, long exception) {
        long __functionAddress = Functions.ObjectCallAsFunction;
        if (CHECKS) {
            check(context);
            check(object);
            check(thisObject);
        }
        return invokePPPPPPP(context, object, thisObject, argumentCount, arguments, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectCallAsFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("OpaqueJSValue const **") PointerBuffer arguments, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectCallAsFunction(context, object, thisObject, arguments.remaining(), memAddress(arguments), exception);
    }

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectCallAsFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("OpaqueJSValue const **") long[] arguments, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectCallAsFunction(context, object, thisObject, arguments.length, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectCallAsFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("OpaqueJSValue const **") long argument, @NativeType("OpaqueJSValue const *") long exception) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectCallAsFunction(context, object, thisObject, 1, argumentsAddress, exception);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectIsConstructor ] ---

    @NativeType("bool")
    public static boolean JSObjectIsConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectIsConstructor;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPZ(context, object, __functionAddress);
    }

    // --- [ JSObjectCallAsConstructor ] ---

    public static long nJSObjectCallAsConstructor(long context, long object, long argumentCount, long arguments) {
        long __functionAddress = Functions.ObjectCallAsConstructor;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPPP(context, object, argumentCount, arguments, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectCallAsConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const **") PointerBuffer arguments) {
        return nJSObjectCallAsConstructor(context, object, arguments.remaining(), memAddress(arguments));
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectCallAsConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const **") long... arguments) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, arguments);
            return nJSObjectCallAsConstructor(context, object, arguments.length, argumentsAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectCallAsConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const **") long argument) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long argumentsAddress = org.lwjgl.system.APIUtil.apiArray(stack, argument);
            return nJSObjectCallAsConstructor(context, object, 1, argumentsAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectCopyPropertyNames ] ---

    @NativeType("OpaqueJSPropertyNameArray *")
    public static long JSObjectCopyPropertyNames(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectCopyPropertyNames;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPP(context, object, __functionAddress);
    }

    // --- [ JSPropertyNameArrayRelease ] ---

    public static void JSPropertyNameArrayRelease(@NativeType("OpaqueJSPropertyNameArray *") long array) {
        long __functionAddress = Functions.PropertyNameArrayRelease;
        if (CHECKS) {
            check(array);
        }
        invokePV(array, __functionAddress);
    }

    // --- [ JSPropertyNameArrayGetCount ] ---

    @NativeType("size_t")
    public static long JSPropertyNameArrayGetCount(@NativeType("OpaqueJSPropertyNameArray *") long array) {
        long __functionAddress = Functions.PropertyNameArrayGetCount;
        if (CHECKS) {
            check(array);
        }
        return invokePP(array, __functionAddress);
    }

    // --- [ JSPropertyNameArrayGetNameAtIndex ] ---

    @NativeType("OpaqueJSString *")
    public static long JSPropertyNameArrayGetNameAtIndex(@NativeType("OpaqueJSPropertyNameArray *") long array, @NativeType("size_t") long index) {
        long __functionAddress = Functions.PropertyNameArrayGetNameAtIndex;
        if (CHECKS) {
            check(array);
        }
        return invokePPP(array, index, __functionAddress);
    }

    // --- [ JSPropertyNameAccumulatorAddName ] ---

    public static void JSPropertyNameAccumulatorAddName(@NativeType("OpaqueJSPropertyNameAccumulator *") long accumulator, @NativeType("OpaqueJSString *") long propertyName) {
        long __functionAddress = Functions.PropertyNameAccumulatorAddName;
        if (CHECKS) {
            check(accumulator);
            check(propertyName);
        }
        invokePPV(accumulator, propertyName, __functionAddress);
    }

    // --- [ JSObjectSetPrivateProperty ] ---

    @NativeType("bool")
    public static boolean JSObjectSetPrivateProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ObjectSetPrivateProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
            check(value);
        }
        return invokePPPPZ(context, object, propertyName, value, __functionAddress);
    }

    // --- [ JSObjectGetPrivateProperty ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSObjectGetPrivateProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName) {
        long __functionAddress = Functions.ObjectGetPrivateProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
        }
        return invokePPPP(context, object, propertyName, __functionAddress);
    }

    // --- [ JSObjectDeletePrivateProperty ] ---

    @NativeType("bool")
    public static boolean JSObjectDeletePrivateProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSString *") long propertyName) {
        long __functionAddress = Functions.ObjectDeletePrivateProperty;
        if (CHECKS) {
            check(context);
            check(object);
            check(propertyName);
        }
        return invokePPPZ(context, object, propertyName, __functionAddress);
    }

    // --- [ JSObjectGetProxyTarget ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectGetProxyTarget(@NativeType("OpaqueJSValue *") long ignored) {
        long __functionAddress = Functions.ObjectGetProxyTarget;
        if (CHECKS) {
            check(ignored);
        }
        return invokePP(ignored, __functionAddress);
    }

    // --- [ JSObjectGetGlobalContext ] ---

    @NativeType("OpaqueJSContext *")
    public static long JSObjectGetGlobalContext(@NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectGetGlobalContext;
        if (CHECKS) {
            check(object);
        }
        return invokePP(object, __functionAddress);
    }

    // --- [ JSStringCreateWithCharacters ] ---

    public static long nJSStringCreateWithCharacters(long chars, long numChars) {
        long __functionAddress = Functions.StringCreateWithCharacters;
        return invokePPP(chars, numChars, __functionAddress);
    }

    @NativeType("OpaqueJSString *")
    public static long JSStringCreateWithCharacters(@NativeType("JSChar const *") ShortBuffer chars) {
        return nJSStringCreateWithCharacters(memAddress(chars), chars.remaining());
    }

    // --- [ JSStringCreateWithUTF8CString ] ---

    public static long nJSStringCreateWithUTF8CString(long string) {
        long __functionAddress = Functions.StringCreateWithUTF8CString;
        return invokePP(string, __functionAddress);
    }

    @NativeType("OpaqueJSString *")
    public static long JSStringCreateWithUTF8CString(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nJSStringCreateWithUTF8CString(memAddress(string));
    }

    @NativeType("OpaqueJSString *")
    public static long JSStringCreateWithUTF8CString(@NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nJSStringCreateWithUTF8CString(stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSStringRetain ] ---

    @NativeType("OpaqueJSString *")
    public static long JSStringRetain(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringRetain;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringRelease ] ---

    public static void JSStringRelease(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringRelease;
        if (CHECKS) {
            check(string);
        }
        invokePV(string, __functionAddress);
    }

    // --- [ JSStringGetLength ] ---

    @NativeType("size_t")
    public static long JSStringGetLength(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringGetLength;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringGetCharactersPtr ] ---

    public static long nJSStringGetCharactersPtr(int stringSize, long string) {
        long __functionAddress = Functions.StringGetCharactersPtr;
        if (CHECKS) {
            check(string);
        }
        return invokePP(stringSize, string, __functionAddress);
    }

    @Nullable
    @NativeType("JSChar const *")
    public static ShortBuffer JSStringGetCharactersPtr(@NativeType("uint32_t") int stringSize, @NativeType("OpaqueJSString *") long string) {
        long __result = nJSStringGetCharactersPtr(stringSize, string);
        return memShortBufferSafe(__result, stringSize);
    }

    // --- [ JSStringGetMaximumUTF8CStringSize ] ---

    @NativeType("size_t")
    public static long JSStringGetMaximumUTF8CStringSize(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringGetMaximumUTF8CStringSize;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringGetUTF8CString ] ---

    public static long nJSStringGetUTF8CString(long string, long buffer, long bufferSize) {
        long __functionAddress = Functions.StringGetUTF8CString;
        if (CHECKS) {
            check(string);
        }
        return invokePPPP(string, buffer, bufferSize, __functionAddress);
    }

    @NativeType("size_t")
    public static long JSStringGetUTF8CString(@NativeType("OpaqueJSString *") long string, @NativeType("char *") ByteBuffer buffer) {
        return nJSStringGetUTF8CString(string, memAddress(buffer), buffer.remaining());
    }

    // --- [ JSStringIsEqual ] ---

    @NativeType("bool")
    public static boolean JSStringIsEqual(@NativeType("OpaqueJSString *") long a, @NativeType("OpaqueJSString *") long b) {
        long __functionAddress = Functions.StringIsEqual;
        if (CHECKS) {
            check(a);
            check(b);
        }
        return invokePPZ(a, b, __functionAddress);
    }

    // --- [ JSStringIsEqualToUTF8CString ] ---

    public static boolean nJSStringIsEqualToUTF8CString(long a, long b) {
        long __functionAddress = Functions.StringIsEqualToUTF8CString;
        if (CHECKS) {
            check(a);
        }
        return invokePPZ(a, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean JSStringIsEqualToUTF8CString(@NativeType("OpaqueJSString *") long a, @NativeType("char const *") ByteBuffer b) {
        if (CHECKS) {
            checkNT1(b);
        }
        return nJSStringIsEqualToUTF8CString(a, memAddress(b));
    }

    @NativeType("bool")
    public static boolean JSStringIsEqualToUTF8CString(@NativeType("OpaqueJSString *") long a, @NativeType("char const *") CharSequence b) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(b, true);
            long bEncoded = stack.getPointerAddress();
            return nJSStringIsEqualToUTF8CString(a, bEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ JSObjectMakeTypedArray ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeTypedArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("JSTypedArrayType") int arrayType, @NativeType("size_t") long length, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeTypedArray;
        if (CHECKS) {
            check(context);
            check(exception);
        }
        return invokePPPP(context, arrayType, length, exception, __functionAddress);
    }

    // --- [ JSObjectMakeTypedArrayWithBytesNoCopy ] ---

    public static long nJSObjectMakeTypedArrayWithBytesNoCopy(long context, int arrayType, long bytes, long byteLength, long bytesDeallocator, long deallocatorContext, long exception) {
        long __functionAddress = Functions.ObjectMakeTypedArrayWithBytesNoCopy;
        if (CHECKS) {
            check(context);
            check(bytes);
            check(deallocatorContext);
        }
        return invokePPPPPPP(context, arrayType, bytes, byteLength, bytesDeallocator, deallocatorContext, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeTypedArrayWithBytesNoCopy(@NativeType("OpaqueJSContext const *") long context, @NativeType("JSTypedArrayType") int arrayType, @NativeType("void *") long bytes, @NativeType("size_t") long byteLength, @NativeType("JSTypedArrayBytesDeallocator") JSTypedArrayBytesDeallocatorI bytesDeallocator, @NativeType("void *") long deallocatorContext, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeTypedArrayWithBytesNoCopy(context, arrayType, bytes, byteLength, bytesDeallocator.address(), deallocatorContext, exception);
    }

    // --- [ JSObjectMakeTypedArrayWithArrayBuffer ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeTypedArrayWithArrayBuffer(@NativeType("OpaqueJSContext const *") long context, @NativeType("JSTypedArrayType") int arrayType, @NativeType("OpaqueJSValue *") long buffer, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeTypedArrayWithArrayBuffer;
        if (CHECKS) {
            check(context);
            check(buffer);
        }
        return invokePPPP(context, arrayType, buffer, exception, __functionAddress);
    }

    // --- [ JSObjectMakeTypedArrayWithArrayBufferAndOffset ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeTypedArrayWithArrayBufferAndOffset(@NativeType("OpaqueJSContext const *") long context, @NativeType("JSTypedArrayType") int arrayType, @NativeType("OpaqueJSValue *") long buffer, @NativeType("size_t") long byteOffset, @NativeType("size_t") long length, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeTypedArrayWithArrayBufferAndOffset;
        if (CHECKS) {
            check(context);
            check(buffer);
        }
        return invokePPPPPP(context, arrayType, buffer, byteOffset, length, exception, __functionAddress);
    }

    // --- [ JSObjectGetTypedArrayBytesPtr ] ---

    @NativeType("void *")
    public static long JSObjectGetTypedArrayBytesPtr(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetTypedArrayBytesPtr;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSObjectGetTypedArrayLength ] ---

    @NativeType("size_t")
    public static long JSObjectGetTypedArrayLength(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetTypedArrayLength;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSObjectGetTypedArrayByteOffset ] ---

    @NativeType("size_t")
    public static long JSObjectGetTypedArrayByteOffset(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetTypedArrayByteOffset;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSObjectGetTypedArrayBuffer ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSObjectGetTypedArrayBuffer(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetTypedArrayBuffer;
        if (CHECKS) {
            check(context);
            check(object);
            check(exception);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSObjectMakeArrayBufferWithBytesNoCopy ] ---

    public static long nJSObjectMakeArrayBufferWithBytesNoCopy(long bytes, long byteLength, long bytesDealloactor, long deallocatorContext, long exception) {
        long __functionAddress = Functions.ObjectMakeArrayBufferWithBytesNoCopy;
        if (CHECKS) {
            check(deallocatorContext);
        }
        return invokePPPPPP(bytes, byteLength, bytesDealloactor, deallocatorContext, exception, __functionAddress);
    }

    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArrayBufferWithBytesNoCopy(@NativeType("void const *") ByteBuffer bytes, @NativeType("size_t") long byteLength, @NativeType("JSTypedArrayBytesDeallocator") JSTypedArrayBytesDeallocatorI bytesDealloactor, @NativeType("void *") long deallocatorContext, @NativeType("OpaqueJSValue const *") long exception) {
        if (CHECKS) {
            check(bytes, 1);
        }
        return nJSObjectMakeArrayBufferWithBytesNoCopy(memAddress(bytes), byteLength, bytesDealloactor.address(), deallocatorContext, exception);
    }

    // --- [ JSObjectGetArrayBufferBytesPtr ] ---

    @NativeType("void *")
    public static long JSObjectGetArrayBufferBytesPtr(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetArrayBufferBytesPtr;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSObjectGetArrayBufferByteLength ] ---

    @NativeType("size_t")
    public static long JSObjectGetArrayBufferByteLength(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectGetArrayBufferByteLength;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPPP(context, object, exception, __functionAddress);
    }

    // --- [ JSValueGetType ] ---

    @NativeType("JSType")
    public static int JSValueGetType(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueGetType;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPI(context, value, __functionAddress);
    }

    // --- [ JSValueIsUndefined ] ---

    @NativeType("bool")
    public static boolean JSValueIsUndefined(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsUndefined;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsNull ] ---

    @NativeType("bool")
    public static boolean JSValueIsNull(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsNull;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsBoolean ] ---

    @NativeType("bool")
    public static boolean JSValueIsBoolean(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsBoolean;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsNumber ] ---

    @NativeType("bool")
    public static boolean JSValueIsNumber(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsNumber;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsString ] ---

    @NativeType("bool")
    public static boolean JSValueIsString(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsString;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsSymbol ] ---

    @NativeType("bool")
    public static boolean JSValueIsSymbol(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsSymbol;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsObject ] ---

    @NativeType("bool")
    public static boolean JSValueIsObject(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsObject;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsObjectOfClass ] ---

    @NativeType("bool")
    public static boolean JSValueIsObjectOfClass(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSClass *") long jsClass) {
        long __functionAddress = Functions.ValueIsObjectOfClass;
        if (CHECKS) {
            check(context);
            check(value);
            check(jsClass);
        }
        return invokePPPZ(context, value, jsClass, __functionAddress);
    }

    // --- [ JSValueIsArray ] ---

    @NativeType("bool")
    public static boolean JSValueIsArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsArray;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueIsDate ] ---

    @NativeType("bool")
    public static boolean JSValueIsDate(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueIsDate;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueGetTypedArrayType ] ---

    @NativeType("JSTypedArrayType")
    public static int JSValueGetTypedArrayType(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueGetTypedArrayType;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPPI(context, value, exception, __functionAddress);
    }

    // --- [ JSValueIsEqual ] ---

    @NativeType("bool")
    public static boolean JSValueIsEqual(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long a, @NativeType("OpaqueJSValue const *") long b, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueIsEqual;
        if (CHECKS) {
            check(context);
            check(a);
            check(b);
        }
        return invokePPPPZ(context, a, b, exception, __functionAddress);
    }

    // --- [ JSValueIsStrictEqual ] ---

    @NativeType("bool")
    public static boolean JSValueIsStrictEqual(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long a, @NativeType("OpaqueJSValue const *") long b) {
        long __functionAddress = Functions.ValueIsStrictEqual;
        if (CHECKS) {
            check(context);
            check(a);
            check(b);
        }
        return invokePPPZ(context, a, b, __functionAddress);
    }

    // --- [ JSValueIsInstanceOfConstructor ] ---

    @NativeType("bool")
    public static boolean JSValueIsInstanceOfConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue *") long constructor, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueIsInstanceOfConstructor;
        if (CHECKS) {
            check(context);
            check(value);
            check(constructor);
        }
        return invokePPPPZ(context, value, constructor, exception, __functionAddress);
    }

    // --- [ JSValueMakeUndefined ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeUndefined(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ValueMakeUndefined;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSValueMakeNull ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeNull(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ValueMakeNull;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSValueMakeBoolean ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeBoolean(@NativeType("OpaqueJSContext const *") long context, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.ValueMakeBoolean;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, value, __functionAddress);
    }

    // --- [ JSValueMakeNumber ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeNumber(@NativeType("OpaqueJSContext const *") long context, double number) {
        long __functionAddress = Functions.ValueMakeNumber;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, number, __functionAddress);
    }

    // --- [ JSValueMakeString ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeString(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.ValueMakeString;
        if (CHECKS) {
            check(context);
            check(string);
        }
        return invokePPP(context, string, __functionAddress);
    }

    // --- [ JSValueMakeSymbol ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeSymbol(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long description) {
        long __functionAddress = Functions.ValueMakeSymbol;
        if (CHECKS) {
            check(context);
            check(description);
        }
        return invokePPP(context, description, __functionAddress);
    }

    // --- [ JSValueMakeFromJSONString ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeFromJSONString(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.ValueMakeFromJSONString;
        if (CHECKS) {
            check(context);
            check(string);
        }
        return invokePPP(context, string, __functionAddress);
    }

    // --- [ JSValueCreateJSONString ] ---

    @NativeType("OpaqueJSValue const *")
    public static long JSValueCreateJSONString(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long value, @NativeType("unsigned") int indent, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueCreateJSONString;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPPP(context, value, indent, exception, __functionAddress);
    }

    // --- [ JSValueToBoolean ] ---

    @NativeType("bool")
    public static boolean JSValueToBoolean(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueToBoolean;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPZ(context, value, __functionAddress);
    }

    // --- [ JSValueToNumber ] ---

    public static double JSValueToNumber(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueToNumber;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPPD(context, value, exception, __functionAddress);
    }

    // --- [ JSValueToStringCopy ] ---

    @NativeType("OpaqueJSString *")
    public static long JSValueToStringCopy(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueToStringCopy;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPPP(context, value, exception, __functionAddress);
    }

    // --- [ JSValueToObject ] ---

    @NativeType("OpaqueJSValue *")
    public static long JSValueToObject(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueToObject;
        if (CHECKS) {
            check(context);
            check(value);
            check(exception);
        }
        return invokePPPP(context, value, exception, __functionAddress);
    }

    // --- [ JSValueProtect ] ---

    public static void JSValueProtect(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueProtect;
        if (CHECKS) {
            check(context);
            check(value);
        }
        invokePPV(context, value, __functionAddress);
    }

    // --- [ JSValueUnprotect ] ---

    public static void JSValueUnprotect(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueUnprotect;
        if (CHECKS) {
            check(context);
            check(value);
        }
        invokePPV(context, value, __functionAddress);
    }

}