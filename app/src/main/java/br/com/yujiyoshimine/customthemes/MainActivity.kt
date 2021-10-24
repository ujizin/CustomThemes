package br.com.yujiyoshimine.customthemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import br.com.yujiyoshimine.customthemes.ui.theme.CustomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTheme {
                Surface(color = CustomTheme.colors.primary) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
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

                        Button(
                            modifier = Modifier.background(CustomTheme.colors.primary),
                            onClick = {

                            }
                        ) {
                            val textRes = if (CustomTheme.colors.isLight) {
                                R.string.light_mode
                            } else {
                                R.string.dark_mode
                            }
                            Text(stringResource(id = textRes))
                        }
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
        modifier = Modifier.background(background)
    )
    Spacer(modifier = Modifier.padding(top = space))
}
