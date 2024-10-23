package com.shoxrux.cameraapp.ui.vision_mode

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenVisionModeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class VisionModeScreen : BaseFragment(R.layout.screen_vision_mode) {

    private val binding by viewBinding(ScreenVisionModeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {
        binding.autoMode.setOnClickListener {
            changeScreen(VisionModeScreenDirections.actionVisionModeScreenToMotionDetectionScreen())
        }
        binding.dayVision.setOnClickListener {
            changeScreen(VisionModeScreenDirections.actionVisionModeScreenToMotionDetectionScreen())
        }
        binding.nightVision.setOnClickListener {
            changeScreen(VisionModeScreenDirections.actionVisionModeScreenToMotionDetectionScreen())
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
