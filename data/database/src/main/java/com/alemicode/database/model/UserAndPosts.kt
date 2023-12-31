package com.alemicode.database.model

import androidx.room.Embedded
import androidx.room.Relation
import com.alemicode.model.User

data class UserAndPosts(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val director: List<PostsEntity>
)