package com.tutotoons.app.fruitsie.fragm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.databinding.FragmentStart1Binding


class Start1Fragment : Fragment() {

    private fun gtjigijgtjgtjgtjjtgijtgijgtj() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentStart1Binding: FragmentStart1Binding? = null
    private val binding get() = fragmentStart1Binding ?: throw RuntimeException("FragmentStart1Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart1Binding = FragmentStart1Binding.inflate(inflater, container, false)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            thghtiuhgthgt()
            hgtutghhgthugt()
            binding.gtgttggt.setOnClickListener {
                gtgtitghgthgt()
            }




        } catch (e: Exception) {
            gtjigijgtjgtjgtjjtgijtgijgtj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun hgtutghhgthugt() {
        binding.aviaaa22.setOnClickListener {
            toijtjitgjjgti()
        }
    }

    private fun thghtiuhgthgt() {
        binding.aviaaa.setOnClickListener {
            toijtjitgjjgti()
        }
    }

    private fun toijtjitgjjgti() {
        findNavController().navigate(R.id.action_start1Fragment_to_start2Fragment)
    }

    private fun gtgtitghgthgt() {
        Toast.makeText(requireContext(), "Choose ONE airplane", Toast.LENGTH_SHORT).show()
    }


    override fun onDestroy() {
        fragmentStart1Binding = null
        super.onDestroy()
    }

}