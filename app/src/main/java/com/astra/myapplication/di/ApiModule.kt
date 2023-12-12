package com.astra.myapplication.di

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import com.astra.myapplication.BuildConfig
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val apiModule = module {
    single<ApolloClient> {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(
                ChuckerInterceptor
                    .Builder(androidApplication())
                    .build()
            )
            .build()

        ApolloClient
            .Builder()
            .serverUrl(BuildConfig.BASE_URL)
            .okHttpClient(okHttpClient)
            .build()
    }
}



