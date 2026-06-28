package com.nganya.app.data.model

data class Post(
    val id: String,
    val authorName: String,
    val authorImage: String,
    val content: String,
    val imageUrl: String?,
    val videoUrl: String?,
    val likes: Int,
    val comments: Int,
    val shares: Int,
    val timestamp: Long,
    val isLiked: Boolean = false
)
