package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)


        val imageButton: ImageView = findViewById(R.id.imageButton3)
        imageButton.setOnClickListener{

            val intent = Intent(this,Home::class.java)
            startActivity(intent)

        }
    }
}