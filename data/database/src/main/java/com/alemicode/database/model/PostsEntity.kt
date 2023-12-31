package com.alemicode.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts_table")
data class PostsEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val reactions: Int,
    val title: String,
    val body: String,
    val userId: Int,
)