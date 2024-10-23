package com.shoxrux.cameraapp.ui.audio_mode

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenAudioModeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class AudioModeScreen : BaseFragment(R.layout.screen_audio_mode) {

    private val binding by viewBinding(ScreenAudioModeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
