package com.example.movies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movies.data.getMovieByTitle
import com.example.movies.movies.MovieDetailsScreen
import com.example.movies.movies.MoviesScreen


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "movies"
            ) {
                composable("movies") {
                    MoviesScreen(navController = navController)
                }
                composable("movieDetails/{movieTitle}") { backStackEntry ->
                    val movieTitle = backStackEntry.arguments?.getString("movieTitle")
                    val movie = getMovieByTitle(movieTitle)

                    if (movie != null) {
                        MovieDetailsScreen(movie = movie, onBackClick = {
                            navController.popBackStack()
                        })
                    } else {
                        // Handle invalid movie title
                    }
                }
            }
        }
    }
}
