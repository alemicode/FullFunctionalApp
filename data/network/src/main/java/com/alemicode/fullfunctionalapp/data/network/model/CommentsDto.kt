package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CommentsDto(

	@field:SerializedName("CommentsDto")
	val commentsDto: List<CommentsDtoItem?>? = null
)

data class CommentsDtoItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("postId")
	val postId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)
