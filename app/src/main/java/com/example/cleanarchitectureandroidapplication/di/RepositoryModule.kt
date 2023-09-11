package com.example.cleanarchitectureandroidapplication.di

import com.example.cleanarchitectureandroidapplication.data.repository.CharacterRepositoryImpl
import com.example.cleanarchitectureandroidapplication.domain.repository.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindCharacterRepository(
        repository: CharacterRepositoryImpl
    ): CharacterRepository
}