package com.menesdurak.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val image = findViewById<ImageView>(R.id.imageView)

        Glide
            .with(this)
            .load("https://i0.wp.com/ares.shiftdelete.net/580x330/original/17-05/02/darksiders-3-1493746641.jpg")
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(image)
    }
}