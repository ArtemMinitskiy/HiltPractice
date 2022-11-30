package com.example.hiltpracticepartone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltpracticepartone.di.DbRepository
import com.example.hiltpracticepartone.database.NoteEntity
import com.example.hiltpracticepartone.databinding.ActivityAddNoteBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AddNoteActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddNoteBinding

    @Inject
    lateinit var repository: DbRepository

    @Inject
    lateinit var note: NoteEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSave.setOnClickListener {
                val title = edtTitle.text.toString()
                val desc = edtDesc.text.toString()
                if (title.isNotEmpty() || desc.isNotEmpty()) {
                    note = NoteEntity(0, title, desc)
                    repository.saveNote(note)
                    finish()
                } else {
                    Snackbar.make(it, "Title and Description cannot be Empty", Snackbar.LENGTH_LONG).show()
                }
            }
        }

    }
}