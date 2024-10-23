package com.shoxrux.cameraapp.ui.field_view

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenFieldViewBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class FieldViewScreen : BaseFragment(R.layout.screen_field_view) {

    private val binding by viewBinding(ScreenFieldViewBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {
        binding.field180.setOnClickListener {
            changeScreen(FieldViewScreenDirections.actionFieldViewScreenToVisionModeScreen())
        }
        binding.field130.setOnClickListener {
            changeScreen(FieldViewScreenDirections.actionFieldViewScreenToVisionModeScreen())
        }
        binding.field160.setOnClickListener {
            changeScreen(FieldViewScreenDirections.actionFieldViewScreenToVisionModeScreen())
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
