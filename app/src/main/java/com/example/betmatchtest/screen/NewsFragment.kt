package com.example.betmatchtest.screen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.betmatchtest.data.News
import com.example.betmatchtest.databinding.FragmentNewsBinding
import com.example.betmatchtest.domain.ApiInterface
import com.example.betmatchtest.domain.NewsAdapter

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


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

        binding.rwNews.layoutManager = LinearLayoutManager(activity)

        val apiInterface = ApiInterface.create().getNews()

        apiInterface.enqueue( object : Callback<List<News>>{
            override fun onResponse(call: Call<List<News>>?, response: Response<List<News>>?) {
                val adapter = NewsAdapter(response?.body()!!)
                binding.rwNews.adapter = adapter
            }
            override fun onFailure(call: Call<List<News>>?, t: Throwable?) {

            }
        })

    }

}