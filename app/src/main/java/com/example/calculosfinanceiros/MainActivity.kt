package com.example.calculosfinanceiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import   org.jetbrains.anko.startActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTesouro = findViewById<Button>(R.id.btnTesouro)
        val btnPoupanca = findViewById<Button>(R.id.btnPoupanca)

        btnTesouro.setOnClickListener {
            startActivity<TesouroActivity>()
        }

        btnPoupanca.setOnClickListener {
            startActivity<PoupancaActivity>()
        }
    }
}