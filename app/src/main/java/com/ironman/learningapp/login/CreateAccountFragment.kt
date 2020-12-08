package com.ironman.learningapp.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ironman.learningapp.databinding.SignUpFragmentBinding

class CreateAccountFragment : Fragment() {
    private lateinit var signUpFragmentBinding: SignUpFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        signUpFragmentBinding = SignUpFragmentBinding.inflate(inflater, container, false)
        return signUpFragmentBinding.root
    }
}