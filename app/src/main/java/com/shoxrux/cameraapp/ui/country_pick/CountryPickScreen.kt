package com.shoxrux.cameraapp.ui.country_pick

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blongho.country_data.World
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.adapter.CountryAdapter
import com.shoxrux.cameraapp.databinding.ScreenCountryPickBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment
import kotlin.math.log

class CountryPickScreen : BaseFragment(R.layout.screen_country_pick) {
    private val binding by viewBinding(ScreenCountryPickBinding::bind)
    private val adapter by lazy { CountryAdapter() }
    override fun onCreate(view: View, savedInstanceState: Bundle?) {

        setCountryList()
        setAdapter()
        setData()
        listenActions()

    }

    private fun listenActions() {
        adapter.onClickItem = {
        }
    }

    private fun setAdapter() {
        binding.recyclerView.adapter = adapter
    }

    private fun setData() {
        adapter.setData(World.getAllCountries())
    }

    private fun setCountryList() {
        World.init(requireContext())
    }
}