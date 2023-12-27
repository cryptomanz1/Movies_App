package com.example.movies.data

data class Movie(
    val title: String,
    val description: String,
    val rating: Float,
    val duration: String,
    val genre: String,
    val releaseDate: String,
    val trailerLink: String,
    val thumbnailResId: Int
)
