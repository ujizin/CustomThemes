package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun ColumnScope.Section(
    title: String,
    content: @Composable ColumnScope.() -> Unit,
) {
    Text(title, style = CustomTheme.typography.h1)
    content()
}