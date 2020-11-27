package com.ironman.learningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import butterknife.ButterKnife
import com.ironman.learningapp.fragements.Home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        supportFragmentManager.beginTransaction().add(R.id.parent_frame,Home()).commit()
    }
}