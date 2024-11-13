package com.example.daggerroomexample.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerroomexample.R
import com.example.daggerroomexample.model.Post
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostActivity : AppCompatActivity() {

    private val mViewModel: PostViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)


        mViewModel.insertAll(
            Post(0, "title1", "Des1"),
            Post(0, "title2", "Des2"),
            Post(0, "title3", "Des3"),
            Post(0, "title4", "Des4"),
            Post(0, "title5", "Des5"),
            )


        mViewModel.postLiveData.observe(this){
            Log.i("roomsdf","onCreate" +it)
        }
    }
}