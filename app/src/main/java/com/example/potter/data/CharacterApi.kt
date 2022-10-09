package com.example.potter.data

import com.example.potter.data.ApiConstants
import com.example.potter.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINTS)
    suspend fun getCharacter():List<Character>
}