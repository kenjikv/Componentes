package com.componentes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.componentes.actionbar.ActionBarActivity
import com.componentes.bottomnavigationview.BottomNavigationViewActivity
import com.componentes.button.ButtonActivity
import com.componentes.checkradio.CheckRadioActivity
import com.componentes.fragment.FragmentActivity
import com.componentes.layout.LayoutActivity
import com.componentes.listview.ListViewActivity
import com.componentes.login.LoginActivity
import com.componentes.playstore.PlayStoreActivity
import com.componentes.recyclerview.RecyclerViewActivity
import com.componentes.spinner.SpinnerActivity
import com.componentes.tablayout.TabLayoutActivity
import com.componentes.textimage.TextImageActivity
import com.componentes.toolbar.ToolbarActivity

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

    fun onClickSpinner(view: View) {
        startActivity(Intent(this, SpinnerActivity::class.java))
    }

    fun onClickListView(view: View) {
        startActivity(Intent(this, ListViewActivity::class.java))
    }

    fun onClickRecyclerView(view: View) {
        startActivity(Intent(this, RecyclerViewActivity::class.java))
    }

    fun onClickFragment(view: View) {
        startActivity(Intent(this, FragmentActivity::class.java))
    }

    fun onClickActionBar(view: View) {
        startActivity(Intent(this, ActionBarActivity::class.java))
    }

    fun onClickToolbar(view: View) {
        startActivity(Intent(this, ToolbarActivity::class.java))
    }

    fun onClickPlayStore(view: View) {
        startActivity(Intent(this, PlayStoreActivity::class.java))
    }

    fun onClickTabLayout(view: View) {
        startActivity(Intent(this, TabLayoutActivity::class.java))
    }

    fun onClickBottomNavigation(view: View) {
        startActivity(Intent(this, BottomNavigationViewActivity::class.java))
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