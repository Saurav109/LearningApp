package com.ironman.learningapp.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.findNavController
import com.ironman.learningapp.R
import com.ironman.learningapp.databinding.FragmentNewBinding

class NewFragment : Fragment() {
    private lateinit var newBinding: FragmentNewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        newBinding= FragmentNewBinding.inflate(inflater,container,false)
        return newBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newBinding.goButton.setOnClickListener {
            it.findNavController().navigate(R.id.newFragment_to_my_activity)
        }

        arguments?.get("title").let {
            Toast.makeText(context,arguments?.getString("title"),Toast.LENGTH_LONG).show()
        }
    }

}