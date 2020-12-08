package com.ironman.learningapp.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ironman.learningapp.databinding.ResetPasswordFragmentBinding

class ResetPassFragment : Fragment() {
    private lateinit var resetPasswordFragmentBinding: ResetPasswordFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        resetPasswordFragmentBinding = ResetPasswordFragmentBinding.inflate(inflater, container, false)
        return resetPasswordFragmentBinding.root
    }
}