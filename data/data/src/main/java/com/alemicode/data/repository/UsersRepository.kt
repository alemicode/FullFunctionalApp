package com.alemicode.data.repository

import com.alemicode.model.User
import kotlinx.coroutines.flow.Flow

interface UsersRepository {

    suspend fun getUsers() : Flow<List<User>>
}