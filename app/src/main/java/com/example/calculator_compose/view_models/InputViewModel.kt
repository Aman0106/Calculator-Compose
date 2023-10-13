package com.example.calculator_compose.view_models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator_compose.models.CalculateModel

class InputViewModel : ViewModel() {
    var result by mutableStateOf("")
        private set

    var inputText by mutableStateOf("")
        private set

    fun getResult() {
        val calculateModel = CalculateModel(inputText)
        result = calculateModel.calculate()
    }

    fun setInput(input: String) = run { inputText += input }

    fun clearInput() {
        inputText = ""
        result = ""
    }
}