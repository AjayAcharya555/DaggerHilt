package com.example.daggerhilt_retrofit.data

import com.example.daggerhilt_retrofit.model.Post
import retrofit2.http.GET

interface PostRequest {

    @GET("posts")
    suspend fun getPost(): List<Post>
}