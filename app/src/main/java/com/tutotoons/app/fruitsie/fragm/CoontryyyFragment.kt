package com.tutotoons.app.fruitsie.fragm


import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.vievmodela.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CoontryyyFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hyhjuujujkiikkiikkiik.countryCodefrfrrfrffr6.observe(viewLifecycleOwner) {
            if (it!=null) {
                country = it.cougtgtgtgt
                gtgtgtgtgttggtgt.edit().putString("country", country).apply()
                gtkgtoijtgijtgjgtjgtgtijgt()
            }
        }
    }

    private fun gtkgtoijtgijtgjgtjgtgtijgt() {
        hyijyjhjhyhyjhyji()
    }

    private fun hyijyjhjhyhyjhyji() {
        gtgthtgtgtitghgth()
    }

    private fun gtgthtgtgtitghgth() {
        findNavController().navigate(R.id.action_coontryyyFragment_to_secccmiannFragment)
    }

    private lateinit var mContextfrfrrfrfrf: Context


    val gtgtgtgtgttggtgt: SharedPreferences by inject(named("SharedPreferences"))
    val hyhjuujujkiikkiikkiik by activityViewModel<ViMod>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_coontryyy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextfrfrrfrfrf = context
    }


}