package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterapp.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var model : MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)

        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)
        model =ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = model

    }
}