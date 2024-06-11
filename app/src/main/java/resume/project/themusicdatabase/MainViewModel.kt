package resume.project.themusicdatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _topTracks = MutableLiveData<List<Track>>()
    val topTracks: LiveData<List<Track>> = _topTracks

    private val _topAlbums = MutableLiveData<List<Album>>()
    val topAlbums: LiveData<List<Album>> = _topAlbums

    private val _topArtists = MutableLiveData<List<Artist>>()
    val topArtists: LiveData<List<Artist>> = _topArtists

    fun search(query: String?) {
        // Implement search functionality
    }

    fun loadTopTracks() {
        // Implement logic to fetch and set top tracks data in _topTracks
    }

    fun loadTopAlbums() {
        // Implement logic to fetch and set top albums data in _topAlbums
    }

    fun loadTopArtists() {
        // Implement logic to fetch and set top artists data in _topArtists
    }
}