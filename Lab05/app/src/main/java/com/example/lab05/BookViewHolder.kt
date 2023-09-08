package com.example.lab05

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTitle: TextView = itemView.findViewById(R.id.tv_book_title)
    val tvAuthor: TextView = itemView.findViewById(R.id.tv_book_author)
}