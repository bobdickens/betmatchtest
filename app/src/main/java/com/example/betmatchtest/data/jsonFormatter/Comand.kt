package com.example.betmatchtest.data.jsonFormatter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Comand(
    @Json(name = "Команда")
    val command : String,
    @Json(name = "Игры")
    val games : String

)