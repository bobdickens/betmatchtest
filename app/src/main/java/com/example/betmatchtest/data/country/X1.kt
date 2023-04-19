package com.example.betmatchtest.data.country

import com.google.gson.annotations.SerializedName

data class X1(
    @SerializedName("В")
    val b: Int,
    @SerializedName("Игры")
    val games: Int,
    @SerializedName("Команда")
    val comand: String,
    @SerializedName("Мячи")
    val balls: String,
    @SerializedName("Н")
    val n: Int,
    @SerializedName("Очки")
    val count: Int,
    @SerializedName("П")
    val p: Int
)