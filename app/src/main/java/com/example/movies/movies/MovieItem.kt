package com.example.movies.movies

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.movies.R
import com.example.movies.data.Movie

@Composable
fun MovieItem(movie: Movie, onMovieClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onMovieClick)
            .padding(6.dp)
    ) {
        Image(
            painter = painterResource(id = movie.thumbnailResId),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .clip(shape = RoundedCornerShape(8.dp))
        )
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(text = movie.title, fontWeight = FontWeight.Bold)
            Text(text = "Duration: ${movie.duration}")
            Text(text = "Genre: ${movie.genre}")
        }
    }
}



fun getMoviesList(): List<Movie> {
    return listOf(
        Movie(
            title = "Tenet",
            description = "Armed with only one word, Tenet, and fighting for the survival of the entire world...",
            rating = 7.8f,
            duration = "2h 30min",
            genre = "Action, Sci-Fi",
            releaseDate = "3 September 2020",
            trailerLink = "https://www.youtube.com/watch?v=LdOM0x0XDMo",
            thumbnailResId = R.drawable.tenet
        ),
        Movie(
            title = "Spider-Man: Into the Spider-Verse",
            description = "Teen Miles Morales becomes the Spider-Man of his universe, and must join with five spider-powered individuals from other dimensions to stop a threat for all realities.",
            rating = 8.4f,
            duration = "1h 57min",
            genre = "Action, Animation, Adventure",
            releaseDate = "14 December 2018",
            trailerLink = "https://www.youtube.com/watch?v=tg52up16eq0",
            thumbnailResId = R.drawable.spider_man
        ),
        Movie(
            title = "Knives Out",
            description = "A detective investigates the death of a patriarch of an eccentric, combative family.",
            rating = 7.9f,
            duration = "2h 10min",
            genre = "Comedy, Crime, Drama",
            releaseDate = "27 November 2019",
            trailerLink = "https://www.youtube.com/watch?v=qGqiHJTsRkQ",
            thumbnailResId = R.drawable.knives_out
        ),
        Movie(
            title = "Guardians of the Galaxy",
            description = "A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.",
            rating = 8.0f,
            duration = "2h 1min",
            genre = "Action, Adventure, Comedy",
            releaseDate = "1 August 2014",
            trailerLink = "https://www.youtube.com/watch?v=d96cjJhvlMA",
            thumbnailResId = R.drawable.guardians_of_the_galaxy
        ),
        Movie(
            title = "Avengers: Age of Ultron",
            description = "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan.",
            rating = 7.3f,
            duration = "2h 21min",
            genre = "Action, Adventure, Sci-Fi",
            releaseDate = "1 May 2015",
            trailerLink = "https://www.youtube.com/watch?v=tmeOjFno6Do",
            thumbnailResId = R.drawable.avengers
        )
    )
}





