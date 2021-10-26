package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import br.com.yujiyoshimine.customthemes.R
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun ColorSection() {
    Section(title = stringResource(R.string.colors)) {
        ColorItem(
            title = stringResource(id = R.string.primary),
            background = CustomTheme.colors.primary,
        )
        ColorItem(
            title = stringResource(id = R.string.success),
            background = CustomTheme.colors.success,
        )
        ColorItem(
            title = stringResource(id = R.string.error),
            background = CustomTheme.colors.error,
        )
    }
}

@Composable
private fun ColorItem(
    title: String,
    background: Color,
) {
    Text(
        text = title,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(top = CustomTheme.spaces.large)
            .background(background)
            .padding(vertical = CustomTheme.spaces.large)
            .fillMaxWidth()
    )
}
