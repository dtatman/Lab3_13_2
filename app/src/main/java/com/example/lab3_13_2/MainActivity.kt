package com.example.lab3_13_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.buttonCheck)
        val textView = findViewById<TextView>(R.id.textViewResult)
        button.setOnClickListener {
            val number = editText.text.toString().toIntOrNull()
            if (number != null) {
                if (number % 2 == 0) {
                    textView.text = "Even Number"
                } else {
                    textView.text = "Odd Number"
                }
                4
            } else {
                textView.text = "Invalid Input"
            }
        }
    }
}