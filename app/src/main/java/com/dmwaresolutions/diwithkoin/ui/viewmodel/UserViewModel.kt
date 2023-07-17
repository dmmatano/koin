package com.dmwaresolutions.diwithkoin.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dmwaresolutions.diwithkoin.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository): ViewModel() {

    fun getAllUsers() = viewModelScope.launch {

        val users = userRepository.getAllUsers()

        for(user in users){
            Log.i("msgg", user.login)
        }

        /**
         * Ataualiza a view, trata erro, LiveData
         */

    }

}