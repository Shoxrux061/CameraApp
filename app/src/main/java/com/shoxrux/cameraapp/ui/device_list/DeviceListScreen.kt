package com.shoxrux.cameraapp.ui.device_list

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.adapter.DeviceAdapter
import com.shoxrux.cameraapp.core.data.local_data.LocalData
import com.shoxrux.cameraapp.databinding.ScreenDeviceListBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class DeviceListScreen : BaseFragment(R.layout.screen_device_list) {

    private val binding by viewBinding(ScreenDeviceListBinding::bind)

    private val adapter by lazy { DeviceAdapter() }

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        setAdapter()
        setData()
        listenActions()
    }

    private fun listenActions() {
        adapter.onClickItem = {


        }
    }

    private fun setData() {
        adapter.setData(LocalData.getData(requireContext()))
    }

    private fun setAdapter() {
        binding.recyclerView.adapter = adapter
    }
}
