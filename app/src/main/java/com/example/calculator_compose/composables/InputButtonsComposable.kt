package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator_compose.ui.theme.primaryGreen
import com.example.calculator_compose.ui.theme.primaryGrey

@Composable
fun InputButtonsComposable(
    rowSpacing: Int = 3,
    colSpacing: Int = 3
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(rowSpacing.dp),

    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(colSpacing.dp)
        ) {
            FunctionButtonComposable(txt = "AC", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "^", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "%", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "/", modifier = Modifier.weight(1f))
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(colSpacing.dp)
        ){
            NumberButtonComposable(txt = "7", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "8", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "9", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "*", modifier = Modifier.weight(1f))
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(colSpacing.dp)
        ) {
            NumberButtonComposable(txt = "4", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "5", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "6", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "-", modifier = Modifier.weight(1f))
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(colSpacing.dp)
        ) {
            NumberButtonComposable(txt = "1", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "2", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = "3", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "+", modifier = Modifier.weight(1f))
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(colSpacing.dp)
        ) {
            NumberButtonComposable(txt = "0", modifier = Modifier.weight(1f))
            NumberButtonComposable(txt = ".", modifier = Modifier.weight(1f))
            FunctionButtonComposable(txt = "=", modifier = Modifier.weight(2f), containerColor = primaryGreen, txtColor = primaryGrey)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputButtonsPreview() {
    InputButtonsComposable()
}