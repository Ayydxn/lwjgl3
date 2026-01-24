/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight.templates

import org.lwjgl.generator.*
import sdl.wchar_t
import ultralight.*

val JAVASCRIPT_CORE = "JavaScriptCore".nativeClass(Module.ULTRALIGHT, prefixMethod = "JS", prefixConstant = "", binding = WEBCORE_BINDING) {
    EnumConstant(
        "kJSPropertyAttributeNone".enum(0),
        "kJSPropertyAttributeReadOnly".enum("1 << 1"),
        "kJSPropertyAttributeDontEnum".enum("1 << 2"),
        "kJSPropertyAttributeDontDelete".enum("1 << 3")
    )

    EnumConstant(
        "kJSClassAttributeNone".enum(0),
        "kJSClassAttributeNoAutomaticPrototype".enum("1 << 1")
    )

    EnumConstant(
        "kJSTypeUndefined".enum(0),
        "kJSTypeNull".enum(1),
        "kJSTypeBoolean".enum(2),
        "kJSTypeNumber".enum(3),
        "kJSTypeString".enum(4),
        "kJSTypeObject".enum(5),
        "kJSTypeSymbol".enum(5)
    )

    EnumConstant(
        "kJSTypedArrayTypeInt8Array".enum(0),
        "kJSTypedArrayTypeInt16Array".enum(1),
        "kJSTypedArrayTypeInt32Array".enum(2),
        "kJSTypedArrayTypeUint8Array".enum(3),
        "kJSTypedArrayTypeUint8ClampedArray".enum(4),
        "kJSTypedArrayTypeUint16Array".enum(5),
        "kJSTypedArrayTypeUint32Array".enum(6),
        "kJSTypedArrayTypeFloat32Array".enum(7),
        "kJSTypedArrayTypeFloat64Array".enum(8),
        "kJSTypedArrayTypeArrayBuffer".enum(9),
        "kJSTypedArrayTypeNone".enum(10),
        "kJSTypedArrayTypeBigInt64Array".enum(11),
        "kJSTypedArrayTypeBigUint64Array".enum(12)
    )

    /*------------*/
    /* -- Base -- */
    /*------------*/

    JSValueRef.p(
        "EvaluateScript",
        JSContextRef.p("context"),
        JSStringRef.p("script"),
        nullable..JSObjectRef.p("thisObject"),
        nullable..JSStringRef.p("sourceURL"),
        int("startingLineNumber"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "CheckScriptSyntax",
        JSContextRef.p("context"),
        JSStringRef.p("script"),
        JSStringRef.p("sourceURL"),
        JSValueRef.p("exception")
    )

    void(
        "GarbageCollect",
        JSContextRef.p("context")
    )

    /*-------------------*/
    /* -- Context Ref -- */
    /*-------------------*/

    JSContextGroupRef.p(
        "ContextGroupCreate",
        void()
    )

    JSContextGroupRef.p(
        "ContextGroupRetain",
        JSContextGroupRef.p("group")
    )

    void(
        "ContextGroupRelease",
        JSContextGroupRef.p("group")
    )

    JSGlobalContextRef.p(
        "GlobalContextCreate",
        JSClassRef.p("globalObjectClass")
    )

    JSGlobalContextRef.p(
        "GlobalContextCreateInGroup",
        JSContextGroupRef.p("group"),
        JSClassRef.p("globalObjectClass")
    )

    JSGlobalContextRef.p(
        "GlobalContextRetain",
        JSGlobalContextRef.p("context")
    )

    void(
        "GlobalContextRelease",
        JSContextRef.p("context")
    )

    JSObjectRef.p(
        "ContextGetGlobalObject",
        JSContextRef.p("context")
    )

    JSContextGroupRef.p(
        "ContextGetGroup",
        JSContextRef.p("context")
    )

    JSGlobalContextRef.p(
        "ContextGetGlobalContext",
        JSContextRef.p("context")
    )

    JSStringRef.p(
        "GlobalContextCopyName",
        JSGlobalContextRef.p("context")
    )

    void(
        "GlobalContextSetName",
        JSGlobalContextRef.p("context"),
        JSStringRef.p("name")
    )

    bool(
        "GlobalContextIsInspectable",
        JSGlobalContextRef.p("context")
    )

    void(
        "GlobalContextSetInspectable",
        JSGlobalContextRef.p("context"),
        bool("inspectable")
    )

    /*------------------*/
    /* -- Object Ref -- */
    /*------------------*/

    JSClassRef.p(
        "ClassCreate",
        JSClassDefinition.const.p("definition")
    )

    JSClassRef.p(
        "ClassRetain",
        JSClassRef.p("jsClass")
    )

    void(
        "ClassRelease",
        JSClassRef.p("jsClass")
    )

    JSObjectRef.p(
        "ObjectMake",
        JSContextRef.p("context"),
        JSClassRef.p("jsClass"),
        opaque_p("data")
    )

    JSObjectRef.p(
        "ObjectMakeFunctionWithCallback",
        JSContextRef.p("context"),
        JSStringRef.p("name"),
        JSObjectCallAsFunctionCallback("callAsFunction")
    )

    JSObjectRef.p(
        "ObjectMakeArray",
        JSContextRef.p("context"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeDate",
        JSContextRef.p("context"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeError",
        JSContextRef.p("context"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeRegExp",
        JSContextRef.p("context"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeDeferredPromise",
        JSContextRef.p("context"),
        JSObjectRef.p("resolve"),
        JSObjectRef.p("reject"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeFunction",
        JSContextRef.p("context"),
        JSStringRef.p("name"),
        AutoSize("parameterNames")..size_t("parameterCount"),
        PointerArray(JSValueRef.p, "parameterName")..JSValueRef.p.p("parameterNames"),
        JSStringRef.p("body"),
        JSStringRef.p("sourceURL"),
        int("startingLineNumber"),
        nullable..JSValueRef.p("exception")
    )

    JSValueRef.p(
        "ObjectGetPrototype",
        JSContextRef.p("context"),
        JSObjectRef.p("object")
    )

    void(
        "ObjectSetPrototype",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("value")
    )

    bool(
        "ObjectHasProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName")
    )

    JSValueRef.p(
        "ObjectGetProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        nullable..JSValueRef.p("exception")
    )

    void(
        "ObjectSetProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        JSValueRef.p("value"),
        Unsafe..nullable..JSPropertyAttributes.p("attributes"),
        nullable..JSValueRef.p("exception"),
    )

    bool(
        "ObjectDeleteProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        nullable..JSValueRef.p("propertyValue")
    )

    bool(
        "ObjectHasPropertyForKey",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("propertyKey"),
        nullable..JSValueRef.p("exception"),
    )

    JSValueRef.p(
        "ObjectGetPropertyForKey",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("property"),
        nullable..JSValueRef.p("exception")
    )

    void(
        "ObjectSetPropertyForKey",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("property"),
        JSValueRef.p("value"),
        Check(1)..JSPropertyAttributes.p("attributes"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "ObjectDeletePropertyForKey",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("propertyKey"),
        nullable..JSValueRef.p("exception")
    )

    JSValueRef.p(
        "ObjectGetPropertyAtIndex",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        unsigned("propertyIndex"),
        JSValueRef.p("value"),
        nullable..JSValueRef.p("exception")
    )

    opaque_p(
        "ObjectGetPrivate",
        JSObjectRef.p("object")
    )

    bool(
        "ObjectSetPrivate",
        JSObjectRef.p("object"),
        opaque_p("data")
    )

    bool(
        "ObjectIsFunction",
        JSContextRef.p("context"),
        JSObjectRef.p("object")
    )

    JSValueRef.p(
        "ObjectCallAsFunction",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSObjectRef.p("thisObject"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "ObjectIsConstructor",
        JSContextRef.p("context"),
        JSObjectRef.p("object")
    )

    JSObjectRef.p(
        "ObjectCallAsConstructor",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        AutoSize("arguments")..size_t("argumentCount"),
        PointerArray(JSValueRef.p, "argument")..JSValueRef.p.p("arguments")
    )

    JSPropertyNameArrayRef.p(
        "ObjectCopyPropertyNames",
        JSContextRef.p("context"),
        JSObjectRef.p("object")
    )

    void(
        "PropertyNameArrayRelease",
        JSPropertyNameArrayRef.p("array")
    )

    size_t(
        "PropertyNameArrayGetCount",
        JSPropertyNameArrayRef.p("array")
    )

    JSStringRef.p(
        "PropertyNameArrayGetNameAtIndex",
        JSPropertyNameArrayRef.p("array"),
        size_t("index")
    )

    void(
        "PropertyNameAccumulatorAddName",
        JSPropertyNameAccumulatorRef.p("accumulator"),
        JSStringRef.p("propertyName")
    )

    bool(
        "ObjectSetPrivateProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        JSValueRef.p("value")
    )

    JSValueRef.p(
        "ObjectGetPrivateProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName")
    )

    bool(
        "ObjectDeletePrivateProperty",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName")
    )

    JSObjectRef.p(
        "ObjectGetProxyTarget",
        JSObjectRef.p("ignored")
    )

    JSGlobalContextRef.p(
        "ObjectGetGlobalContext",
        JSObjectRef.p("object")
    )

    /*-----------------*/
    /* -- StringRef -- */
    /*-----------------*/

    JSStringRef.p(
        "StringCreateWithCharacters",
        JSChar.const.p("chars"),
        AutoSize("chars")..size_t("numChars")
    )

    JSStringRef.p(
        "StringCreateWithUTF8CString",
        charASCII.const.p("string")
    )

    JSStringRef.p(
        "StringRetain",
        JSStringRef.p("string")
    )

    void(
        "StringRelease",
        JSStringRef.p("string")
    )

    size_t(
        "StringGetLength",
        JSStringRef.p("string")
    )

    JSChar.const.p(
        "StringGetCharactersPtr",
        JSStringRef.p("string")
    )

    size_t(
        "StringGetMaximumUTF8CStringSize",
        JSStringRef.p("string")
    )

    size_t(
        "StringGetUTF8CString",
        JSStringRef.p("string"),
        char.p("buffer"),
        AutoSize("buffer")..size_t("bufferSize")
    )

    bool(
        "StringIsEqual",
        JSStringRef.p("a"),
        JSStringRef.p("b")
    )

    bool(
        "StringIsEqualToUTF8CString",
        JSStringRef.p("a"),
        charASCII.const.p("b")
    )

    /*------------------*/
    /* -- TypedArray -- */
    /*------------------*/

    JSObjectRef.p(
        "ObjectMakeTypedArray",
        JSContextRef.p("context"),
        JSTypedArrayType("arrayType"),
        size_t("length"),
        JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeTypedArrayWithBytesNoCopy",
        JSContextRef.p("context"),
        JSTypedArrayType("arrayType"),
        opaque_p("bytes"),
        size_t("byteLength"),
        JSTypedArrayBytesDeallocator("bytesDeallocator"),
        opaque_p("deallocatorContext"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeTypedArrayWithArrayBuffer",
        JSContextRef.p("context"),
        JSTypedArrayType("arrayType"),
        JSObjectRef.p("buffer"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeTypedArrayWithArrayBufferAndOffset",
        JSContextRef.p("context"),
        JSTypedArrayType("arrayType"),
        JSObjectRef.p("buffer"),
        size_t("byteOffset"),
        size_t("length"),
        nullable..JSValueRef.p("exception")
    )

    opaque_p(
        "ObjectGetTypedArrayBytesPtr",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        nullable..JSValueRef.p("exception")
    )

    size_t(
        "ObjectGetTypedArrayLength",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        nullable..JSValueRef.p("exception")
    )

    size_t(
        "ObjectGetTypedArrayByteOffset",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectGetTypedArrayBuffer",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ObjectMakeArrayBufferWithBytesNoCopy",
        Check(1)..void.const.p("bytes"),
        size_t("byteLength"),
        JSTypedArrayBytesDeallocator("bytesDealloactor"),
        opaque_p("deallocatorContext"),
        nullable..JSValueRef.p("exception")
    )

    opaque_p(
        "ObjectGetArrayBufferBytesPtr",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        nullable..JSValueRef.p("exception")
    )

    size_t(
        "ObjectGetArrayBufferByteLength",
        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        nullable..JSValueRef.p("exception")
    )

    /*----------------*/
    /* -- ValueRef -- */
    /*----------------*/

    JSType(
        "ValueGetType",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsUndefined",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsNull",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsBoolean",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsNumber",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsString",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsSymbol",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsObject",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsObjectOfClass",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        JSClassRef.p("jsClass")
    )

    bool(
        "ValueIsArray",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    bool(
        "ValueIsDate",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    JSTypedArrayType(
        "ValueGetTypedArrayType",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "ValueIsEqual",
        JSContextRef.p("context"),
        JSValueRef.p("a"),
        JSValueRef.p("b"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "ValueIsStrictEqual",
        JSContextRef.p("context"),
        JSValueRef.p("a"),
        JSValueRef.p("b")
    )

    bool(
        "ValueIsInstanceOfConstructor",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        JSObjectRef.p("constructor"),
        nullable..JSValueRef.p("exception")
    )

    JSValueRef.p(
        "ValueMakeUndefined",
        JSContextRef.p("context")
    )

    JSValueRef.p(
        "ValueMakeNull",
        JSContextRef.p("context")
    )

    JSValueRef.p(
        "ValueMakeBoolean",
        JSContextRef.p("context"),
        bool("value")
    )

    JSValueRef.p(
        "ValueMakeNumber",
        JSContextRef.p("context"),
        double("number")
    )

    JSValueRef.p(
        "ValueMakeString",
        JSContextRef.p("context"),
        JSStringRef.p("string")
    )

    JSValueRef.p(
        "ValueMakeSymbol",
        JSContextRef.p("context"),
        JSStringRef.p("description")
    )

    JSValueRef.p(
        "ValueMakeFromJSONString",
        JSContextRef.p("context"),
        JSStringRef.p("string")
    )

    JSValueRef.p(
        "ValueCreateJSONString",
        JSContextRef.p("context"),
        JSStringRef.p("value"),
        unsigned("indent"),
        nullable..JSValueRef.p("exception")
    )

    bool(
        "ValueToBoolean",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    double(
        "ValueToNumber",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        nullable..JSValueRef.p("exception")
    )

    JSStringRef.p(
        "ValueToStringCopy",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        nullable..JSValueRef.p("exception")
    )

    JSObjectRef.p(
        "ValueToObject",
        JSContextRef.p("context"),
        JSValueRef.p("value"),
        JSValueRef.p("exception")
    )

    void(
        "ValueProtect",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )

    void(
        "ValueUnprotect",
        JSContextRef.p("context"),
        JSValueRef.p("value")
    )
}