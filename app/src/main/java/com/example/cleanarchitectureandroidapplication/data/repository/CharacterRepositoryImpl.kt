package com.example.cleanarchitectureandroidapplication.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.cleanarchitectureandroidapplication.data.datasource.CharacterPagingDataSource
import com.example.cleanarchitectureandroidapplication.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val dataSource: CharacterPagingDataSource,
): CharacterRepository {

    override fun getCharacters() = Pager(PagingConfig(pageSize = 5)) { dataSource }.flow
}