package com.alemicode.data.repository

import com.alemicode.model.User
import kotlinx.coroutines.flow.Flow

interface UserAndPostRepository {
    fun getUserAndPosts(userId: Int): Flow<User>

}