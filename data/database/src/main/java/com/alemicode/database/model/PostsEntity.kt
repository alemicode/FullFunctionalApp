package com.alemicode.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alemicode.model.Post

@Entity(tableName = "posts_table")
data class PostsEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val reactions: Int,
    val title: String,
    val body: String,
    val userId: Int,
)

fun PostsEntity.asExternalModel() = Post(
    id = id,
    reactions = reactions,
    title = title,
    body = body,
    userId = userId
)