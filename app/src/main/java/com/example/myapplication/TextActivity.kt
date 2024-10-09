package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class TextActivity:AppCompatActivity(){
    private fun setLocale(langCode:String){
        val currentLang=resources.configuration.locales.get(0).language
        if(langCode!=currentLang){
            val l= Locale(langCode)
            Locale.setDefault(l)
            val c= Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)
            recreate()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_localdemo)
        val btnEnglish=findViewById<Button>(R.id.button3)
        val btnHindi=findViewById<Button>(R.id.button5)
        btnEnglish.setOnClickListener{
            setLocale("en")
        }
        btnHindi.setOnClickListener {
            setLocale("hi")
        }
    }
}