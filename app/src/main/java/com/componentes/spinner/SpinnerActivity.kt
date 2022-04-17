package com.componentes.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.componentes.R

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        var cmbOpciones = findViewById<Spinner>(R.id.cmbOpciones)

//        val datos = arrayOf("Elem 1","Elem 2","Elem 3","Elem 4","Elem 5","Elem 6" )
//        val adaptor = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos)
//        cmbOpciones.adapter = adaptor

        val adaptor = ArrayAdapter.createFromResource(
            this, R.array.valores, android.R.layout.simple_spinner_item)
        cmbOpciones.adapter = adaptor
        
        cmbOpciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}