package com.example.android.unittestgithubpro.model

data class PostModel(val postList: List<Posts>)

data class Posts(val userId: Int, val id: Int, val title: String, val body: String)


data class CommentModel(val postList: List<Comment>)

data class Comment(
    val postId: Int,
    val id: Int,
    val name: String,
    val email: String,
    val body: String
)

data class PhotosModel(val postList: List<Photo>)

data class Photo(
    val albumId: Int,
    val id: Int,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)