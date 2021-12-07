package com.tuwaiq.date

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment =
            supportFragmentManager
                .findFragmentById(R.id.fragment_Container)
        if (currentFragment == null){
            val fragment =DateFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_Container,fragment)
                .commit()
    }
}}