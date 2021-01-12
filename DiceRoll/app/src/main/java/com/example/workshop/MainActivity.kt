package com.example.workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton=findViewById<Button>(R.id.roll)
        var diceImage=findViewById<ImageView>(R.id.dice_image)

        rollButton.setOnClickListener {
            var randomNumber=(1..6).random()
            when(randomNumber){
                1->diceImage.setImageResource(R.drawable.dice_1)
                2->diceImage.setImageResource(R.drawable.dice_2)
                3->diceImage.setImageResource(R.drawable.dice_3)
                4->diceImage.setImageResource(R.drawable.dice_4)
                5->diceImage.setImageResource(R.drawable.dice_5)
                6->diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}