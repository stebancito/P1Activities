package com.example.p1activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TierraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tierra_activity)

        val btnAnterior = findViewById<Button>(R.id.btnAnteriorTierra)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteTierra)

        btnAnterior.setOnClickListener {
            finish()
        }

        btnSiguiente.setOnClickListener {
            val intent = Intent(this, PaisesActivity::class.java)
            startActivity(intent)
        }
    }
}