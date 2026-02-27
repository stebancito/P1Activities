package com.example.p1activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaisesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paises_activity)

        val btnAnterior = findViewById<Button>(R.id.btnAnteriorPaises)
        val btnSiguiente = findViewById<Button>(R.id.btnFinalizar)

        btnAnterior.setOnClickListener {
            finish()
        }

        btnSiguiente.setOnClickListener {
            val intent = Intent(this, EcatepunkActivity::class.java)
            startActivity(intent)
        }
    }
}