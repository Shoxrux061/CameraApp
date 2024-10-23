package com.shoxrux.cameraapp.ui.main

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.HorizontalMarginItemDecoration
import com.shoxrux.cameraapp.core.adapter.HomeAdapter
import com.shoxrux.cameraapp.core.data.local_data.LocalData
import com.shoxrux.cameraapp.databinding.ScreenHomeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment
import com.shoxrux.cameraapp.ui.device_dialog.DeviceDialog

class HomeScreen : BaseFragment(R.layout.screen_home) {

    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val adapter by lazy { HomeAdapter() }
    private lateinit var dialog: DeviceDialog

    override fun onCreate(view: View, savedInstanceState: Bundle?) {
        setDialog()
        setAdapter()
        setData()
        setupCarousel()
        listenActions()

    }

    private fun setDialog() {
        dialog = DeviceDialog()
    }

    private fun listenActions() {

        binding.notification.setOnClickListener {
            changeScreen(HomeScreenDirections.actionHomeScreenToNotificationScreen())
        }

        adapter.onClickItem = {
            dialog.show(childFragmentManager, "Dialog")
        }

    }

    private fun setData() {
        adapter.setData(LocalData.getHomeData())
    }

    private fun setAdapter() {
        binding.viewPager.adapter = adapter
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

    private fun setupCarousel() {

        binding.viewPager.offscreenPageLimit = 1

        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible)
        val currentItemHorizontalMarginPx =
            resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position
            page.scaleY = 1 - (0.25f * kotlin.math.abs(position))
        }
        binding.viewPager.setPageTransformer(pageTransformer)
        val itemDecoration = HorizontalMarginItemDecoration(
            requireContext(),
            R.dimen.viewpager_current_item_horizontal_margin
        )
        binding.viewPager.addItemDecoration(itemDecoration)
    }

}
