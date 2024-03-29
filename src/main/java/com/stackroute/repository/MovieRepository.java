package com.stackroute.repository;

import com.stackroute.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer> {
    @Query("{ 'movieTitle' : ?0 }")
    List<Movie> getMovieWithTitle(@Param("chars") String chars);
}
