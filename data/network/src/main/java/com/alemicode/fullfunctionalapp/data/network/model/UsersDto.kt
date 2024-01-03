package com.alemicode.fullfunctionalapp.data.network.model

import com.google.gson.annotations.SerializedName

data class UsersDto(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("limit")
	val limit: Int,

	@field:SerializedName("skip")
	val skip: Int,

	@field:SerializedName("users")
	val users: List<UsersItemDto>
)

data class BankDto(

	@field:SerializedName("iban")
	val iban: String,

	@field:SerializedName("cardExpire")
	val cardExpire: String,

	@field:SerializedName("cardType")
	val cardType: String,

	@field:SerializedName("currency")
	val currency: String,

	@field:SerializedName("cardNumber")
	val cardNumber: String
)

data class CompanyDto(

    @field:SerializedName("address")
	val address: Address,

    @field:SerializedName("name")
	val name: String,

    @field:SerializedName("department")
	val department: String,

    @field:SerializedName("title")
	val title: String
)

data class UsersItemDto(

	@field:SerializedName("lastName")
	val lastName: String,

	@field:SerializedName("gender")
	val gender: String,

	@field:SerializedName("university")
	val university: String,

	@field:SerializedName("maidenName")
	val maidenName: String,

	@field:SerializedName("ein")
	val ein: String,

	@field:SerializedName("ssn")
	val ssn: String,

	@field:SerializedName("bloodGroup")
	val bloodGroup: String,

	@field:SerializedName("password")
	val password: String,

	@field:SerializedName("hair")
	val hair: Hair,

	@field:SerializedName("bank")
	val bankDto: BankDto,

	@field:SerializedName("eyeColor")
	val eyeColor: String,

	@field:SerializedName("company")
	val companyDto: CompanyDto,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("height")
	val height: Int,

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("address")
	val address: Address,

	@field:SerializedName("ip")
	val ip: String,

	@field:SerializedName("weight")
	val weight: Any,

	@field:SerializedName("userAgent")
	val userAgent: String,

	@field:SerializedName("birthDate")
	val birthDate: String,

	@field:SerializedName("firstName")
	val firstName: String,

	@field:SerializedName("macAddress")
	val macAddress: String,

	@field:SerializedName("phone")
	val phone: String,

	@field:SerializedName("domain")
	val domain: String,

	@field:SerializedName("age")
	val age: Int,

	@field:SerializedName("username")
	val username: String
)

data class Hair(

	@field:SerializedName("color")
	val color: String,

	@field:SerializedName("type")
	val type: String
)

data class Address(

    @field:SerializedName("address")
	val address: String,

    @field:SerializedName("city")
	val city: String,

    @field:SerializedName("postalCode")
	val postalCode: String,

    @field:SerializedName("coordinates")
	val coordinates: Coordinates,

    @field:SerializedName("state")
	val state: String
)

data class Coordinates(

	@field:SerializedName("lng")
	val lng: Any,

	@field:SerializedName("lat")
	val lat: Any
)
