package com.shoxrux.cameraapp.ui.device_resolution

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenDeviceResolutionBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceResolutionScreen : BaseFragment(R.layout.screen_device_resolution){

    private val binding by viewBinding(ScreenDeviceResolutionBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
