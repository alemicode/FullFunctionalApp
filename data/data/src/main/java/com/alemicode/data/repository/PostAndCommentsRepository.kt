package com.alemicode.data.repository

import com.alemicode.database.model.PostAndComments
import kotlinx.coroutines.flow.Flow

interface PostAndCommentsRepository {

    suspend fun getPostAndComments(postId: Int): Flow<PostAndComments>

}