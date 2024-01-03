package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class PostsDto(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("limit")
	val limit: Int,

	@field:SerializedName("skip")
	val skip: Int,

	@field:SerializedName("posts")
	val posts: List<PostsItemDto>
)

data class PostsItemDto(

	@field:SerializedName("reactions")
	val reactions: Int,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("body")
	val body: String,

	@field:SerializedName("userId")
	val userId: Int,

	@field:SerializedName("tags")
	val tags: List<String>
)
