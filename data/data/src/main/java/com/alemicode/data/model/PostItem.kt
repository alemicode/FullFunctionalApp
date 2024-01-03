package com.alemicode.data.model

import com.alemicode.database.model.PostsEntity
import com.alemicode.fullfunctionalapp.data.network.model.PostsItemDto

fun PostsItemDto.toEntity() = PostsEntity(
    id = id,
    reactions = reactions,
    title = title,
    body = body,
    userId = userId,
)