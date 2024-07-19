package com.example.android.photogallery

import retrofit2.http.GET


private const val API_KEY = "bfd11511931b1d2288218074d515d4b0"
//
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse

    //suspend fun fetchContents(): String
}