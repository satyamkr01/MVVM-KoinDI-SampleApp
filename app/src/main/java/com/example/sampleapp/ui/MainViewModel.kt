package com.example.sampleapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampleapp.data.api.UserRepo
import com.example.sampleapp.data.model.User

class MainViewModel(private val userRepo: UserRepo) : ViewModel() {

    val userDetails = MutableLiveData<User>()

    fun getUserInfo() {
        userDetails.postValue(userRepo.getUserInfo())
    }
}