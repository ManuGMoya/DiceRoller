package com.manugmoya.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        btn_count_up.setOnClickListener {
            countUp()
        }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        result_text.text = randomInt.toString()
    }

    private fun countUp(){

        if(result_text.text == "Hello word"){
            result_text.text = 1.toString()
        }else{
            var result = result_text.text.toString().toInt()
            if(result < 6){
                result++
                result_text.text = result.toString()
            }
        }

    }
}