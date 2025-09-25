package com.cpsc333fa25.layoutsandwidgetsactivity1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button
    lateinit var usernameTextView: TextView
    lateinit var resultTextView: TextView

    lateinit var buttonOneButton: Button
    lateinit var buttonTwoButton: Button
    lateinit var buttonThreeButton: Button
    lateinit var buttonFourButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        submitButton = findViewById<Button>(R.id.submitButton)
        usernameTextView = findViewById<TextView>(R.id.usernameInput)
        resultTextView = findViewById<TextView>(R.id.resultText)

        //not required
        buttonOneButton = findViewById<Button>(R.id.btn_one)
        buttonTwoButton = findViewById<Button>(R.id.btn_two)
        buttonThreeButton = findViewById<Button>(R.id.btn_three)
        buttonFourButton = findViewById<Button>(R.id.btn_four)

        submitButton.setOnClickListener {
            val username = usernameTextView.text
            val greeting = getString(R.string.greeting_format, username)
            resultTextView.text = greeting
        }

        buttonOneButton.setOnClickListener {
            Toast.makeText(this, "one!", Toast.LENGTH_SHORT).show()
        }
        buttonTwoButton.setOnClickListener {
            Toast.makeText(this, "two!", Toast.LENGTH_SHORT).show()
        }
        buttonThreeButton.setOnClickListener {
            Toast.makeText(this, "three!", Toast.LENGTH_SHORT).show()
        }
        buttonFourButton.setOnClickListener {
            Toast.makeText(this, "four!", Toast.LENGTH_SHORT).show()
        }
    }
}