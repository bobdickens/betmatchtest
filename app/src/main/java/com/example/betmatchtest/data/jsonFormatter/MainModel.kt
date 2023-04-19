package com.example.betmatchtest.data.jsonFormatter

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MainModel(

    val data : Map<String, Comand>

)