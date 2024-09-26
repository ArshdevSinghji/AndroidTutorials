package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SpinnerActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        val btn=findViewById<Button>(R.id.button2)
        val text=findViewById<EditText>(R.id.editTextText)


        val spinner1=findViewById<Spinner>(R.id.spinner)
        val spinnerList:List<String> = listOf("fruits","vegetable")
        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerList)
        spinner1.adapter=arrayAdapter

        val a=findViewById<ListView>(R.id.listView)

        var fruits=ArrayList<String>()
        var fList= ArrayAdapter(this,android.R.layout.simple_list_item_1,fruits)

        var vege=ArrayList<String>()
        var vList= ArrayAdapter(this,android.R.layout.simple_list_item_1,vege)


        spinner1.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int, //position
                p3: Long  //id
            )   {
                if(spinnerList[p2]=="fruits"){
                    a.adapter=fList
                    btn.setOnClickListener{
                        val f=text.text.toString()
                        if(f.isNotEmpty()){
                            fruits.add(f)
                            text.text.clear()
                            fList.notifyDataSetChanged()
                        }
                    }
                }else{
                    a.adapter=vList
                    btn.setOnClickListener{
                        val f=text.text.toString()
                        if(f.isNotEmpty()){
                            vList.add(f)
                            text.text.clear()
                            vList.notifyDataSetChanged()
                        }
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}