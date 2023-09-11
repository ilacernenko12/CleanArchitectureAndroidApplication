package com.example.cleanarchitectureandroidapplication.di

import com.example.cleanarchitectureandroidapplication.data.model.CharacterResponse
import com.example.cleanarchitectureandroidapplication.domain.mapper.CharacterMapper
import com.example.cleanarchitectureandroidapplication.domain.mapper.base.Mapper
import com.example.cleanarchitectureandroidapplication.presentation.mapper.CharacterUIMapper
import com.example.cleanarchitectureandroidapplication.presentation.model.CharacterUI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    abstract fun bindCharacterMapper(
        mapper: CharacterMapper
    ): Mapper<CharacterResponse, Character>

    @Binds
    abstract fun bindCharacterUIMapper(
        mapper: CharacterUIMapper
    ): Mapper<Character, CharacterUI>
}