package com.androiddev.diexample

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor(){

    fun getWheel(){
        Log.i("inject","wheel is spinning.")
    }
}