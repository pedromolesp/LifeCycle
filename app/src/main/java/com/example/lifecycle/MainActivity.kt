package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LifeCycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "OnPause")

    }
}