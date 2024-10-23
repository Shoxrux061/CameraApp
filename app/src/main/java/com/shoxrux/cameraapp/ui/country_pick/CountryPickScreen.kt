package com.shoxrux.cameraapp.ui.country_pick

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.blongho.country_data.World
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.adapter.CountryAdapter
import com.shoxrux.cameraapp.databinding.ScreenCountryPickBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

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
            changeScreen(CountryPickScreenDirections.actionCountryPickScreenToSelectGenderScreen())
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

    private fun changeScreen(navDirections: NavDirections) {
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in)
            .setExitAnim(R.anim.slide_out)
            .setPopEnterAnim(R.anim.slide_pop_in)
            .setPopExitAnim(R.anim.slide_pop_out)
            .build()
        findNavController().navigate(navDirections, navOptions)
    }

}