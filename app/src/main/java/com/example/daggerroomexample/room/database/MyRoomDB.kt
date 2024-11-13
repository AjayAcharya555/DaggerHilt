package com.example.daggerroomexample.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerroomexample.model.Post
import com.example.daggerroomexample.room.dao.PostDao

@Database(entities = [Post::class], version = 1, exportSchema = false)
abstract class MyRoomDB : RoomDatabase() {

    abstract fun getPostDao(): PostDao

}