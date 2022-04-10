package com.componentes.textimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.componentes.R

class TextImageActivity : AppCompatActivity() {

    val FRUTAS = arrayOf(
        "Manzana",
        "Pera",
        "Banana",
        "Sandia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_image)

        val campoSugerencia = findViewById<AutoCompleteTextView>(R.id.campo_sugerencia)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, FRUTAS)

        campoSugerencia.setAdapter(adaptador)

    }
}