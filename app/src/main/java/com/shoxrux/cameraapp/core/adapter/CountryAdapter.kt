package com.shoxrux.cameraapp.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blongho.country_data.Country
import com.shoxrux.cameraapp.R
import com.shoxrux.cameraapp.databinding.ItemCountryBinding

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    private val data = ArrayList<Country>()
    lateinit var onClickItem: (Country) -> Unit


    fun setData(data: List<Country>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: Country) {
            binding.name.text = data.name
            binding.image.setImageResource(data.flagResource)

            binding.root.setOnClickListener {
                onClickItem.invoke(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data[position])
    }
}