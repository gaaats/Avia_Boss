package com.tutotoons.app.fruitsie.fragm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.tutotoons.app.fruitsie.R
import com.tutotoons.app.fruitsie.gameactiv.GggggaamemeActivity
import com.tutotoons.app.fruitsie.mainaplication.MainAplication
import com.tutotoons.app.fruitsie.mainaplication.MainAplication.Companion.aps_idddddd
import com.tutotoons.app.fruitsie.vebvvv.BrovVebActivity
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class FilFilFilFragFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgtgtgtgthyyhhyhy = context
    }
    private lateinit var gtgtgtgtgthyyhhyhy: Context
    val ggtgokkgttgk: SharedPreferences by inject(named("SharedPreferences"))



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fil_fil_fil_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val counthhyyhhyhy = ggtgokkgttgk.getString("country", null)
        val deepStgttgtgt = ggtgokkgttgk.getString("deepSt", null)
        val countryDevgtgtgtgt = ggtgokkgttgk.getString("countryDev", null)
        val appsgtgtgtgt = ggtgokkgttgk.getString("apps", null)
        val appCampgtgtgtgt = ggtgokkgttgk.getString("appCamp", null)

        val wvgtgtgtgtgt = ggtgokkgttgk.getString("wv", null)
        val mainIdfrfrrfrf = ggtgokkgttgk.getString("mainId", null)
        val packtgtgtgtgt = "com.superking.parchisi.stare"
        val buildVerssssssss = Build.VERSION.RELEASE
        val myTrIdffrrfrf = ggtgokkgttgk.getString(MainAplication.instIdfrfrf, null)
        val trackerParamsfrffrrf = MyTracker.getTrackerParams()
        trackerParamsfrffrrf.setCustomUserId(myTrIdffrrfrf)


        val ffrfrfrfrrf = Intent(activity, BrovVebActivity::class.java)
        val gtgtgtgttg = Intent(activity, GggggaamemeActivity::class.java)


        val hyhyhyhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgtgtgtgthyyhhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        ggtgokkgttgk.edit().putString(aps_idddddd, hyhyhyhyhyhy).apply()

        val linkAppsfrrffr = "$wvgtgtgtgtgt$subOnefrrfrf$appCampgtgtgtgt&$onefrfrrfrf$hyhyhyhyhyhy&$ad_idfrfrfrf$mainIdfrfrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$nammgtgtgtgt"
        val linkMTfrrffrgtgt = "$wvgtgtgtgtgt$onefrfrrfrf$myTrIdffrrfrf&$ad_idfrfrfrf$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$nammgtgtgtgt"
        val linkFBfrrfrf = "$wvgtgtgtgtgt$subOnefrrfrf$deepStgttgtgt&$onefrfrrfrf$hyhyhyhyhyhy&$ad_idfrfrfrf$mainIdfrfrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$trololohyhyhy"
        val linkFBNullAppsfrrffrrffr = "$wvgtgtgtgtgt$subOnefrrfrf$deepStgttgtgt&$onefrfrrfrf$myTrIdffrrfrf&$ad_idfrfrfrf$myTrIdffrrfrf&$subFourggtgt$packtgtgtgtgt&$subFiverrrrrrr$buildVerssssssss&$subSixxxxxx$trololohyhyhy"

        when(appsgtgtgtgt) {
            "1" ->
                if(appCampgtgtgtgt!!.contains("tdb2")) {
                    ggtgokkgttgk.edit().putString("link", linkAppsfrrffr).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "campaign").apply()
                    startActivity(ffrfrfrfrrf)
                    tgojtjojgtojigt()
                } else if (deepStgttgtgt!=null||countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {


                    ggtgokkgttgk.edit().putString("link", linkFBfrrfrf).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLink").apply()
                    startActivity(ffrfrfrfrrf)
                    tgojtjojgtojigt()
                } else {
                    startActivity(gtgtgtgttg)
                    tgojtjojgtojigt()
                }
            "0" ->
                if(deepStgttgtgt!=null) {
                    ggtgokkgttgk.edit().putString("link", linkFBNullAppsfrrffrrffr).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(ffrfrfrfrrf)
                    tgojtjojgtojigt()
                } else if (countryDevgtgtgtgt!!.contains(counthhyyhhyhy.toString())) {
                    ggtgokkgttgk.edit().putString("link", linkMTfrrffrgtgt).apply()
                    ggtgokkgttgk.edit().putString("WebInt", "geo").apply()
                    startActivity(ffrfrfrfrrf)
                    tgojtjojgtojigt()
                } else {
                    startActivity(gtgtgtgttg)
                    tgojtjojgtojigt()
                }
        }
    }

    private fun tgojtjojgtojigt() {
        activity?.finish()
    }


    val subFourggtgt = "sub_id_4="
    val subFiverrrrrrr = "sub_id_5="
    val onefrfrrfrf = "deviceID="
    val subSixxxxxx = "sub_id_6="
    val nammgtgtgtgt = "naming"
    val trololohyhyhy = "deeporg"
    val subOnefrrfrf = "sub_id_1="
    val ad_idfrfrfrf = "ad_id="
}
