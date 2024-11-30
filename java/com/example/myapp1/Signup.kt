package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val imageButton: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.button5)
        imageButton.setOnClickListener{

            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}