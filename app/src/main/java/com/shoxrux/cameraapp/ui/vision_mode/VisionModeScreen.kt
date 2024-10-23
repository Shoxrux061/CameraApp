package com.shoxrux.cameraapp.ui.vision_mode

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenVisionModeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class VisionModeScreen : BaseFragment(R.layout.screen_vision_mode){

    private val binding by viewBinding(ScreenVisionModeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
