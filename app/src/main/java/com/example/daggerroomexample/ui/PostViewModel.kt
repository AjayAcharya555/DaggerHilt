package com.example.daggerroomexample.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerroomexample.model.Post
import com.example.daggerroomexample.room.repo.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(val postRepository: PostRepository) : ViewModel()  {

    val postLiveData = postRepository.getAllPosts()

    fun insertAll(vararg post: Post) = viewModelScope.launch {
        postRepository.insertAll(*post)

    }


}