package br.com.yujiyoshimine.customthemes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color


fun lightColors() = CustomColors(
    primary = Color(0xFFFFFFFF),
    secondary = Color(0xFFFFFFFF),
    success = Color(0xFFFFFFFF),
    error = Color(0xFFFFFFFF),
    isLight = true,
)

fun darkColors() = CustomColors(
    primary = Color(0xFFFFFFFF),
    secondary = Color(0xFFFFFFFF),
    success = Color(0xFFFFFFFF),
    error = Color(0xFFFFFFFF),
    isLight = false,
)

@Composable
fun CustomTheme(
    spaces: CustomSpaces = CustomTheme.spaces,
    typography: CustomTypography = CustomTheme.typography,
    colors: CustomColors = CustomTheme.colors,
    darkColors: CustomColors? = null,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val rememberedColors = remember {
        val currentColor = if (darkColors != null && darkTheme) darkColors else colors
        currentColor.copy()
    }.apply { updateColorsFrom(colors) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalSpaces provides spaces,
        LocalTypography provides typography,
    ) {
        ProvideTextStyle(typography.body1, content = content)
    }
}