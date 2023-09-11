package com.example.cleanarchitectureandroidapplication.data.model

data class PageResponse(
    val info: PageInfoResponse,
    val results: List<CharacterResponse>
)