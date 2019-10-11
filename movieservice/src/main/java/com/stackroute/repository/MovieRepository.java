package com.stackroute.repository;

import com.stackroute.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer> {

//    @Query(value = "select * from MOVIE where movie_title=:Name",nativeQuery = true)
    Movie findMovieByMovieTitle(String movieTitle);
}
