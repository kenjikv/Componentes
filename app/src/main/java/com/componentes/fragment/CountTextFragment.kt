package com.componentes.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.componentes.R

class CountTextFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_count_text, container, false)

        var editText = view.findViewById<EditText>(R.id.editText)
        var button = view.findViewById<Button>(R.id.button)
        var textView = view.findViewById<TextView>(R.id.textview)

        button.setOnClickListener {
            val texto = editText.text.toString()
            textView.text = texto.length.toString()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}