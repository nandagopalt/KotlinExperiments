package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsByExample1 {
    public static void main(String[] args) {
        List<Movie> moviesList = Arrays.asList(
                new Movie(1, "Movie 1", 2021, 5),
                new Movie(2, "Movie 2", 2021, 5),
                new Movie(3, "Movie 3", 2021, 5),
                new Movie(4, "Movie 4", 2021, 4),
                new Movie(5, "Movie 5", 2021, 4),
                new Movie(5, "Movie 5", 2021, 4),
                new Movie(5, "Movie 5", 2021, 3),
                new Movie(5, "Movie 5", 2021, 3),
                new Movie(5, "Movie 5", 2021, 3),
                new Movie(5, "Movie 5", 2020, 3),
                new Movie(5, "Movie 5", 2021, 3)

        );
        // 1. Get the list of movie names and add it to the list
        List<String> moviesNames = moviesList.stream()
                .map(Movie::getMovieName)
                .collect(Collectors.toList());
        //moviesNames.forEach(System.out::println);

        // 2. Get all the movies and add it to Set [Removing duplicates]
        Set<String> moviesSet = moviesList.stream().map(Movie::getMovieName).collect(Collectors.toSet());
        //moviesSet.forEach(System.out::println);

        // 3. Join all the movie names with comma separated value
        String commaSeparated = moviesList.stream().map(Movie::getMovieName).collect(Collectors.joining(","));
        //System.out.println(commaSeparated);

        // 4. Group the movies based on year
        Map<Integer, List<Movie>> movieMap = moviesList.stream().collect(Collectors.groupingBy(Movie::getMovieYear));
        //movieMap.forEach((k, v) -> System.out.println("Key : " + k + ", value :" + v));

        // 5. Average movie ratings from the list of movies
        Double averageRatings = moviesList.stream().collect(Collectors.averagingInt(movie -> movie.getRatings()));
        //System.out.println(averageRatings);

        // 6. Split the movies in to 2 list based on the criteria for example rating>=4
        Map<Boolean, List<Movie>> map = moviesList.stream().collect(Collectors.partitioningBy(movie -> movie.getRatings() >= 5));
        map.forEach((k, v) -> System.out.println("Key :" + k + ", " + "Value :" + v));
    }
}
