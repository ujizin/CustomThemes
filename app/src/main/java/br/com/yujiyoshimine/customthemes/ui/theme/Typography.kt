package br.com.yujiyoshimine.customthemes.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

data class CustomTypography(
    val h1: TextStyle = TextStyle(),
    val body1: TextStyle = TextStyle(),
)

val LocalTypography = staticCompositionLocalOf { CustomTypography() }