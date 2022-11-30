package com.example.hiltpracticepartone

import android.util.Log
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(msg: String){
        Log.d("mLog","DatabaseService msg : $msg")
    }
}