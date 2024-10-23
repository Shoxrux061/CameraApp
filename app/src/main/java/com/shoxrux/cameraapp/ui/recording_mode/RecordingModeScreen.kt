package com.shoxrux.cameraapp.ui.recording_mode

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenRecordingModeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class RecordingModeScreen : BaseFragment(R.layout.screen_recording_mode) {

    private val binding by viewBinding(ScreenRecordingModeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        binding.hdLive.setOnClickListener {
            changeScreen(RecordingModeScreenDirections.actionRecordingModeScreenToFieldViewScreen())
        }
        binding.sdLive.setOnClickListener {
            changeScreen(RecordingModeScreenDirections.actionRecordingModeScreenToFieldViewScreen())
        }
        binding.fhdLive.setOnClickListener {
            changeScreen(RecordingModeScreenDirections.actionRecordingModeScreenToFieldViewScreen())
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
