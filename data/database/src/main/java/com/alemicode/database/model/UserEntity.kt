package com.alemicode.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alemicode.model.User


/**
 * Define User resource
 * */

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val university: String,
    val email: String,
    val image: String,
    val age: Int,
)

fun UserEntity.asExternalModel() = User(
    id = id,
    firstName = firstName,
    lastName = lastName,
    gender = gender,
    university = university,
    email = email,
    image = image,
    age = age,
)