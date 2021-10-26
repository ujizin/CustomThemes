package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import br.com.yujiyoshimine.customthemes.R
import br.com.yujiyoshimine.customthemes.extensions.capitalize
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun TypographySection() {
    Section(title = stringResource(id = R.string.typography)) {
        Text(
            text = stringResource(id = R.string.headline1).capitalize(),
            style = CustomTheme.typography.h1.copy(color = CustomTheme.colors.text)
        )
        Text(
            text = stringResource(id = R.string.body1).capitalize(),
            modifier = Modifier.padding(top = CustomTheme.spaces.medium)
        )
    }
}
