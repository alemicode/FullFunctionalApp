package com.alemicode.fullfunctionalapp

import android.util.Log
import androidx.lifecycle.ViewModel
import com.alemicode.data.repository.PostAndCommentsRepository
import com.alemicode.data.repository.UserAndPostRepository
import com.alemicode.data.repository.UsersRepository
import com.alemicode.database.dao.AppDao
import com.alemicode.database.model.CommentsEntity
import com.alemicode.database.model.PostsEntity
import com.alemicode.database.model.UserEntity
import com.alemicode.fullfunctionalapp.data.network.retrofit.RemoteDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UsersRepository,
    private val postRepository: PostAndCommentsRepository,
    private val userAndPostRepository: UserAndPostRepository
) : ViewModel() {
    suspend fun getComments() {


//        Log.d(
//            "TAG", "etComments: ddd: ${
//                postRepository.getPostAndComments(2).first()
//            }"
//        )
        Log.d(
            "TAG", "etCodmdments: ddd: ${
                userAndPostRepository.getUserAndPosts(9).first()
            }"
        )

    }
}