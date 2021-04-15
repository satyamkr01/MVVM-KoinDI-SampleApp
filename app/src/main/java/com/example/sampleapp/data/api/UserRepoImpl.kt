package com.example.sampleapp.data.api

import com.example.sampleapp.data.model.User

class UserRepoImpl: UserRepo {

    override fun getUserInfo() = User(name = "Satyam", age = 22)

}