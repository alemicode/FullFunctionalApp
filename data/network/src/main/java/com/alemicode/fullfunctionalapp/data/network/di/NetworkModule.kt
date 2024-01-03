package com.alemicode.fullfunctionalapp.data.network.di

import com.alemicode.fullfunctionalapp.data.network.retrofit.NetworkDataSource
import com.alemicode.fullfunctionalapp.data.network.retrofit.RemoteDataSource
import com.alemicode.fullfunctionalapp.data.network.retrofit.RetrofitService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    companion object {
        @Singleton
        @Provides
        fun provideHttpClient(): OkHttpClient {
            return OkHttpClient
                .Builder()
                .readTimeout(15, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build()
        }

        @Singleton
        @Provides
        fun provideConverterFactory(): GsonConverterFactory =
            GsonConverterFactory.create()

        @Singleton
        @Provides
        fun provideRetrofit(
            okHttpClient: OkHttpClient,
            gsonConverterFactory: GsonConverterFactory
        ): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://dummyjson.com/")
                .client(okHttpClient)
                .addConverterFactory(gsonConverterFactory)
                .build()
        }

        @Singleton
        @Provides
        fun provideCurrencyService(retrofit: Retrofit): RetrofitService =
            retrofit.create(RetrofitService::class.java)
    }

    @Binds
    fun provideNetworkDataSource(
        remoteDataSource: RemoteDataSource
    ): NetworkDataSource
}