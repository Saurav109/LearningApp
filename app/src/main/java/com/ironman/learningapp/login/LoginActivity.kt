package com.ironman.learningapp.login

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ironman.learningapp.databinding.LoginActivityBinding
import com.ironman.learningapp.MainActivity.Companion.TAG;


class LoginActivity:AppCompatActivity() {

    private lateinit var loginActivityBinding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        loginActivityBinding= LoginActivityBinding.inflate(layoutInflater)
        setContentView(loginActivityBinding.root)

        Log.d(TAG, "onCreate: view created")
    }
}