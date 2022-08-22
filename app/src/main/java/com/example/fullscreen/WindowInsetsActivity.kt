package com.example.fullscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WindowInsetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window_insets)

        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, _ ->
            WindowInsetsCompat.CONSUMED
        }
    }
}
