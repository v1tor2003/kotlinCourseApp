package com.example.mainactivity.presentation.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class MainViewModel : ViewModel() {
    val imcResult = MutableLiveData<Double>()

    fun calculateImc(weight: Double, height: Double): Double{
        imcResult.value = weight / (height.pow(2))
    }
}