package com.example.calculosfinanceiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import	java.text.NumberFormat
import	java.util.Locale
import kotlin.math.*

class PoupancaActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poupanca)
        val txtInvestimentoPoupanca = findViewById<TextView>(R.id.txtInvestimentoPoupanca)
        val txtJurosPoupanca = findViewById<TextView>(R.id.txtJurosPoupanca)
        val txtMesesPoupanca = findViewById<TextView>(R.id.txtMesesPoupanca)
        val txtResultadoPoupanca = findViewById<TextView>(R.id.txtResultadoPoupanca)
        val btnCalcularPoupanca = findViewById<Button>(R.id.btnCalcularPoupanca)

        btnCalcularPoupanca.setOnClickListener{
            val investpoupanca = txtInvestimentoPoupanca.text.toString().toDouble()
            val jurospoupanca = txtJurosPoupanca.text.toString().toDouble()
            val mesespoupanca = txtMesesPoupanca.text.toString().toInt()
            var resultadopoupanca = (investpoupanca*((1+(jurospoupanca/100)).pow(mesespoupanca)-1))/(jurospoupanca/100)
            val f = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
            txtResultadoPoupanca.text = "O total de ${f.format(investpoupanca)} investidos com a taxa de $jurospoupanca % ao mês por $mesespoupanca meses" +
                    " será de ${f.format(resultadopoupanca)}"

        }
    }
}