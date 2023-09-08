package com.example.lab05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var rvBooks: RecyclerView
    private lateinit var adapter: BookAdapter
    private val books: List<Book> = listOf(
// Sample data for demonstration purposes
        Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel set in the Jazz Age."),
        Book("Moby Dick", "Herman Melville", "A novel about a man's obsession with a whale."),
    )
    // ... add more books here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBooks = findViewById(R.id.rv_books)
        adapter = BookAdapter(this, books)
        rvBooks.layoutManager = LinearLayoutManager(this)
        rvBooks.adapter = adapter
        val fabAddBook: FloatingActionButton = findViewById(R.id.btn_add_book)
        fabAddBook.setOnClickListener {
// Intent to go to AddBookActivity or show a dialog to add a book
            val intent = Intent(this, AddBookActivity::class.java)
            startActivity(intent)
        }
    }}