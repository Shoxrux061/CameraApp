package com.shoxrux.cameraapp.ui.inter_connection

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenInternetConnectionBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class InternetConnectionScreen : BaseFragment(R.layout.screen_internet_connection) {

    private val binding by viewBinding(ScreenInternetConnectionBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
