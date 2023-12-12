package com.astra.myapplication.di

import com.astra.myapplication.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val presentationModule = module {
    viewModelOf(::MainViewModel)
}