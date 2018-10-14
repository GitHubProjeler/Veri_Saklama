package com.example.fatih.storedatakotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //veri kaydetmek için
    fun saveBtn(view: View){

       val sharedPrefences = this.getSharedPreferences("com.example.fatih.storedatakotlin", Context.MODE_PRIVATE)
        var age = editText.text.toString().toInt()
         sharedPrefences.edit().putInt("userAge",age).apply()


    }

    //Veri çekmek için
    fun showBtn(view: View){

       val sharedPrefences = this.getSharedPreferences("com.example.fatih.storedatakotlin", Context.MODE_PRIVATE)
       val saveAge = sharedPrefences.getInt("userAge",0)
        sonucText.text = "Sonuç : " + saveAge
    }

    //Veriyi silmek için
    fun deleteBtn (view: View){
        val sharedPrefences = this.getSharedPreferences("com.example.fatih.storedatakotlin", Context.MODE_PRIVATE)
        sharedPrefences.edit().remove("userAge").apply()
        sonucText.text = "Sonuç : "
    }
}
