package com.alemicode.model

/**
 * External data layer represent of Comments
 * */
data class Comments(
    val id: Int,
    val postId: Int,
    val body: String,
    val userId: Int
)