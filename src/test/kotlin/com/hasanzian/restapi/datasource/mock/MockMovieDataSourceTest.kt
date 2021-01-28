package com.hasanzian.restapi.datasource.mock

import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions

internal class MockMovieDataSourceTest{

    private val mockDataSource =  MockMovieDataSource()

    @Test
     fun `should provide a collection of Movies`(){
         // when
          val  movies  = mockDataSource.retriveMovies()

         // then
         Assertions.assertThat(movies).isNotEmpty
         Assertions.assertThat(movies.size).isGreaterThanOrEqualTo(3)
        // Assertions.assertThat(movies.size).isGreaterThanOrEqualTo(10)

     }

    @Test
     fun `should provide some mock data`(){
         // when
         val movies = mockDataSource.retriveMovies()

         // then
         Assertions.assertThat(movies).allSatisfy { it.title.isBlank() }
         Assertions.assertThat(movies).anyMatch { it.title.isNotEmpty() }
        // Assertions.assertThat(movies).allSatisfy { it.titile.isNotBlank() }

     }

}