package com.tutotoons.app.fruitsie.models

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tutotoons.app.fruitsie.HostInterfaceeee
import com.tutotoons.app.fruitsie.apiii.ApiInterfaceeeee
import com.tutotoons.app.fruitsie.apiii.CountryRepo
import com.tutotoons.app.fruitsie.apiii.DevRepo
import com.tutotoons.app.fruitsie.vievmodela.BeamModel
import com.tutotoons.app.fruitsie.vievmodela.ViMod
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModulefrrffrrf = module {

    single  <HostInterfaceeee> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfaceeee::class.java)
    }

    single <ApiInterfaceeeee> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceeeee::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://transcemonkey.fun/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepo(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
    single{
        provideGsonfrrfrffrrfrfrfrf()
    }
    single (named("SharedPreferences")) {
        provideSharedPreffrfrrgtggtgttgt(androidApplication())
    }
}

fun provideSharedPreffrfrrgtggtgttgt(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun provideGsonfrrfrffrrfrfrfrf(): Gson {
    return GsonBuilder().create()
}

val viewModelModule = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModel(get())
    }
}
