package com.shoxrux.cameraapp.ui.device_connectivity

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenDeviceConnectivityBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceConnectivityScreen : BaseFragment(R.layout.screen_device_connectivity) {

    private val binding by viewBinding(ScreenDeviceConnectivityBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {

        binding.wired.setOnClickListener {
            changeScreen(DeviceConnectivityScreenDirections.actionDeviceConnectivityScreenToRecordingModeScreen())
        }
        binding.hardwired.setOnClickListener {
            changeScreen(DeviceConnectivityScreenDirections.actionDeviceConnectivityScreenToRecordingModeScreen())
        }
        binding.wireless.setOnClickListener {
            changeScreen(DeviceConnectivityScreenDirections.actionDeviceConnectivityScreenToRecordingModeScreen())
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
