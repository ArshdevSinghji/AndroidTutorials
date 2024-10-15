package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RecievedataActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recievedata)
        val username=intent.getStringExtra("username")
        val password=intent.getStringExtra("password")
        val displayUsername=findViewById<TextView>(R.id.textView4)
        val displayPassword=findViewById<TextView>(R.id.textView5)
        displayUsername.text = username
        displayPassword.text= password
    }
}