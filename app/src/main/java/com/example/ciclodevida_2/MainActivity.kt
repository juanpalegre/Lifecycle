package com.example.ciclodevida_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val tag: String = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "Estoy en el onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Estoy en el onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Estoy en el onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Estoy en el onCreate")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Estoy en el onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Estoy en el onCreate")
    }


}