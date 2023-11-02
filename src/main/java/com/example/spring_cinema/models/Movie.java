package com.example.spring_cinema.models;

import jakarta.persistence.*;

// start

@Entity // to connect to database
@Table(name = "spring_cinema")
public class Movie {

    @Id // generates ID for each object
    @GeneratedValue(strategy = GenerationType.IDENTITY) // orders the number

    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private String rating;

    @Column(name = "duration")
    private int duration;

    public Movie(String word, String rating, int duration) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Movie() {
    }
//    empty constructor

//    getter and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

} // end