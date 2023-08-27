
package Ejercicio2;

import java.util.ArrayList;
import java.util.Random;


// @author new53
 
public class WaterWeapon {
    private static int barrelPosition;
    private static int waterBarrelPosition;     
    private static ArrayList<Player> players;

    public WaterWeapon() {
    }
    
    public static int getBarrelPosition() {
        return barrelPosition;
    }
   
    public static int getWaterBarrelPosition() {
        return waterBarrelPosition;
    }
    
    public static void fillWeapon(){
        Random randomValue = new Random();
        WaterWeapon.barrelPosition = randomValue.nextInt(6-1+1)+1;
        WaterWeapon.waterBarrelPosition = randomValue.nextInt(6-1+1)+1;      
    }
    
    public static boolean toGetWet(){
        return WaterWeapon.barrelPosition == WaterWeapon.waterBarrelPosition ? true : false;
    }
    
    public static void nextSpirt(){
        if(WaterWeapon.barrelPosition == 6){
            WaterWeapon.barrelPosition = 1;
        }else{
            WaterWeapon.barrelPosition ++;
        }
    }
    
    public static String weaponDetails(){
        return "\nActual barrel position: " + WaterWeapon.barrelPosition + 
                "\nWater spirt position: " + WaterWeapon.waterBarrelPosition + "\n";
    }         
}