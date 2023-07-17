package com.dmwaresolutions.diwithkoin

import android.app.Application
import com.dmwaresolutions.diwithkoin.di.modules.apiModule
import com.dmwaresolutions.diwithkoin.di.modules.repositoryModule
import com.dmwaresolutions.diwithkoin.di.modules.viewModelModule
import org.koin.core.context.startKoin

/** Necessário para iniciar o Koin
 *
 */
class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                apiModule,
                repositoryModule,
                viewModelModule
            )
        }
    }
}