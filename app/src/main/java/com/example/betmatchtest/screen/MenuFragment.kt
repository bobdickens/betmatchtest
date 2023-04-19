package com.example.betmatchtest.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betmatchtest.R
import com.example.betmatchtest.databinding.FragmentMenuBinding
import com.example.betmatchtest.resource.MAIN


class MenuFragment : Fragment() {

    lateinit var binding: FragmentMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNews.setOnClickListener {
            MAIN.navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
        binding.btnTable.setOnClickListener{
            MAIN.navController.navigate(R.id.action_firstFragment_to_countryFragment)
        }
    }


}