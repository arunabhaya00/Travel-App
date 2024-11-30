package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        val imageButton: ImageButton = findViewById(R.id.imageView6)
        imageButton.setOnClickListener{

            val intent = Intent(this,Location::class.java)
            startActivity(intent)

        }


    }
}