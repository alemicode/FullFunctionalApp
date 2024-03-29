package com.alemicode.fullfunctionalapp.data.network.retrofit

import com.alemicode.fullfunctionalapp.data.network.model.CommentsDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersDto
import retrofit2.Response

/**
 * Interface representing network calls
 */
interface NetworkDataSource {
    suspend fun getPosts(): PostsDto

    suspend fun getUsers(): UsersDto

    suspend fun getComments() : CommentsDto

}
