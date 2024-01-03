package com.alemicode.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alemicode.model.Comments
import com.alemicode.model.User

@Entity(tableName = "comments_table")
data class CommentsEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val postId: Int,
    val body: String,
    val userId: Int
)

fun CommentsEntity.asExternalModel() = Comments(
    id = id,
    postId = postId,
    body = body,
    userId = userId
)