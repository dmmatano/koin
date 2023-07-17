package com.dmwaresolutions.diwithkoin.repository

import com.dmwaresolutions.diwithkoin.api.UserApi
import com.dmwaresolutions.diwithkoin.model.User

class UserRepositoryImpl(
    private val userApi: UserApi
): UserRepository {
    override suspend fun getAllUsers(): List<User> = userApi.getAllUsers()
}