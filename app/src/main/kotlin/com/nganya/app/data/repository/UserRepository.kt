package com.nganya.app.data.repository

import com.nganya.app.data.model.Post
import com.nganya.app.data.model.User

class UserRepository {
    fun getCurrentUser(): User {
        return User(
            id = "user_001",
            username = "nganyauser",
            displayName = "NGANYA User",
            bio = "Welcome to NGANYA - Entertainment at its finest!",
            profileImage = "",
            coverImage = "",
            followers = 1250,
            following = 450,
            posts = 89
        )
    }

    fun getUserById(userId: String): User? {
        // This would fetch from an API in a real app
        return null
    }
}
