package com.alemicode.fullfunctionalapp

import android.util.Log
import androidx.lifecycle.ViewModel
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
    private val remoteDataSource: RemoteDataSource,
    private val appDao: AppDao
) : ViewModel() {
    suspend fun getComments() {
        /**
         * Here We just check the response comming from server
         * This class will be refactored
         * */

        remoteDataSource.getPosts()?.let { posts ->
            val data = posts.body()?.posts?.map { post ->
                PostsEntity(
                    id = post.id,
                    title = post.title,
                    reactions = post.reactions,
                    body = post.body,
                    userId = post.userId
                )
            }
            data?.forEach {
                appDao.insertPosts(it)
            }
        }

        remoteDataSource.getUsers()?.let { user ->
            val data = user.body()?.users?.map {
                UserEntity(
                    id = it.id,
                    firstName = it.firstName,
                    lastName = it.lastName,
                    gender = it.gender,
                    university = it.university,
                    email = it.email,
                    image = it.image,
                    age = it.age
                )
            } ?: return
            data.forEach {
                appDao.insetUsers(it)
            }
        }
        remoteDataSource.getComments()?.let { comments ->
            val data = comments.body()?.comments?.map { comment ->
                CommentsEntity(
                    id = comment.id,
                    postId = comment.postId,
                    body = comment.body,
                    userId = comment.userDto.id
                )
            } ?: return
            data.forEach {
                appDao.insertComments(it)
            }
        }

        Log.d(
            "TAG", "etComments: ddd: ${
                appDao.getPostAndComments(1).first()
            }"
        )
    }
}