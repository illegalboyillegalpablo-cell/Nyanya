package com.nganya.app.data.model

data class User(
    val id: String,
    val username: String,
    val displayName: String,
    val bio: String,
    val profileImage: String,
    val coverImage: String,
    val followers: Int,
    val following: Int,
    val posts: Int,
    val isFollowing: Boolean = false
)
