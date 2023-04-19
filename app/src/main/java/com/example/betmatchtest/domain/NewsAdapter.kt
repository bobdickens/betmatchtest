package com.example.betmatchtest.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.betmatchtest.R
import com.example.betmatchtest.data.News

import com.squareup.picasso.Picasso

class NewsAdapter(private val mList: List<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        Picasso.get().load(ItemsViewModel.img).into(holder.imageView)
        holder.textTitle.text = ItemsViewModel.tittle
        holder.textData.text = ItemsViewModel.date
        holder.textText.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_news)
        val textTitle: TextView = itemView.findViewById(R.id.title_news)
        val textData: TextView = itemView.findViewById(R.id.date_news)
        val textText: TextView = itemView.findViewById(R.id.text_news)
    }
}
