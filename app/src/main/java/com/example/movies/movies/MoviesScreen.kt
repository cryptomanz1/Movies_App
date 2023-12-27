package com.example.movies.movies

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesScreen(navController: NavController) {
    val moviesList = getMoviesList()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Movies") },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.List, contentDescription = null)
                    }
                }
            )
        }
    ) {
        LazyColumn {
            items(moviesList) { movie ->
                MovieItem(movie = movie, onMovieClick = {
                    navController.navigate("movieDetails/${movie.title}")
                })
            }
        }
    }
}



