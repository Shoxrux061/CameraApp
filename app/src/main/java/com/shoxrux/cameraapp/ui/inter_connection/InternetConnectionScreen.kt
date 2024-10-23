package com.shoxrux.cameraapp.ui.inter_connection

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenInternetConnectionBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class InternetConnectionScreen : BaseFragment(R.layout.screen_internet_connection) {

    private val binding by viewBinding(ScreenInternetConnectionBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()
    }

    private fun listenActions() {
        binding.con4g.setOnClickListener {
            changeScreen(InternetConnectionScreenDirections.actionInternetConnectionScreenToConnectionSplashScreen())
        }
        binding.con5g.setOnClickListener {
            changeScreen(InternetConnectionScreenDirections.actionInternetConnectionScreenToConnectionSplashScreen())
        }
        binding.conCable.setOnClickListener {
            changeScreen(InternetConnectionScreenDirections.actionInternetConnectionScreenToConnectionSplashScreen())
        }
        binding.conWifi.setOnClickListener {
            changeScreen(InternetConnectionScreenDirections.actionInternetConnectionScreenToConnectionSplashScreen())
        }
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
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
