package com.example.navigationapp.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.databinding.FragmentAddressBinding
import com.example.navigationapp.extensions.text
import com.example.navigationapp.model.PersonModel

class AddressFragment : Fragment(){

    //uma variável só pra settar e uma só pra recuperar
    private var _binding: FragmentAddressBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //uma das formas de se recuperar
    private val args by navArgs<AddressFragmentArgs>()


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
        Log.e(TAG, "onViewCreated : ${args.model}")

        //recuperando o valor digitado ao clicar no botão
        binding.btnNext.setOnClickListener {
            //pelo model ser uma data class (para nao ter que instanciar um novo objeto:
          val model = args.model.copy(
                street = binding.tilStreet.text,
                number = binding.tilNumber.text.toInt()
            )

           val directions = AddressFragmentDirections.goToResumeFragment(model)
            findNavController().navigate(directions)
        }
    }
    //limpar a referência
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}