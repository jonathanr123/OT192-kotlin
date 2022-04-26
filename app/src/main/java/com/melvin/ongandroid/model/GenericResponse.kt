package com.melvin.ongandroid.model

import com.google.gson.annotations.SerializedName

// data class that represents the response from the Api
data class GenericResponse<T>(
    @SerializedName("success") val success: Boolean = false,
    @SerializedName("data") val data: T,
    @SerializedName("message") val message: String = ""
)