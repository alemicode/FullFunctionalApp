package com.alemicode.model

/**
 * External Datalayer represents of Posts
 * */
data class Post(
    val id: Int,
    val reactions: Int,
    val title: String,
    val body: String,
    val userId: Int,
)