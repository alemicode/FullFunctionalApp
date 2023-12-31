package com.alemicode.fullfunctionalapp.data.network.retrofit

import com.alemicode.fullfunctionalapp.data.network.model.CommentsDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersDto
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiService: RetrofitService) :
    NetworkDataSource {

    override suspend fun getPosts(): Response<PostsDto> {
        return apiService.getPosts()
    }

    override suspend fun getUsers(): Response<UsersDto> {
        return apiService.getUsers()

    }

    override suspend fun getComments(): Response<CommentsDto> {
        return apiService.getComments()
    }


}