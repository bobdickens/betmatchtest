package com.example.betmatchtest.screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betmatchtest.R
import com.example.betmatchtest.data.country.Country
import com.example.betmatchtest.databinding.FragmentCountryBinding
import com.example.betmatchtest.domain.CountryApi
import com.example.betmatchtest.resource.MAIN
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CountryFragment : Fragment() {
    lateinit var binding: FragmentCountryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        binding.btnRussia.setOnClickListener{
            bundle.putInt("MyArg", 1)
            MAIN.navController.navigate(R.id.action_countryFragment_to_russiaFragment, bundle)
        }
        binding.btnEngland.setOnClickListener{
            bundle.putInt("MyArg", 0)
            MAIN.navController.navigate(R.id.action_countryFragment_to_russiaFragment, bundle)
        }
        binding.btnGerman.setOnClickListener{
            bundle.putInt("MyArg", 3)
            MAIN.navController.navigate(R.id.action_countryFragment_to_russiaFragment, bundle)
        }
        binding.btnSpanish.setOnClickListener{
            bundle.putInt("MyArg", 2)
            MAIN.navController.navigate(R.id.action_countryFragment_to_russiaFragment, bundle)
        }
    }

}