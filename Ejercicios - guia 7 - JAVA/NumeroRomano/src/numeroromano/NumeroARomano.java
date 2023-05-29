
package numeroromano;
import java.util.*;
//  @author new53
/* Construir un programa que solicite al usuario un número entero entre 1 y 3999, 
y una función retorne el número romano del número entero ingresado */
public class NumeroARomano {
    
    public static String transformarNumeroARomano(int numero){
        String romano = "";
        int controlador = numero;
        while(controlador != 0){
            if (controlador >= 1000){
                romano = romano.concat("M");
                controlador -= 1000;
            }else if(controlador >= 900 && controlador < 1000){
                romano = romano.concat("CM");
                controlador -= 900;
            }else if(controlador >= 500 && controlador < 900){
                romano = romano.concat("D");
                controlador -= 500;
            }else if(controlador >= 400 && controlador < 500){
                romano = romano.concat("CD");
                controlador -= 400;                
            }else if(controlador >= 100 && controlador < 400){
                romano = romano.concat("C");
                controlador -= 100;
            }else if(controlador >= 90 && controlador < 100){
                romano = romano.concat("XC");
                controlador -= 90;
            }else if(controlador >= 50 && controlador < 90){
                romano = romano.concat("L");
                controlador -= 50;
            }else if(controlador >= 40 && controlador < 50){
                romano = romano.concat("XL");
                controlador -= 40;
            }else if(controlador >= 10 && controlador < 40){
                romano = romano.concat("X");
                controlador -= 10;
            }else if(controlador == 9){
                romano = romano.concat("IX");
                controlador -= 9;
            }else if(controlador >= 5 && controlador < 9){
                romano = romano.concat("V");
                controlador -= 5;
            }else if(controlador == 4){
                romano = romano.concat("IV");
                controlador -= 4;
            }else if(controlador >= 1 && controlador < 4){
                romano = romano.concat("I");
                controlador -= 1;
            }                         
        }
        return romano;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Ingrese el número a transformar en romano: ");
            numero = entrada.nextInt();
            if(numero >= 4000){
                System.out.println("¡El programa solo arroja números romanos entre 1 y 3999!");
            }
        }while(numero >= 4000);               
        System.out.println(numero + " en romano se escribe: " + transformarNumeroARomano(numero));
    }
}