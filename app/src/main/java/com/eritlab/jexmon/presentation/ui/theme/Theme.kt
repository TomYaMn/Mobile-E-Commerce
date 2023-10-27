package com.eritlab.jexmon.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
//import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Purple800,
    primaryVariant = Purple900,
    secondary = Teal400,
    secondaryVariant = Teal500,
    background = Purple500,
    surface = Purple400,
    error = Red500,
    onPrimary = White,
    onSecondary= Black,
    onBackground= White,
    onSurface = White,
    onError = White
)

private val LightColorPalette = lightColors(
    primary = Grey800,
    primaryVariant = Grey900,
    secondary = Gold400,
    secondaryVariant = Gold500,
    background = Grey500,
    surface = Grey400,
    error = Red200,
    onPrimary = White,
    onSecondary= Black,
    onBackground= White,
    onSurface = White,
    onError = White

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun TomYumTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    MaterialTheme(
        colors = if(darkTheme) DarkColorPalette else LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}