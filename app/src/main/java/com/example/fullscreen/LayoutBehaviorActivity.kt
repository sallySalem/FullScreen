package com.example.fullscreen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LayoutBehaviorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_behavior)

        window.statusBarColor = Color.TRANSPARENT
    }
}