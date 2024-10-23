package com.shoxrux.cameraapp.ui.field_view

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenFieldViewBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class FieldViewScreen : BaseFragment(R.layout.screen_field_view) {

    private val binding by viewBinding(ScreenFieldViewBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
