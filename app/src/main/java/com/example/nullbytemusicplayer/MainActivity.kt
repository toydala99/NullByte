package com.example.nullbytemusicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            Intent(this, Home::class.java).also{
                startActivity(it);
            }


        }


    }
}