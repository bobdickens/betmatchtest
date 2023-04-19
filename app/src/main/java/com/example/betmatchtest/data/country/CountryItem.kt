package com.example.betmatchtest.data.country

data class CountryItem(
    val category: String,
    val data: List<Data>,
    val dates: String,
    val icon: String,
    val name: String,
    val players_count: Int
)