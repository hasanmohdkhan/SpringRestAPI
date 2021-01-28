package com.hasanzian.restapi.service

import com.hasanzian.restapi.datasource.MovieDataSource
import com.hasanzian.restapi.model.Movie
import org.springframework.stereotype.Service

@Service
class MovieService(private val dataSource: MovieDataSource) {
    fun getMovies(): Collection<Movie> = dataSource.retriveMovies()


}