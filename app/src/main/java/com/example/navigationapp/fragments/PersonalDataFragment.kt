package com.example.navigationapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationapp.databinding.FragmentPersonalDataBinding

class PersonalDataFragment : Fragment() {

    //uma variável só pra settar e uma só pra recuperar
    private var _binding: FragmentPersonalDataBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //recuperando

    }

    //limpar a referência
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}