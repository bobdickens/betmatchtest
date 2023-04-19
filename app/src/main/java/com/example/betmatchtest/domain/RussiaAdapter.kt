package com.example.betmatchtest.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.betmatchtest.R
import com.example.betmatchtest.data.country.CountryItem

class RussiaAdapter(private val mList: ArrayList<CountryItem>, private val country: Int?) : RecyclerView.Adapter<RussiaAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.nameView.text = ItemsViewModel.name
    }


    // binds the list items to a view
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//
//        val ItemsViewModel = mList[position]
//
//        Picasso.get().load(ItemsViewModel.img).into(holder.imageView)
//        holder.textTitle.text = ItemsViewModel.tittle
//        holder.textData.text = ItemsViewModel.date
//        holder.textText.text = ItemsViewModel.text
//
//    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val nameView: TextView = itemView.findViewById(R.id.tvName)
    }
}