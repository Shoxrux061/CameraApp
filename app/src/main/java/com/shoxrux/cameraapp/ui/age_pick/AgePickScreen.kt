package com.shoxrux.cameraapp.ui.age_pick

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenAgePickBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class AgePickScreen : BaseFragment(R.layout.screen_age_pick) {

    private val binding by viewBinding(ScreenAgePickBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {
        binding.nextBtn.setOnClickListener {
            changeScreen(AgePickScreenDirections.actionAgePickScreenToEnterNameScreen())
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
