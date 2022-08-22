package com.example.fullscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class ImmersiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_immersive)

        val windowInsets = WindowInsetsControllerCompat(
            window,
            window.decorView
        )

        findViewById<Button>(R.id.butFullScreen).setOnClickListener {
            windowInsets.hide(WindowInsetsCompat.Type.systemBars())
            windowInsets.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE
        }

        findViewById<Button>(R.id.butNormal).setOnClickListener {
            windowInsets.show(WindowInsetsCompat.Type.systemBars())
        }
    }
}
