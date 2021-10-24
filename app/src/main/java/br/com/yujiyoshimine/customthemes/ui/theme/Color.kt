package br.com.yujiyoshimine.customthemes.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class CustomColors(
    primary: Color,
    secondary: Color,
    success: Color,
    error: Color,
    isLight: Boolean,
) {
    var primary by mutableStateOf(primary)
        private set

    var secondary by mutableStateOf(secondary)
        private set

    var success by mutableStateOf(success)
        private set

    var error by mutableStateOf(error)
        private set

    var isLight by mutableStateOf(isLight)
        private set

    fun copy(
        primary: Color = this.primary,
        secondary: Color = this.secondary,
        success: Color = this.success,
        error: Color = this.error,
        isLight: Boolean = this.isLight,
    ) = CustomColors(
        primary = primary,
        secondary = secondary,
        success = success,
        error = error,
        isLight = isLight,
    )

    fun updateColorsFrom(other: CustomColors) {
        primary = other.primary
        secondary = other.secondary
        success = other.success
        error = other.error
    }
}

val LocalColors = staticCompositionLocalOf { lightColors() }