package com.example.cleanarchitectureandroidapplication.presentation.mapper

import com.example.cleanarchitectureandroidapplication.domain.mapper.base.Mapper
import com.example.cleanarchitectureandroidapplication.domain.model.Character
import com.example.cleanarchitectureandroidapplication.presentation.model.CharacterUI
import com.example.cleanarchitectureandroidapplication.presentation.model.LocationUI
import com.example.cleanarchitectureandroidapplication.presentation.model.OriginUI
import com.example.cleanarchitectureandroidapplication.presentation.model.convertToUI
import javax.inject.Inject

class CharacterUIMapper @Inject constructor(): Mapper<Character, CharacterUI>() {
    override fun map(from: Character) = from.run {
        CharacterUI(
            id = id,
            name = name,
            status = status.convertToUI(),
            species = species,
            type = type,
            gender = gender,
            origin = OriginUI(
                origin.name,
                origin.url
            ),
            image = image,
            url = url,
            location = LocationUI(
                name = name,
                url = url
            ),
            episode = episode
        )
    }
}