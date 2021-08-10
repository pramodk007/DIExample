package com.androiddev.diexample

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    fun getEngine(){
        Log.i("inject","engine started..")
    }
}