package com.example.hiltpracticepartone.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hiltpracticepartone.R
import dagger.hilt.android.AndroidEntryPoint

//https://androidgeek.co/how-to-use-hilt-with-retrofit-complete-guide-part-3-d6fe55b6460f

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}