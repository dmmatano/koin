package com.dmwaresolutions.diwithkoin.repository

import com.dmwaresolutions.diwithkoin.model.User

interface UserRepository {
    suspend fun getAllUsers(): List<User>
}