package com.example.daggertest.di

import com.example.daggertest.di.module.RepositoryModule
import com.example.daggertest.di.module.ViewModelModule
import com.example.daggertest.ui.MainActivity
import com.example.daggertest.ui.test.TestFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RepositoryModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    companion object {
        fun create(): AppComponent {
            return DaggerAppComponent.builder()
                .build()
        }
    }

    @Component.Builder
    interface Builder {

        fun build(): AppComponent
    }

    fun inject(mainActivity: MainActivity)

    fun inject(testFragment: TestFragment)

}