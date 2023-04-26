package com.example.udemycourseprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class CalculatorActivity : AppCompatActivity() {

    var number: String? = ""
    var numberOne: Float = 0.0F
    var numberTwo: Float = 0.0F
    var isAddition: Boolean = false
    var isDivide: Boolean = false
    var isMinus: Boolean = false
    var isMultiply: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }

    fun operationFunction(view: View) {
        var editText: EditText? = findViewById(R.id.calculator_edit_text)

        when (view.id) {
            R.id.btn_zero -> {
                number += "0"
                editText?.setText(number)
            }
            R.id.btn_one -> {
                number += "1"
                editText?.setText(number)
            }
            R.id.btn_two -> {
                number += "2"
                editText?.setText(number)
            }
            R.id.btn_three -> {
                number += "3"
                editText?.setText(number)
            }
            R.id.btn_four -> {
                number += "4"
                editText?.setText(number)
            }
            R.id.btn_five -> {
                number += "5"
                editText?.setText(number)
            }
            R.id.btn_six -> {
                number += "6"
                editText?.setText(number)
            }
            R.id.btn_seven -> {
                number += "7"
                editText?.setText(number)
            }
            R.id.btn_eight -> {
                number += "8"
                editText?.setText(number)
            }
            R.id.btn_nine -> {
                number += "9"
                editText?.setText(number)
            }
            R.id.btn_clear -> {
                number = ""
                editText?.setText("")
            }
            R.id.btn_dot -> {
                number += "."
                editText?.setText(number)
            }
            R.id.btn_divide -> {
                if(number.isNullOrBlank()) {
                    editText?.setText("")
                }
                else {
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isDivide = true
                    number = ""
                }
            }
            R.id.btn_sum -> {
                if (number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number = ""
                }
            }
            R.id.btn_minus -> {
                if (number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isMinus = true
                    number = ""
                }
            }
            R.id.btn_multiply -> {
                if (number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isMultiply = true
                    number = ""
                }
            }
            R.id.btn_equal -> {
                if (isAddition) {
                    numberTwo = number!!.toFloat()
                    editText?.setText((numberOne + numberTwo).toString())
                } else if (isDivide) {
                    numberTwo = number!!.toFloat()
                    editText?.setText((numberOne / numberTwo).toString())
                } else if (isMinus) {
                    numberTwo = number!!.toFloat()
                    editText?.setText((numberOne - numberTwo).toString())
                } else if (isMultiply) {
                    numberTwo = number!!.toFloat()
                    editText?.setText((numberTwo * numberOne).toString())
                }
            }

        }
    }


}

//fun setValueOfNum1(
//    num1: Float,
//    num2: String,
//    isOperation: Boolean,
//    editText: EditText
//) {
//    var n1 = num1
//    n1 = num2!!.toFloat()
//    var isOper : Boolean = isOperation
//    isOper= true
//    var n2: String = num2
//    n2 = ""
//    editText.setText("")
//}