package com.example.using_hilt_room.db

import androidx.room.*
import androidx.room.Insert
import com.example.using_hilt_room.utils.Constants.NOTE_TABLE

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(noteEntity: NoteEntity)

    @Update
    fun updateNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM $NOTE_TABLE ORDER BY noteId DESC")
    fun getAllNotes() : MutableList<NoteEntity>

    @Query("SELECT * FROM $NOTE_TABLE WHERE noteId LIKE :id")
    fun getNote(id: Int) : NoteEntity
}
