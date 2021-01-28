package com.hasanzian.restapi.datasource

import com.hasanzian.restapi.model.Movie

interface MovieDataSource {

    fun retriveMovies():Collection<Movie>
}