package com.shoxrux.cameraapp.ui

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenSelectGenderBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class SelectGenderScreen : BaseFragment(R.layout.screen_select_gender) {
    private val binding by viewBinding(ScreenSelectGenderBinding::bind)
    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }
}
