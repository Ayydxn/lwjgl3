/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ultralight;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class JavaScriptCore {

    private static final SharedLibrary ULTRALIGHT = Library.loadNative(JavaScriptCore.class, "org.lwjgl.ultralight", "Ultralight");

    /** Contains the function pointers loaded from the Ultralight {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            EvaluateScript              = apiGetFunctionAddress(ULTRALIGHT, "JSEvaluateScript"),
            CheckScriptSyntax           = apiGetFunctionAddress(ULTRALIGHT, "JSCheckScriptSyntax"),
            GarbageCollect              = apiGetFunctionAddress(ULTRALIGHT, "JSGarbageCollect"),
            ContextGroupCreate          = apiGetFunctionAddress(ULTRALIGHT, "JSContextGroupCreate"),
            ContextGroupRetain          = apiGetFunctionAddress(ULTRALIGHT, "JSContextGroupRetain"),
            ContextGroupRelease         = apiGetFunctionAddress(ULTRALIGHT, "JSContextGroupRelease"),
            GlobalContextCreate         = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextCreate"),
            GlobalContextCreateInGroup  = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextCreateInGroup"),
            GlobalContextRetain         = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextRetain"),
            GlobalContextRelease        = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextRelease"),
            ContextGetGlobalObject      = apiGetFunctionAddress(ULTRALIGHT, "JSContextGetGlobalObject"),
            ContextGetGroup             = apiGetFunctionAddress(ULTRALIGHT, "JSContextGetGroup"),
            ContextGetGlobalContext     = apiGetFunctionAddress(ULTRALIGHT, "JSContextGetGlobalContext"),
            GlobalContextCopyName       = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextCopyName"),
            GlobalContextSetName        = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextSetName"),
            GlobalContextIsInspectable  = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextIsInspectable"),
            GlobalContextSetInspectable = apiGetFunctionAddress(ULTRALIGHT, "JSGlobalContextSetInspectable");

    }

    /** Returns the Ultralight {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return ULTRALIGHT;
    }

    public static final int
        kJSPropertyAttributeNone       = 0x0,
        kJSPropertyAttributeReadOnly   = 1 << 1,
        kJSPropertyAttributeDontEnum   = 1 << 2,
        kJSPropertyAttributeDontDelete = 1 << 3;

    public static final int
        kJSClassAttributeNone                 = 0x0,
        kJSClassAttributeNoAutomaticPrototype = 1 << 1;

    protected JavaScriptCore() {
        throw new UnsupportedOperationException();
    }

    // --- [ JSEvaluateScript ] ---

    /** {@code OpaqueJSValue const * JSEvaluateScript(OpaqueJSContext const * context, OpaqueJSString * script, OpaqueJSString * sourceURL, int startingLineNumber, OpaqueJSValue const * exception)} */
    @NativeType("OpaqueJSValue const *")
    public static long JSEvaluateScript(@NativeType("OpaqueJSContext const *") long context, @NativeType("OpaqueJSString *") long script, @NativeType("OpaqueJSString *") long sourceURL, int startingLineNumber, @NativeType("OpaqueJSValue const *") long exception) {
        long __functionAddress = Functions.EvaluateScript;
        if (CHECKS) {
            check(context);
            check(script);
            check(sourceURL);
            check(exception);
        }
        return invokePPPPP(context, script, sourceURL, startingLineNumber, exception, __functionAddress);
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

}