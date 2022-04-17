package com.componentes.checkradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.componentes.R
import java.util.*

class CheckRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_radio)

        var chkMarcame = findViewById<CheckBox>(R.id.chkMarcame)
//        chkMarcame.setOnClickListener { view ->
//            if (view is CheckBox) {
//                if (view.isChecked) {
//                    chkMarcame.text = "Checkbox marcado!!!"
//                } else {
//                    chkMarcame.text = "Checkbox desmarcado!!!"
//                }
//            }
//        }

        chkMarcame.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                chkMarcame.text = "Checkbox marcado!!!"
            } else {
                chkMarcame.text = "Checkbox desmarcado!!!"
            }
        }

        var grbGrupo1 = findViewById<RadioGroup>(R.id.grbGrupo1)
        grbGrupo1.clearCheck()
        grbGrupo1.check(R.id.rbOpcion1)

        var lblMensaje = findViewById<TextView>(R.id.lblMensaje)
        var rbOpcion1 = findViewById<RadioButton>(R.id.rbOpcion1)
        var rbOpcion2 = findViewById<RadioButton>(R.id.rbOpcion2)

//        var listener = View.OnClickListener { view ->
//            if (view is RadioButton) {
//                var opcion = ""
//                when (view.id) {
//                    R.id.rbOpcion1 -> {
//                        opcion = "Opcion 1"
//                    }
//                    R.id.rbOpcion2 -> {
//                        opcion = "Opcion 2"
//                    }
//                }
//                lblMensaje.text = "Opcion seleccionada $opcion"
//            }
//        }
//
//        rbOpcion1.setOnClickListener(listener)
//        rbOpcion2.setOnClickListener(listener)

        grbGrupo1.setOnCheckedChangeListener { _, checkId ->
            var opcion = ""
            when (checkId) {
                R.id.rbOpcion1 -> {
                    opcion = "Opcion 1"
                }
                R.id.rbOpcion2 -> {
                    opcion = "Opcion 2"
                }
            }
            lblMensaje.text = "Opcion seleccionada $opcion"
        }
    }
}