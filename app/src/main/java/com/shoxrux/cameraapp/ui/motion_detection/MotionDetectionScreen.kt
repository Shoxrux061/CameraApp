package com.shoxrux.cameraapp.ui.motion_detection

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenMotionDetectionBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class MotionDetectionScreen : BaseFragment(R.layout.screen_motion_detection){

    private val binding by viewBinding(ScreenMotionDetectionBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }
}
