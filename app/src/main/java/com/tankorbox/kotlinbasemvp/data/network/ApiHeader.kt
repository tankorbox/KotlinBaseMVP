package com.tankorbox.kotlinbasemvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tankorbox.kotlinbasemvp.di.ApiKeyInfo
import javax.inject.Inject

class ApiHeader @Inject constructor(
    internal val publicApiHeader: PublicApiHeader,
    internal val protectedApiHeader: ProtectedApiHeader
) {

    class PublicApiHeader @Inject constructor(
        @ApiKeyInfo
        @Expose
        @SerializedName
            ("api_key") val apiKey: String
    )

    class ProtectedApiHeader @Inject constructor(
        @Expose
        @SerializedName("api_key") val apiKey: String,
        @Expose
        @SerializedName("user_id") val userId: Long?,
        @Expose
        @SerializedName("access_token") val accessToken: String?
    )

}