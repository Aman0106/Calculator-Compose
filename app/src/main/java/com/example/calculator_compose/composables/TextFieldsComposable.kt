package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldsComposable() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        Text(text = "12+34-56")
        Text(text = "-26")
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldsPreview() {
    TextFieldsComposable()
}