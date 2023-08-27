
package EjercicioE2;


// @author new53
 
public class Movie {
    private String movieName, directorName;
    private double duration;
    private int minAge;

    public Movie() {
    }

    public Movie(String movieName, String directorName, double duration, int minAge) {
        this.movieName = movieName;
        this.directorName = directorName;
        this.duration = duration;
        this.minAge = minAge;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieName=" + movieName + ", directorName=" + directorName + ", duration=" + duration + ", minAge=" + minAge + '}';
    }
}