package com.example.navigationapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationapp.databinding.FragmentAddressBinding
import com.example.navigationapp.databinding.FragmentPersonalDataBinding
import com.example.navigationapp.extensions.text
import com.example.navigationapp.model.PersonModel

class AddressFragment : Fragment(){

    //uma variável só pra settar e uma só pra recuperar
    private var _binding: FragmentAddressBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        _binding = FragmentAddressBinding.inflate(inflater, group, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //recuperando o valor digitado ao clicar no botão
        binding.btnNext.setOnClickListener {
            val model = PersonModel(
                street = binding.tilStreet.text ,
                number = binding.tilNumber.text.toInt()
            )
            // TODO 03 mandar os dados para outro fragment
            //TODO 04  navegar entre os fragments no click do bttn

        }
    }

    //limpar a referência
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}