
package EjercicioE2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// @author new53
 
public class Cinema {
    private Movie movie;
    private final String room[][];
    private List<Viewer> viewer = new ArrayList<>();
    private double roomPrice;

    public Cinema() {
        this.room = new String[8][6];        
    }

    public Cinema(Movie movie, List<Viewer> viewer, double roomPrice) {
        this.room = new String[8][6];
        this.movie = movie;
        this.viewer = viewer;
        this.roomPrice = roomPrice;
    }   

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Viewer> getViewer() {
        return viewer;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String[][] getRoom() {
        return room;
    }
    
    @Override
    public String toString() {
        return "Cinema{" + "movie=" + movie + ", room=" + Arrays.deepToString(room) + ", viewer=" + viewer + ", roomPrice=" + roomPrice + '}';
    }
}