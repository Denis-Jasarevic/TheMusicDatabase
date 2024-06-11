package resume.project.themusicdatabase

data class ArtistSearchResponse(
    val results: ArtistSearchResults
)

data class ArtistSearchResults(
    val artistmatches: ArtistMatches
)

data class ArtistMatches(
    val artist: List<Artist>
)

data class ArtistInfoResponse(
    val artist: Artist
)

data class TopArtistsResponse(
    val topartists: TopArtists
)

data class TopArtists(
    val artist: List<Artist>
)

data class TopAlbumsResponse(
    val topalbums: TopAlbums
)

data class TopAlbums(
    val album: List<Album>
)

data class TopTracksResponse(
    val toptracks: TopTracks
)

data class TopTracks(
    val track: List<Track>
)

data class AlbumInfoResponse(
    val album: Album
)

data class TrackInfoResponse(
    val track: Track
)

data class SimilarArtistsResponse(
    val similarartists: SimilarArtists
)

data class SimilarArtists(
    val artist: List<Artist>
)

data class Artist(
    val name: String,
    val listeners: String? = null,
    val mbid: String? = null,
    val url: String? = null,
    val image: List<Image>? = null
)

data class Album(
    val name: String,
    val artist: String,
    val mbid: String? = null,
    val url: String? = null,
    val image: List<Image>? = null
)

data class Track(
    val name: String,
    val artist: String,
    val mbid: String? = null,
    val url: String? = null,
    val image: List<Image>? = null
)

data class Image(
    val text: String,
    val size: String
)