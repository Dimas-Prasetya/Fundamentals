package com.sam_id.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boxThreeText: TextView
    private lateinit var boxFourText: TextView
    private lateinit var boxFiveText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val boxOneText: TextView = findViewById(R.id.box_one_text)
        val boxTwoText: TextView = findViewById(R.id.box_two_text)
        boxThreeText = findViewById(R.id.box_three_text)
        boxFourText = findViewById(R.id.box_four_text)
        boxFiveText = findViewById(R.id.box_five_text)
        val redButton: Button = findViewById(R.id.red_button)
        val greenButton: Button = findViewById(R.id.green_button)
        val yellowButton: Button = findViewById(R.id.yellow_button)

        val rootConstraintLayout: View = findViewById(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            rootConstraintLayout,
            redButton,
            greenButton,
            yellowButton
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}