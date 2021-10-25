package br.com.yujiyoshimine.customthemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTheme(darkColors = darkColors()) {
                Scaffold(
                    backgroundColor = CustomTheme.colors.background,
                    topBar = { TopAppBar() }
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        TextTheme(
                            titleRes = R.string.primary,
                            background = CustomTheme.colors.primary,
                            space = CustomTheme.spaces.small,
                        )
                        TextTheme(
                            titleRes = R.string.secondary,
                            background = CustomTheme.colors.secondary,
                            space = CustomTheme.spaces.medium,
                        )
                        TextTheme(
                            titleRes = R.string.success,
                            background = CustomTheme.colors.success,
                            space = CustomTheme.spaces.large,
                        )
                        TextTheme(
                            titleRes = R.string.error,
                            background = CustomTheme.colors.error,
                            space = CustomTheme.spaces.extraLarge,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun TextTheme(
    @StringRes titleRes: Int,
    background: Color,
    space: Dp,
) {
    Text(
        text = stringResource(id = titleRes),
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(background)
            .padding(vertical = 16.dp)
            .fillMaxWidth(0.5F)
    )
    Spacer(modifier = Modifier.padding(top = space))
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