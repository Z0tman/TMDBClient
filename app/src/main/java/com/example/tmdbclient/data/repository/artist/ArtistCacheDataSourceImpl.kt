package com.example.tmdbclient.data.repository.artist

import com.example.tmdbclient.data.model.artist.Artist

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {
    private var listArtist = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return listArtist
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        listArtist.clear()
        listArtist = ArrayList(artists)
    }
}