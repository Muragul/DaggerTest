package com.example.daggertest.di.module

import com.example.daggertest.data.TestRepositoryImpl
import com.example.daggertest.domain.TestRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideTestRepository(): TestRepository = TestRepositoryImpl()
}