package com.alemicode.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class UserAndPosts(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val posts: List<PostsEntity>
)