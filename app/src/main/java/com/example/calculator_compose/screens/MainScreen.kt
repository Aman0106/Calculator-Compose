package com.example.calculator_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator_compose.composables.InputButtonsComposable
import com.example.calculator_compose.composables.TextFieldsComposable

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        TextFieldsComposable()
        Spacer(modifier = Modifier.height(10.dp))
        InputButtonsComposable()
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}