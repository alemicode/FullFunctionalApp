package com.alemicode.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alemicode.database.dao.AppDao
import com.alemicode.database.model.CommentsEntity
import com.alemicode.database.model.PostsEntity
import com.alemicode.database.model.UserEntity

@Database(
    entities = [
        CommentsEntity::class,
        PostsEntity::class,
        UserEntity::class,
    ],
    version = 1,
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}