package com.alemicode.data.model

import com.alemicode.database.model.UserEntity
import com.alemicode.fullfunctionalapp.data.network.model.UsersItemDto

fun UsersItemDto.toEntity() = UserEntity(
    id = id,
    firstName = firstName,
    lastName = lastName,
    gender = gender,
    university = university,
    email = email,
    image = image,
    age = age
)