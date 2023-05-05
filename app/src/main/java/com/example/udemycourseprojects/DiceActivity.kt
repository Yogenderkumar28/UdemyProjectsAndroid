package com.example.udemycourseprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*


class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        val rollButton = findViewById<Button>(R.id.button_id)
        val diceOne: ImageView = findViewById(R.id.first_dice)
        val diceTwo: ImageView = findViewById(R.id.second_dice)
        rollButton.setOnClickListener() {
            val randomNumber1 = Random().nextInt(6) + 1

            val resourcesDrawable1 = getImage(randomNumber1)
            diceOne.setImageResource(resourcesDrawable1)
            val randomNumber2 = Random().nextInt(6) + 1

            val resourcesDrawable2 = getImage(randomNumber2)
            diceTwo.setImageResource(resourcesDrawable2)
        }
    }

    private fun getImage(num: Int) : Int {
       return when(num) {
               1 -> R.drawable.dice1
               2 -> R.drawable.dice2
               3 -> R.drawable.dice3
               4 -> R.drawable.dice4
               5 -> R.drawable.dice5
               6 -> R.drawable.dice6
               else -> R.drawable.dice6
        }
    }

}