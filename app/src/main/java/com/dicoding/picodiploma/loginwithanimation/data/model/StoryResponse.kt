package com.dicoding.picodiploma.loginwithanimation.data.model


import com.google.gson.annotations.SerializedName

data class StoryResponse(
    @SerializedName("error") val error: Boolean,
    @SerializedName("message") val message: String,
    @SerializedName("listStory") val listStory: List<StoryItem>
)

data class StoryItem(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("photoUrl") val photoUrl: String
)
