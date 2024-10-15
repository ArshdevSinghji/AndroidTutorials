package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ImplicitActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)

        val et=findViewById<EditText>(R.id.editTextText3)
        val nav=findViewById<Button>(R.id.button7)
        val cam=findViewById<Button>(R.id.button8)
        val call=findViewById<Button>(R.id.button9)
        val con=findViewById<Button>(R.id.button10)
        val gal=findViewById<Button>(R.id.button11)
        val dia=findViewById<Button>(R.id.button12)

        nav.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            startActivity(intent)
        }
        cam.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = CallLog.Calls.CONTENT_URI
            startActivity(intent)
        }
        con.setOnClickListener{
            val intent=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(intent)
        }
        gal.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.setType("image/*")
            startActivity(intent)
        }
        dia.setOnClickListener{
            val intent=Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
    }
}
