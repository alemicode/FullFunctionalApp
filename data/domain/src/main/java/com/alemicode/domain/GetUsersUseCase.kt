package com.alemicode.domain

import com.alemicode.data.repository.UserRepository
import com.alemicode.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<List<User>> {
        return userRepository.getUsers()
    }
}