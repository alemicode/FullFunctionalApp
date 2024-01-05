package com.alemicode.user.ui.user

import com.alemicode.model.Post
import com.alemicode.model.User

data class UserInfo(
    val user: User,
    val posts: List<Post>
)