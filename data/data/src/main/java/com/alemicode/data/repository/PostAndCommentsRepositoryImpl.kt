package com.alemicode.data.repository

import com.alemicode.data.model.toEntity
import com.alemicode.database.dao.AppDao
import com.alemicode.database.model.PostAndComments
import com.alemicode.fullfunctionalapp.data.network.model.CommentsItemDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsItemDto
import com.alemicode.fullfunctionalapp.data.network.retrofit.NetworkDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class PostAndCommentsRepositoryImpl @Inject constructor(
    private val topicDao: AppDao,
    private val network: NetworkDataSource,
) : PostAndCommentsRepository {
    override suspend fun getPostAndComments(postId: Int): Flow<PostAndComments> {
        CoroutineScope(IO).launch {
            val commentsList = network.getComments().comments.map(CommentsItemDto::toEntity)
            val postsList = network.getPosts().posts.map(PostsItemDto::toEntity)
            topicDao.insertPosts(postsList)
            topicDao.insertComments(commentsList)
        }

        return topicDao.getPostAndComments(postId)
    }
}