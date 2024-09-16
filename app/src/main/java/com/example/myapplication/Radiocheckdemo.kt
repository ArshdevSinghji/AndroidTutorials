package com.example.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Radiocheckdemo : AppCompatActivity() { // Inherit from AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radiocheckdemo)
        var a=findViewById<RadioGroup>(R.id.rg1)
        var b=findViewById<CheckBox>(R.id.checkBox)
        var c=findViewById<CheckBox>(R.id.checkBox2)
        var d=findViewById<CheckBox>(R.id.checkBox3)
        var e=findViewById<Button>(R.id.button)
        e.setOnClickListener {
            var f = a.checkedRadioButtonId
            var g = when (f) {
                R.id.radioButton -> "small"
                R.id.radioButton2 -> "medium"
                R.id.radioButton3 -> "large"
                else -> "none"
            }
            var h=mutableListOf<String>()
            if(b.isChecked) h.add(b.text.toString())
            if(c.isChecked) h.add(c.text.toString())
            if(d.isChecked) h.add(d.text.toString())
            if(h.isEmpty()) h.add("none")
            Toast.makeText(this, "$g pizza with $h as topping", Toast.LENGTH_LONG).show()
        }
    }
}