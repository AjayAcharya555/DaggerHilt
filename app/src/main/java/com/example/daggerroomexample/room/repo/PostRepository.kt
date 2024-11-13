package com.example.daggerroomexample.room.repo

import com.example.daggerroomexample.model.Post
import com.example.daggerroomexample.room.dao.PostDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class PostRepository @Inject constructor(val postDao : PostDao){

    suspend fun insertAll(vararg post: Post) = withContext(Dispatchers.IO){
        postDao.insertAllPost(*post)
    }

    fun getAllPosts() = postDao.getAllPosts()

}