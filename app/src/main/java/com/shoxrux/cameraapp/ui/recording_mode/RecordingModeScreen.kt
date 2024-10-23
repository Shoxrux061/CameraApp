package com.shoxrux.cameraapp.ui.recording_mode

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ScreenRecordingModeBinding
import com.shoxrux.cameraapp.ui.base.BaseFragment

class RecordingModeScreen : BaseFragment(R.layout.screen_recording_mode) {

    private val binding by viewBinding(ScreenRecordingModeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}
