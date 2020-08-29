package com.rinfinity.games.dagger_example

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Driver @Inject constructor() {


    fun drive() {
        Log.e(this.javaClass.simpleName, "Driver is Driving ${hashCode()}")
    }
}