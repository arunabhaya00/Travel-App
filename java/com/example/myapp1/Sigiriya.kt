package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sigiriya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sigiriya)

        val imageButton: ImageView = findViewById(R.id.imageView42)
        imageButton.setOnClickListener{

            val intent = Intent(this,Hotel::class.java)
            startActivity(intent)

        }
    }
}