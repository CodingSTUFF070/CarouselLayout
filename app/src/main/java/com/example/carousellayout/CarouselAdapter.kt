package com.example.carousellayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carousellayout.databinding.EachItemBinding

class CarouselAdapter(private val imageList: MutableList<Int>) :
    RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    inner class CarouselViewHolder(private val binding: EachItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(image: Int) {
            binding.imageView.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            EachItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(imageList[position])
    }
}