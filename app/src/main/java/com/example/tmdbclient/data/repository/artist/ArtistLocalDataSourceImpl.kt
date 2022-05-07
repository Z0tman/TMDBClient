package com.example.tmdbclient.data.repository.artist

import com.example.tmdbclient.data.db.ArtistDao
import com.example.tmdbclient.data.model.artist.Artist

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao) : ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist>? {
        return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        artistDao.saveArtists(artists)
    }

    override suspend fun clearAll() {
        artistDao.deleteAllArtists()
    }
}