package com.tutotoons.app.fruitsie.fragm

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.vievmodela.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SecccmiannFragment : Fragment() {


    val viewMainModelfrrffrrf by activityViewModel<ViMod>(named("MainModel"))
    lateinit var countryDevfrrfrf: String
    lateinit var wvfrrfrfrf: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_secccmiann, container, false)
    }

    lateinit var gtgtgtgtgt2gt5: String
    private lateinit var gt2tg2gt26gt: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gt2tg2gt26gt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModelfrrffrrf.frrfrffrfrrf.observe(viewLifecycleOwner) {
            if (it != null) {
                val mainnnnnnnnnn = it.toString()
                shareP.edit().putString("mainId", mainnnnnnnnnn).apply()
            }
        }

        viewMainModelfrrffrrf.ggtgtgtgtthyhy.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDevfrrfrf = it.geoooo
                gtgtgtgtgt2gt5 = it.appsCheckerrrrr
                wvfrrfrfrf = it.viewvvv

                jgtigtjtgjgtjigtjgt()
                shareP.edit().putString("apps", gtgtgtgtgt2gt5).apply()
                shareP.edit().putString("wv", wvfrrfrfrf).apply()

                gttkgttgjigtjgtgtji()
            }
        }
    }

    private fun jgtigtjtgjgtjigtjgt() {
        shareP.edit().putString("countryDev", countryDevfrrfrf).apply()
    }

    private fun gttkgttgjigtjgtgtji() {
        gtgtgtjgtijtgjigtjjgt()
    }

    private fun gtgtgtjgtijtgjigtjjgt() {
        tggtjigtjgttgg()
    }

    private fun tggtjigtjgttgg() {
        findNavController().navigate(R.id.action_secccmiannFragment_to_befBefFragFragment)
    }
}