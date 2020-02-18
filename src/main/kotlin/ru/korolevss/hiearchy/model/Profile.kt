package ru.korolevss.hiearchy.model

class Profile(
    val id: String,
    val login: String,
    private val name: String,
    private val surname: String,
    val status: String,
    val avatar: String
) {
    val fullName: String
        get() = "$name $surname"
}