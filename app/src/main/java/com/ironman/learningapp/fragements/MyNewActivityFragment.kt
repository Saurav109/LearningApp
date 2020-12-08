package com.ironman.learningapp.fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ironman.learningapp.R
import com.ironman.learningapp.databinding.FragmentNewBinding
import com.ironman.learningapp.databinding.NewFragLayoutBinding

class MyNewActivityFragment : Fragment() {
    private lateinit var newFragLayout: NewFragLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        newFragLayout = NewFragLayoutBinding.inflate(inflater, container, false)
        return newFragLayout.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newFragLayout.goMainButton.setOnClickListener {
            it.findNavController().navigate(R.id.to_main_activity)
        }
    }

}