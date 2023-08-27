
package Main;

//  @author new53

import Service.MovieService;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Creamos la lista de peliculas
        MovieService.createMovie();
        System.out.println("");
        MovieService.showMovieGreaterOneHour();
        System.out.println("" + "\nMovieList");
        MovieService.showMovieList();
        System.out.println("");
        MovieService.sortByDurationAscendig();
        System.out.println("");
        MovieService.sortByDurationDescendig();
        System.out.println("");
        MovieService.sortByTitle();
        System.out.println("");
        MovieService.sortByDirector();
    }
}