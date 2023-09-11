package com.example.cleanarchitectureandroidapplication.domain.interactor

import androidx.paging.PagingData
import androidx.paging.map
import com.example.cleanarchitectureandroidapplication.data.model.CharacterResponse
import com.example.cleanarchitectureandroidapplication.domain.mapper.base.Mapper
import com.example.cleanarchitectureandroidapplication.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository,
    private val mapper: Mapper<CharacterResponse, Character>
) {

    fun invoke(): Flow<PagingData<Character>> =
        repository.getCharacters().map { pagingData ->
            pagingData.map { characterResponse ->
                mapper.map(characterResponse)
            }
        }
}