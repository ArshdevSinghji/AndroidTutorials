package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ShiftdataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shiftdata)
        val username=findViewById<EditText>(R.id.editTextText4)
        val password=findViewById<EditText>(R.id.editTextTextPassword2)
        val btn=findViewById<Button>(R.id.button13)
        btn.setOnClickListener{
            val intent= Intent(this,RecievedataActivity::class.java)
            intent.putExtra("username",username.text.toString())
            intent.putExtra("password",password.text.toString())
            startActivity(intent)
        }
    }
}