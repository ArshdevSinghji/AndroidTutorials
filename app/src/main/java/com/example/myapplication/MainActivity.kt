package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
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
        var a=findViewById<EditText>(R.id.editTextText)
        var b=findViewById<Button>(R.id.btn1)
        var c=findViewById<ListView>(R.id.listView)
        var e=ArrayList<String>()
        var d:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,e)
        c.adapter=d //set adapter to listview means set data to listview
        b.setOnClickListener{
            var f=a.text.toString()
            if(f.isNotEmpty()){
                e.add(f);
                a.text.clear()
                d.notifyDataSetChanged()
            }else{
                Toast.makeText(this,"enter something",Toast.LENGTH_SHORT).show()
            }
        }

    }
}