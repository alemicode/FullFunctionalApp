package com.alemicode.data.model

import com.alemicode.database.model.CommentsEntity
import com.alemicode.fullfunctionalapp.data.network.model.CommentsItemDto

fun CommentsItemDto.toEntity() = CommentsEntity(
    id = id,
    postId = postId,
    body = body,
    userId = userDto.id
)