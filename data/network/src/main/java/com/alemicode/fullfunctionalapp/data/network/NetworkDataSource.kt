package com.alemicode.fullfunctionalapp.data.network

import com.alemicode.fullfunctionalapp.data.network.model.CommentsDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersDto

/**
 * Interface representing network calls to the NIA backend
 */
interface NetworkDataSource {
    suspend fun getPosts(): PostsDto

    suspend fun getUsers(): UsersDto

    suspend fun getComments(): CommentsDto

}
