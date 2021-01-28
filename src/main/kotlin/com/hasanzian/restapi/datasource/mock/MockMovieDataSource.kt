package com.hasanzian.restapi.datasource.mock

import com.hasanzian.restapi.datasource.MovieDataSource
import com.hasanzian.restapi.model.Movie
import org.springframework.stereotype.Repository

@Repository
class MockMovieDataSource : MovieDataSource {
    val movies = listOf(Movie("Her", "Her_cover.jpg", "Story about human and AI"),
            Movie("Thor", "Thor_cover.jpg", "Story of god of thunder. Thor!"),
            Movie("Big Hero 6", "Big_hero_6.jpg", "Story of of 6 super hero"),)

    override fun retriveMovies(): Collection<Movie> = movies
}