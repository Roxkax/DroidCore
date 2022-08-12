package com.sqool.droidcore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<B : ViewDataBinding, T : BaseViewModel>(
    private val layoutId: Int,
    private val viewModelVariableId: Int,
    private val viewModelClass: Class<T>
) :
    AppCompatActivity() {

    protected lateinit var binding: B
    protected lateinit var viewModel: T


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
        viewModel = ViewModelProvider(this).get(viewModelClass)
        binding.setVariable(viewModelVariableId, viewModel)
    }
}