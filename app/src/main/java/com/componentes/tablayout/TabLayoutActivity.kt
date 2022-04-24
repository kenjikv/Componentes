package com.componentes.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.componentes.R
import com.componentes.databinding.ActivityTabLayoutBinding
import com.google.android.material.tabs.TabLayoutMediator

val playArray = arrayOf(
    "Para ti",
    "Lista de existos",
    "Infantiles"
)

class TabLayoutActivity : AppCompatActivity() {

    lateinit var binding: ActivityTabLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(this)
        binding.pager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            tab.text = playArray[position]
        }.attach()
    }
}