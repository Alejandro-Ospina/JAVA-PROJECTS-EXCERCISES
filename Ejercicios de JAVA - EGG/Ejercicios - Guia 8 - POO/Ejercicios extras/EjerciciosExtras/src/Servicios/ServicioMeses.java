
package Servicios;

import Entidades.Meses;
import java.util.Scanner;
import java.util.Random;

// @author new53
 
public class ServicioMeses {
    private static Scanner entrada = new Scanner(System.in);
    private Random aleatorio = new Random();
    private static Meses mes;

    public ServicioMeses() {
        mes = new Meses();       
        mes.setMesSecreto(mes.getMesesAnio()[aleatorio.nextInt(12)]);
    }
    
    public static void adivinarMesOculto(){
        int intentos = 4;
        String mesOculto;
        System.out.println("Nota: En el juego de adivinar mes, cuentas con " + intentos +
                " intentos.");
        System.out.print("Intenta ingresar el mes oculto: ");
        do{
            mesOculto = entrada.nextLine();
            if(mesOculto.equalsIgnoreCase(mes.getMesSecreto())){
                System.out.println("¡ENHORABUENA! Mes adivinado!!!");                
            }else{
                intentos -= 1;
                System.out.println("¡MES EQUIVOCADO! Intentos restantes: " + intentos);
                if (intentos == 0){
                    System.out.println("Gracias por intentar. Esta vez NO has ganado!!");
                }else{
                    System.out.print("Intenta de nuevo otro mes: ");
                }               
            }
        }
        while(intentos != 0 && !mesOculto.equalsIgnoreCase(mes.getMesSecreto()));       
    }   
}