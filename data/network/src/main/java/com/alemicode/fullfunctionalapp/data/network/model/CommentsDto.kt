package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CommentsDto(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("comments")
	val comments: List<CommentsItemDto>,

	@field:SerializedName("limit")
	val limit: Int,

	@field:SerializedName("skip")
	val skip: Int
)

data class CommentsItemDto(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("postId")
	val postId: Int,

	@field:SerializedName("body")
	val body: String,

	@field:SerializedName("user")
	val userDto: UserDto
)

data class UserDto(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("username")
	val username: String
)
