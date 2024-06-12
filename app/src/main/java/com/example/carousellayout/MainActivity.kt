package com.example.carousellayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.carousellayout.databinding.ActivityMainBinding
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.carousel.CarouselSnapHelper

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = CarouselLayoutManager()
        CarouselSnapHelper().attachToRecyclerView(binding.recyclerView)

        val imageList = mutableListOf<Int>()
        imageList.add(R.drawable.one)
        imageList.add(R.drawable.two)
        imageList.add(R.drawable.three)
        imageList.add(R.drawable.four)
        imageList.add(R.drawable.five)

        val adapter = CarouselAdapter(imageList)
        binding.recyclerView.adapter = adapter
    }

}