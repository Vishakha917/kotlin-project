package com.example.android.unittestgithubpro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.unittestgithubpro.R
import com.example.android.unittestgithubpro.model.Posts

class PostAdapter(private val posts : List<Posts>) : RecyclerView.Adapter<PostAdapter.PostViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_post, parent, false)
        return PostViewholder(view)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: PostViewholder, position: Int) {

    }

    class PostViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}