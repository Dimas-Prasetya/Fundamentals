package com.sam_id.mydiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnRoll: Button
    private lateinit var imageDice1: ImageView
    private lateinit var imageDice2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener { rollDice() }
        imageDice1 = findViewById(R.id.image_dice_1)
        imageDice2 = findViewById(R.id.image_dice_2)
    }

    private fun rollDice() {
        imageDice1.setImageResource(getRandomDiceImage())
        imageDice2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomDice = (1..6).random()

        return when (randomDice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
    }
}