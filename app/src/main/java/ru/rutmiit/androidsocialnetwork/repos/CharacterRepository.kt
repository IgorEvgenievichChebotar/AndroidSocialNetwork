package ru.rutmiit.androidsocialnetwork.repos

import ru.rutmiit.androidsocialnetwork.data.Character

interface CharacterRepository {
    suspend fun getCharacters(): List<Character>
}