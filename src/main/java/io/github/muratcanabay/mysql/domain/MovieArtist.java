package io.github.muratcanabay.mysql.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "MOVIEARTIST")
public class MovieArtist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "MOVIE_ARTIST_MOVIE_ID"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ARTIST_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "MOVIE_ARTIST_ARTIST_ID"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Artist artist;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}