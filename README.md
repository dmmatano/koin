# Koin
Saiba mais em https://insert-koin.io/docs/quickstart/kotlin

## Setup
<pre>
dependencies {
    
    // Koin for Kotlin apps
    compile "io.insert-koin:koin-core:$koin_version"
}
</pre>

## Module
Lugar onde adicionamos todos os componentes a serem injetados
<pre>
val appModule = module {
     single<UserRepository> { UserRepositoryImpl() }
     single { UserService(get()) }
}

podemos escrever assim tbm ...

val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    singleOf(::UserService)
}
</pre>

## DI with Koin
<pre>
class UserApplication : KoinComponent {

    private val userService : UserService by inject()

    // display our data
    fun sayHello(){
        val user = userService.getDefaultUser()
        val message = "Hello '$user'!"
        println(message)
    }
}
</pre>

## Start in application entry point
<pre>
fun main() {
    startKoin {
       androidContext(this@MainApplication)        
       modules(appModule)
    }

    UserApplication().sayHello()
}
</pre>

