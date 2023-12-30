package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class PostsDto(

	@field:SerializedName("PostsDto")
	val postsDto: List<PostsDtoItem?>? = null
)

data class PostsDtoItem(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("userId")
	val userId: Int? = null
)
