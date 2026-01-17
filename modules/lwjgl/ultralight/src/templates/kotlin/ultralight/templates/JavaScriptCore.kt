/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight.templates

import org.lwjgl.generator.EnumConstant
import org.lwjgl.generator.Module
import org.lwjgl.generator.bool
import org.lwjgl.generator.int
import org.lwjgl.generator.nativeClass
import org.lwjgl.generator.void
import ultralight.JSClassRef
import ultralight.JSContextGroupRef
import ultralight.JSContextRef
import ultralight.JSGlobalContextRef
import ultralight.JSObjectRef
import ultralight.JSStringRef
import ultralight.JSValueRef
import ultralight.ULTRALIGHT_BINDING

val JAVASCRIPT_CORE = "JavaScriptCore".nativeClass(Module.ULTRALIGHT, prefixMethod = "JS", prefixConstant = "", binding = ULTRALIGHT_BINDING) {
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


    /*------------*/
    /* -- Base -- */
    /*------------*/

    JSValueRef.p(
        "EvaluateScript",
        JSContextRef.p("context"),
        JSStringRef.p("script"),
        JSStringRef.p("sourceURL"),
        int("startingLineNumber"),
        JSValueRef.p("exception")
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

    // TODO: (Ayydxn) Continue binding JSContextRef.h
}