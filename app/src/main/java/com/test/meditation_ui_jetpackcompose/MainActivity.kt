package com.test.meditation_ui_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.test.meditation_ui_jetpackcompose.ui.HomeScreen
import com.test.meditation_ui_jetpackcompose.ui.theme.Meditation_UI_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Meditation_UI_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}

