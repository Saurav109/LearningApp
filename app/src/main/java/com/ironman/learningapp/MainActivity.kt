package com.ironman.learningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ironman.learningapp.fragements.Home

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().add(R.id.parent_frame,Home()).commit()
    }

    companion object{
        var TAG="MY_TAG"
    }

    /*TODO
        1. chat head
        2.

     */
}