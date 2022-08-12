package com.example.homeworks

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.homeworks.base.BaseActivity
import com.example.homeworks.base.BaseViewModel
import com.example.homeworks.databinding.ActivityMainBinding
import org.jetbrains.annotations.Contract

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateViewBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }



}