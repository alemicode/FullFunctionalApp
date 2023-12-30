package com.alemicode.fullfunctionalapp.data.network.di

import com.alemicode.fullfunctionalapp.data.network.NetworkDataSource
import com.alemicode.fullfunctionalapp.data.network.retrofit.RetrofitNetwork
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    @Binds
    fun bindsRetrofitNetwork(retrofitNetwork: RetrofitNetwork): NetworkDataSource
}