package com.example.introkotlin_901.ejemplo1

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class SumaActivity : AppCompatActivity() {

    private lateinit var txtnum1: EditText
    private lateinit var txtnum2: EditText
    private lateinit var txtRes: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suma)

        txtnum1 = findViewById(R.id.txtnum1)
        txtnum2 = findViewById(R.id.txtnum2)
        txtRes = findViewById(R.id.txtRes)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: android.view.View) {
        val num1 = txtnum1.text.toString().toInt()
        val num2 = txtnum2.text.toString().toInt()
        val res = num1 + num2
        txtRes.setText(res.toString())
    }

}



