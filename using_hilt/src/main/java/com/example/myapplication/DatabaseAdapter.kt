package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(val databaseService: DatabaseService) {
    fun log(msg: String){
        Log.d(TAG, "Database Adapter: $msg")
        databaseService.log(msg)
    }
}