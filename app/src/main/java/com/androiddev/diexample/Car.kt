package com.androiddev.diexample

import android.content.ContentValues.TAG
import android.util.Log
import android.util.Log.INFO
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheel: Wheel
) {
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.i("inject","car is running")
    }
}