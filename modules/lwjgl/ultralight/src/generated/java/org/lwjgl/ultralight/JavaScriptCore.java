/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import java.nio.*;

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
            PropertyNameArrayRefRetain                   = apiGetFunctionAddress(WEBCORE, "JSPropertyNameArrayRefRetain"),
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

    public static final int
        kJSPropertyAttributeNone       = 0x0,
        kJSPropertyAttributeReadOnly   = 1 << 1,
        kJSPropertyAttributeDontEnum   = 1 << 2,
        kJSPropertyAttributeDontDelete = 1 << 3;

    public static final int
        kJSClassAttributeNone                 = 0x0,
        kJSClassAttributeNoAutomaticPrototype = 1 << 1;

    public static final int
        kJSTypeUndefined = 0x0,
        kJSTypeNull      = 0x1,
        kJSTypeBoolean   = 0x2,
        kJSTypeNumber    = 0x3,
        kJSTypeString    = 0x4,
        kJSTypeObject    = 0x5,
        kJSTypeSymbol    = 0x5;

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

    /** {@code OpaqueJSValue const * JSEvaluateScript(OpaqueJSContext const * context, OpaqueJSString * script, OpaqueJSValue * thisObject, OpaqueJSString * sourceURL, int startingLineNumber, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSEvaluateScript(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long script, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.EvaluateScript;
        if (CHECKS) {
            check(context);
            check(script);
            check(thisObject);
            check(sourceURL);
        }
        return invokePPPPPP(context, script, thisObject, sourceURL, startingLineNumber, exception, __functionAddress);
    }

    // --- [ JSCheckScriptSyntax ] ---

    /** {@code bool JSCheckScriptSyntax(OpaqueJSContext const * context, OpaqueJSString * script, OpaqueJSString * sourceURL, OpaqueJSValue const * exception)} */
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

    /** {@code void JSGarbageCollect(OpaqueJSContext const * context)} */
    public static void JSGarbageCollect(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.GarbageCollect;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ JSContextGroupCreate ] ---

    /** {@code OpaqueJSContextGroup const * JSContextGroupCreate(void)} */
    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGroupCreate() {
        long __functionAddress = Functions.ContextGroupCreate;
        return invokeP(__functionAddress);
    }

    // --- [ JSContextGroupRetain ] ---

    /** {@code OpaqueJSContextGroup const * JSContextGroupRetain(OpaqueJSContextGroup const * group)} */
    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGroupRetain(@NativeType("OpaqueJSContextGroup const *") long group) {
        long __functionAddress = Functions.ContextGroupRetain;
        if (CHECKS) {
            check(group);
        }
        return invokePP(group, __functionAddress);
    }

    // --- [ JSContextGroupRelease ] ---

    /** {@code void JSContextGroupRelease(OpaqueJSContextGroup const * group)} */
    public static void JSContextGroupRelease(@NativeType("OpaqueJSContextGroup const *") long group) {
        long __functionAddress = Functions.ContextGroupRelease;
        if (CHECKS) {
            check(group);
        }
        invokePV(group, __functionAddress);
    }

    // --- [ JSGlobalContextCreate ] ---

    /** {@code OpaqueJSContext * JSGlobalContextCreate(OpaqueJSClass * globalObjectClass)} */
    @NativeType("OpaqueJSContext *")
    public static long JSGlobalContextCreate(@NativeType("OpaqueJSClass *") long globalObjectClass) {
        long __functionAddress = Functions.GlobalContextCreate;
        if (CHECKS) {
            check(globalObjectClass);
        }
        return invokePP(globalObjectClass, __functionAddress);
    }

    // --- [ JSGlobalContextCreateInGroup ] ---

    /** {@code OpaqueJSContext * JSGlobalContextCreateInGroup(OpaqueJSContextGroup const * group, OpaqueJSClass * globalObjectClass)} */
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

    /** {@code OpaqueJSContext * JSGlobalContextRetain(OpaqueJSContext * context)} */
    @NativeType("OpaqueJSContext *")
    public static long JSGlobalContextRetain(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextRetain;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextRelease ] ---

    /** {@code void JSGlobalContextRelease(OpaqueJSContext const * context)} */
    public static void JSGlobalContextRelease(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.GlobalContextRelease;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ JSContextGetGlobalObject ] ---

    /** {@code OpaqueJSValue * JSContextGetGlobalObject(OpaqueJSContext const * context)} */
    @NativeType("OpaqueJSValue *")
    public static long JSContextGetGlobalObject(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGlobalObject;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSContextGetGroup ] ---

    /** {@code OpaqueJSContextGroup const * JSContextGetGroup(OpaqueJSContext const * context)} */
    @NativeType("OpaqueJSContextGroup const *")
    public static long JSContextGetGroup(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGroup;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSContextGetGlobalContext ] ---

    /** {@code OpaqueJSContext * JSContextGetGlobalContext(OpaqueJSContext const * context)} */
    @NativeType("OpaqueJSContext *")
    public static long JSContextGetGlobalContext(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ContextGetGlobalContext;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextCopyName ] ---

    /** {@code OpaqueJSString * JSGlobalContextCopyName(OpaqueJSContext * context)} */
    @NativeType("OpaqueJSString *")
    public static long JSGlobalContextCopyName(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextCopyName;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSGlobalContextSetName ] ---

    /** {@code void JSGlobalContextSetName(OpaqueJSContext * context, OpaqueJSString * name)} */
    public static void JSGlobalContextSetName(@NativeType("OpaqueJSContext *") long context, @NativeType("OpaqueJSString *") long name) {
        long __functionAddress = Functions.GlobalContextSetName;
        if (CHECKS) {
            check(context);
            check(name);
        }
        invokePPV(context, name, __functionAddress);
    }

    // --- [ JSGlobalContextIsInspectable ] ---

    /** {@code bool JSGlobalContextIsInspectable(OpaqueJSContext * context)} */
    @NativeType("bool")
    public static boolean JSGlobalContextIsInspectable(@NativeType("OpaqueJSContext *") long context) {
        long __functionAddress = Functions.GlobalContextIsInspectable;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ JSGlobalContextSetInspectable ] ---

    /** {@code void JSGlobalContextSetInspectable(OpaqueJSContext * context, bool inspectable)} */
    public static void JSGlobalContextSetInspectable(@NativeType("OpaqueJSContext *") long context, @NativeType("bool") boolean inspectable) {
        long __functionAddress = Functions.GlobalContextSetInspectable;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, inspectable, __functionAddress);
    }

    // --- [ JSClassCreate ] ---

    /** {@code OpaqueJSClass * JSClassCreate(JSClassDefinition const * definition)} */
    public static long nJSClassCreate(long definition) {
        long __functionAddress = Functions.ClassCreate;
        if (CHECKS) {
            JSClassDefinition.validate(definition);
        }
        return invokePP(definition, __functionAddress);
    }

    /** {@code OpaqueJSClass * JSClassCreate(JSClassDefinition const * definition)} */
    @NativeType("OpaqueJSClass *")
    public static long JSClassCreate(@NativeType("JSClassDefinition const *") JSClassDefinition definition) {
        return nJSClassCreate(definition.address());
    }

    // --- [ JSClassRetain ] ---

    /** {@code OpaqueJSClass * JSClassRetain(OpaqueJSClass * jsClass)} */
    @NativeType("OpaqueJSClass *")
    public static long JSClassRetain(@NativeType("OpaqueJSClass *") long jsClass) {
        long __functionAddress = Functions.ClassRetain;
        if (CHECKS) {
            check(jsClass);
        }
        return invokePP(jsClass, __functionAddress);
    }

    // --- [ JSClassRelease ] ---

    /** {@code void JSClassRelease(OpaqueJSClass * jsClass)} */
    public static void JSClassRelease(@NativeType("OpaqueJSClass *") long jsClass) {
        long __functionAddress = Functions.ClassRelease;
        if (CHECKS) {
            check(jsClass);
        }
        invokePV(jsClass, __functionAddress);
    }

    // --- [ JSObjectMake ] ---

    /** {@code OpaqueJSValue * JSObjectMake(OpaqueJSContext const * context, OpaqueJSClass * jsClass, void * data)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeFunctionWithCallback(OpaqueJSContext const * context, OpaqueJSString * name, JSObjectCallAsFunctionCallback callAsFunction)} */
    public static long nJSObjectMakeFunctionWithCallback(long context, long name, long callAsFunction) {
        long __functionAddress = Functions.ObjectMakeFunctionWithCallback;
        if (CHECKS) {
            check(context);
            check(name);
        }
        return invokePPPP(context, name, callAsFunction, __functionAddress);
    }

    /** {@code OpaqueJSValue * JSObjectMakeFunctionWithCallback(OpaqueJSContext const * context, OpaqueJSString * name, JSObjectCallAsFunctionCallback callAsFunction)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunctionWithCallback(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("JSObjectCallAsFunctionCallback") JSObjectCallAsFunctionCallbackI callAsFunction) {
        return nJSObjectMakeFunctionWithCallback(context, name, callAsFunction.address());
    }

    // --- [ JSObjectMakeArray ] ---

    /** {@code OpaqueJSValue * JSObjectMakeArray(OpaqueJSContext const * context, size_t argumentCount, OpaqueJSValue const * arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArray(@NativeType("OpaqueJSContext const *") long context, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeArray;
        if (CHECKS) {
            check(context);
            check(arguments);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    // --- [ JSObjectMakeDate ] ---

    /** {@code OpaqueJSValue * JSObjectMakeDate(OpaqueJSContext const * context, size_t argumentCount, OpaqueJSValue const * arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeDate(@NativeType("OpaqueJSContext const *") long context, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeDate;
        if (CHECKS) {
            check(context);
            check(arguments);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    // --- [ JSObjectMakeError ] ---

    /** {@code OpaqueJSValue * JSObjectMakeError(OpaqueJSContext const * context, size_t argumentCount, OpaqueJSValue const * arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeError(@NativeType("OpaqueJSContext const *") long context, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeError;
        if (CHECKS) {
            check(context);
            check(arguments);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    // --- [ JSObjectMakeRegExp ] ---

    /** {@code OpaqueJSValue * JSObjectMakeRegExp(OpaqueJSContext const * context, size_t argumentCount, OpaqueJSValue const * arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeRegExp(@NativeType("OpaqueJSContext const *") long context, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeRegExp;
        if (CHECKS) {
            check(context);
            check(arguments);
        }
        return invokePPPPP(context, argumentCount, arguments, exception, __functionAddress);
    }

    // --- [ JSObjectMakeDeferredPromise ] ---

    /** {@code OpaqueJSValue * JSObjectMakeDeferredPromise(OpaqueJSContext const * context, OpaqueJSValue * resolve, OpaqueJSValue * reject, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeFunction(OpaqueJSContext const * context, OpaqueJSString * name, unsigned parameterCount, OpaqueJSString const * parameterNames, OpaqueJSString * body, OpaqueJSString * sourceURL, int startingLineNumber, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long name, @NativeType("unsigned") int parameterCount, @NativeType("OpaqueJSString const *") long parameterNames, @NativeType("OpaqueJSString *") long body, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectMakeFunction;
        if (CHECKS) {
            check(context);
            check(name);
            check(parameterNames);
            check(body);
            check(sourceURL);
        }
        return invokePPPPPPP(context, name, parameterCount, parameterNames, body, sourceURL, startingLineNumber, exception, __functionAddress);
    }

    // --- [ JSObjectGetPrototype ] ---

    /** {@code OpaqueJSValue const * JSObjectGetPrototype(OpaqueJSContext const * context, OpaqueJSValue * object)} */
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

    /** {@code void JSObjectSetPrototype(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * value)} */
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

    /** {@code bool JSObjectHasProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName)} */
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

    /** {@code OpaqueJSValue const * JSObjectGetProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName, OpaqueJSValue const * exception)} */
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

    /** {@code void JSObjectSetProperty(OpaqueJSContext const * context, OpaqueJSValue * objecty, OpaqueJSString * propertyName, OpaqueJSValue const * value, JSPropertyAttributes * attributes, OpaqueJSValue const * exception)} */
    public static void nJSObjectSetProperty(long context, long objecty, long propertyName, long value, long attributes, long exception) {
        long __functionAddress = Functions.ObjectSetProperty;
        if (CHECKS) {
            check(context);
            check(objecty);
            check(propertyName);
            check(value);
        }
        invokePPPPPPV(context, objecty, propertyName, value, attributes, exception, __functionAddress);
    }

    /** {@code void JSObjectSetProperty(OpaqueJSContext const * context, OpaqueJSValue * objecty, OpaqueJSString * propertyName, OpaqueJSValue const * value, JSPropertyAttributes * attributes, OpaqueJSValue const * exception)} */
    public static void JSObjectSetProperty(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long objecty, @NativeType("OpaqueJSString *") long propertyName, @NativeType("OpaqueJSValue const *") long value, @NativeType("JSPropertyAttributes *") IntBuffer attributes, @NativeType("OpaqueJSValue const *") long exception) {
        nJSObjectSetProperty(context, objecty, propertyName, value, memAddress(attributes), exception);
    }

    // --- [ JSObjectDeleteProperty ] ---

    /** {@code bool JSObjectDeleteProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName, OpaqueJSValue const * propertyValue)} */
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

    /** {@code bool JSObjectHasPropertyForKey(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * propertyKey, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue const * JSObjectGetPropertyForKey(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * property, OpaqueJSValue const * exception)} */
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

    /** {@code void JSObjectSetPropertyForKey(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * property, OpaqueJSValue const * value, JSPropertyAttributes * attributes, OpaqueJSValue const * exception)} */
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

    /** {@code void JSObjectSetPropertyForKey(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * property, OpaqueJSValue const * value, JSPropertyAttributes * attributes, OpaqueJSValue const * exception)} */
    public static void JSObjectSetPropertyForKey(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue const *") long property, @NativeType("OpaqueJSValue const *") long value, @NativeType("JSPropertyAttributes *") IntBuffer attributes, @NativeType("OpaqueJSValue const *") long exception) {
        if (CHECKS) {
            check(attributes, 1);
        }
        nJSObjectSetPropertyForKey(context, object, property, value, memAddress(attributes), exception);
    }

    // --- [ JSObjectDeletePropertyForKey ] ---

    /** {@code bool JSObjectDeletePropertyForKey(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * propertyKey, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue const * JSObjectGetPropertyAtIndex(OpaqueJSContext const * context, OpaqueJSValue * object, unsigned propertyIndex, OpaqueJSValue const * value, OpaqueJSValue const * exception)} */
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

    /** {@code void * JSObjectGetPrivate(OpaqueJSValue * object)} */
    @NativeType("void *")
    public static long JSObjectGetPrivate(@NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectGetPrivate;
        if (CHECKS) {
            check(object);
        }
        return invokePP(object, __functionAddress);
    }

    // --- [ JSObjectSetPrivate ] ---

    /** {@code bool JSObjectSetPrivate(OpaqueJSValue * object, void * data)} */
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

    /** {@code bool JSObjectIsFunction(OpaqueJSContext const * context, OpaqueJSValue * object)} */
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

    /** {@code OpaqueJSValue const * JSObjectCallAsFunction(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue * thisObject, size_t argumentCount, OpaqueJSValue const * arguments, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSObjectCallAsFunction(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("OpaqueJSValue *") long thisObject, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ObjectCallAsFunction;
        if (CHECKS) {
            check(context);
            check(object);
            check(thisObject);
            check(arguments);
        }
        return invokePPPPPPP(context, object, thisObject, argumentCount, arguments, exception, __functionAddress);
    }

    // --- [ JSObjectIsConstructor ] ---

    /** {@code bool JSObjectIsConstructor(OpaqueJSContext const * context, OpaqueJSValue * object)} */
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

    /** {@code OpaqueJSValue * JSObjectCallAsConstructor(OpaqueJSContext const * context, OpaqueJSValue * object, size_t argumentCount, OpaqueJSValue const * arguments)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectCallAsConstructor(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object, @NativeType("size_t") long argumentCount, @NativeType("OpaqueJSValue const *") long arguments) {
        long __functionAddress = Functions.ObjectCallAsConstructor;
        if (CHECKS) {
            check(context);
            check(object);
            check(arguments);
        }
        return invokePPPPP(context, object, argumentCount, arguments, __functionAddress);
    }

    // --- [ JSObjectCopyPropertyNames ] ---

    /** {@code OpaqueJSPropertyNameArray * JSObjectCopyPropertyNames(OpaqueJSContext const * context, OpaqueJSValue * object)} */
    @NativeType("OpaqueJSPropertyNameArray *")
    public static long JSObjectCopyPropertyNames(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectCopyPropertyNames;
        if (CHECKS) {
            check(context);
            check(object);
        }
        return invokePPP(context, object, __functionAddress);
    }

    // --- [ JSPropertyNameArrayRefRetain ] ---

    /** {@code OpaqueJSPropertyNameArray * JSPropertyNameArrayRefRetain(OpaqueJSPropertyNameArray * array)} */
    @NativeType("OpaqueJSPropertyNameArray *")
    public static long JSPropertyNameArrayRefRetain(@NativeType("OpaqueJSPropertyNameArray *") long array) {
        long __functionAddress = Functions.PropertyNameArrayRefRetain;
        if (CHECKS) {
            check(array);
        }
        return invokePP(array, __functionAddress);
    }

    // --- [ JSPropertyNameArrayRelease ] ---

    /** {@code void JSPropertyNameArrayRelease(OpaqueJSPropertyNameArray * array)} */
    public static void JSPropertyNameArrayRelease(@NativeType("OpaqueJSPropertyNameArray *") long array) {
        long __functionAddress = Functions.PropertyNameArrayRelease;
        if (CHECKS) {
            check(array);
        }
        invokePV(array, __functionAddress);
    }

    // --- [ JSPropertyNameArrayGetCount ] ---

    /** {@code size_t JSPropertyNameArrayGetCount(OpaqueJSPropertyNameArray * array)} */
    @NativeType("size_t")
    public static long JSPropertyNameArrayGetCount(@NativeType("OpaqueJSPropertyNameArray *") long array) {
        long __functionAddress = Functions.PropertyNameArrayGetCount;
        if (CHECKS) {
            check(array);
        }
        return invokePP(array, __functionAddress);
    }

    // --- [ JSPropertyNameArrayGetNameAtIndex ] ---

    /** {@code OpaqueJSString * JSPropertyNameArrayGetNameAtIndex(OpaqueJSPropertyNameArray * array, size_t index)} */
    @NativeType("OpaqueJSString *")
    public static long JSPropertyNameArrayGetNameAtIndex(@NativeType("OpaqueJSPropertyNameArray *") long array, @NativeType("size_t") long index) {
        long __functionAddress = Functions.PropertyNameArrayGetNameAtIndex;
        if (CHECKS) {
            check(array);
        }
        return invokePPP(array, index, __functionAddress);
    }

    // --- [ JSPropertyNameAccumulatorAddName ] ---

    /** {@code void JSPropertyNameAccumulatorAddName(OpaqueJSPropertyNameAccumulator * accumulator, OpaqueJSString * propertyName)} */
    public static void JSPropertyNameAccumulatorAddName(@NativeType("OpaqueJSPropertyNameAccumulator *") long accumulator, @NativeType("OpaqueJSString *") long propertyName) {
        long __functionAddress = Functions.PropertyNameAccumulatorAddName;
        if (CHECKS) {
            check(accumulator);
            check(propertyName);
        }
        invokePPV(accumulator, propertyName, __functionAddress);
    }

    // --- [ JSObjectSetPrivateProperty ] ---

    /** {@code bool JSObjectSetPrivateProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName, OpaqueJSValue const * value)} */
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

    /** {@code OpaqueJSValue const * JSObjectGetPrivateProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName)} */
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

    /** {@code bool JSObjectDeletePrivateProperty(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSString * propertyName)} */
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

    /** {@code OpaqueJSValue * JSObjectGetProxyTarget(OpaqueJSValue * ignored)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectGetProxyTarget(@NativeType("OpaqueJSValue *") long ignored) {
        long __functionAddress = Functions.ObjectGetProxyTarget;
        if (CHECKS) {
            check(ignored);
        }
        return invokePP(ignored, __functionAddress);
    }

    // --- [ JSObjectGetGlobalContext ] ---

    /** {@code OpaqueJSContext * JSObjectGetGlobalContext(OpaqueJSValue * object)} */
    @NativeType("OpaqueJSContext *")
    public static long JSObjectGetGlobalContext(@NativeType("OpaqueJSValue *") long object) {
        long __functionAddress = Functions.ObjectGetGlobalContext;
        if (CHECKS) {
            check(object);
        }
        return invokePP(object, __functionAddress);
    }

    // --- [ JSStringCreateWithCharacters ] ---

    /** {@code OpaqueJSString * JSStringCreateWithCharacters(JSChar const * chars, size_t numChars)} */
    public static long nJSStringCreateWithCharacters(long chars, long numChars) {
        long __functionAddress = Functions.StringCreateWithCharacters;
        return invokePPP(chars, numChars, __functionAddress);
    }

    /** {@code OpaqueJSString * JSStringCreateWithCharacters(JSChar const * chars, size_t numChars)} */
    @NativeType("OpaqueJSString *")
    public static long JSStringCreateWithCharacters(@NativeType("JSChar const *") ShortBuffer chars) {
        return nJSStringCreateWithCharacters(memAddress(chars), chars.remaining());
    }

    // --- [ JSStringCreateWithUTF8CString ] ---

    /** {@code OpaqueJSString * JSStringCreateWithUTF8CString(char const * string)} */
    public static long nJSStringCreateWithUTF8CString(long string) {
        long __functionAddress = Functions.StringCreateWithUTF8CString;
        return invokePP(string, __functionAddress);
    }

    /** {@code OpaqueJSString * JSStringCreateWithUTF8CString(char const * string)} */
    @NativeType("OpaqueJSString *")
    public static long JSStringCreateWithUTF8CString(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nJSStringCreateWithUTF8CString(memAddress(string));
    }

    /** {@code OpaqueJSString * JSStringCreateWithUTF8CString(char const * string)} */
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

    /** {@code OpaqueJSString * JSStringRetain(OpaqueJSString * string)} */
    @NativeType("OpaqueJSString *")
    public static long JSStringRetain(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringRetain;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringRelease ] ---

    /** {@code void JSStringRelease(OpaqueJSString * string)} */
    public static void JSStringRelease(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringRelease;
        if (CHECKS) {
            check(string);
        }
        invokePV(string, __functionAddress);
    }

    // --- [ JSStringGetLength ] ---

    /** {@code size_t JSStringGetLength(OpaqueJSString * string)} */
    @NativeType("size_t")
    public static long JSStringGetLength(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringGetLength;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringGetMaximumUTF8CStringSize ] ---

    /** {@code size_t JSStringGetMaximumUTF8CStringSize(OpaqueJSString * string)} */
    @NativeType("size_t")
    public static long JSStringGetMaximumUTF8CStringSize(@NativeType("OpaqueJSString *") long string) {
        long __functionAddress = Functions.StringGetMaximumUTF8CStringSize;
        if (CHECKS) {
            check(string);
        }
        return invokePP(string, __functionAddress);
    }

    // --- [ JSStringGetUTF8CString ] ---

    /** {@code size_t JSStringGetUTF8CString(OpaqueJSString * string, char * buffer, size_t bufferSize)} */
    public static long nJSStringGetUTF8CString(long string, long buffer, long bufferSize) {
        long __functionAddress = Functions.StringGetUTF8CString;
        if (CHECKS) {
            check(string);
        }
        return invokePPPP(string, buffer, bufferSize, __functionAddress);
    }

    /** {@code size_t JSStringGetUTF8CString(OpaqueJSString * string, char * buffer, size_t bufferSize)} */
    @NativeType("size_t")
    public static long JSStringGetUTF8CString(@NativeType("OpaqueJSString *") long string, @NativeType("char *") ByteBuffer buffer) {
        return nJSStringGetUTF8CString(string, memAddress(buffer), buffer.remaining());
    }

    // --- [ JSStringIsEqual ] ---

    /** {@code bool JSStringIsEqual(OpaqueJSString * a, OpaqueJSString * b)} */
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

    /** {@code bool JSStringIsEqualToUTF8CString(OpaqueJSString * a, char const * b)} */
    public static boolean nJSStringIsEqualToUTF8CString(long a, long b) {
        long __functionAddress = Functions.StringIsEqualToUTF8CString;
        if (CHECKS) {
            check(a);
        }
        return invokePPZ(a, b, __functionAddress);
    }

    /** {@code bool JSStringIsEqualToUTF8CString(OpaqueJSString * a, char const * b)} */
    @NativeType("bool")
    public static boolean JSStringIsEqualToUTF8CString(@NativeType("OpaqueJSString *") long a, @NativeType("char const *") ByteBuffer b) {
        if (CHECKS) {
            checkNT1(b);
        }
        return nJSStringIsEqualToUTF8CString(a, memAddress(b));
    }

    /** {@code bool JSStringIsEqualToUTF8CString(OpaqueJSString * a, char const * b)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeTypedArray(OpaqueJSContext const * context, JSTypedArrayType arrayType, size_t length, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeTypedArrayWithBytesNoCopy(OpaqueJSContext const * context, JSTypedArrayType arrayType, void * bytes, size_t byteLength, JSTypedArrayBytesDeallocator bytesDeallocator, void * deallocatorContext, OpaqueJSValue const * exception)} */
    public static long nJSObjectMakeTypedArrayWithBytesNoCopy(long context, int arrayType, long bytes, long byteLength, long bytesDeallocator, long deallocatorContext, long exception) {
        long __functionAddress = Functions.ObjectMakeTypedArrayWithBytesNoCopy;
        if (CHECKS) {
            check(context);
            check(bytes);
            check(deallocatorContext);
        }
        return invokePPPPPPP(context, arrayType, bytes, byteLength, bytesDeallocator, deallocatorContext, exception, __functionAddress);
    }

    /** {@code OpaqueJSValue * JSObjectMakeTypedArrayWithBytesNoCopy(OpaqueJSContext const * context, JSTypedArrayType arrayType, void * bytes, size_t byteLength, JSTypedArrayBytesDeallocator bytesDeallocator, void * deallocatorContext, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeTypedArrayWithBytesNoCopy(@NativeType("OpaqueJSContext const *") long context, @NativeType("JSTypedArrayType") int arrayType, @NativeType("void *") long bytes, @NativeType("size_t") long byteLength, @NativeType("JSTypedArrayBytesDeallocator") JSTypedArrayBytesDeallocatorI bytesDeallocator, @NativeType("void *") long deallocatorContext, @NativeType("OpaqueJSValue const *") long exception) {
        return nJSObjectMakeTypedArrayWithBytesNoCopy(context, arrayType, bytes, byteLength, bytesDeallocator.address(), deallocatorContext, exception);
    }

    // --- [ JSObjectMakeTypedArrayWithArrayBuffer ] ---

    /** {@code OpaqueJSValue * JSObjectMakeTypedArrayWithArrayBuffer(OpaqueJSContext const * context, JSTypedArrayType arrayType, OpaqueJSValue * buffer, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeTypedArrayWithArrayBufferAndOffset(OpaqueJSContext const * context, JSTypedArrayType arrayType, OpaqueJSValue * buffer, size_t byteOffset, size_t length, OpaqueJSValue const * exception)} */
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

    /** {@code void * JSObjectGetTypedArrayBytesPtr(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code size_t JSObjectGetTypedArrayLength(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code size_t JSObjectGetTypedArrayByteOffset(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSObjectGetTypedArrayBuffer(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSObjectMakeArrayBufferWithBytesNoCopy(void const * bytes, size_t byteLength, JSTypedArrayBytesDeallocator bytesDealloactor, void * deallocatorContext, OpaqueJSValue const * exception)} */
    public static long nJSObjectMakeArrayBufferWithBytesNoCopy(long bytes, long byteLength, long bytesDealloactor, long deallocatorContext, long exception) {
        long __functionAddress = Functions.ObjectMakeArrayBufferWithBytesNoCopy;
        if (CHECKS) {
            check(deallocatorContext);
        }
        return invokePPPPPP(bytes, byteLength, bytesDealloactor, deallocatorContext, exception, __functionAddress);
    }

    /** {@code OpaqueJSValue * JSObjectMakeArrayBufferWithBytesNoCopy(void const * bytes, size_t byteLength, JSTypedArrayBytesDeallocator bytesDealloactor, void * deallocatorContext, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue *")
    public static long JSObjectMakeArrayBufferWithBytesNoCopy(@NativeType("void const *") ByteBuffer bytes, @NativeType("size_t") long byteLength, @NativeType("JSTypedArrayBytesDeallocator") JSTypedArrayBytesDeallocatorI bytesDealloactor, @NativeType("void *") long deallocatorContext, @NativeType("OpaqueJSValue const *") long exception) {
        if (CHECKS) {
            check(bytes, 1);
        }
        return nJSObjectMakeArrayBufferWithBytesNoCopy(memAddress(bytes), byteLength, bytesDealloactor.address(), deallocatorContext, exception);
    }

    // --- [ JSObjectGetArrayBufferBytesPtr ] ---

    /** {@code void * JSObjectGetArrayBufferBytesPtr(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code size_t JSObjectGetArrayBufferByteLength(OpaqueJSContext const * context, OpaqueJSValue * object, OpaqueJSValue const * exception)} */
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

    /** {@code JSType JSValueGetType(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsUndefined(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsNull(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsBoolean(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsNumber(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsString(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsSymbol(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsObject(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsObjectOfClass(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSClass * jsClass)} */
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

    /** {@code bool JSValueIsArray(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code bool JSValueIsDate(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code JSTypedArrayType JSValueGetTypedArrayType(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSValue const * exception)} */
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

    /** {@code bool JSValueIsEqual(OpaqueJSContext const * context, OpaqueJSValue const * a, OpaqueJSValue const * b, OpaqueJSValue const * exception)} */
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

    /** {@code bool JSValueIsStrictEqual(OpaqueJSContext const * context, OpaqueJSValue const * a, OpaqueJSValue const * b)} */
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

    /** {@code bool JSValueIsInstanceOfConstructor(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSValue * constructor, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue const * JSValueMakeUndefined(OpaqueJSContext const * context)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeUndefined(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ValueMakeUndefined;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSValueMakeNull ] ---

    /** {@code OpaqueJSValue const * JSValueMakeNull(OpaqueJSContext const * context)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeNull(@NativeType("OpaqueJSContext const *") long context) {
        long __functionAddress = Functions.ValueMakeNull;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ JSValueMakeBoolean ] ---

    /** {@code OpaqueJSValue const * JSValueMakeBoolean(OpaqueJSContext const * context, bool value)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeBoolean(@NativeType("OpaqueJSContext const *") long context, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.ValueMakeBoolean;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, value, __functionAddress);
    }

    // --- [ JSValueMakeNumber ] ---

    /** {@code OpaqueJSValue const * JSValueMakeNumber(OpaqueJSContext const * context, double number)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSValueMakeNumber(@NativeType("OpaqueJSContext const *") long context, double number) {
        long __functionAddress = Functions.ValueMakeNumber;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, number, __functionAddress);
    }

    // --- [ JSValueMakeString ] ---

    /** {@code OpaqueJSValue const * JSValueMakeString(OpaqueJSContext const * context, OpaqueJSString * string)} */
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

    /** {@code OpaqueJSValue const * JSValueMakeSymbol(OpaqueJSContext const * context, OpaqueJSString * description)} */
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

    /** {@code OpaqueJSValue const * JSValueMakeFromJSONString(OpaqueJSContext const * context, OpaqueJSString * string)} */
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

    /** {@code OpaqueJSValue const * JSValueCreateJSONString(OpaqueJSContext const * context, OpaqueJSString * value, unsigned indent, OpaqueJSValue const * exception)} */
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

    /** {@code bool JSValueToBoolean(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
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

    /** {@code double JSValueToNumber(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSValue const * exception)} */
    public static double JSValueToNumber(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.ValueToNumber;
        if (CHECKS) {
            check(context);
            check(value);
        }
        return invokePPPD(context, value, exception, __functionAddress);
    }

    // --- [ JSValueToStringCopy ] ---

    /** {@code OpaqueJSString * JSValueToStringCopy(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSValue const * exception)} */
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

    /** {@code OpaqueJSValue * JSValueToObject(OpaqueJSContext const * context, OpaqueJSValue const * value, OpaqueJSValue const * exception)} */
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

    /** {@code void JSValueProtect(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
    public static void JSValueProtect(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueProtect;
        if (CHECKS) {
            check(context);
            check(value);
        }
        invokePPV(context, value, __functionAddress);
    }

    // --- [ JSValueUnprotect ] ---

    /** {@code void JSValueUnprotect(OpaqueJSContext const * context, OpaqueJSValue const * value)} */
    public static void JSValueUnprotect(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSValue const *") long value) {
        long __functionAddress = Functions.ValueUnprotect;
        if (CHECKS) {
            check(context);
            check(value);
        }
        invokePPV(context, value, __functionAddress);
    }

}