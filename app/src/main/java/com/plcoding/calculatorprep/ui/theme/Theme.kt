package com.plcoding.calculatorprep.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//all the new dark and light colors are added
private val DarkColorPalette = darkColors(
    primary = Orange,
    onPrimary = Color.White,
    secondary = LightGray,
    onSecondary = Color.White,
    surface = MediumGray,
    onSurface = Color.White,
    background = Color.DarkGray,
    onBackground = Color.White,
)

private val LightColorPalette = lightColors(
    primary = Orange,
    onPrimary = Color.White,
    secondary = Color(0xFFBDBDBD),
    onSecondary = Color.Black,
    surface = Color(0xFFE0E0E0),
    onSurface = Color.Black,
    background = Color(0xFFF5F5F5),
    onBackground = Color.Black,

)

@Composable
fun CalculatorPrepTheme(
    isDarkMode: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (isDarkMode) {
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