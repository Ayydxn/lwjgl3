/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ultralight

import org.lwjgl.generator.Module
import org.lwjgl.generator.enumType
import org.lwjgl.generator.opaque
import org.lwjgl.generator.opaque_p
import org.lwjgl.generator.simpleBinding
import org.lwjgl.generator.unsigned_int
import org.lwjgl.generator.void

val APPCORE_BINDING = simpleBinding(
    Module.ULTRALIGHT,
    libraryName = "AppCore",
    bundledWithLWJGL = false
)

val ULSettings = "C_Settings".opaque
val ULApp = "C_App".opaque
val ULWindow = "C_Window".opaque
val ULMonitor = "C_Monitor".opaque
val ULOverlay = "C_Overlay".opaque

val ULWindowFlags = "ULWindowFlags".enumType

val ULUpdateCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULUpdateCallback",

        opaque_p("userData"),

        nativeType = "ULUpdateCallback"
    )
}

val ULCloseCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULCloseCallback",

        opaque_p("userData"),
        ULWindow.p("window"),

        nativeType = "ULCloseCallback"
    )
}

val ULResizeCallback = Module.ULTRALIGHT.callback {
    void(
        className = "ULResizeCallback",

        opaque_p("userData"),
        ULWindow.p("window"),
        unsigned_int("width"),
        unsigned_int("height"),

        nativeType = "ULResizeCallback"
    )
}