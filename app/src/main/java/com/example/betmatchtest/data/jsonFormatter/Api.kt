package com.example.betmatchtest.data.jsonFormatter

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface Api {

    @GET("data/v1/countries?limit=251") suspend fun getAllCountries(): Response<MainModel>


    companion object {
        var api: Api? = null
        fun getInstance() : Api {
            if (api == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.first.org/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .build()
                api = retrofit.create(Api::class.java)
            }
            return api!!
        }

    }
}