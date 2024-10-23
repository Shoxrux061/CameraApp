package com.shoxrux.cameraapp.ui.select_storage

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenSelectStorageBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class SelectStorageScreen : BaseFragment(R.layout.screen_select_storage){

    private val binding by viewBinding(ScreenSelectStorageBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
