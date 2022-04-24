package com.componentes.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.componentes.R
import com.componentes.listview.Titulares

class RecyclerViewAdapter(): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private lateinit var list: List<Titulares>

    constructor(list: List<Titulares>):this() {
        this.list = list;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_titular, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var titular = list[position]
        holder.titulo.text = titular.titulo
        holder.subtitulo.text = titular.subtitulo
    }

    override fun getItemCount(): Int {
        return this.list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var titulo = itemView.findViewById<TextView>(R.id.lblTitulo)
        var subtitulo = itemView.findViewById<TextView>(R.id.lblSubTitulo)
    }
}