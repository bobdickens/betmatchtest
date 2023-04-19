package com.example.betmatchtest.domain

import com.example.betmatchtest.data.country.Country
import com.example.betmatchtest.data.country.CountryItem
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CountryApi {

    @GET("api/data_tournament_tables.json")
    fun getCountry() : Call<Country>

    companion object {

        var BASE_URL = "http://84.38.181.162/"

        fun create() : CountryApi {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(CountryApi::class.java)

        }
    }
}