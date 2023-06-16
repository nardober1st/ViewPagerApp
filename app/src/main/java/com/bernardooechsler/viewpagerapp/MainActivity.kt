package com.bernardooechsler.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.bernardooechsler.viewpagerapp.fragments.adapter.MyAdapter

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter
    private val arrayList = ArrayList<String>()
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        myAdapter = MyAdapter(this)

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        viewPager.adapter = myAdapter
    }
}