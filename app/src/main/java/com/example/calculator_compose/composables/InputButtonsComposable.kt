package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputButtonsComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Row {
            FunctionButtonComposable(txt = "AC")
            FunctionButtonComposable(txt = "^")
            FunctionButtonComposable(txt = "%")
            FunctionButtonComposable(txt = "/")
        }

        Row {
            NumberButtonComposable(txt = "7")
            NumberButtonComposable(txt = "8")
            NumberButtonComposable(txt = "9")
            FunctionButtonComposable(txt = "*")
        }

        Row {
            NumberButtonComposable(txt = "4")
            NumberButtonComposable(txt = "5")
            NumberButtonComposable(txt = "6")
            FunctionButtonComposable(txt = "-")
        }

        Row {
            NumberButtonComposable(txt = "1")
            NumberButtonComposable(txt = "2")
            NumberButtonComposable(txt = "3")
            FunctionButtonComposable(txt = "+")
        }

        Row {
            NumberButtonComposable(txt = "0")
            NumberButtonComposable(txt = ".")
            FunctionButtonComposable(txt = "+")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputButtonsPreview() {
    InputButtonsComposable()
}