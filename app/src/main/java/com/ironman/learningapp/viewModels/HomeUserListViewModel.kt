package com.ironman.learningapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class HomeUserListViewModel : ViewModel() {

    val title: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }



}