
package Service;

import Entity.Movie;
import Sorters.SortByDirector;
import Sorters.SortByTitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;


// @author new53
 
public class MovieService {
    private static final ArrayList<Movie> movieList = new ArrayList();
    private static final Scanner read = new Scanner(System.in);
    private static Movie movie;
    
    public static void createMovie(){
        System.out.println("Creating movies...");
        System.out.print("Please, type the movie title: ");
        String answer;
        while(true){
            movie = new Movie();
            movie.setTitle(read.nextLine());
            System.out.print("Type director name: ");
            movie.setDirectorName(read.nextLine());
            System.out.print("Set duration movie: ");
            movie.setDuration(read.nextDouble());
            read.nextLine();
            movieList.add(movie);
            System.out.print("Would you like to add another movie to list? (y/n): ");
            answer = read.nextLine();
            if("n".equalsIgnoreCase(answer)){
                break;
            }else{
                System.out.print("\nAdd movie title: ");
            }
        }
    }
    
    public static void showMovieList(){
        System.out.println(movieList.toString());
    }
    
    public static void showMovieGreaterOneHour(){
        boolean isGreater = false;
        System.out.println("Movies that have more than one hour of duration");
        for(Movie mov : movieList){
            if(mov.getDuration() >= 1.0){
                isGreater = true;
                System.out.print(mov.toString());
            }
        }
        if(!isGreater){
            System.out.println("No movies greater than one hour were found!");
        }
    }
    
    public static void sortByDurationAscendig(){
        movieList.sort(Comparator.comparingDouble(Movie::getDuration));
        System.out.println("Sorted List by ascending duration\n" + movieList.toString());
    }
    
    public static void sortByDurationDescendig(){
        movieList.sort(Comparator.comparingDouble(Movie::getDuration).reversed());
        System.out.println("Sorted List by descending duration\n" + movieList.toString());
    }
    
    public static void sortByTitle(){
        Collections.sort(movieList, new SortByTitle());
        System.out.println("Sorted List by title\n" + movieList.toString());
    }
    
    public static void sortByDirector(){
        Collections.sort(movieList, new SortByDirector());
        System.out.println("Sorted List by director name\n" + movieList.toString());
    }   
}