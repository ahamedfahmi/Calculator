package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var num1 : EditText
    lateinit var num2 : EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         num1 = findViewById<EditText>(R.id.input_text)
         num2 = findViewById<EditText>(R.id.input_text1)


        //operators

        val add = findViewById<Button>(R.id.add)
        val subtract = findViewById<Button>(R.id.subs)
        val multiply = findViewById<Button>(R.id.multiply)
        val divide = findViewById<Button>(R.id.divide)

        //equal button

        val eqBtn = findViewById<Button>(R.id.btn_equal)

        eqBtn.setOnClickListener{

            if (add.isPressed){

            }


        }


    }

}