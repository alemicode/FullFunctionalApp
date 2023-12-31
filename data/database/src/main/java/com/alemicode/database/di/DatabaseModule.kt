package com.alemicode.database.di

import android.content.Context
import androidx.room.Room
import com.alemicode.database.AppDatabase
import com.alemicode.database.dao.AppDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DatabaseModule {

    companion object {
        @Provides
        @Singleton
        fun providesAppDatabase(
            @ApplicationContext context: Context
        ): AppDatabase = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_database"
        ).allowMainThreadQueries().build()

        @Provides
        fun provideAppDao(
            database: AppDatabase
        ): AppDao = database.appDao()
    }
}