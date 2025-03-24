package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // find the TextView by ID
        val TextView = findViewById<TextView>(R.id.textView)
        val EditText1 = findViewById<EditText>(R.id.editnum)
        val EditText2 = findViewById<EditText>(R.id.editnum2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val txt1 = EditText1.text.toString().toInt()
            val txt2 = EditText2.text.toString().toInt()
            val Answer = txt1+txt2

            TextView.text = """$Answer""".trimIndent()
        }
    }
}