package com.cg.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "abes_track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private Long id;

    @Column(name = "track_title")
    private String title;

    @Column(name = "album_name")
    private String albumName;

    @Column(name = "release_dt")
    private LocalDate releaseDate;

    // Default constructor (required by JPA)
    public Track() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAlbumName() { return albumName; }
    public void setAlbumName(String albumName) { this.albumName = albumName; }

    public LocalDate getReleaseDate() { return releaseDate; }
    public void setReleaseDate(LocalDate releaseDate) { this.releaseDate = releaseDate; }
}