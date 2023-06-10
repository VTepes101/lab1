package com.example.lab1
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.*
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_activity)

    }

    fun onClickMyButton(view: View){
        val editText1 = findViewById<TextView>(R.id.editText1)
        val editText2 = findViewById<TextView>(R.id.TextOut)
        editText2.text = editText1.text.toString()
        editText2.visibility = VISIBLE
    }
}