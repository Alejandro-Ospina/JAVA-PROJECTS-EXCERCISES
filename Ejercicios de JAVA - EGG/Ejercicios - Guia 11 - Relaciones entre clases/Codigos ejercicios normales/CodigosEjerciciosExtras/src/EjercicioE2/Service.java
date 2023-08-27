
package EjercicioE2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


// @author new53
 
public class Service {
    private static final Cinema cinema = new Cinema();  
    private static final List<Viewer> viewersNotAllowed = new ArrayList<Viewer>();
    private static final Scanner read = new Scanner(System.in);
    
    public static void generateViewers(){
        Random viewerNumbers = new Random();
        for(int i=0; i<viewerNumbers.nextInt(70-20+1) + 20; i++){
            Viewer viewer = new Viewer();
            viewer.setViewerName("Viewer " + Integer.toString(i+1));
            viewer.setViewerAge(viewerNumbers.nextInt(50-10+1)+10);
            viewer.setViewerCash(viewerNumbers.nextDouble()*(70000.0-10000.0)+10000.0);
            cinema.getViewer().add(viewer);
        }
        System.out.println("Viewers generated successfully!");
    }
    
    public static void generateMovie(){
        Movie movie = new Movie();
        System.out.print("Write movie name: ");
        movie.setMovieName(read.nextLine());
        System.out.print("Set movie duration (min): ");
        movie.setDuration(read.nextDouble());
        read.nextLine();
        System.out.print("Set director name: ");
        movie.setDirectorName(read.nextLine());
        System.out.print("Set minimal age to watch the movie: ");
        movie.setMinAge(read.nextInt());       
        read.nextLine();
        cinema.setMovie(movie);
        System.out.println("Movie generated successfully!");
    }
    
    public static void roomPrice(){
        System.out.print("Set room price: ");
        cinema.setRoomPrice(read.nextDouble());
        read.nextLine();
        System.out.println("Room price generated successfully!");
    }
    
    private static void allowedViewers(){
        cinema.getViewer().stream().filter((i) -> (i.getViewerAge() < cinema.getMovie().getMinAge() ||
                i.getViewerCash() < cinema.getRoomPrice())).forEachOrdered((i) -> {
                    viewersNotAllowed.add(i);
        });
        cinema.getViewer().removeAll(viewersNotAllowed);
    }
    
    private static void roomInitialize(){
        for (String[] room : cinema.getRoom()) {
            for (int j = 0; j < room.length; j++) {
                room[j] = "______";
            }           
        }
    }
    
    public static void locateViewerRandomly(){
        Random randomPosition = new Random();
        allowedViewers();   
        roomInitialize();
        if(cinema.getViewer().size() > cinema.getRoom().length){
            System.out.println("Only the first " + cinema.getViewer().size() + 
                    " viewers are gonnna be placed in the chair rooms randomly");
        }
        cinema.getViewer().forEach((i) -> {
            int j = randomPosition.nextInt(8);
            int k = randomPosition.nextInt(6);          
            while(!cinema.getRoom()[j][k].equals("______")){
                j = randomPosition.nextInt(8);
                k = randomPosition.nextInt(6);
            } 
            cinema.getRoom()[j][k] = i.getViewerName();
        });
    }
    
    public static void showLocationDetails(){
        System.out.println("Cinema room distribution details...\n");
        for(int i=0; i<cinema.getRoom().length; i++){
            for(int j=0; j<cinema.getRoom()[i].length; j++){
                System.out.print(cinema.getRoom()[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void showViewerDetails(){
        System.out.println(cinema.getViewer());
    }
}