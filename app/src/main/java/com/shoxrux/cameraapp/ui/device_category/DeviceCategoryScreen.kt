package com.shoxrux.cameraapp.ui.device_category

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenDeviceCategoryBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceCategoryScreen : BaseFragment(R.layout.screen_device_category) {

    private val binding by viewBinding(ScreenDeviceCategoryBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {

        binding.btnIndoorCamera.setOnClickListener {
            changeScreen(DeviceCategoryScreenDirections.actionDeviceCategoryScreenToDeviceListScreen())
        }
        binding.btnOutCamera.setOnClickListener {
            changeScreen(DeviceCategoryScreenDirections.actionDeviceCategoryScreenToDeviceListScreen())
        }
        binding.btnBabyCamera.setOnClickListener {
            changeScreen(DeviceCategoryScreenDirections.actionDeviceCategoryScreenToDeviceListScreen())
        }
        binding.btnDorbellCamera.setOnClickListener {
            changeScreen(DeviceCategoryScreenDirections.actionDeviceCategoryScreenToDeviceListScreen())
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
