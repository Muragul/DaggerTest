package com.example.daggertest.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggertest.di.DaggerViewModelFactory
import com.example.daggertest.di.ViewModelKey
import com.example.daggertest.ui.test.TestViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(
        factory: DaggerViewModelFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(TestViewModel::class)
    internal abstract fun provideTestViewModel(viewModel: TestViewModel): ViewModel
}