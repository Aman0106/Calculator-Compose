package com.example.calculator_compose.composables

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NumberButtonComposable(
    txt: String
) {
    Button(
        onClick = { /*TODO*/ },
        
    ) {
        Text(text = txt)
    }
}

@Preview(showBackground = true)
@Composable
fun NumberButtonComposablePreview() {
    NumberButtonComposable("1")
}