package com.example.sampleapp.data.api

import com.example.sampleapp.data.model.User

interface UserRepo {

    fun getUserInfo(): User
}