package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldsComposable() {
    var inputText by remember {
        mutableStateOf("1+2+3")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.End
    ) {

            Text(
                text = inputText,
                style = LocalTextStyle.current.copy(
                    fontSize = 66.sp,
                    color = Color.White,
                    textAlign = TextAlign.Right,
                )
            )
            Text(
                text = "6",
                style = LocalTextStyle.current.copy(
                    fontSize = 108.sp,
                    color = Color.White,
                    textAlign = TextAlign.Right,
                )
            )
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldsPreview() {
    TextFieldsComposable()
}