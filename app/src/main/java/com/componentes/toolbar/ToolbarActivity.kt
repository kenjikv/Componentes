package com.componentes.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import com.componentes.R

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        var toolBar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolBar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        var title = findViewById<TextView>(R.id.title)
        var subtitle = findViewById<TextView>(R.id.subtitle)

        title.text = "Hola mundo"
        subtitle.text = "Soy un ejemplo de toolbar"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_action_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_buscar -> {
                showDialog("Buscar")
            }
            R.id.action_nuevo -> {
                showDialog("Nuevo")
            }
            R.id.action_opciones -> {
                showDialog("Opciones")
            }
            R.id.action_versiones -> {
                showDialog("Versiones")
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun showDialog(text: String) {
        var build = AlertDialog.Builder(this)
        build.setTitle("Titulo")
        build.setMessage(text)
        build.setNeutralButton("Neutral", null)
        build.setPositiveButton("Positivo") { p0, p1 ->
            Toast.makeText(this@ToolbarActivity, "Presiono en positivo", Toast.LENGTH_SHORT).show()
        }
        build.setNegativeButton("Negativo", null)
        build.show()
    }
}