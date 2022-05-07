package com.example.tmdbclient.data.repository.tvshow

import com.example.tmdbclient.data.db.TvShowDao
import com.example.tmdbclient.data.model.tvshow.TvShow

class TvShowLocalDataSourceImpl(private val tvShowDao: TvShowDao) : TvShowLocalDataSource{
    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        tvShowDao.saveTvShows(tvShows)

    }

    override suspend fun clearAll() {
        tvShowDao.deleteAllTvShows()
    }
}