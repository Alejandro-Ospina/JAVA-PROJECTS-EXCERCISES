
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class Player {
    private int id;
    private String player;
    private boolean isWet;
    private static ArrayList<Player> players;

    public Player(int id) {
        this.id = id;
        this.player = "Jugador " + Integer.toString(this.id);
        this.isWet = false;      
    }
                      
    public static void numberOfPlayers(){
        Scanner read = new Scanner(System.in);
        players = new ArrayList();
        System.out.print("¿Hoy many players would you like to set for the game?: ");
        int answer = read.nextInt();
        read.nextLine();       
        if(answer > 6 || answer <= 0){
            System.out.println("Sorry but we've set a limit of 6 players");
            for(int i=0; i<6; i++){                
                Player player = new Player(i+1);
                players.add(player);
            }
        }else{
            for(int i=0; i<answer; i++){               
                Player player = new Player(i+1);
                players.add(player);
            }
        }
    }
    
    public boolean shoot(){               
        if(WaterWeapon.toGetWet()){
            this.isWet = true;
            return true;
        }else{
            WaterWeapon.nextSpirt();
            return false;
        }       
    }
    
    public static ArrayList<Player> listOfPlayers(){
        return players;
    }
    
    @Override
    public String toString(){
        return "\nPlayer information" + ""
                + "\nPlayer: " + player + ""
                + "\nIs wet?: " + isWet;
    }
}