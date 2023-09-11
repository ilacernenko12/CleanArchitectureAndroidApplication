package com.example.cleanarchitectureandroidapplication.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import coil.map.Mapper
import com.example.cleanarchitectureandroidapplication.domain.interactor.GetCharactersUseCase
import com.example.cleanarchitectureandroidapplication.presentation.model.CharacterUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    getCharactersUseCase: GetCharactersUseCase,
    private val mapper: Mapper<Character, CharacterUI>
) : ViewModel() {

    val characters: StateFlow<PagingData<CharacterUI>> =
        getCharactersUseCase.invoke().map { pagingData ->
            pagingData.map { character ->
                mapper.map(character)
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.Lazily,
            PagingData.empty()
        )
}