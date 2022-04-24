package com.componentes.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.componentes.R

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var lstOpciones = findViewById<ListView>(R.id.lstOpciones)

//        val datos = arrayOf("Elem 1","Elem 2","Elem 3","Elem 4","Elem 5","Elem 6" )
//        var adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, datos)
//        lstOpciones.adapter = adaptador

        val datos = arrayOf(
            Titulares("Titulo 1", "Subtitulo 1"),
            Titulares("Titulo 2", "Subtitulo 2"),
            Titulares("Titulo 3", "Subtitulo 3"),
            Titulares("Titulo 4", "Subtitulo 4"),
            Titulares("Titulo 5", "Subtitulo 5"),
            Titulares("Titulo 6", "Subtitulo 6"),
            Titulares("Titulo 7", "Subtitulo 7"),
            Titulares("Titulo 8", "Subtitulo 8"),
            Titulares("Titulo 9", "Subtitulo 9"),
            Titulares("Titulo 10", "Subtitulo 10"),
            Titulares("Titulo 11", "Subtitulo 11"),
            Titulares("Titulo 11", "Subtitulo 11"),
        )
        var adaptador = AdapterTitulares(this, datos.toMutableList())
        lstOpciones.adapter = adaptador

        adaptador.notifyDataSetChanged()
    }
}