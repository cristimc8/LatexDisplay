package com.kotlin.latexdisplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlin.latexdisplay.ui.LaTeXView
import com.kotlin.latexdisplay.ui.theme.LatexDisplayTheme
import com.kotlin.latexdisplay.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatexDisplayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Purple40
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    LaTeXView(latex = "\\\\sin(x) \\\\cdot \\\\cos(y) \\\\cdot \\\\sin(x \\\\cdot y)")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatexDisplayTheme {
        Greeting("Android")
    }
}