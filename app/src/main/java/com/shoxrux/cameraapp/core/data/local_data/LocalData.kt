package com.shoxrux.cameraapp.core.data.local_data

import android.content.Context
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.data.model.DeviceModel

object LocalData {

    private val data = ArrayList<DeviceModel>()

    fun getData(context: Context): List<DeviceModel> {

        data.clear()

        data.add(
            DeviceModel(
                image = R.drawable.device_1,
                text = context.getString(R.string.device_1_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_2_image,
                text = context.getString(R.string.device_2_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_3_image,
                text = context.getString(R.string.device_3_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_4_image,
                text = context.getString(R.string.device_4_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_5_image,
                text = context.getString(R.string.device_5_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_6_image,
                text = context.getString(R.string.device_6_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_7_image,
                text = context.getString(R.string.device_7_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_8_image,
                text = context.getString(R.string.device_8_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_9_image,
                text = context.getString(R.string.device_9_text)
            )
        )
        data.add(
            DeviceModel(
                image = R.drawable.device_10_image,
                text = context.getString(R.string.device_10_text)
            )
        )

        return data
    }

}