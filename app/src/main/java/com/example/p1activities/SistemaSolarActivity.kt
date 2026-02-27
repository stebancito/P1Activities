package com.example.p1activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SistemaSolarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.sistemasolar_activity)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAnterior = findViewById<Button>(R.id.btnAnteriorSistema)
        btnAnterior.setOnClickListener {
            finish()
        }

        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteSistema)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)
        }
    }
}