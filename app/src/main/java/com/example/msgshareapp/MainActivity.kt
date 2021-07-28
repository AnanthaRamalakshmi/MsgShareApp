package com.example.msgshareapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        btnShowToast.setOnClickListener { ShowToast() }
    }
       private fun ShowToast() {
           Toast.makeText(this, "Button was Clicked",
          Toast.LENGTH_SHORT).show()
    }
}

