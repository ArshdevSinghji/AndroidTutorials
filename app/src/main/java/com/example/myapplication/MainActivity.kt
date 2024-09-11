package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val username=findViewById<EditText>(R.id.etUsername)
        val password=findViewById<TextView>(R.id.etPassword)
        val output=findViewById<TextView>(R.id.tvOutput)
        val btn=findViewById<Button>(R.id.btnLogin)
        btn.setOnClickListener{
            val name=username.text.toString()
            val pass=password.text.toString()
            output.text="My Username is $name and Password is $pass"
        }
    }
    override fun onStart(){
        super.onStart()
        val toast=Toast.makeText(applicationContext,"onStart Called",Toast.LENGTH_LONG)
        toast.show() //A toast provides simple feedback about an operation in a small popup
    }
    //applicationContext: represents the current state of the application
    override fun onRestart() {
        super.onRestart()
        val toast=Toast.makeText(this,"onRestart Called",Toast.LENGTH_LONG).show()
    }
    override fun onPause(){
        super.onPause()
        val toast=Toast.makeText(applicationContext,"onPause Called",Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        val toast=Toast.makeText(applicationContext,"onResume Called",Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        val toast=Toast.makeText(applicationContext,"onStop Called",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","onStopCalled")
    }
    override fun onDestroy() {
        super.onDestroy()
        val toast=Toast.makeText(applicationContext,"onDestroy Called",Toast.LENGTH_LONG).show()
    }
}