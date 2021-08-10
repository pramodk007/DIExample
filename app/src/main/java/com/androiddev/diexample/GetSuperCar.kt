package com.androiddev.diexample

import android.util.Log
import javax.inject.Inject

//interface to provide dependency for
interface GetSuperCar {
    fun getCar()
}
//implementation of getSuperCar
class ImplementGetSuperCar @Inject constructor():GetSuperCar{
    override fun getCar() {
       Log.i("interfaceCar","SuperCar is ready")
    }

}
//
class Main @Inject constructor(private val getSuperCar: GetSuperCar){
   fun getCar(){
        getSuperCar.getCar()
   }
}