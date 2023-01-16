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
<pre>
</pre>

## Module
<pre>
</pre>

## Module
Lugar onde adicionamos todos os componentes a serem injetados
<pre>
val appModule = module {
     single<UserRepository> { UserRepositoryImpl() }
     single { UserService(get()) }
}
</pre>
