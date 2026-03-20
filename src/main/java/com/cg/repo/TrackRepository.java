package com.cg.repo;

import com.cg.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Long> {

    // Spring Data JPA auto-generates the query from the method name
	// WHERE track_title = ?
    List<Track> findByTitle(String title);

    // WHERE track_title LIKE '%?%'
    List<Track> findByTitleContaining(String title);

    // WHERE LOWER(track_title) LIKE LOWER('%?%')
    List<Track> findByTitleContainingIgnoreCase(String title);

    // WHERE album_name = ?
    List<Track> findByAlbumName(String albumName);

    // WHERE release_dt > ?
    List<Track> findByReleaseDateAfter(LocalDate releaseDate);
    
}