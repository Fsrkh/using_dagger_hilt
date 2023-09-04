package com.example.myapplication
import javax.inject.Inject
import android.util.Log

class DatabaseService @Inject constructor() {
    fun log(msg: String){
        Log.d(TAG, "Database Service message: $msg" )
    }
}