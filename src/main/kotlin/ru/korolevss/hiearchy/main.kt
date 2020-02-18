package ru.korolevss.hiearchy

import ru.korolevss.hiearchy.model.Profile

fun main() {
    val profile = Profile("123", "12345", "Stas", "Korolev", "free", "avatar")
    println(profile.fullName)
}