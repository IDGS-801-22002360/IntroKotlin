package com.example.introkotlin_901.ejemplo1

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R
import android.widget.Button
import android.widget.Toast

class SumaActivity : AppCompatActivity() {

    private lateinit var txtnum1: EditText
    private lateinit var txtnum2: EditText
    private lateinit var txtRes: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        val myButton = findViewById<Button>(R.id.btnCalcular)
        myButton.setOnClickListener {
            // Code to execute when the button is clicked
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }
    }

}



