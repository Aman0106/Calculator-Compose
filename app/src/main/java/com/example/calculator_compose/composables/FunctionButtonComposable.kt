package com.example.calculator_compose.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator_compose.ui.theme.primaryGreen
import com.example.calculator_compose.ui.theme.primaryGrey

@Composable
fun FunctionButtonComposable(
    txt: String,
    modifier: Modifier = Modifier,
    txtColor:Color = primaryGrey,
    containerColor: Color = primaryGreen
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .padding(horizontal = 2.dp, vertical = 2.dp)
            .height(120.dp),
        colors = ButtonDefaults.buttonColors(containerColor = containerColor)

    ) {
        Text(text = txt, fontSize = 32.sp, color = txtColor)
    }
}

@Preview(showBackground = true)
@Composable
fun FunctionButtonComposablePreview () {
    FunctionButtonComposable(txt = "AC")
}