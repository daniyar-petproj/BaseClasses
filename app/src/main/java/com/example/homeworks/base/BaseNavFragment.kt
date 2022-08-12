package com.example.homeworks.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.example.homeworks.R

abstract class BaseNavFragment<VB : ViewBinding, VM : BaseViewModel>: Fragment(){

    protected lateinit var binding: VB
    protected lateinit var viewModel: VM
    private var _navController: NavController? = null

    abstract fun inflateViewBinding(layoutInflater: LayoutInflater): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflateViewBinding(layoutInflater)
        val navHostFragment = activity?.supportFragmentManager?.findFragmentById(R.id.nav_graph) as NavHostFragment
        _navController = navHostFragment.navController

        initViews()
        initListener()
        initViewModel()
        checkInternet()


        return binding.root
    }
    fun navigate(directions: Int, data: Bundle? = null){
        _navController?.navigate(directions,data)
    }

    fun currentDestinationId(): Int?{
        return _navController?.currentDestination?.id
    }

    open fun checkInternet() {}

    open fun initViews() {}

    open fun initListener() {}

    open fun initViewModel() {}
}