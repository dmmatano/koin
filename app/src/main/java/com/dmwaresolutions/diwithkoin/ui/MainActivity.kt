package com.dmwaresolutions.diwithkoin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dmwaresolutions.diwithkoin.api.UserApi
import com.dmwaresolutions.diwithkoin.databinding.ActivityMainBinding
import com.dmwaresolutions.diwithkoin.repository.UserRepositoryImpl
import com.dmwaresolutions.diwithkoin.ui.viewmodel.UserViewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    //get do koin. Instancia imediatamente
    //private val userApi = get<UserApi>()
    //semelhante ao by lazy
    //private val userApi: UserApi by inject()
    // não precisa do userApi, já que no RepositoryModule, foi instanciado no get()
    //private val userRepository: UserRepositoryImpl by inject()
    // o mesmo vale para userRepository.. o get() já instancia.
    // Logo, sobrou apenas o viewModel
    //Obs: não é by viewModels() e sim by viewModel()
    private val userViewModel: UserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCallNetwork.setOnClickListener {
            userViewModel.getAllUsers()

        }
    }
}