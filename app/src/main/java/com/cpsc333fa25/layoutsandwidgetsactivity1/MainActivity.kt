package com.cpsc333fa25.layoutsandwidgetsactivity1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button
    lateinit var usernameTextView: TextView
    lateinit var resultTextView: TextView

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

        submitButton.setOnClickListener {
            val username = usernameTextView.text
            val greeting = getString(R.string.greeting_format, username)
            resultTextView.text = greeting
        }
    }
}