package com.componentes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.componentes.button.ButtonActivity
import com.componentes.checkradio.CheckRadioActivity
import com.componentes.layout.LayoutActivity
import com.componentes.login.LoginActivity
import com.componentes.textimage.TextImageActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLayout(view: View) {
        startActivity(Intent(this, LayoutActivity::class.java))
    }
    fun onClickButton(view: View) {
        startActivity(Intent(this, ButtonActivity::class.java))
    }
    fun onClickTextImage(view: View) {
        startActivity(Intent(this, TextImageActivity::class.java))
    }
    fun onClickCheckRadio(view: View) {
        startActivity(Intent(this, CheckRadioActivity::class.java))
    }
    fun onClickLogin(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }

    /**
     * Ciclos de vida de un activity
     * /
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
    **/
}