package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 30..35 -> "Sam Cooke"
                    in 35..40 -> "Martin Luther King"
                    in 40..45 -> "Kobe Bryant"
                    in 45..50 -> "Micheal Jackson"
                    in 50..55 -> "Harry Houdini"
                    in 55..60 -> "Adolf Hitler"
                    in 60..65 -> "Louis Calhern"
                    in 65..70 -> "Saddam Hussein"
                    in 70..75 ->"Muhammad Ali"
                    in 75..80-> "Elizabeth Taylor"
                    else -> "out of rang."
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Sam Cooke" -> "Sam Cooke died at the age of 33."
                        "Martin Luther King" -> "Martin Luther King died at the age of 39."
                        "Kobe Bryant" -> "Kobe Bryant died at the age of 41."
                        "Micheal Jackson" -> "Micheal Jackson died at the age of 50."
                        "Harry Houdini" -> "Harry Houdini died at the age of 52."
                        "Adolf Hitler" -> "Adolf Hitler died at the age of 56."
                        "Louis Calhern" -> "Louis Calhern died at the age of 61."
                        "Saddam Hussein" -> "Saddam Hussein died at the age of 69."
                        "Muhammad Ali" -> "Muhammad Ali died at the age of 74."
                        "Elizabeth Taylor" -> "Elizabeth Taylor died at the age of 79."
                        else -> "You age is out of rang."
                    }

                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }



   }