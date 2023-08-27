
package Ejercicio2;

//  @author new53

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        Game.fillGame();
        System.out.println(WaterWeapon.weaponDetails());
        Game.round();
        System.out.println(Arrays.toString(Player.listOfPlayers().toArray()));        
    }
}