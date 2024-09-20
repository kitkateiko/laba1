package com.example.laba1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.view.View
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun season(view: View)
    {
        val x = findViewById<EditText>(R.id.editTextNumber)
        when(x.text.toString().toInt())
        {
            1 -> Toast.makeText(this,"Зима",Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this,"Весна",Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this,"Лето",Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(this,"Осень",Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(this,"ВВЕДИТЕ ЧИСЛО ОТ 1 ДО 4",Toast.LENGTH_SHORT).show()
        }

    }

}