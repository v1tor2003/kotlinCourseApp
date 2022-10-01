package com.example.mainactivity.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mainactivity.R
import com.example.mainactivity.databinding.ActivityMainBinding
import com.example.mainactivity.helper.getInput
import kotlin.math.pow

lateinit var mainViewModel: MainViewModel
lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
        initObserver()
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    private fun initListener(){
        binding.buttonCalculate.setOnClickListener {
            mainViewModel.calculateImc(binding.etWeight.getInput(), binding.etHeight.getInput()/100)
        }
    }

    private fun initObserver(){
        mainViewModel.imcResult.observe(this){
            binding.tvResult.text = it.toString()
        }
    }
}