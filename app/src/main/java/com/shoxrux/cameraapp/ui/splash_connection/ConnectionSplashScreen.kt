package com.shoxrux.cameraapp.ui.splash_connection

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenConnectionSplashBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

@SuppressLint("CustomSplashScreen")
class ConnectionSplashScreen : BaseFragment(R.layout.screen_connection_splash) {

    private val binding by viewBinding(ScreenConnectionSplashBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        Handler(Looper.getMainLooper()).postDelayed({
            changeScreen(ConnectionSplashScreenDirections.actionConnectionSplashScreenToHomeScreen())
        }, 3000)
    }

    private fun changeScreen(navDirections: NavDirections) {
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in)
            .setExitAnim(R.anim.slide_out)
            .setPopEnterAnim(R.anim.slide_pop_in)
            .setPopExitAnim(R.anim.slide_pop_out)
            .build()
        findNavController().navigate(navDirections, navOptions)
    }
}
