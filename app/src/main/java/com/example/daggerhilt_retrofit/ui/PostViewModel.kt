package com.example.daggerhilt_retrofit.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerhilt_retrofit.data.PostRepository
import com.example.daggerhilt_retrofit.model.Post

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PostViewModel @Inject constructor(private val postRepository: PostRepository):ViewModel(){

    private val _post :  MutableLiveData<List<Post>> = MutableLiveData()

    private val post : LiveData<List<Post>> = _post

     fun getPostLiveData() :  LiveData<List<Post>> =  post

    fun getPost() = viewModelScope.launch {
        val posts = postRepository.getPost()
        _post.value =posts
    }
}