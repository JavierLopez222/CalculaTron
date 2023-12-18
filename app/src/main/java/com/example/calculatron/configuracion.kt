package com.example.calculatron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class configuracion : AppCompatActivity() {

    lateinit var spinner:Spinner
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        spinner = findViewById<Spinner>(R.id.spinneruno)
        btn = findViewById<Button>(R.id.btnuno)


        val opciones = arrayOf("Sin animaciones", "Con animaciones")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        btn.setOnClickListener{
            val seleccion = spinner.selectedItem.toString()
            var intent = Intent(this, calculadora::class.java)
            startActivity(intent)
        }

    }
}