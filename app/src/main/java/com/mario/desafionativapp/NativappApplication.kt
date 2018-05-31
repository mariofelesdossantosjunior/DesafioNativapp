package com.mario.desafionativapp

import android.app.Application

class NativappApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //startKoin(this, modules = appModules )
    }
}