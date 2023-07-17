package com.dmwaresolutions.diwithkoin.api

import com.dmwaresolutions.diwithkoin.model.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UserApi {

    @GET("/users")
    suspend fun getAllUsers(): List<User>

    /**
     * O Koin já cria um singleton para o Retofit s2. Não precisa do cód abaixo:
     *
     * companion object{
     *   private var retrofitService: UserApi? = null

    *   fun getInstance(): UserApi{
    *     if(retrofitService == null){
    *       val retrofit = Retrofit.Builder()
    *         .baseUrl("https://api.github.com/")
    *         .addConverterFactory(GsonConverterFactory.create())
    *         .build()
    *      retrofitService = retrofit.create(UserApi::class.java)
    *     }
    *     return retrofitService!!
    *   }
    * }
     * */

}