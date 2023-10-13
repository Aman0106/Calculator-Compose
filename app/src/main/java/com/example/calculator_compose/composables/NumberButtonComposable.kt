package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator_compose.ui.theme.primaryGrey
import com.example.calculator_compose.view_models.InputViewModel

@Composable
fun NumberButtonComposable(
    txt: String,
    modifier: Modifier = Modifier,
    txtColor:Color = Color.White,
    containerColor: Color = primaryGrey
) {
    val inputViewModel = viewModel<InputViewModel>()
    Button(
        onClick = {inputViewModel.setInput(txt)},
        modifier = modifier
            .padding(top = 6.dp)
            .clip(CircleShape)
            .size(100.dp),
        colors = ButtonDefaults.buttonColors(containerColor = containerColor)
    ) {
        Text(text = txt, fontSize = 40.sp, color = txtColor)
    }
}

@Preview(showBackground = true)
@Composable
fun NumberButtonComposablePreview() {
    NumberButtonComposable("1")
}