package com.example.betmatchtest.screen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betmatchtest.R
import com.example.betmatchtest.databinding.FragmentNewsBinding

import com.example.betmatchtest.resource.MAIN


class NewsFragment : Fragment() {

lateinit var binding: FragmentNewsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }


}