package com.example.fullscreen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class EdgeToEdgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edge_to_edge)

        findViewById<Button>(R.id.butFullScreen).setOnClickListener {
            WindowCompat
                .setDecorFitsSystemWindows(
                    window,
                    false
                )

            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
        }

        findViewById<Button>(R.id.butNormal).setOnClickListener {
            WindowCompat
                .setDecorFitsSystemWindows(
                    window,
                    true
                )

            window.statusBarColor = Color.BLACK
            window.navigationBarColor = Color.BLACK

            window.decorView.refreshDrawableState()
        }
    }
}
