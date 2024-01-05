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
    val posts: List<PostsEntity>
)

fun UserAndPosts.asExternalModel() = User(
    id = user.id,
    firstName = user.firstName,
    lastName = user.lastName,
    gender = user.gender,
    university = user.university,
    email = user.email,
    image = user.image,
    age = user.age,
    posts = posts.map(PostsEntity::asExternalModel)
)