package com.hasanzian.restapi.service

import com.hasanzian.restapi.datasource.MovieDataSource
import com.hasanzian.restapi.datasource.mock.MockMovieDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class MovieServiceTest{

    private val dataSource : MovieDataSource = mockk(relaxed = true)
    private val movieService = MovieService(dataSource)

    @Test
     fun `should call data source and retrive data`(){
         // given
       //  every { dataSource.retriveMovies() } returns emptyList()


         // when
        movieService.getMovies()



         // then
        verify(exactly = 1) {
            dataSource.retriveMovies()
        }



     }
}