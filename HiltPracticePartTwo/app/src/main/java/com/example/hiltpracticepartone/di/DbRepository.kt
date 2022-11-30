package com.example.hiltpracticepartone.di

import com.example.hiltpracticepartone.database.NoteDao
import com.example.hiltpracticepartone.database.NoteEntity
import javax.inject.Inject

class DbRepository
@Inject constructor(private val dao: NoteDao) {
    fun saveNote(note: NoteEntity) = dao.insertNote(note)
    fun updateNote(note: NoteEntity) = dao.updateNote(note)
    fun deleteNote(note: NoteEntity) = dao.deleteNote(note)
    fun getNote(id: Long): NoteEntity = dao.getNote(id)
    fun getAllNotes() = dao.getAllNotes()
}