package com.example.intentapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonActivity2 = findViewById<Button>(R.id.button_activity2)
        val button2Activity2 = findViewById<Button>(R.id.button2_activity2)
        val textViewActivity2 = findViewById<TextView>(R.id.texview_activity2)

        val intent = intent
        val userName = intent.getStringExtra("User")
        val password = intent.getStringExtra("Password")
        textViewActivity2.text = "Welcome to your app " + userName
        buttonActivity2.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                it.putExtra("Password", password)
                startActivity(it)
            }
        }
        button2Activity2.setOnClickListener {
            finish()
        }
    }
}