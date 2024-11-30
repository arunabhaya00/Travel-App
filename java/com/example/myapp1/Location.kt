package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_location2)


        val imageButton: ImageButton = findViewById(R.id.imageView7)
        imageButton.setOnClickListener{

            val intent = Intent(this,Map::class.java)
            startActivity(intent)

        }
    }
}

