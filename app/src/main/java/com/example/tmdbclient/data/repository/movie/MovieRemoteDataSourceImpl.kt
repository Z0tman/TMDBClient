package com.example.tmdbclient.data.repository.movie

import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val api_key:String) : MovieRemoteDataSource {
    //inject the date with dagger
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(api_key)
}