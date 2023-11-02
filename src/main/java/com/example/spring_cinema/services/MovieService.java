package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

        @Autowired
        MovieRepository movieRepository;



public List<Movie> getAllMovies() {
        return movieRepository.findAll();
}

public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
}
 public void deleteMovie(Long id){
        movieRepository.deleteById(id);
 }
}
