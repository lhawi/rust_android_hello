package com.lhawi.rustandroidhello

object RustBridge {
    init {
        System.loadLibrary("rust_android_hello")
    }

    external fun helloFromRust(): String
}