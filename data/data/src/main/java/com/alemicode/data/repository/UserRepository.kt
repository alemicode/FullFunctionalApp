package com.alemicode.data.repository

import com.alemicode.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getUsers(): Flow<List<User>>

    fun getUser(id: Int): Flow<User>
}