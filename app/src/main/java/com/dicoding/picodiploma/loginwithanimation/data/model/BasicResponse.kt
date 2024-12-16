package com.dicoding.picodiploma.loginwithanimation.data.model

import com.google.gson.annotations.SerializedName

data class BasicResponse(
    @SerializedName("error") val error: Boolean,
    @SerializedName("message") val message: String
)