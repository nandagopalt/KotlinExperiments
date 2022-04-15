package Collections;

public class Movie {
    private int movieID;
    private String movieName;
    private int movieYear;
    private int ratings;

    public Movie(int movieID, String movieName, int movieYear, int ratings) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.ratings = ratings;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName='" + movieName + '\'' +
                ", movieYear=" + movieYear +
                ", ratings=" + ratings +
                '}';
    }
}
