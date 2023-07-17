package com.dmwaresolutions.diwithkoin.di.modules

import com.dmwaresolutions.diwithkoin.api.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * ViewModel -depende-de-> Repository -que-depende-de-> UserApi (não depende de ninguém)
 * Começão por quem não depende de ninguém (User Api)
 */
val apiModule = module {
    //singleton: uma única instância
    //factory: x instâncias
    single{ provideUserApi() }
}

fun provideUserApi(): UserApi {
    return Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(UserApi::class.java)
}
