package ru.rutmiit.androidsocialnetwork.data

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val name: String?,
    val culture: String?,
    val born: String?,
    val titles: ArrayList<String> = arrayListOf(),
    var aliases: ArrayList<String> = arrayListOf(),
    var playedBy: ArrayList<String> = arrayListOf()
)
