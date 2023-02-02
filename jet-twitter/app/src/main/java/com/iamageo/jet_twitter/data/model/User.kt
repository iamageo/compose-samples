package com.iamageo.jet_twitter.data.model

data class User(
    val name: String,
    val username: String,
    val avatar: Int,
    val banner: Int,
    val bio: String,
    val following: Int,
    val followers: Int,
    val verified: Boolean,
    val moreInfo: UserMoreInfo
)

data class UserMoreInfo(
    val firstLogin: String,
    val likInProfile: String
)