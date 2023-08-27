
package Sorters;

import Entity.Movie;
import java.util.Comparator;


// @author new53
 
public class SortByDirector implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2){
        return movie1.getDirectorName().compareToIgnoreCase(movie2.getDirectorName());
    }
}
