package com.example.modulfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var view_pager : ViewPager = findViewById(R.id.view_pager)
        var tabs : TabLayout? = findViewById(R.id.tabs)
        view_pager?.adapter = ViewPagerAdapter( this,
            supportFragmentManager)
        tabs?.setupWithViewPager(view_pager)
    }
}