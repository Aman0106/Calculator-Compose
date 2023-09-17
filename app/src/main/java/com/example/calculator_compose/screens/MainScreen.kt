package com.example.calculator_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator_compose.composables.InputButtonsComposable
import com.example.calculator_compose.composables.TextFieldsComposable

@Composable
fun MainScreen() {
    Column {
        TextFieldsComposable()
        InputButtonsComposable()
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}