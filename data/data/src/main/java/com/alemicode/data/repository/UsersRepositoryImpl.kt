package com.alemicode.data.repository

import com.alemicode.data.model.toEntity
import com.alemicode.database.dao.AppDao
import com.alemicode.database.model.UserEntity
import com.alemicode.database.model.asExternalModel
import com.alemicode.fullfunctionalapp.data.network.model.UsersItemDto
import com.alemicode.fullfunctionalapp.data.network.retrofit.NetworkDataSource
import com.alemicode.model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val topicDao: AppDao,
    private val network: NetworkDataSource,
) : UsersRepository {
    override suspend fun getUsers(): Flow<List<User>> {
        CoroutineScope(IO).launch {
            val usersList = network.getUsers().users.map(UsersItemDto::toEntity)
            topicDao.insetUsers(usersList)
        }

        return topicDao.getAllUsers().map {
            it.map(UserEntity::asExternalModel)
        }
    }
}