package com.example.intentapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val buttonActivity3 = findViewById<Button>(R.id.button_activity3)
        val textViewActivity3 = findViewById<TextView>(R.id.texview_activity3)

        val intent = intent
        val password = intent.getStringExtra("Password")

        textViewActivity3.text = "Here is your password: " + password

        buttonActivity3.setOnClickListener {
            finish()
        }
    }
}