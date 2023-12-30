package com.alemicode.fullfunctionalapp.data.network.retrofit

import com.alemicode.fullfunctionalapp.data.network.NetworkDataSource
import com.alemicode.fullfunctionalapp.data.network.model.CommentsDto
import com.alemicode.fullfunctionalapp.data.network.model.PostsDto
import com.alemicode.fullfunctionalapp.data.network.model.UsersDto
import kotlinx.serialization.Serializable
import javax.inject.Inject
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Retrofit API declaration for NIA Network API
 */
private interface RetrofitNetworkApi {
    @GET(value = "posts")
    suspend fun getPosts(): NetworkResponse<PostsDto>

    @GET(value = "users")
    suspend fun getUsers(): NetworkResponse<UsersDto>

    @GET(value = "comments")
    suspend fun getComments(): NetworkResponse<CommentsDto>

}

/**
 * Wrapper for data provided
 */
@Serializable
private data class NetworkResponse<T>(
    val data: T,
)

@Singleton
class RetrofitNetwork @Inject constructor() : NetworkDataSource {

    private val networkApi = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RetrofitNetworkApi::class.java)

    override suspend fun getPosts(): PostsDto =
        networkApi.getPosts().data

    override suspend fun getUsers(): UsersDto =
        networkApi.getUsers().data

    override suspend fun getComments(): CommentsDto =
        networkApi.getComments().data


}