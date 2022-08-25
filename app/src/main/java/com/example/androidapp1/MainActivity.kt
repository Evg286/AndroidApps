package com.example.androidapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getName(): CharSequence? {
        val name: TextView = findViewById<TextView>(R.id.editText)
        return name.text
    }

    fun onButtonClick(view: View){
        val textView: TextView = findViewById<TextView>(R.id.greeting)
        textView.text = "Hello ${getName()}. What's up?"
    }
}