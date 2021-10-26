package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.capitalize
import br.com.yujiyoshimine.customthemes.extensions.capitalize
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun Section(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable () -> Unit,
) {
    Column(
        Modifier
            .padding(top = CustomTheme.spaces.extraLarge)
            .then(modifier)
    ) {
        Text(
            text = title.capitalize(),
            style = CustomTheme.typography.h1.copy(color = CustomTheme.colors.text),
        )
        content()
    }
}
