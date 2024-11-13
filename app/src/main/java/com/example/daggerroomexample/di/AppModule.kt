package com.example.daggerroomexample.di

import android.content.Context
import androidx.room.Room
import com.example.daggerroomexample.room.dao.PostDao
import com.example.daggerroomexample.room.database.MyRoomDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun getDBName() : String = "RoomDB"

    @Singleton
    @Provides
    fun getRoomDb(@ApplicationContext context: Context, name: String) : MyRoomDB =
        Room.databaseBuilder(context,MyRoomDB::class.java,name)
            .build()

    @Singleton
    @Provides
    fun getPostDao(db:MyRoomDB):PostDao = db.getPostDao()


}