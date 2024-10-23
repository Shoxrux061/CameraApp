package com.shoxrux.cameraapp.ui.device_category

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenDeviceCategoryBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceCategoryScreen : BaseFragment(R.layout.screen_device_category) {

    private val binding by viewBinding(ScreenDeviceCategoryBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
