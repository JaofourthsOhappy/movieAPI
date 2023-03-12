package dev.fourth.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository moviesRepository;

    public List<Movie> allMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return moviesRepository.findById(id);
    }
}
