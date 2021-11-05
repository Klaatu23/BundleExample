package com.klaatu.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.os.PersistableBundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("dato","On create")
    }

    override fun onStart() {
        super.onStart()
        Log.i("dato","On start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("dato","On resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("dato","On pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("dato","On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("dato","On destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("dato","On restart")
    }
}