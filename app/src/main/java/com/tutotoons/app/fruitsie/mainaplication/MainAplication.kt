package com.tutotoons.app.fruitsie.mainaplication

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tutotoons.app.fruitsie.models.appModulefrrffrrf
import com.tutotoons.app.fruitsie.models.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class MainAplication:Application() {

    companion object {

        val deepLlllll: String = "deepL"
        var AIR_BALANCEfrrfrfrf = 500
        var defaultValueeeeeee = "null"
        var instIdfrfrf: String? = "instID"
        var urlMainfrrffr: String = "link"
        const val ONESIGNAL_APP_IDrrffrrf = "346cd88a-a042-4c53-a48b-fb84542f9a29"
        const val paaaaaaack = "com.tutotoons.app.fruitsie"
        const val apppppppps = "29jBVc3jyoVuHpkd8nUdk4"
        const val traaaaacker = "15802813274303224074"
        val myIdfrrrfrf: String = "myID"
        var MAIN_IDfrrfrf: String? = "main_id"
        var aps_idddddd: String? = "main_id"
        var C1frrfrf: String? = "c11"
        const val myTrIdfrfrrf = ""
        val appsCheckChefrfrfrf: String = "appsCheckChe"
        val geoCoffffff: String = "geoCo"

        //        val userCo: String = "userCo"
        val codeCodeeeeeee: String = "uff"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDrrffrrf)

        val frrfrfrffrrf = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingssssssss = getSharedPreferences("PREFS_NAME", 0)

        val trackerParamsssssss = MyTracker.getTrackerParams()
        val trackerConfigfrfrfrffr = MyTracker.getTrackerConfig()

        val instIDsdddd = MyTracker.getInstanceId(this)
        trackerConfigfrfrfrffr.isTrackingLaunchEnabled = true


        if (settingssssssss.getBoolean("my_first_time", true)) {

            frrfrfrffrrf.edit().putString(instIdfrfrf, instIDsdddd).apply()
            settingssssssss.edit().putBoolean("my_first_time", false).apply()
        } else {

        }
        MyTracker.initTracker(traaaaacker, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MainAplication)
            modules(
                listOf(
                    viewModelModule, appModulefrrffrrf
                )
            )
        }
    }
}