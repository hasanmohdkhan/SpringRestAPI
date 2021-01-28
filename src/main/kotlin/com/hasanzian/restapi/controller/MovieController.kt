package com.hasanzian.restapi.controller

import com.hasanzian.restapi.model.Movie
import com.hasanzian.restapi.service.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movies")
class MovieController(private val service: MovieService) {

    @GetMapping
    fun getMovies():Collection<Movie>{
        return service.getMovies()
    }

}