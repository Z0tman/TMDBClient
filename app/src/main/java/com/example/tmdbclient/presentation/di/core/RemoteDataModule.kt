package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.model.tvshow.TvShow
import com.example.tmdbclient.data.repository.artist.ArtistCacheDataSourceImpl
import com.example.tmdbclient.data.repository.artist.ArtistRemoteDataSource
import com.example.tmdbclient.data.repository.artist.ArtistRemoteDataSourceImpl
import com.example.tmdbclient.data.repository.movie.MovieRemoteDataSource
import com.example.tmdbclient.data.repository.movie.MovieRemoteDataSourceImpl
import com.example.tmdbclient.data.repository.tvshow.TvShowRemoteDataSource
import com.example.tmdbclient.data.repository.tvshow.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey:String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService,apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService):TvShowRemoteDataSource{
        return TvShowRemoteDataSourceImpl(tmdbService,apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService):ArtistRemoteDataSource{
        return ArtistRemoteDataSourceImpl(tmdbService,apiKey)
    }
}