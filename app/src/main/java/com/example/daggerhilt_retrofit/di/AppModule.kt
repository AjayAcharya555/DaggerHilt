package com.example.daggerhilt_retrofit.di

import com.example.daggerhilt_retrofit.data.PostRequest
import com.example.daggerhilt_retrofit.utils.NetworkConstant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getBaseUrl(): String = NetworkConstant.BASE_URL

    @Singleton
    @Provides
    fun getRetrofit(baseUrl: String): Retrofit =
        Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build()

    @Singleton
    @Provides
    fun getPostRequest(retrofit: Retrofit): PostRequest = retrofit.create(PostRequest::class.java)

}