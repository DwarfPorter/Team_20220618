package com.example.team_20220618

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Загружаем", Toast.LENGTH_LONG).show()

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            Toast.makeText(this, "Кнопа", Toast.LENGTH_LONG).show()
        }
    }
}