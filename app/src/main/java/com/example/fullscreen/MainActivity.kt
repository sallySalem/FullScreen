package com.example.fullscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.butImmersive).setOnClickListener {
            startActivity(Intent(this, ImmersiveActivity::class.java))
        }

        findViewById<Button>(R.id.butEdgeToEdge).setOnClickListener {

        }

        findViewById<Button>(R.id.butWindowInsets).setOnClickListener {

        }

        findViewById<Button>(R.id.butTheme).setOnClickListener {

        }
    }
}