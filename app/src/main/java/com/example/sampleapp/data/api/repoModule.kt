package com.example.sampleapp.data.api

import org.koin.dsl.module

val repoModule = module {
    single<UserRepo> {
        UserRepoImpl()
    }
}