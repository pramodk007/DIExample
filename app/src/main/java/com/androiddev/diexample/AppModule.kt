package com.androiddev.diexample

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun binding(
        implementGetSuperCar:ImplementGetSuperCar
    ):GetSuperCar

}