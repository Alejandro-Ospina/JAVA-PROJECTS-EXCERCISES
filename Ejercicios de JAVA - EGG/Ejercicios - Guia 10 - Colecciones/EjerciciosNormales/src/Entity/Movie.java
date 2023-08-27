
package Entity;


// @author new53
 
public class Movie {
    private String title, directorName;
    private double duration;

    public Movie() {
    }

    public Movie(String title, String directorName, double duration) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Movie information {" + "Movie title=" + title + "\nDirector name=" + directorName + "\nDuration=" + duration + '}' + "\n";
    }
}