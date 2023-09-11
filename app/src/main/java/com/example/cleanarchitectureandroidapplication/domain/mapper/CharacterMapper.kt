package com.example.cleanarchitectureandroidapplication.domain.mapper

import com.example.cleanarchitectureandroidapplication.data.model.CharacterResponse
import com.example.cleanarchitectureandroidapplication.domain.mapper.base.Mapper
import com.example.cleanarchitectureandroidapplication.domain.model.Location
import com.example.cleanarchitectureandroidapplication.domain.model.Origin
import com.example.cleanarchitectureandroidapplication.domain.model.getCharacterStatusEnum
import com.example.cleanarchitectureandroidapplication.domain.model.Character
import javax.inject.Inject

class CharacterMapper @Inject constructor(): Mapper<CharacterResponse, Character>() {
    override fun map(from: CharacterResponse) = from.run {
        Character(
            id = id,
            name = name,
            status = getCharacterStatusEnum(status),
            species = species,
            type = type,
            gender = gender,
            origin = Origin(
                origin.name,
                origin.url
            ),
            image = image,
            url = url,
            location = Location(
                name = name,
                url = url
            ),
            episode = episode
        )
    }
}