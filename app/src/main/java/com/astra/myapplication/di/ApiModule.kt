package com.astra.myapplication.di

import com.apollographql.apollo3.ApolloClient
import com.astra.myapplication.BuildConfig
import org.koin.dsl.module

val apiModule = module {
    single<ApolloClient> {
        ApolloClient
            .Builder()
            .serverUrl(BuildConfig.BASE_URL)
            .build()
    }
}



