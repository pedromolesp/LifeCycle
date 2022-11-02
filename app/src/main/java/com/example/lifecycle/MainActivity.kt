package com.example.lifecycle

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var position: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.ai_2)
        mediaPlayer?.start()
        Log.i("LifeCycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer.start()

        Log.i("LifeCycle", "OnStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "OnResume")

    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
        Log.i("LifeCycle", "OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "OnStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "OnRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "OnDestroy")

    }
}