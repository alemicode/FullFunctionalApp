package com.alemicode.data.di

import com.alemicode.data.repository.PostAndCommentsRepository
import com.alemicode.data.repository.PostAndCommentsRepositoryImpl
import com.alemicode.data.repository.UserAndPostRepository
import com.alemicode.data.repository.UserAndPostRepositoryImpl
import com.alemicode.data.repository.UsersRepository
import com.alemicode.data.repository.UsersRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun provideUserRepository(
        userRepositoryImpl: UsersRepositoryImpl
    ): UsersRepository

    @Binds
    fun providePostAndCommentsRepository(
        postAndCommentsRepositoryImpl: PostAndCommentsRepositoryImpl
    ): PostAndCommentsRepository

    @Binds
    fun provideUserAndPostsRepository(
        userAndPostRepositoryImpl: UserAndPostRepositoryImpl
    ): UserAndPostRepository
}