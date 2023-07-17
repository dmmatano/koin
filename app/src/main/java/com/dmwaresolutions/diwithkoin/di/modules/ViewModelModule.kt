package com.dmwaresolutions.diwithkoin.di.modules

import com.dmwaresolutions.diwithkoin.ui.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module{
     //para viewlModels, usamos viewModel
    viewModel {
        UserViewModel(userRepository = get())
    }

}