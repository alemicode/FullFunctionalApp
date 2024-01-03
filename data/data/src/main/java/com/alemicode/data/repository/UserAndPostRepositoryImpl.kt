package com.alemicode.data.repository

import android.util.Log
import com.alemicode.data.model.toEntity
import com.alemicode.database.dao.AppDao
import com.alemicode.database.model.UserAndPosts
import com.alemicode.fullfunctionalapp.data.network.model.PostsItemDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersItemDto
import com.alemicode.fullfunctionalapp.data.network.retrofit.NetworkDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserAndPostRepositoryImpl @Inject constructor(
    private val topicDao: AppDao,
    private val network: NetworkDataSource,
) : UserAndPostRepository {
    override suspend fun getUserAndPosts(userId: Int): Flow<UserAndPosts> {
        CoroutineScope(IO).launch {
            val userList = network.getUsers().users.map(UsersItemDto::toEntity)
            val postsList = network.getPosts().posts.map(PostsItemDto::toEntity)
            topicDao.insertPosts(postsList)
            topicDao.insetUsers(userList)
            val x = topicDao.getAllPosts().first()
            Log.d("TAG", "getUsdderAndPosts: ${x}")
        }

        return topicDao.getUserAndPosts(userId)
    }
}