package com.sqool.droidcore.ui

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<T> : AppCompatActivity() where T : BaseViewModel {

}