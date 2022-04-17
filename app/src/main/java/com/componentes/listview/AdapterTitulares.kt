package com.componentes.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.componentes.R
import java.text.FieldPosition

class AdapterTitulares():BaseAdapter() {

    lateinit var context: Context
    var datos = mutableListOf<Titulares>()

    constructor(context: Context, datos: MutableList<Titulares>) : this() {
        this.context = context
        this.datos = datos
    }

    override fun getCount(): Int {
        return this.datos.size
    }

    override fun getItem(position: Int): Any {
        return this.datos[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_list_titular, parent, false)

        var titulo = view.findViewById<TextView>(R.id.lblTitulo)
        var subtitulo = view.findViewById<TextView>(R.id.lblSubTitulo)

        titulo.text = datos[position].titulo
        subtitulo.text = datos[position].subtitulo

        return view
    }
}