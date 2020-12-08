package com.ironman.learningapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ironman.learningapp.adapters.HomeAdapter


class HomeUserListViewModel : ViewModel() {

    val myList = MutableLiveData<List<HomeAdapter.User>>(ArrayList<HomeAdapter.User>())

}