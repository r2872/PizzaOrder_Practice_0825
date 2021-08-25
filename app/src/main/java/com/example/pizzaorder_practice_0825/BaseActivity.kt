package com.example.pizzaorder_practice_0825

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()

    abstract fun setValues()
}