package com.test.meditation_ui_jetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


@Composable
fun Meditation_UI_JetpackComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}