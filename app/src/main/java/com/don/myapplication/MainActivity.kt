package com.don.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personA = Person(" abcd abcd "," abaabbbb",30)
        personA.trim()
        Log.e("INFO",personA.toString())
    }
}
