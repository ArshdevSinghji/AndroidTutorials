package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val username=findViewById<EditText>(R.id.editTextText2)
        val password=findViewById<EditText>(R.id.editTextTextPassword)
        val output=findViewById<TextView>(R.id.textView)
        val b=findViewById<Button>(R.id.button4)
        b.setOnClickListener{
            val a= Intent(this,SpinnerActivity::class.java)
            val x=username.text.toString()
            val y=output.text.toString()
            a.putExtra("username", x) // Using key-value pairs for intent extras
            a.putExtra("output", y)
            startActivity(a)
        }
    }
}