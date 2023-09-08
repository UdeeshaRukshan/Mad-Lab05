package com.example.lab05

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(
    private val context: Context, private val books: List<Book>
) : RecyclerView.Adapter<BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.tvTitle.text = book.title
        holder.tvAuthor.text = book.author
        holder.itemView.setOnClickListener {
// Handle item click here, e.g., open BookDetailActivity
            val intent = Intent(context, BookDetailActivity::class.java)
            intent.putExtra("BOOK_ID", position)
            context.startActivity(intent)
        } }
    override fun getItemCount() = books.size }