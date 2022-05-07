package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.data.repository.artist.ArtistCacheDataSource
import com.example.tmdbclient.data.repository.artist.ArtistLocalDataSource
import com.example.tmdbclient.data.repository.artist.ArtistRemoteDataSource
import com.example.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.example.tmdbclient.data.repository.movie.*
import com.example.tmdbclient.data.repository.tvshow.TvShowCacheDataSource
import com.example.tmdbclient.data.repository.tvshow.TvShowLocalDataSource
import com.example.tmdbclient.data.repository.tvshow.TvShowRemoteDataSource
import com.example.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.example.tmdbclient.domain.repository.ArtistRepository
import com.example.tmdbclient.domain.repository.MovieRepository
import com.example.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieRemoteDataSource: MovieRemoteDataSource
    ):MovieRepository{
        return MovieRepositoryImpl(movieCacheDataSource,movieLocalDataSource, movieRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowCacheDataSource: TvShowCacheDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowRemoteDataSource: TvShowRemoteDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowCacheDataSource,tvShowLocalDataSource, tvShowRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistCacheDataSource: ArtistCacheDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistRemoteDataSource: ArtistRemoteDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistCacheDataSource,artistLocalDataSource, artistRemoteDataSource)
    }
}