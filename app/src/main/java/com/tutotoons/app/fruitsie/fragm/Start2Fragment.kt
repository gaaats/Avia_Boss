package com.tutotoons.app.fruitsie.fragm


import android.view.ViewGroup
import android.widget.Toast
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.databinding.FragmentStart2Binding


class Start2Fragment : Fragment() {


    private fun gtjigijgtjgtjgtjjtgijtgijgtj() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjitgjtgjgtjtgijjigtjigt()

        } catch (e: Exception) {
            gtjigijgtjgtjgtjjtgijtgijgtj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjitgjtgjgtjtgijjigtjigt() {
        tgjitgjtgjtgjijtggtjigtijgt()
    }

    private fun tgjitgjtgjtgjijtggtjigtijgt() {
        binding.btnOk.setOnClickListener {
            text = binding.edTxt.text.toString()
            if (text.isNotBlank() && text.isNotEmpty()) {
                gtughgthgttght()
            } else {
                gtjgtjtgjigtjijgtjgt()
            }

        }
    }

    private fun gtjgtjtgjigtjijgtjgt() {
        Toast.makeText(requireContext(), "Enter TITLE", Toast.LENGTH_SHORT).show()
    }

    private fun gtughgthgttght() {
        findNavController().navigate(R.id.action_start2Fragment_to_start3Fragment)
    }


    private var text = ""
    private var fragmentStart2Binding: FragmentStart2Binding? = null
    private val binding get() = fragmentStart2Binding ?: throw RuntimeException("FragmentStart2Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart2Binding = FragmentStart2Binding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onDestroy() {
        fragmentStart2Binding = null
        super.onDestroy()
    }

}