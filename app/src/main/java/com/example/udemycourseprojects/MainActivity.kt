package com.example.udemycourseprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceActbutton = findViewById<Button>(R.id.dice_act_btn)
        diceActbutton.setOnClickListener {
            val Intent = Intent(this, DiceActivity::class.java)
            startActivity(Intent)
        }

        val changingActButton = findViewById<Button>(R.id.changing_text_color_act_btn)
        changingActButton.setOnClickListener() {
            val Intent = Intent(this, ColorChangingTextActivity::class.java)
            startActivity(Intent)
        }

        val composingMailBtn = findViewById<Button>(R.id.composing_mail_btn)
        composingMailBtn.setOnClickListener() {
            val Intent = Intent(this, ComposingMailConstraint::class.java)
            startActivity(Intent)
        }

        val calculatorBtn = findViewById<Button>(R.id.calculator_btn)
        calculatorBtn.setOnClickListener() {
            val Intent = Intent(this, CalculatorActivity::class.java)
            startActivity(Intent)
        }
    }


}