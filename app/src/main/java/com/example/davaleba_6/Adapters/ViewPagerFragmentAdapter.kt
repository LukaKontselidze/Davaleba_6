package com.example.davaleba_6.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba_6.Fragments.First_fragment
import com.example.davaleba_6.Fragments.Second_fragment
import com.example.davaleba_6.Fragments.Third_fragment

class ViewPagerFragmentAdapter(Activity: FragmentActivity): FragmentStateAdapter(Activity) {
    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> First_fragment()
            1 -> Second_fragment()
            2 -> Third_fragment()
            else -> First_fragment()
        }



    }
}