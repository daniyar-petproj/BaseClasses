package com.example.homeworks.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>: Fragment(){

    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    abstract fun inflateViewBinding(layoutInflater: LayoutInflater): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflateViewBinding(layoutInflater)

        initViews()
        initListener()
        initViewModel()
        checkInternet()


        return binding.root
    }

    open fun checkInternet() {}

    open fun initViews() {}

    open fun initListener() {}

    open fun initViewModel() {}
}