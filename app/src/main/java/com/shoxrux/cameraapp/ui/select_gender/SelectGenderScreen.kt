package com.shoxrux.cameraapp.ui.select_gender

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenSelectGenderBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class SelectGenderScreen : BaseFragment(R.layout.screen_select_gender) {
    private val binding by viewBinding(ScreenSelectGenderBinding::bind)
    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        listenActions()

    }

    private fun listenActions() {
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId != -1) {
                showBtn()
            } else {
                binding.nextBtn.alpha = 0.4f
                binding.nextBtn.isClickable = false
            }
        }

        binding.nextBtn.setOnClickListener {
            if (binding.radioGroup.checkedRadioButtonId != -1) {
                changeScreen(SelectGenderScreenDirections.actionSelectGenderScreenToAgePickScreen())
            }
        }

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun showBtn() {
        binding.nextBtn.alpha = 1f
        binding.nextBtn.isClickable = true
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
