package com.app.sampleglide

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.sampleglide.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage()
    }

    private fun loadImage() {
        val urlImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Android_logo_2.svg/2048px-Android_logo_2.svg.png"

        /**
         * IMAGE CIRCLE
         */
        Glide.with(this).load(urlImage).circleCrop().into(binding.ivImage)

        /**
         * IMAGE CIRCLE WITH BORDER
         */
        binding.ivImageBorder.loadCircularImage(urlImage, 10f, Color.BLACK)
    }
}