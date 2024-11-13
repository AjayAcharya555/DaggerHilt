package com.example.daggerroomexample.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.daggerroomexample.model.Post


@Dao
interface  PostDao {

    @Insert
    suspend fun insert(post : Post)

    @Update
    suspend fun update(post : Post)

    @Delete
    suspend fun delete(post : Post)

    @Query("SELECT * FROM post")
    fun getAllPosts(): LiveData<List<Post>>

    @Insert
    fun insertAllPost(vararg post: Post)
}