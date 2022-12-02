package com.jjrodcast.patterns.core.extensions

import java.nio.charset.StandardCharsets
import java.util.*

fun String.fromBase64():String{
    return String(android.util.Base64.decode(this, android.util.Base64.DEFAULT), StandardCharsets.UTF_8)
}

@OptIn(ExperimentalStdlibApi::class)
fun String.capitalizeWords(): String =
    split(" ").joinToString(" ") { word ->
        word.lowercase(Locale.ROOT).replaceFirstChar {
            if(it.isLowerCase())
                it.titlecase(Locale.ROOT)
            else it.toString()
        }
    }
