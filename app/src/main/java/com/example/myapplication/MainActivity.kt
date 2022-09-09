package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylibrary.MyLibraryClass
import com.example.mylibrary.twice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 10
        var log = i.twice()
        MyLibraryClass.log(log)

        val list = mutableListOf<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)


        val l = 1
        var k: Number = 24

        val map = mutableMapOf<String, Int>()
        map["Вася"] = 11
        map[""] = 5

        when (k) {
            is Int -> Log.d("LOGQ", "Int")
            is Double -> Log.d("LOGQ", "Double")
            is Float -> Log.d("LOGQ", "Float")
            else -> Log.d("LOGQ", "Неет")
        }

    }


}