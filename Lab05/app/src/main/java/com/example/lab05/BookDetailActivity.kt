package com.example.lab05

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class BookDetailActivity : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    private lateinit var tvAuthor: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnEdit: Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        tvTitle = findViewById(R.id.tv_title)
        tvAuthor = findViewById(R.id.tv_author)
        tvDescription = findViewById(R.id.tv_description)
        btnEdit = findViewById(R.id.btn_edit)
// Get the book's position or ID passed from MainActivity
val bookId = intent.getIntExtra("BOOK_ID", -1)
        if (bookId != -1) {
// Fetch the book details based on the bookId.
// For demonstration purposes, I'm using a sample list.
// In a real application, you might fetch this from a database or other data source.
            val book = fetchBookDetails(bookId)
// Update the UI with the book details
            tvTitle.text = book.title
            tvAuthor.text = book.author
            tvDescription.text = book.description

                    btnEdit.setOnClickListener {
                        val intent = Intent(this, AddBookActivity::class.java)
                        intent.putExtra("BOOK_ID", bookId)
                        startActivity(intent)
                    }
        } else {
// Handle error case where no valid bookId is provided
            Toast.makeText(this, "Error fetching book details.", Toast.LENGTH_SHORT).show()
        } }
    private fun fetchBookDetails(bookId: Int): Book {
// This is a sample function. In a real app, fetch the book details based on the bookId.
// For demonstration, I'm returning a sample book.
        return Book("Sample Title", "Sample Author", "Sample Description") }
    }
