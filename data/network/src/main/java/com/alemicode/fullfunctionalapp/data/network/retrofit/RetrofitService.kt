package com.alemicode.fullfunctionalapp.data.network.retrofit

import com.alemicode.fullfunctionalapp.data.network.model.CommentsDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersDto
import retrofit2.Response
import retrofit2.http.GET

/**
 * Retrofit API declaration for NIA Network API
 */
interface RetrofitService {
    @GET(value = "posts")
    suspend fun getPosts(): Response<PostsDto>

    @GET(value = "users")
    suspend fun getUsers(): Response<UsersDto>

    @GET(value = "comments")
    suspend fun getComments(): Response<CommentsDto>

}