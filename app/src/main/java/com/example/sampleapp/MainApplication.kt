package com.example.sampleapp

import android.app.Application
import com.example.sampleapp.data.api.repoModule
import com.example.sampleapp.ui.mainVMmodule
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(repoModule, mainVMmodule)
            )
        }
    }
}