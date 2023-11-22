package com.example.navigationapp.fragments

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.databinding.FragmentResumeBinding

class ResumeFragment : Fragment() {

    //uma variável só pra settar e uma só pra recuperar
    private var _binding: FragmentResumeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //uma das formas de se recuperar
    private val args by navArgs<ResumeFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        _binding = FragmentResumeBinding.inflate(inflater, group, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(ContentValues.TAG, "onViewCreated : ${args.model}")

        binding.tvPerson.text = args.model.person
        binding.tvAddress.text = args.model.address
    }

    //limpar a referência
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}