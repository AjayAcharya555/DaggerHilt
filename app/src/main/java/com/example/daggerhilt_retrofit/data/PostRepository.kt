package com.example.daggerhilt_retrofit.data

import javax.inject.Inject

class PostRepository @Inject constructor(val postRequest: PostRequest) {


    suspend fun getPost() = postRequest.getPost()
}