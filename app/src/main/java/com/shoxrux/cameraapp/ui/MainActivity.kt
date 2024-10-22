package com.shoxrux.cameraapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.shoxrux.cameraapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()

    }

    private fun setFragment() {
        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val graph = navHost.navController.navInflater.inflate(R.navigation.main_navigation)
        navHost.navController.graph = graph
    }
}