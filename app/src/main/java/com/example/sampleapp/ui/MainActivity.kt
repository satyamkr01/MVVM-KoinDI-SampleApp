package com.example.sampleapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.sampleapp.R.layout
import kotlinx.android.synthetic.main.activity_main.tv_user_info
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        mainViewModel.getUserInfo()
        initObservers()
    }

    private fun initObservers() {
        mainViewModel.userDetails.observe(this, Observer {
            tv_user_info.text = "This app is built in Kotlin and follows MVVM architecture and Koin Dependency Injection." +
                    "\nDeveloped by:${it?.name}"
        })
    }
}