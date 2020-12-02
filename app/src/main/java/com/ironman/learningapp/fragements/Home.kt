package com.ironman.learningapp.fragements

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.ironman.learningapp.adapters.HomeAdapter
import com.ironman.learningapp.databinding.HomeLayoutBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Home:Fragment() {

    private lateinit var homeLayoutBinding: HomeLayoutBinding
    private val titleText = MutableLiveData<String>()
    private val homeUserListViewModel = MutableLiveData<List<HomeAdapter.User>>()
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        homeLayoutBinding= HomeLayoutBinding.inflate(inflater,container,false)
        return homeLayoutBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        titleText.value= "before"


        titleText.observe(this, {
            homeLayoutBinding.titleText.text=it
        })
        homeUserListViewModel.value= listOf(HomeAdapter.User("dsds",3),HomeAdapter.User("dsds",3))
        homeLayoutBinding.homeRecyclerView.layoutManager=LinearLayoutManager(context)
        homeAdapter= HomeAdapter(homeUserListViewModel.value!!)
        homeLayoutBinding.homeRecyclerView.adapter=homeAdapter


        homeUserListViewModel.observe(this, {
            Log.d("MY_TAG", "onViewCreated: homeUserListViewModel")
            homeAdapter.setValues(it)
        })



        CoroutineScope(Default).launch {
            changeText("after")
        }
    }

    private suspend fun changeText(text:String){
        delay(2*1000)
        withContext(Main){
            titleText.value=text
            homeUserListViewModel.value?.toMutableList()?.add(HomeAdapter.User("sdsd",20))
            Log.d("MY_TAG", "changeText: size:"+ homeUserListViewModel.value!!.size)
        }
    }

}
