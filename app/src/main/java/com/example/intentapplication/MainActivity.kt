package com.example.intentapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login_button)
        val resetButton = findViewById<Button>(R.id.reset_button)
        val username = findViewById<EditText>(R.id.text_username)
        val password = findViewById<EditText>(R.id.text_password)

        loginButton.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("User", username.text.toString())
                it.putExtra("Password", password.text.toString())
                startActivity(it)
            }
        }

        resetButton.setOnClickListener {
            username.text = null
            password.text = null
        }
    }
}