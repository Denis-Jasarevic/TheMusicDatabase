package resume.project.themusicdatabase

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private val apiKey = System.getProperty("api_key")

private val retrofit = Retrofit.Builder()
    .baseUrl("http://ws.audioscrobbler.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
val musicService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("/2.0/")
    fun searchArtists(
        @Query("method") method: String = "artist.search",
        @Query("artist") artist: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<ArtistSearchResponse>

    @GET("/2.0/")
    fun getArtistInfo(
        @Query("method") method: String = "artist.getInfo",
        @Query("artist") artist: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<ArtistInfoResponse>

    @GET("/2.0/")
    fun getTopArtists(
        @Query("method") method: String = "chart.getTopArtists",
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<TopArtistsResponse>

    @GET("/2.0/")
    fun getTopAlbums(
        @Query("method") method: String = "artist.getTopAlbums",
        @Query("artist") artist: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<TopAlbumsResponse>

    @GET("/2.0/")
    fun getTopTracks(
        @Query("method") method: String = "artist.getTopTracks",
        @Query("artist") artist: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<TopTracksResponse>

    @GET("/2.0/")
    fun getAlbumInfo(
        @Query("method") method: String = "album.getInfo",
        @Query("artist") artist: String,
        @Query("album") album: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<AlbumInfoResponse>

    @GET("/2.0/")
    fun getTrackInfo(
        @Query("method") method: String = "track.getInfo",
        @Query("artist") artist: String,
        @Query("track") track: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<TrackInfoResponse>

    @GET("/2.0/")
    fun getSimilarArtists(
        @Query("method") method: String = "artist.getSimilar",
        @Query("artist") artist: String,
        @Query("api_key") apiKey: String,
        @Query("format") format: String = "json"
    ): Call<SimilarArtistsResponse>
}