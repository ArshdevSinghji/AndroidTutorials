package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        val btn = findViewById<Button>(R.id.button6)
        btn.setOnClickListener{
            view-> Snackbar.make(view,"want to shift",Snackbar.LENGTH_LONG).setAction("yes"){
//            Toast.makeText(this,"this is a toast",Toast.LENGTH_LONG).show()
            val intent= Intent(this,SpinnerActivity::class.java)
            startActivity(intent)
            }.show()
        }
    }
}