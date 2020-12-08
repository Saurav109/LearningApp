package com.ironman.learningapp.fragements

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ironman.learningapp.adapters.HomeAdapter
import com.ironman.learningapp.databinding.HomeLayoutBinding
import com.ironman.learningapp.viewModels.HomeUserListViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.log

class Home : Fragment() {

    private lateinit var homeLayoutBinding: HomeLayoutBinding
    private lateinit var homeAdapter: HomeAdapter

    //
    private val model: HomeUserListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeLayoutBinding = HomeLayoutBinding.inflate(inflater, container, false)
        return homeLayoutBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val initialList = ArrayList<HomeAdapter.User>()
        initialList.add(HomeAdapter.User("sdsd", 209))
        model.myList.postValue(initialList)

        homeAdapter = HomeAdapter(initialList)

        homeLayoutBinding.homeRecyclerView.layoutManager = LinearLayoutManager(context)
        homeLayoutBinding.homeRecyclerView.adapter = homeAdapter
        homeAdapter.notifyDataSetChanged()

        model.myList.observe(viewLifecycleOwner, Observer {
            Log.d("MY_TAG", "onViewCreated: notify ")
            homeAdapter.setValues(it)
        })
        CoroutineScope(Default).launch {
            changeText()
            changeText()
            changeText()
            changeText()
        }
    }

    private suspend fun changeText() {
        delay(2 * 1000)
        withContext(Main) {

            val list = ArrayList<HomeAdapter.User>()
            model.myList.value?.let { list.addAll(it) }
            list.add(HomeAdapter.User("dsd", 32))
            list.add(HomeAdapter.User("dsd", 32))
            list.add(HomeAdapter.User("dsd", 32))
            list.add(HomeAdapter.User("dsd", 32))
            list.add(HomeAdapter.User("dsd", 32))
            list.add(HomeAdapter.User("dsd", 32))


            model.myList.postValue(list)
        }
    }


}
