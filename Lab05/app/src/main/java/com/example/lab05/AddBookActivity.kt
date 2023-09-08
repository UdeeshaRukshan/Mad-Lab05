package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
// object book{

//     val add: Unit
//         get() {
//
//         }
//     var books: List<Book> = listOf(
//// Sample data for demonstration purposes
//         Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel set in the Jazz Age."),
//         Book("Moby Dick", "Herman Melville", "A novel about a man's obsession with a whale."),
//     )
// }
class AddBookActivity : AppCompatActivity() {
    private lateinit var edtTitle: EditText
    private lateinit var edtAuthor: EditText
    private lateinit var edtDescription: EditText
    private lateinit var btnSave: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)
        edtTitle = findViewById(R.id.edt_title)
        edtAuthor = findViewById(R.id.edt_author)

        edtDescription = findViewById(R.id.edt_description)

        btnSave = findViewById(R.id.btn_save)
        btnSave.setOnClickListener {
            val title = edtTitle.text.toString()
            val author = edtAuthor.text.toString()
            val description = edtDescription.text.toString()
            if (title.isNotEmpty() && author.isNotEmpty()) { // Create a new book instance
                val newBook = Book(title, author, description)
                book.

// Notify user, e.g., using a Toast
                Toast.makeText(this, "Book added successfully!", Toast.LENGTH_SHORT).show()
// Return to the previous activity (e.g., MainActivity)
                finish()
            } else {
// Notify user to fill out required fields
                Toast.makeText(this, "Please fill out required fields!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
