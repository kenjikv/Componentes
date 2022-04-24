package com.componentes.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.componentes.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }

    fun onClickNewFragment(view: View) {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val fragment = CountTextFragment()
        transaction.add(R.id.contenedor, fragment)

        transaction.commit()
    }
}