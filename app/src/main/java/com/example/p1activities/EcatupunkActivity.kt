package com.example.p1activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EcatepunkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ecatupunk_activity)

        val btnAnterior = findViewById<Button>(R.id.btnAnteriorEcatepunk)
        val btnFinalizar = findViewById<Button>(R.id.btnFinalizarEcatepunk)

        btnAnterior.setOnClickListener {
            finish()
        }

        btnFinalizar.setOnClickListener {
            finishAffinity()
        }


    }
}