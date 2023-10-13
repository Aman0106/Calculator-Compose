package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator_compose.view_models.InputViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldsComposable() {
    val inputViewModel = viewModel<InputViewModel>()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.End
    ) {

            Text(
                text = inputViewModel.inputText,
                style = LocalTextStyle.current.copy(
                    fontSize = 66.sp,
                    color = Color.White,
                    textAlign = TextAlign.Right,
                )
            )
            Text(
                text = inputViewModel.result,
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