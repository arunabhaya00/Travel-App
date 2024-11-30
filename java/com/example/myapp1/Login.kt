package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        val imageButton: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.button5)
        imageButton.setOnClickListener{

            val intent = Intent(this,Signup::class.java)
            startActivity(intent)

        }
    }
}