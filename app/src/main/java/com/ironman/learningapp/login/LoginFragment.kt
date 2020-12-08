package com.ironman.learningapp.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ironman.learningapp.R
import com.ironman.learningapp.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {
    private lateinit var loginFragmentBinding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loginFragmentBinding = LoginFragmentBinding.inflate(inflater, container, false)
        return loginFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginFragmentBinding.createButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_loginFragment_to_createAccountFragment)
        }
        loginFragmentBinding.resetButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_loginFragment_to_resetPassFragment)
        }

    }
}