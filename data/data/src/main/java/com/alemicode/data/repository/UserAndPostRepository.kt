package com.alemicode.data.repository

import com.alemicode.database.model.PostAndComments
import com.alemicode.database.model.UserAndPosts
import kotlinx.coroutines.flow.Flow

interface UserAndPostRepository {
    suspend fun getUserAndPosts(userId: Int): Flow<UserAndPosts>

}