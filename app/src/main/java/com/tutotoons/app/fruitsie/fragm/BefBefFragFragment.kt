package com.tutotoons.app.fruitsie.fragm


import androidx.navigation.fragment.findNavController
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.vievmodela.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class BefBefFragFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bef_bef_frag, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        vfbgbhnhnnhnhnh = context
    }

    val hyhyyhhyhy by activityViewModel<ViMod>(named("MainModel"))
    val hyhhyhyhyhy: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgtgtgt: String
    private lateinit var vfbgbhnhnnhnhnh: Context


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gtgt2gt2g = hyhhyhyhyhy.getString("apps", null)
        val hy2hyhy2hy5hy5hy = hyhhyhyhyhy.getString("appCamp", null)

        if (gtgt2gt2g=="1" &&hy2hyhy2hy5hy5hy == null) {
            hyhyyhhyhy.converssssssss(vfbgbhnhnnhnhnh)
            hyhyyhhyhy.appsDatagtgt65tggt.observe(viewLifecycleOwner) {

                if (it != null) {

                    gtgtgtgt = it.toString()
                    hyhhyhyhyhy.edit().putString("appCamp", gtgtgtgt).apply()
                    gtjigtjigtijgtjitgjjgt()
                }
            }
        } else {
            gtjigtjigtijgtjitgjjgt()
        }
    }

    private fun gtjigtjigtijgtjitgjjgt() {
        tjggtjgtjjtgjtgigtjitgji()
    }

    private fun tjggtjgtjjtgjtgigtjitgji() {
        findNavController().navigate(R.id.action_befBefFragFragment_to_filFilFilFragFragment)
    }

}