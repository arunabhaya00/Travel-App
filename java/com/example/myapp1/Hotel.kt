package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Hotel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hotel)

        val imageButton: ImageButton = findViewById(R.id.imageView1)
        imageButton.setOnClickListener{

            val intent = Intent(this,Profile::class.java)
            startActivity(intent)

        }

        val Button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.button151)
        Button.setOnClickListener{

            val intent = Intent(this,Sigiriya::class.java)
            startActivity(intent)

        }
    }
}