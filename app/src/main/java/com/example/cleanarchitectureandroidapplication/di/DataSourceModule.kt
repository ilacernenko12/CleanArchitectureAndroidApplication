package com.example.cleanarchitectureandroidapplication.di

import androidx.paging.PagingSource
import com.example.cleanarchitectureandroidapplication.data.datasource.CharacterPagingDataSource
import com.example.cleanarchitectureandroidapplication.data.model.CharacterResponse
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindCharacterPagingDataSource(
        dataSource: CharacterPagingDataSource
    ): PagingSource<Int, CharacterResponse>
}