package com.example.sampleapp.ui

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainVMmodule = module {
    viewModel {
        MainViewModel(get())
    }
}