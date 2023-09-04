package com.example.using_hilt_room.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import com.example.myapplication.databinding.AddNoteActivityBinding
import com.example.using_hilt_room.db.NoteEntity
import com.example.using_hilt_room.repository.DbRepository
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

@AndroidEntryPoint
class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: AddNoteActivityBinding

    @Inject
    lateinit var repository: DbRepository

    @Inject
    lateinit var note: NoteEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddNoteActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnSave.setOnClickListener{
                val title = edtTitle.text.toString()
                val desc = edtDesc.text.toString()
                if(title.isNotEmpty()||desc.isNotEmpty()){
                    note = NoteEntity(0,title,desc)
                    repository.saveNote(note)
                    finish()
                }else{
                    Snackbar.make(it,"Title and Description cannot be Empty",Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }
}