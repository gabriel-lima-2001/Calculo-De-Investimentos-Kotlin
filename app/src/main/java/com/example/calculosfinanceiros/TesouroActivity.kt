package com.example.calculosfinanceiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
//import kotlinx.android.synthetic.main.activity_main.*

import	java.text.NumberFormat
import	java.util.Locale
import kotlin.math.*
class TesouroActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tesouro)
        val txtInvestimentoTesouro = findViewById<TextView>(R.id.txtInvestimentoTesouro)
        val txtJurosTesouro = findViewById<TextView>(R.id.txtJurosTesouro)
        val txtAnosTesouro = findViewById<TextView>(R.id.txtAnosTesouro)
        val txtResultadoTesouro = findViewById<TextView>(R.id.txtResultadoTesouro)
        val btnCalcularTesouro = findViewById<Button>(R.id.btnCalcularTesouro)

        btnCalcularTesouro.setOnClickListener{
            val investtesouro = txtInvestimentoTesouro.text.toString().toDouble()
            val jurostesouro = txtJurosTesouro.text.toString().toDouble()
            val anostesouro = txtAnosTesouro.text.toString().toInt()
            var resultadotesouro = investtesouro  *  (( 1+(jurostesouro/100)).pow(anostesouro))
            val f = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
            txtResultadoTesouro.text = "O total de ${f.format(investtesouro)} investidos com a taxa de $jurostesouro % ao ano por $anostesouro anos" +
                    " será de ${f.format(resultadotesouro)}"

        }
    }
}