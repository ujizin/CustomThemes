package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.yujiyoshimine.customthemes.R
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun ColumnScope.ColorSection() {
    Section(stringResource(R.string.colors)) {
        TextItem(
            title = stringResource(id = R.string.primary),
            background = CustomTheme.colors.primary,
        )
        TextItem(
            title = stringResource(id = R.string.success),
            background = CustomTheme.colors.success,
        )
        TextItem(
            title = stringResource(id = R.string.error),
            background = CustomTheme.colors.error,
        )
    }
}
@Composable
private fun TextItem(
    title: String,
    background: Color,
) {
    Text(
        text = title,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(background)
            .padding(vertical = 16.dp)
            .fillMaxWidth()
    )
}
