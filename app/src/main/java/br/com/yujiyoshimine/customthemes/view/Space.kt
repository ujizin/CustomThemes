package br.com.yujiyoshimine.customthemes.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import br.com.yujiyoshimine.customthemes.R
import br.com.yujiyoshimine.customthemes.extensions.capitalize
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

@Composable
fun SpaceSection() {
    Section(title = stringResource(id = R.string.spaces)) {
        SpaceItem(
            title = stringResource(id = R.string.small),
            spaceHeight = CustomTheme.spaces.small
        )
        SpaceItem(
            title = stringResource(id = R.string.medium),
            spaceHeight = CustomTheme.spaces.medium
        )
        SpaceItem(
            title = stringResource(id = R.string.large),
            spaceHeight = CustomTheme.spaces.large
        )
        SpaceItem(
            title = stringResource(id = R.string.extralarge),
            spaceHeight = CustomTheme.spaces.extraLarge
        )
    }
}

@Composable
fun SpaceItem(
    modifier: Modifier = Modifier,
    title: String,
    spaceHeight: Dp,
) {
    Column(modifier.padding(top = CustomTheme.spaces.medium)) {
        Text(title.capitalize())
        Box(Modifier
            .fillMaxWidth()
            .height(spaceHeight)
            .background(CustomTheme.colors.primary)
        )
    }
}
