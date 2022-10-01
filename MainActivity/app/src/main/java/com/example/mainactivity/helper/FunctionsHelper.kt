package com.example.mainactivity.helper

import com.google.android.material.textfield.TextInputEditText

fun TextInputEditText.getInput(): Double {
    return this.text.toString().toDouble()
}