package com.componentes.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.componentes.R
import com.componentes.listview.Titulares

class RecyclerViewActivity : AppCompatActivity() {

    private var datos = mutableListOf<Titulares>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        datos = Array(50) { i -> Titulares("Titulo $i", "Subtitulo item $i")}
            .toMutableList()

        var adapter = RecyclerViewAdapter(datos)

        var recView = findViewById<RecyclerView>(R.id.recView)
        //SOLO EN CASO QUE SEA DE TAMAÑO FIJO
//        recView.setHasFixedSize(true)

        //ESTO ES PARA LISTADO
//        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //ESTO ES PARA GRILLA
//        recView.layoutManager = GridLayoutManager(this, 3)

        //ESTO ES PARA ORDERNAR EN DESC
        var mLayoutManager = LinearLayoutManager(this)
        mLayoutManager.reverseLayout = true
        mLayoutManager.stackFromEnd = true
        recView.layoutManager = mLayoutManager

        //ESTO ES PARA ADICIONAR UN SEPARADOR
        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        recView.adapter = adapter

        var btnInsertar = findViewById<Button>(R.id.btnInsertar)
        var btnEliminar = findViewById<Button>(R.id.btnEliminar)
        var btnMover = findViewById<Button>(R.id.btnMover)

        btnInsertar.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View?) {
                datos.add(1, Titulares( "Nuevo Titular", "Nuevo Subtitulo"))
                adapter.notifyItemInserted(1)
            }
        })

        btnEliminar.setOnClickListener{ view ->
            datos.removeAt(1)
            adapter.notifyItemRemoved(1)
        }

        btnMover.setOnClickListener {
            val titularAux = datos[1]
            datos[1] = datos[2].also { datos[2] = datos[1] }
            adapter.notifyItemMoved(1, 2)
        }

    }
}