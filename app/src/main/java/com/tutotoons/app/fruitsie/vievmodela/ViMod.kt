package com.tutotoons.app.fruitsie.vievmodela

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tutotoons.app.fruitsie.GeoDevgtgtt6ggt
import com.tutotoons.app.fruitsie.apiii.CountryCodeJSgt2gtgtgtgt
import com.tutotoons.app.fruitsie.apiii.CountryRepo
import com.tutotoons.app.fruitsie.apiii.DevRepo
import com.tutotoons.app.fruitsie.faaake.BEEEE.COMMA
import com.tutotoons.app.fruitsie.faaake.BEEEE.DOT
import com.tutotoons.app.fruitsie.mainaplication.MainAplication.Companion.apppppppps
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*


class ViMod(
    private val mainRepository: CountryRepo,
    private val devRepo: DevRepo,
    private val shP: SharedPreferences,
    val application: Application
) : ViewModel() {


    private val gtgtggt = MutableLiveData<GeoDevgtgtt6ggt>()
    val ggtgtgtgtthyhy: LiveData<GeoDevgtgtt6ggt>
        get() = gtgtggt


    private val _appsDataaaaaaa56d56 = MutableLiveData<String>()
    val appsDatagtgt65tggt: LiveData<String>
        get() = _appsDataaaaaaa56d56

    private val _deepSfrrf56fr5fr5 = MutableLiveData<String>()
    val deepS: LiveData<String>
        get() = _deepSfrrf56fr5fr5

    suspend fun getDataaaaaaaa() {
        val ressss = mainRepository.getDattttttttt().body()!!
        Log.d("lolo", "list GEO is $ressss")
        fr5rf5rf5.postValue(ressss)
        getDevDataaaaaaaaaa()
    }

    suspend fun getDevDataaaaaaaaaa() {
        val ressss = devRepo.getDataDevvvvvvvv().body()
        Log.d("lolo", "list GEO is ${ressss}")
        gtgtggt.postValue(ressss!!)
    }



    private val gttggt5gt5tg = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val data: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = gttggt5gt5tg


    private val fr5rf5rf5 = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val countryCodefrfrrfrffr6: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = fr5rf5rf5


    private val _mainIddededdeeded = MutableLiveData<String?>()
    val frrfrffrfrrf: LiveData<String?>
        get() = _mainIddededdeeded


    fun converssssssss(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apppppppps, gtjtgigtjgtjgtjijgtijgtjig, application)
        AppsFlyerLib.getInstance().start(cont)
    }


    fun gtjjgtgtjjgtijgtjigt() {
        val vbghgthgthhgt = AdvertisingIdClient(application)
        vbghgthgthhgt.start()
        val gjjgtijigtjjgtjgt = vbghgthgthhgt.info.id.toString()
        _mainIddededdeeded.postValue(gjjgtijigtjjgtjgt)
    }

    fun fbDeeeeeeeee(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepDataaaaaaaaa = data.targetUri?.host.toString()
                shP.edit().putString("deepSt", deepDataaaaaaaaa).apply()
            }
        }
    }

    private val gtjtgigtjgtjgtjijgtijgtjig = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val ggtgtgtgtgt = data?.get("campaign").toString()
            _appsDataaaaaaa56d56.postValue(ggtgtgtgtgt)

            val hyhjuujjujuju = Bundle()

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }



    init {
        viewModelScope.launch(Dispatchers.IO) {
            gtjjgtgtjjgtijgtjigt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getDataaaaaaaa()
        }
    }

}

class NumberFormatHelper(
    var decimalSeparator: String = DOT,
    var groupingSeparator: String = COMMA
) {

    fun doubleToString(d: Double): String {
        val symbols = DecimalFormatSymbols(Locale.US)
        symbols.decimalSeparator = decimalSeparator.single()
        symbols.groupingSeparator = groupingSeparator.single()

        val formatter = DecimalFormat()
        formatter.maximumFractionDigits = 12
        formatter.decimalFormatSymbols = symbols
        formatter.isGroupingUsed = true
        return formatter.format(d)
    }

    fun addGroupingSeparators(str: String): String {
        return doubleToString(removeGroupingSeparator(str).toDouble())
    }

    fun removeGroupingSeparator(str: String): String {
        return str.replace(groupingSeparator, "").replace(decimalSeparator, DOT)
    }
}

fun getDecimalSeparator(): String {
    return DecimalFormatSymbols.getInstance().decimalSeparator.toString()
}