package com.example.davaleba_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleba_6.Adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var adapter: ViewPagerFragmentAdapter





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()

        viewpager.adapter =  adapter

        TabLayoutMediator(tabLayout, viewpager){ tab, position ->
            tab.text = "Tab" + (position + 1)

        } .attach()

    }
    fun init() {
        viewpager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        adapter = ViewPagerFragmentAdapter(this)
    }
}