package com.example.hiltpracticepartone

import android.util.Log
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(msg: String){
        Log.d("mLog","DatabaseAdapter : $msg")
        databaseService.log(msg)
    }
}