package com.dmwaresolutions.diwithkoin.di.modules

import com.dmwaresolutions.diwithkoin.api.UserApi
import com.dmwaresolutions.diwithkoin.repository.UserRepository
import com.dmwaresolutions.diwithkoin.repository.UserRepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val repositoryModule = module {
    //nesse caso faz mais sentido criar um singleton
    single<UserRepository>{
        //como já foi ensinado ao Koin como instanciar um UserApi, podemos usar apenas o get()
        UserRepositoryImpl(userApi = get())
    }
}