package com.example.betmatchtest.screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.betmatchtest.data.country.Country
import com.example.betmatchtest.data.country.CountryItem
import com.example.betmatchtest.databinding.FragmentRussiaBinding
import com.example.betmatchtest.domain.CountryApi
import com.example.betmatchtest.domain.RussiaAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RussiaFragment : Fragment() {
private lateinit var binding: FragmentRussiaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRussiaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val apiInterface = CountryApi.create().getCountry()

        val country = arguments?.getInt("MyArg")

        apiInterface.enqueue( object : Callback<Country> {
            override fun onResponse(call: Call<Country>?, response: Response<Country>?) {
                Log.d("test country", response?.body().toString())
                val adapter = response?.body()?.let { RussiaAdapter(it, country) }
                binding.rwRussia.adapter = adapter
            }
            override fun onFailure(call: Call<Country>?, t: Throwable?) {
            }
        })




        binding.rwRussia.layoutManager = LinearLayoutManager(activity)
        //val adapter = NewsAdapter(

        binding.tvCountry.text = when (country){
            1 -> "Россия"
            0 -> "Англия"
            3 -> "Германия"
            2 -> "Испания"
            else -> {"Error"}
        }

    }
/*    private fun getAllCountries() {

        viewModelScope.launch {
            try {

                val response = repository.getAllCountries()

                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        //do your code

                    } else {

                        onError("Error : ${response.message()} ")
                    }
                }
            } catch (e: IOException) {
                onError(e.message!!)
            }


        }

    }*/



}