package com.alemicode.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class PostAndComments(
    @Embedded val post: PostsEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "postId"
    )
    val comments: List<CommentsEntity>
)