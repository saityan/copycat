package saityan.misc.copycat.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Black,
    primaryVariant = Green,
    onPrimary = White,
    onBackground = White,
    background = Black,
    surface = DarkGray,
    secondary = Shoal,
    secondaryVariant = Blue,
    onSurface = Gray
)

private val LightColorPalette = lightColors(
    primary = Black,
    primaryVariant = Green,
    onPrimary = White,
    onBackground = White,
    background = Black,
    surface = DarkGray,
    secondary = Shoal,
    secondaryVariant = Blue,
    onSurface = Gray

    /* Other default colors to override
    surface = Color(0xFFFFFBFE),
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun CopycatTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
