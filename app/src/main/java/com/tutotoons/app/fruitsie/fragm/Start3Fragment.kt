package com.tutotoons.app.fruitsie.fragm


import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.databinding.FragmentStart3Binding
import kotlinx.coroutines.delay
import kotlin.random.Random

class Start3Fragment : Fragment() {

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
            val num = Random.nextInt(from = 200, until = 2000)

            gtjgtijtgjgtijgtjtgjigt(num)

        } catch (e: Exception) {
            gtjigijgtjgtjgtjjtgijtgijgtj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjgtijtgjgtijgtjtgjigt(num: Int) {
        lifecycleScope.launchWhenCreated {
            gtjgtijgtjitgijtgojjtgjjio(num)
            delay(2600)
            tggthtghuhgthgt()
        }
    }

    private fun gtjgtijgtjitgijtgojjtgjjio(num: Int) {
        Toast.makeText(
            requireContext(),
            "You earn ${num}. Loading next game.",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun tggthtghuhgthgt() {
        findNavController().navigate(R.id.action_start3Fragment_to_start1Fragment)
    }


    override fun onDestroy() {
        fragmentStart3Binding = null
        super.onDestroy()
    }

    private var text = ""
    private var fragmentStart3Binding: FragmentStart3Binding? = null
    private val binding get() = fragmentStart3Binding ?: throw RuntimeException("FragmentStart3Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart3Binding = FragmentStart3Binding.inflate(inflater, container, false)
        return binding.root
    }


}