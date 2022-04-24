package com.componentes.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.componentes.R
import com.componentes.databinding.ActivityBottomNavigationViewBinding
import com.google.android.material.navigation.NavigationView

class BottomNavigationViewActivity : AppCompatActivity() {

    lateinit var binding : ActivityBottomNavigationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = BottomAdapter(this)
        binding.contentView.offscreenPageLimit = 3
        binding.contentView.adapter = adapter

        binding.tabBar.setOnNavigationItemSelectedListener{
            onNavigationItemSelectedListener(it.itemId)
        }

    }

    private fun onNavigationItemSelectedListener(id: Int):Boolean {
        when(id) {
            R.id.home -> {
                binding.contentView.setCurrentItem(0)
                binding.tabBar.getMenu().getItem(0).setChecked(true)
            }
            R.id.search -> {
                binding.contentView.setCurrentItem(1)
                binding.tabBar.getMenu().getItem(1).setChecked(true)
            }
            R.id.add -> {
                binding.contentView.setCurrentItem(2)
                binding.tabBar.getMenu().getItem(2).setChecked(true)
            }
        }
        return false
    }
}