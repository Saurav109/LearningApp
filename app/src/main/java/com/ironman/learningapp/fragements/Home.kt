package com.ironman.learningapp.fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import butterknife.BindView
import butterknife.ButterKnife
import com.ironman.learningapp.R

class Home:Fragment() {

    @BindView(R.id.title_text)
    lateinit var title:TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_main,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ButterKnife.bind(view)

        title.text = "this is a text ${getTextVal()}"
    }

    fun getTextVal(): String {
        return "From text function"
    }
}