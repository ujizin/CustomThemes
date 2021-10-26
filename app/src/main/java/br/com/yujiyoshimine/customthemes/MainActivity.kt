package br.com.yujiyoshimine.customthemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme
import br.com.yujiyoshimine.customthemes.ui.theme.darkColors
import br.com.yujiyoshimine.customthemes.view.ColorSection
import br.com.yujiyoshimine.customthemes.view.SpaceSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTheme(darkColors = darkColors()) {
                ThemeUI()
            }
        }
    }
}

@Composable
private fun ThemeUI() {
    Scaffold(
        backgroundColor = CustomTheme.colors.background,
        topBar = { TopAppBar() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ColorSection()
            SpaceSection()
            TypographySection()
        }
    }

}

@Composable
private fun TopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = CustomTheme.typography.h1)
        }
    )
}