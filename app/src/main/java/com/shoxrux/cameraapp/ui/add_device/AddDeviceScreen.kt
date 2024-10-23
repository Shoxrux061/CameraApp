package com.shoxrux.cameraapp.ui.add_device

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenAddDeviceBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class AddDeviceScreen : BaseFragment(R.layout.screen_add_device) {

    private val binding by viewBinding(ScreenAddDeviceBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}