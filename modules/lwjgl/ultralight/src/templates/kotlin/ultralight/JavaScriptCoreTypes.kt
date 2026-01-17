/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight

import org.lwjgl.generator.Module
import org.lwjgl.generator.bool
import org.lwjgl.generator.charASCII
import org.lwjgl.generator.enumType
import org.lwjgl.generator.int
import org.lwjgl.generator.opaque
import org.lwjgl.generator.opaque_p
import org.lwjgl.generator.rangeTo
import org.lwjgl.generator.size_t
import org.lwjgl.generator.struct
import org.lwjgl.generator.typedef
import org.lwjgl.generator.unsigned_int
import org.lwjgl.generator.void

val JSContextGroupRef = "OpaqueJSContextGroup".opaque.const
val JSContextRef = "OpaqueJSContext".opaque.const
val JSGlobalContextRef = "OpaqueJSContext".opaque
val JSStringRef = "OpaqueJSString".opaque
val JSClassRef = "OpaqueJSClass".opaque
val JSPropertyNameArrayRef = "OpaqueJSPropertyNameArray".opaque
val JSPropertyNameAccumulatorRef = "OpaqueJSPropertyNameAccumulator".opaque
val JSValueRef = "OpaqueJSValue".opaque.const
val JSObjectRef = "OpaqueJSValue".opaque

val JSType = "JSType".enumType

val JSPropertyAttributes = typedef(unsigned_int, "JSPropertyAttributes")
val JSClassAttributes = typedef(unsigned_int, "JSClassAttributes")

val JSTypedArrayBytesDeallocator = Module.ULTRALIGHT.callback {
    void(
        className = "JSTypedArrayBytesDeallocator",

        opaque_p("bytes"),
        opaque_p("deallocatorContext"),

        nativeType = "JSTypedArrayBytesDeallocator"
    )
}

val JSObjectInitializeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "JSObjectInitializeCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),

        nativeType = "JSObjectInitializeCallback"
    )
}

val JSObjectFinalizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "JSObjectFinalizeCallback",

        JSObjectRef.p("object"),

        nativeType = "JSObjectFinalizeCallback"
    )
}

val JSObjectHasPropertyCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "JSObjectHasPropertyCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),

        nativeType = "JSObjectHasPropertyCallback"
    )
}

val JSObjectGetPropertyCallback = Module.ULTRALIGHT.callback {
    JSValueRef.p(
        className = "JSObjectGetPropertyCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectGetPropertyCallback"
    )
}

val JSObjectSetPropertyCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "JSObjectSetPropertyCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        JSValueRef.p("value"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectSetPropertyCallback"
    )
}

val JSObjectDeletePropertyCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "JSObjectDeletePropertyCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSStringRef.p("propertyName"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectDeletePropertyCallback"
    )
}

val JSObjectGetPropertyNamesCallback = Module.ULTRALIGHT.callback {
    void(
        className = "JSObjectGetPropertyNamesCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSPropertyNameAccumulatorRef.p("propertyNames"),

        nativeType = "JSObjectGetPropertyNamesCallback"
    )
}

val JSObjectCallAsFunctionCallback = Module.ULTRALIGHT.callback {
    void(
        className = "JSObjectCallAsFunctionCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("function"),
        JSObjectRef.p("thisObject"),
        AutoSize("arguments")..size_t("argumentCount"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectCallAsFunctionCallback"
    )
}

val JSObjectCallAsConstructorCallback = Module.ULTRALIGHT.callback {
    JSObjectRef.p(
        className = "JSObjectCallAsConstructorCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("constructor"),
        AutoSize("arguments")..size_t("argumentCount"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectCallAsConstructorCallback"
    )
}

val JSObjectHasInstanceCallback = Module.ULTRALIGHT.callback {
    bool(
        className = "JSObjectHasInstanceCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("constructor"),
        JSValueRef.p("possibleInstance"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectHasInstanceCallback"
    )
}

val JSObjectConvertToTypeCallback = Module.ULTRALIGHT.callback {
    JSValueRef.p(
        className = "JSObjectConvertToTypeCallback",

        JSContextRef.p("context"),
        JSObjectRef.p("object"),
        JSType.p("type"),
        JSValueRef.p("exception"),

        nativeType = "JSObjectConvertToTypeCallback"
    )
}

val JSStaticValue = struct(Module.ULTRALIGHT, className = "JSStaticValue") {
    charASCII.p("name")
    JSObjectGetPropertyCallback.p("getProperty")
    JSObjectSetPropertyCallback.p("setProperty")
    JSPropertyAttributes.p("attributes")
}

val JSStaticFunction = struct(Module.ULTRALIGHT, className = "JSStaticFunction") {
    charASCII.p("name");
    JSObjectCallAsFunctionCallback.p("callAsFunction")
    JSPropertyAttributes.p("attributes")
}

val JSClassDefinition = struct(Module.ULTRALIGHT, className = "JSClassDefinition") {
    int("version")
    JSClassAttributes.p("attributes")

    charASCII.p("className")
    JSClassRef.p("parentClass")

    JSStaticValue.const.p("staticValues")
    JSStaticFunction.const.p("staticFunctions")

    JSObjectInitializeCallback.p("initialize")
    JSObjectFinalizeCallback.p("finalize")
    JSObjectHasPropertyCallback.p("hasProperty")
    JSObjectGetPropertyCallback.p("getProperty")
    JSObjectSetPropertyCallback.p("setProperty")
    JSObjectDeletePropertyCallback.p("deleteProperty")
    JSObjectGetPropertyNamesCallback.p("getPropertyNames")
    JSObjectCallAsFunctionCallback.p("callAsFunction")
    JSObjectCallAsConstructorCallback.p("callAsConstructor")
    JSObjectHasInstanceCallback.p("hasInstance")
    JSObjectConvertToTypeCallback.p("convertToType")

    // TODO: (Ayydxn) Continue binding JSObjectRef.h (continue from after JSClassDefinition)
}