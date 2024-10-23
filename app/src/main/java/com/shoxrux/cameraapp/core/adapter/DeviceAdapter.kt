package com.shoxrux.cameraapp.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blongho.country_data.Country
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.core.data.model.DeviceModel
import com.shoxrux.cameraapp.databinding.ItemCountryBinding
import com.shoxrux.cameraapp.databinding.ItemDeviceBinding

class DeviceAdapter : RecyclerView.Adapter<DeviceAdapter.ViewHolder>() {

    private val data = ArrayList<DeviceModel>()
    lateinit var onClickItem: (DeviceModel) -> Unit


    fun setData(data: List<DeviceModel>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemDeviceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: DeviceModel) {

            binding.image.setImageResource(data.image)
            binding.text.text = data.text

            binding.root.setOnClickListener {
                onClickItem.invoke(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDeviceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data[position])
    }
}