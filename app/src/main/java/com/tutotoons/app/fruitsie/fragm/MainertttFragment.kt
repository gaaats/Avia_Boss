package com.tutotoons.app.fruitsie.fragm

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.vievmodela.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MainertttFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyjoijhyjhyji = context
    }

    private lateinit var hyhyjoijhyjhyji: Context
    lateinit var gtgtgtgtgtgt: String

    val gtgthyhyhyyhhyhyhy by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mainerttt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtgthyhyhyyhhyhyhy.fbDeeeeeeeee(hyhyjoijhyjhyji)

        gigtjojgtjgtjgtjgt()

    }

    private fun gigtjojgtjgtjgtjgt() {
        gttggtuhugthgthgt()
    }

    private fun gttggtuhugthgthgt() {
        ogigtojgtjgtjgtji()
    }

    private fun ogigtojgtjgtjgtji() {
        findNavController().navigate(R.id.action_mainertttFragment_to_coontryyyFragment)
    }
}