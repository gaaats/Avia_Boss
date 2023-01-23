package com.tutotoons.app.fruitsie

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface HostInterfaceeee {
    @GET("typo.json")
    suspend fun getDataDevvvvvvvv(): Response<GeoDevgtgtt6ggt>
}

@Keep
data class GeoDevgtgtt6ggt(
    @SerializedName("geo")
    val geoooo: String,
    @SerializedName("view")
    val viewvvv: String,
    @SerializedName("appsChecker")
    val appsCheckerrrrr: String,
)