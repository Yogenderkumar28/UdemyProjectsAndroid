package com.example.udemycourseprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class ColorChangingTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_changing_text)

        val changeTextColor = findViewById<Button>(R.id.color_changing_btn)
        val txt = findViewById<TextView>(R.id.textView_changing_color)
        changeTextColor.setOnClickListener() {
            val randomColor = Random().nextInt(6) + 1
            val Colour = when(randomColor) {
                1 -> R.color.forest_green
                2 -> R.color.midnight_blue
                3 -> R.color.kashmir_green
                4 -> R.color.burnt_umber
                5 -> R.color.teal_200
                6 -> R.color.purple_500
                else -> R.color.black
            }

            txt.setTextColor(resources.getColor(Colour, null))

        }
    }
}