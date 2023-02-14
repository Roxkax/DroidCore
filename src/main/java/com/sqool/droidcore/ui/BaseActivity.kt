package com.sqool.droidcore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(private val layoutId: Int?) : AppCompatActivity() {

    constructor() : this(null)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutId?.let {
            setContentView(layoutId)
        }
    }
}