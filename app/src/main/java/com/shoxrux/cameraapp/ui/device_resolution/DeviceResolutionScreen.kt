package com.shoxrux.cameraapp.ui.device_resolution

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenDeviceResolutionBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceResolutionScreen : BaseFragment(R.layout.screen_device_resolution) {

    private val binding by viewBinding(ScreenDeviceResolutionBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {
        binding.res4k.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
        }
        binding.res2k.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
        }
        binding.res720.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
        }
        binding.res480.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
        }
        binding.res4c.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
        }
        binding.res2c.setOnClickListener {
            changeScreen(DeviceResolutionScreenDirections.actionDeviceResolutionScreenToInternetConnectionScreen())
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
