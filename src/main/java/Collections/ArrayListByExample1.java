package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListByExample1 {
    public static void main(String args[]) {
        List<Movie> movieList = Arrays.asList(new Movie(1, "Movie1", 2020, 5),
                new Movie(2, "Movie2", 2021, 5),
                new Movie(3, "Movie3", 2022, 5));

        /*Stream<Movie> movieStream = movieList.stream(); // source
        Stream<Movie> filterMovieStream = movieStream.filter(movie -> movie.getMovieYear() == 2022); // intermediate
        Stream<String> mapStream = filterMovieStream.map(Movie::getMovieName); // intermediate
        mapStream.forEach(System.out::println); // terminal
        */

        movieList.stream().filter(movie -> movie.getMovieYear() == 2022)
                .map(Movie::getMovieName)
                .forEach(System.out::println);
    }
}
