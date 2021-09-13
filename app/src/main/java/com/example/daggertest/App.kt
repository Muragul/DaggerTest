package com.example.daggertest

import android.app.Application
import com.example.daggertest.di.AppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = AppComponent.create()
    }

}