package com.example.myapplication

import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class GirdLayoutDemo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gridlayoutdemo)
        val a=findViewById<ImageButton>(R.id.imageButton3)
        a.setOnClickListener{
            Toast.makeText(this,"Girl was clicked",Toast.LENGTH_LONG).show()
        }
    }
}