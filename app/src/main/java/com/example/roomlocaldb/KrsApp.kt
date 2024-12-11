package com.example.roomlocaldb

import android.app.Application
import com.example.roomlocaldb.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Fungsinya untuk menyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // Membuat Instance
        // instance adalah objek yang dibuat dari class
    }
}