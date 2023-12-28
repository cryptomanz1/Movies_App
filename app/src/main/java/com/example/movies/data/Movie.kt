package com.example.movies.data

import com.example.movies.movies.getMoviesList

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

fun getMovieByTitle(title: String?): Movie? {
    return getMoviesList().find { it.title == title }
}
