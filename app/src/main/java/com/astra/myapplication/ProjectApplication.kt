package com.astra.myapplication

import android.app.Application
import com.astra.myapplication.di.apiModule
import com.astra.myapplication.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ProjectApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ProjectApplication)
            modules(listOf(
                apiModule,
                presentationModule
            ))
        }
    }
}