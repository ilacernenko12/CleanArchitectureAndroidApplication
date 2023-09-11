package com.example.cleanarchitectureandroidapplication.domain.repository

import androidx.paging.PagingData
import com.example.cleanarchitectureandroidapplication.data.model.CharacterResponse
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters(): Flow<PagingData<CharacterResponse>>
}