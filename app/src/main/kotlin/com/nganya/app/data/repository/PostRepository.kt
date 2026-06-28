package com.nganya.app.data.repository

import com.nganya.app.data.model.Post

class PostRepository {
    fun getFeedPosts(): List<Post> {
        return listOf(
            Post(
                id = "post_001",
                authorName = "User One",
                authorImage = "",
                content = "Check out this amazing content!",
                imageUrl = null,
                videoUrl = null,
                likes = 256,
                comments = 42,
                shares = 15,
                timestamp = System.currentTimeMillis()
            ),
            Post(
                id = "post_002",
                authorName = "User Two",
                authorImage = "",
                content = "Having fun with NGANYA!",
                imageUrl = null,
                videoUrl = null,
                likes = 512,
                comments = 89,
                shares = 34,
                timestamp = System.currentTimeMillis()
            )
        )
    }

    fun getExplorePosts(): List<Post> {
        return (1..20).map { index ->
            Post(
                id = "explore_post_$index",
                authorName = "Creator $index",
                authorImage = "",
                content = "Trending content #$index",
                imageUrl = null,
                videoUrl = null,
                likes = (100..1000).random(),
                comments = (10..100).random(),
                shares = (5..50).random(),
                timestamp = System.currentTimeMillis() - (index * 3600000L)
            )
        }
    }

    fun likePost(postId: String): Boolean {
        // This would update the backend in a real app
        return true
    }

    fun unlikePost(postId: String): Boolean {
        // This would update the backend in a real app
        return true
    }
}
