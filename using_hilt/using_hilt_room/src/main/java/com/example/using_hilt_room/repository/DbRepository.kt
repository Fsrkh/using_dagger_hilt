package com.example.using_hilt_room.repository

import com.example.using_hilt_room.db.NoteDao
import com.example.using_hilt_room.db.NoteEntity
import javax.inject.Inject

class DbRepository
@Inject constructor(
    private val dao: NoteDao
){
    fun saveNote(note: NoteEntity)= dao.insertNote(note)
    fun updateNote(note: NoteEntity)= dao.updateNote(note)
    fun deleteNote(note: NoteEntity)= dao.deleteNote(note)
    fun getNote(id: Int)= dao.getNote(id)
    fun getAllNotes() = dao.getAllNotes()

}