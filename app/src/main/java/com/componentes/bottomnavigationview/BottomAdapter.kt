package com.componentes.bottomnavigationview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.ListFragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.componentes.tablayout.ChildFragment
import com.componentes.tablayout.ForYouFragment

class BottomAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                return ForYouFragment()
            }
            1 -> {
                return ListFragment()
            }
        }
        return ChildFragment()
    }
}