package br.com.yujiyoshimine.customthemes.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CustomSpaces(
    val small: Dp = 4.dp,
    val medium: Dp = 8.dp,
    val large: Dp = 16.dp,
    val extraLarge: Dp = 24.dp,
)

val LocalSpaces = staticCompositionLocalOf { CustomSpaces() }