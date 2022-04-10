package com.componentes.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.componentes.R

class LayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
    }

    fun onClickFrameLayout(view: View) {
        startActivity(Intent(this, FrameLayoutActivity::class.java))
    }
    fun onClickLinearLayout(view: View) {
        startActivity(Intent(this, LinearLayoutActivity::class.java))
    }
    fun onClickRelativeLayout(view: View) {
        startActivity(Intent(this, RelativeLayoutActivity::class.java))
    }
}