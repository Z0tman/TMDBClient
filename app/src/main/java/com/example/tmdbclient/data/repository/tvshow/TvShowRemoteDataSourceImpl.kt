package com.example.tmdbclient.data.repository.tvshow

import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val api_key:String
) : TvShowRemoteDataSource{
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(api_key)
}