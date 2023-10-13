package com.example.calculator_compose.models

import kotlin.math.pow

class CalculateModel(
    private val inputText: String
) {
    private val inputUnits = mutableListOf<InputUnitDataClass>()

    fun calculate(): String {
        var result = 0f

        evaluate(inputText, inputUnits)

        inputUnits.forEach {
            when (it.operand) {
                '.' -> result = it.number
                '+' -> result += it.number
                '-' -> result -= it.number
                '*' -> result *= it.number
                '/' -> result /= it.number
                '^' -> result = result.toDouble().pow(it.number.toDouble()).toFloat()
            }
        }
        return result.toString()
    }

    fun evaluate(input: String, inputUnits: MutableList<InputUnitDataClass>) {
        var lastIndex = 0
        var operand = '.'
        var index = 0
        input.forEach { c ->
            if (c !in '0'..'9' && c != '.') {
                val num = input.substring(lastIndex, index).toFloat()
                inputUnits.add(InputUnitDataClass(operand, num))
                operand = input[index++]
                lastIndex = index
                return@forEach
            }
            if (index == input.length - 1) {
                val num = input.substring(lastIndex, index + 1).toFloat()
                inputUnits.add(InputUnitDataClass(operand, num))
            }
            index++
        }

    }
}
data class InputUnitDataClass(
    val operand: Char,
    val number: Float,
)
