
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

// @author new53
 
public class ServicioPersona {
    private Scanner entrada = new Scanner(System.in);
    
    /**
     * El método persona se encarga de crear un objeto de la clase Persona, y lo retorna como objeto de la clase misma.
     * @return objeto de clase Persona.
     */
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese el sexo de la persona: ");
        entrada.nextLine();
        String sexo = "";
        do{
            sexo = entrada.nextLine();
            if(!sexo.toLowerCase().equalsIgnoreCase("h") && !sexo.toLowerCase().equalsIgnoreCase("m") && !sexo.toLowerCase().equalsIgnoreCase("o")){
                System.out.print("¡Sexo inválido!, ingrese nuevamente el sexo: ");
            }
        }while(!sexo.toLowerCase().equalsIgnoreCase("h") && !sexo.toLowerCase().equalsIgnoreCase("m") && !sexo.toLowerCase().equalsIgnoreCase("o"));
        System.out.print("Ingrese la altura (m): ");
        double altura = entrada.nextDouble();
        System.out.print("Ingrese el peso (Kg): ");
        double peso = entrada.nextDouble();
        entrada.nextLine();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    /**
     * El método se encarga de calcular el índice de masa corporal del objeto persona que recibe como parámetro.
     * Nota: El parámetro que recibe el método, es un objeto de la clase Persona.
     * @param persona
     * @return condicion de peso de la persona
     */
    public int calcularIMC(Persona persona){
        if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) < 20){
            return -1;
        }else if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) >= 20 && (double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) <= 25){
            return 0;            
        }else if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) > 25){
            return 1;
        }
        return 2;
    }
    
    /**
     * El método se encarga de comprobar si el objeto persona de la clase Persona es mayor de edad.
     * @param persona
     * @return verdadero si es mayor de edad, y falso en caso contrario.
     */
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >= 18 ? true : false;
    }
}