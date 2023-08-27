
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class Game {
    private static ArrayList<Player> players;
    
    public static void fillGame(){
        Player.numberOfPlayers();
        players = Player.listOfPlayers();
        WaterWeapon.fillWeapon();
    }
    
    public static void round(){ 
        Scanner read = new Scanner(System.in);  
        boolean isWet = false;
        while(true){
           for(Player player : players){                
                System.out.print("¿Are you sure you wanna shoot the water gun? (y/n): ");
                String answer = read.next();
                if(answer.equalsIgnoreCase("y")){
                    if(player.shoot()){
                        System.out.println("¡You have gotten wet!");
                        System.out.println("¡GAME ENDS!"); 
                        System.out.println("----------------------------------");
                        isWet = true;
                        break;
                    }else{
                        System.out.println("¡You keep dry!");
                    }
                }else{
                    System.out.println("¡Let's try with next player!");
                    System.out.println("----------------------------------");
                    continue;                   
                }
                System.out.println("----------------------------------");                  
           }
           if(isWet){
               read.close();
               break;
           }          
        }      
    }
}