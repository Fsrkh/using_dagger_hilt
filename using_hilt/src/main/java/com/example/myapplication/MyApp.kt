package com.example.myapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
const val TAG = "hilt tag"
@HiltAndroidApp
class MyApp : Application() {
}