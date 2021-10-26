package br.com.yujiyoshimine.customthemes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color


fun lightColors() = CustomColors(
    primary = Color(0xFFE67E22),
    background = Color(0xFFF5F5F5),
    success = Color(0xFF2ECC71),
    error = Color(0xFFE74C3C),
    isLight = true,
)

fun darkColors() = CustomColors(
    primary = Color(0xFFDF6900),
    background = Color(0xFF353B48),
    success = Color(0xFF44BD32),
    error = Color(0xFFC23616),
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
    val currentColor = remember { if (darkColors != null && darkTheme) darkColors else colors }
    val rememberedColors = remember { currentColor.copy() }.apply { updateColorsFrom(currentColor) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalSpaces provides spaces,
        LocalTypography provides typography,
    ) {
        ProvideTextStyle(typography.body1, content = content)
    }
}