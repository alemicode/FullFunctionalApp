package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CommentsDto(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("comments")
	val comments: List<CommentsItem>,

	@field:SerializedName("limit")
	val limit: Int,

	@field:SerializedName("skip")
	val skip: Int
)

data class CommentsItem(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("postId")
	val postId: Int,

	@field:SerializedName("body")
	val body: String,

	@field:SerializedName("user")
	val user: User
)

data class User(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("username")
	val username: String
)
