
package Sorters;

import Entity.Movie;
import java.util.Comparator;


// @author new53
 
public class SortByTitle implements Comparator<Movie>{   
    @Override
    public int compare(Movie movie1, Movie movie2){
        return movie1.getTitle().compareToIgnoreCase(movie2.getTitle());
    }
}